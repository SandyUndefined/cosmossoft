package com.sandy.cosmossoft.fragments.screenmenus;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Looper;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.paysprint.onboardinglib.activities.HostActivity;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.activities.HomeActivity;
import com.sandy.cosmossoft.activities.aeps.AepsHome;
import com.sandy.cosmossoft.activities.microatm.MicroAtmHome;
import com.sandy.cosmossoft.activities.mobilenumber.SendMoney;
import com.sandy.cosmossoft.activities.payoutpaysprint.PaysprintPayout;
import com.sandy.cosmossoft.adapters.MenuAdapter;
import com.sandy.cosmossoft.data.model.MenuModel;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.network.responses.PaySprintMerchant;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.PaySprintApi;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.FragmentHomeMenuFragmentsBinding;
import com.sandy.cosmossoft.fragments.sliders.SliderFragment;
import com.sandy.cosmossoft.listeners.NumberPayListener;
import com.sandy.cosmossoft.listeners.OnBoardingListeners;
import com.sandy.cosmossoft.listeners.RecyclerViewClickListener;
import com.sandy.cosmossoft.maskedittext.MaskedEditText;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.HomeViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HomeMenuFragments extends Hilt_HomeMenuFragments implements RecyclerViewClickListener, OnBoardingListeners, NumberPayListener {
    private FragmentHomeMenuFragmentsBinding binding;
    ProgressDialog dialog;
    Double latitude = null;
    Double longitude = null;
    PaySprintApi sprintApi = null;
    User user = null;
    HomeViewModel viewModel;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentHomeMenuFragmentsBinding fragmentHomeMenuFragmentsBinding = (FragmentHomeMenuFragmentsBinding) DataBindingUtil.inflate(inflater, C0330R.layout.fragment_home_menu_fragments, container, false);
        this.binding = fragmentHomeMenuFragmentsBinding;
        fragmentHomeMenuFragmentsBinding.getRoot().setOverScrollMode(2);
        HomeViewModel homeViewModel = (HomeViewModel) new ViewModelProvider(this).get(HomeViewModel.class);
        this.viewModel = homeViewModel;
        this.binding.setHomeViewModel(homeViewModel);
        this.viewModel.onBoardingListeners = this;
        this.dialog = new ProgressDialog(requireActivity());
        AppDatabase appDatabase = AppDatabase.getAppDatabase(requireActivity());
        this.user = appDatabase.getUserDao().getRegularUser();
        this.sprintApi = appDatabase.getPaySprint().getRegularPaySprint();
        return this.binding.getRoot();
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(new SliderFragment(), this.binding.HomeSliderFragment);
            setMenus();
        }
        this.viewModel.bringTheNews(this.binding.everynews, this.binding.newsSection);
        this.binding.everynews.setSelected(true);
    }

    public TextView getMainBalance() {
        return this.binding.mainBalText;
    }

    public TextView getAepsBalance() {
        return this.binding.aepsBalText;
    }

    public void setFragment(Fragment fragment, View view) {
        FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(view.getId(), fragment);
        fragmentTransaction.commit();
    }

    private void setMenus() {
        this.binding.moneyTransfer.setLayoutManager(new GridLayoutManager(requireContext(), 5, 1, false));
        List<MenuModel> moneyTransferList = new ArrayList<>();
        Integer valueOf = Integer.valueOf(C0330R.C0332drawable.ic_bank);
        moneyTransferList.add(new MenuModel(valueOf, "Payout"));
        moneyTransferList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_money_transfer), "Mobile Number"));
        moneyTransferList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_aeps), "AEPS"));
        moneyTransferList.add(new MenuModel(valueOf, "DMT"));
        moneyTransferList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_m_atm), "Micro ATM"));
        this.binding.moneyTransfer.setAdapter(new MenuAdapter(moneyTransferList, this));
        this.binding.moneyTransfer.setOverScrollMode(2);
        this.binding.firstHomeMenu.setLayoutManager(new GridLayoutManager(requireContext(), 4, 1, false));
        List<MenuModel> rechargeList = new ArrayList<>();
        rechargeList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_mobile_recharge), "Mobile\nRecharge"));
        rechargeList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_fastag_recharge), "FASTag\nRecharge"));
        rechargeList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_dth), "DTH"));
        rechargeList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_cable_tv), "Cable Tv"));
        this.binding.firstHomeMenu.setAdapter(new MenuAdapter(rechargeList, this));
        this.binding.firstHomeMenu.setOverScrollMode(2);
        this.binding.utilitiesHomeMenu.setLayoutManager(new GridLayoutManager(requireContext(), 4, 1, false));
        List<MenuModel> utilitiesList = new ArrayList<>();
        Integer valueOf2 = Integer.valueOf(C0330R.C0332drawable.ic_cylinder);
        utilitiesList.add(new MenuModel(valueOf2, "Book A\nCylinder"));
        utilitiesList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_water), "Water"));
        utilitiesList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_electricity), "Electricity"));
        utilitiesList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_postpaid), "Postpaid"));
        utilitiesList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_boardband), "Broadband"));
        utilitiesList.add(new MenuModel(valueOf2, "LPG"));
        utilitiesList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_data_card_prepaid), "Data Card\nPrepaid"));
        utilitiesList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_landline), "Landline"));
        utilitiesList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_data_card_postpaid), "Data Card\nPostpaid"));
        this.binding.utilitiesHomeMenu.setAdapter(new MenuAdapter(utilitiesList, this));
        this.binding.utilitiesHomeMenu.setOverScrollMode(2);
        this.binding.taxesHomeMenu.setLayoutManager(new GridLayoutManager(requireContext(), 3, 1, false));
        List<MenuModel> financesList = new ArrayList<>();
        financesList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_credit_card_bill), "EMI"));
        financesList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_insurance), "LIC/Insurance"));
        financesList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_municipal), "Municipal"));
        this.binding.taxesHomeMenu.setAdapter(new MenuAdapter(financesList, this));
        this.binding.taxesHomeMenu.setOverScrollMode(2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02a6, code lost:
        r1 = r19;
        r1.viewModel.checkPaySprintExistence(r1.user.getMobile(), "microatm");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02b7, code lost:
        r1 = r19;
        r1.viewModel.checkPaySprintExistence(r1.user.getMobile(), "aeps");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c8, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = "Electricity";
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", "Electricity");
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02de, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = "Broadband";
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", "Broadband");
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02f4, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = "Postpaid";
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", "Postpaid");
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x030a, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r16;
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", r16);
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0322, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r17;
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", "Prepaid");
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ec, code lost:
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ef, code lost:
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0106, code lost:
        r18 = "EMI";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0109, code lost:
        r18 = "EMI";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011a, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011d, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012e, code lost:
        r17 = "Mobile\nRecharge";
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0133, code lost:
        r17 = "Mobile\nRecharge";
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014b, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014c, code lost:
        r16 = "DTH";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0150, code lost:
        switch(r1) {
            case 0: goto L_0x0322;
            case 1: goto L_0x030a;
            case 2: goto L_0x02f4;
            case 3: goto L_0x02de;
            case 4: goto L_0x02c8;
            case 5: goto L_0x02b7;
            case 6: goto L_0x02a6;
            case 7: goto L_0x0294;
            case 8: goto L_0x0283;
            case 9: goto L_0x027c;
            case 10: goto L_0x0263;
            case 11: goto L_0x024a;
            case 12: goto L_0x0231;
            case 13: goto L_0x0218;
            case 14: goto L_0x0201;
            case 15: goto L_0x01e8;
            case 16: goto L_0x01e2;
            case 17: goto L_0x01c9;
            case 18: goto L_0x01b0;
            case 19: goto L_0x0199;
            case 20: goto L_0x0180;
            case 21: goto L_0x0169;
            case 22: goto L_0x0157;
            default: goto L_0x0153;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0153, code lost:
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0157, code lost:
        startActivity(new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.tobank.QueryRemitter.class));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0169, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = "LPG";
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", "LPG");
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0180, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = "Data Card\nPostpaid";
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", "Datacard Postpaid");
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0199, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r2;
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", r2);
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b0, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r5;
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", "Datacard Prepaid");
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c9, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = "LIC/Insurance";
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", "Insurance");
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e2, code lost:
        r1 = r19;
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = "Loan";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e8, code lost:
        r0 = r18;
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r0;
        r2 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r2.putExtra("operatorType", r0);
        startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0201, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = "Water";
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", "Water");
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0218, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = "Book A\nCylinder";
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", "Gas");
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0231, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = "Cable Tv";
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", "Cable");
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x024a, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = "FASTag\nRecharge";
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", "Fastag");
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0263, code lost:
        com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r0;
        r0 = new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class);
        r0.putExtra("operatorType", "Municipality");
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x027c, code lost:
        r1 = r19;
        proceedToSeekMobileNumber();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0283, code lost:
        r1 = r19;
        r1.viewModel.checkPaySprintExistence(r1.user.getMobile(), "payout");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0294, code lost:
        startActivity(new android.content.Intent(requireActivity(), com.sandy.cosmossoft.activities.Payouts.PayoutHome.class));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRecyclerViewClickItem(View r20, com.sandy.cosmossoft.data.model.MenuModel r21) {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = r21.getTitle()
            int r2 = r1.hashCode()
            java.lang.String r3 = "Data Card\nPostpaid"
            java.lang.String r4 = "LIC/Insurance"
            java.lang.String r5 = "Mobile\nRecharge"
            java.lang.String r6 = "FASTag\nRecharge"
            java.lang.String r7 = "Book A\nCylinder"
            java.lang.String r8 = "Loan"
            java.lang.String r9 = "Cable Tv"
            java.lang.String r10 = "Municipal"
            java.lang.String r11 = "Data Card\nPrepaid"
            java.lang.String r12 = "Postpaid"
            java.lang.String r13 = "Broadband"
            java.lang.String r14 = "Water"
            java.lang.String r15 = "LPG"
            java.lang.String r0 = "EMI"
            r16 = r11
            java.lang.String r11 = "DTH"
            r17 = r10
            java.lang.String r10 = "Landline"
            r18 = r10
            java.lang.String r10 = "Electricity"
            switch(r2) {
                case -2099607477: goto L_0x0138;
                case -2042775854: goto L_0x0120;
                case -1911338554: goto L_0x010c;
                case -1668965807: goto L_0x00fd;
                case -1551976321: goto L_0x00f2;
                case -393841275: goto L_0x00e4;
                case -162122617: goto L_0x00d9;
                case 67819: goto L_0x00cf;
                case 68024: goto L_0x00c7;
                case 68769: goto L_0x00be;
                case 75587: goto L_0x00b5;
                case 2005287: goto L_0x00ab;
                case 2373904: goto L_0x00a2;
                case 83350775: goto L_0x0099;
                case 242207216: goto L_0x008e;
                case 385061783: goto L_0x0086;
                case 414938198: goto L_0x007c;
                case 415372687: goto L_0x0072;
                case 822480780: goto L_0x0069;
                case 1008531023: goto L_0x0060;
                case 1303472721: goto L_0x0056;
                case 1374075536: goto L_0x004c;
                case 1907222270: goto L_0x0041;
                default: goto L_0x0035;
            }
        L_0x0035:
            r2 = r18
            r18 = r0
            r0 = r17
            r17 = r5
            r5 = r16
            goto L_0x014b
        L_0x0041:
            java.lang.String r2 = "Micro ATM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00ef
            r1 = 6
            goto L_0x00ec
        L_0x004c:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ef
            r1 = 20
            goto L_0x00ec
        L_0x0056:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00ef
            r1 = 17
            goto L_0x00ec
        L_0x0060:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00ef
            r1 = 0
            goto L_0x00ec
        L_0x0069:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00ef
            r1 = 2
            goto L_0x00ec
        L_0x0072:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00ef
            r1 = 11
            goto L_0x00ec
        L_0x007c:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00ef
            r1 = 13
            goto L_0x00ec
        L_0x0086:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x00ef
            r1 = 3
            goto L_0x00ec
        L_0x008e:
            java.lang.String r2 = "Testing"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00ef
            r1 = 22
            goto L_0x00ec
        L_0x0099:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x00ef
            r1 = 14
            goto L_0x00ec
        L_0x00a2:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00ef
            r1 = 16
            goto L_0x00ec
        L_0x00ab:
            java.lang.String r2 = "AEPS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00ef
            r1 = 5
            goto L_0x00ec
        L_0x00b5:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x00ef
            r1 = 21
            goto L_0x00ec
        L_0x00be:
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ef
            r1 = 15
            goto L_0x00ec
        L_0x00c7:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x00ef
            r1 = 1
            goto L_0x00ec
        L_0x00cf:
            java.lang.String r2 = "DMT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00ef
            r1 = 7
            goto L_0x00ec
        L_0x00d9:
            java.lang.String r2 = "Mobile Number"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00ef
            r1 = 9
            goto L_0x00ec
        L_0x00e4:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00ef
            r1 = 12
        L_0x00ec:
            r2 = r18
            goto L_0x0106
        L_0x00ef:
            r2 = r18
            goto L_0x0109
        L_0x00f2:
            r2 = r18
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0109
            r1 = 19
            goto L_0x0106
        L_0x00fd:
            r2 = r18
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x0109
            r1 = 4
        L_0x0106:
            r18 = r0
            goto L_0x011a
        L_0x0109:
            r18 = r0
            goto L_0x011d
        L_0x010c:
            r2 = r18
            r18 = r0
            java.lang.String r0 = "Payout"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x011d
            r1 = 8
        L_0x011a:
            r0 = r17
            goto L_0x012e
        L_0x011d:
            r0 = r17
            goto L_0x0133
        L_0x0120:
            r2 = r18
            r18 = r0
            r0 = r17
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0133
            r1 = 10
        L_0x012e:
            r17 = r5
            r5 = r16
            goto L_0x014c
        L_0x0133:
            r17 = r5
            r5 = r16
            goto L_0x014b
        L_0x0138:
            r2 = r18
            r18 = r0
            r0 = r17
            r17 = r5
            r5 = r16
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x014b
            r1 = 18
            goto L_0x014c
        L_0x014b:
            r1 = -1
        L_0x014c:
            r16 = r11
            java.lang.String r11 = "operatorType"
            switch(r1) {
                case 0: goto L_0x0322;
                case 1: goto L_0x030a;
                case 2: goto L_0x02f4;
                case 3: goto L_0x02de;
                case 4: goto L_0x02c8;
                case 5: goto L_0x02b7;
                case 6: goto L_0x02a6;
                case 7: goto L_0x0294;
                case 8: goto L_0x0283;
                case 9: goto L_0x027c;
                case 10: goto L_0x0263;
                case 11: goto L_0x024a;
                case 12: goto L_0x0231;
                case 13: goto L_0x0218;
                case 14: goto L_0x0201;
                case 15: goto L_0x01e8;
                case 16: goto L_0x01e2;
                case 17: goto L_0x01c9;
                case 18: goto L_0x01b0;
                case 19: goto L_0x0199;
                case 20: goto L_0x0180;
                case 21: goto L_0x0169;
                case 22: goto L_0x0157;
                default: goto L_0x0153;
            }
        L_0x0153:
            r1 = r19
            goto L_0x033a
        L_0x0157:
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r1 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.tobank.QueryRemitter> r2 = com.sandy.cosmossoft.activities.tobank.QueryRemitter.class
            r0.<init>(r1, r2)
            r1 = r19
            r1.startActivity(r0)
            goto L_0x033a
        L_0x0169:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r15
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r3 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r2, r3)
            r0.putExtra(r11, r15)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x0180:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r3
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r3 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r2, r3)
            java.lang.String r2 = "Datacard Postpaid"
            r0.putExtra(r11, r2)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x0199:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r2
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r3 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r4 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r3, r4)
            r0.putExtra(r11, r2)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x01b0:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r5
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r3 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r2, r3)
            java.lang.String r2 = "Datacard Prepaid"
            r0.putExtra(r11, r2)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x01c9:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r4
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r3 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r2, r3)
            java.lang.String r2 = "Insurance"
            r0.putExtra(r11, r2)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x01e2:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r8
            goto L_0x033a
        L_0x01e8:
            r1 = r19
            r0 = r18
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r0
            android.content.Intent r2 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r3 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r4 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r2.<init>(r3, r4)
            r2.putExtra(r11, r0)
            r1.startActivity(r2)
            goto L_0x033a
        L_0x0201:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r14
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r3 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r2, r3)
            r0.putExtra(r11, r14)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x0218:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r7
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r3 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r2, r3)
            java.lang.String r2 = "Gas"
            r0.putExtra(r11, r2)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x0231:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r9
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r3 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r2, r3)
            java.lang.String r2 = "Cable"
            r0.putExtra(r11, r2)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x024a:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r6
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r3 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r2, r3)
            java.lang.String r2 = "Fastag"
            r0.putExtra(r11, r2)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x0263:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r0
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r3 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r2, r3)
            java.lang.String r2 = "Municipality"
            r0.putExtra(r11, r2)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x027c:
            r1 = r19
            r19.proceedToSeekMobileNumber()
            goto L_0x033a
        L_0x0283:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.HomeViewModel r0 = r1.viewModel
            com.sandy.cosmossoft.data.db.entities.User r2 = r1.user
            java.lang.String r2 = r2.getMobile()
            java.lang.String r3 = "payout"
            r0.checkPaySprintExistence(r2, r3)
            goto L_0x033a
        L_0x0294:
            r1 = r19
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.Payouts.PayoutHome> r3 = com.sandy.cosmossoft.activities.Payouts.PayoutHome.class
            r0.<init>(r2, r3)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x02a6:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.HomeViewModel r0 = r1.viewModel
            com.sandy.cosmossoft.data.db.entities.User r2 = r1.user
            java.lang.String r2 = r2.getMobile()
            java.lang.String r3 = "microatm"
            r0.checkPaySprintExistence(r2, r3)
            goto L_0x033a
        L_0x02b7:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.HomeViewModel r0 = r1.viewModel
            com.sandy.cosmossoft.data.db.entities.User r2 = r1.user
            java.lang.String r2 = r2.getMobile()
            java.lang.String r3 = "aeps"
            r0.checkPaySprintExistence(r2, r3)
            goto L_0x033a
        L_0x02c8:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r10
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r3 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r2, r3)
            r0.putExtra(r11, r10)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x02de:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r13
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r3 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r2, r3)
            r0.putExtra(r11, r13)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x02f4:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r12
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r3 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r2, r3)
            r0.putExtra(r11, r12)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x030a:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r16
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r3 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r2, r3)
            r2 = r16
            r0.putExtra(r11, r2)
            r1.startActivity(r0)
            goto L_0x033a
        L_0x0322:
            r1 = r19
            com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel.service = r17
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.Class<com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator> r3 = com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator.class
            r0.<init>(r2, r3)
            java.lang.String r2 = "Prepaid"
            r0.putExtra(r11, r2)
            r1.startActivity(r0)
        L_0x033a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandy.cosmossoft.fragments.screenmenus.HomeMenuFragments.onRecyclerViewClickItem(android.view.View, com.sandy.cosmossoft.data.model.MenuModel):void");
    }

    private boolean checkPermission() {
        return ContextCompat.checkSelfPermission(requireContext(), "android.permission.READ_CONTACTS") == 0 && ContextCompat.checkSelfPermission(requireContext(), "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public void onBegin() {
        this.dialog.setTitle("Please.. wait..");
        this.dialog.show();
    }

    public void onBoardingResponse(String result, String purpose) {
        ViewUtils.showToast(requireActivity(), result);
    }

    public void onComplete() {
        this.dialog.dismiss();
    }

    public void onFailure(String message) {
        this.dialog.setTitle(message);
    }

    public void onCheck(PaySprintMerchant merchant, String activity) {
        HomeActivity.merchant = merchant;
        if (merchant.isResult() && activity.equals("aeps")) {
            startAEPS();
        } else if (merchant.isResult() && activity.equals("microatm")) {
            startMicroAtm();
        } else if (merchant.isResult() && activity.equals("tobank")) {
            startToBank();
        } else if (merchant.isResult() && activity.equals("payout")) {
            startPayout();
        } else if (checkPermission()) {
            ViewUtils.showToast(requireActivity(), merchant.message);
            Intent intent = new Intent(requireActivity(), HostActivity.class);
            intent.putExtra("pId", this.sprintApi.getPartnerid());
            intent.putExtra("pApiKey", this.sprintApi.getJwtkey());
            intent.putExtra("mCode", this.sprintApi.getMerchantcode() + this.user.getId());
            intent.putExtra("mobile", this.user.getMobile());
            intent.putExtra("lat", "42.10");
            intent.putExtra("lng", "76.00");
            intent.putExtra("firm", this.sprintApi.getFirm());
            intent.putExtra("email", this.user.getEmail());
            intent.addFlags(65536);
            startActivityForResult(intent, 993192);
        } else {
            ViewUtils.showToast(requireActivity(), "Location Permissions are not granted");
        }
    }

    public void startPayout() {
        startActivity(new Intent(requireActivity(), PaysprintPayout.class));
    }

    public void startAEPS() {
        startActivity(new Intent(requireActivity(), AepsHome.class));
    }

    public void startMicroAtm() {
        startActivity(new Intent(requireActivity(), MicroAtmHome.class));
    }

    public void startToBank() {
        this.viewModel.checkDmtExistence(requireActivity());
    }

    private void getCurrentLocation() {
        this.dialog.setTitle("Getting Location...");
        this.dialog.show();
        LocationRequest locationRequest = LocationRequest.create();
        locationRequest.setInterval(1000);
        locationRequest.setFastestInterval(300);
        locationRequest.setPriority(100);
        if (ActivityCompat.checkSelfPermission(requireContext(), "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(requireContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            LocationServices.getFusedLocationProviderClient((Activity) requireActivity()).requestLocationUpdates(locationRequest, new LocationCallback() {
                public void onLocationResult(LocationResult locationResult) {
                    super.onLocationResult(locationResult);
                    LocationServices.getFusedLocationProviderClient((Activity) HomeMenuFragments.this.requireActivity()).removeLocationUpdates((LocationCallback) this);
                    if (locationResult.getLocations().size() > 0) {
                        int latestLocationIndex = locationResult.getLocations().size() - 1;
                        HomeMenuFragments.this.latitude = Double.valueOf(locationResult.getLocations().get(latestLocationIndex).getLatitude());
                        HomeMenuFragments.this.longitude = Double.valueOf(locationResult.getLocations().get(latestLocationIndex).getLongitude());
                        HomeMenuFragments.this.dialog.dismiss();
                        ViewUtils.showToast(HomeMenuFragments.this.requireActivity(), "Latitude: " + HomeMenuFragments.this.latitude + "\nLongitude: " + HomeMenuFragments.this.longitude);
                    }
                }
            }, Looper.getMainLooper());
            return;
        }
        this.dialog.dismiss();
        ViewUtils.showToast(requireActivity(), "No Location Permission has given");
    }

    public void proceedToSeekMobileNumber() {
        startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI), 1412);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1412 && resultCode == -1) {
            Objects.requireNonNull(data);
            Cursor cursor = requireActivity().getContentResolver().query(data.getData(), new String[]{"data1"}, (String) null, (String[]) null, (String) null);
            String selectedPhone = "";
            if (cursor != null && cursor.moveToFirst()) {
                StringBuilder builder = new StringBuilder(cursor.getString(cursor.getColumnIndex("data1")).replaceAll("[^\\w]", ""));
                if (builder.charAt(0) == '9' && builder.charAt(1) == '1') {
                    builder.deleteCharAt(0);
                    builder.deleteCharAt(0);
                }
                selectedPhone = String.valueOf(builder);
            }
            Objects.requireNonNull(cursor);
            cursor.close();
            if (!AppDatabase.getAppDatabase(requireActivity()).getUserDao().getRegularUser().getMobile().equals(selectedPhone)) {
                this.viewModel.checkIfAccountExists(selectedPhone, this);
            } else {
                MyAlertUtils.showServerAlertDialog(requireActivity(), "Invalid choice");
            }
        } else if (requestCode == 993192 && resultCode == -1) {
            Objects.requireNonNull(data);
            boolean status = data.getBooleanExtra("status", false);
            String details = "Status: " + status + "\nResponse: " + data.getIntExtra("response", 0) + "\nMessage: " + data.getStringExtra("message");
            if (status) {
                this.viewModel.getOnBoardingStore(this.user.getMobile(), this.user.getOwnerstatus(), this.user.getOwnerid(), this.sprintApi.getPartnerid(), this.sprintApi.getMerchantcode() + this.user.getId(), "shfjshdkfjcbcjbdjsjsncs");
                return;
            }
            MyAlertUtils.anotherAlertDialog(requireActivity(), details, "Result", Integer.valueOf(C0330R.C0332drawable.warning));
        }
    }

    public void isNumberValid(AuthResponse authResponse) {
        if (authResponse.isStatus()) {
            MyAlertUtils.dismissAlertDialog();
            Intent intent = new Intent(requireActivity(), SendMoney.class);
            intent.putExtra("receiver_id", authResponse.getUser().getId());
            intent.putExtra("receiver_name", authResponse.getUser().getName() + MaskedEditText.SPACE + authResponse.getUser().getLastname());
            intent.putExtra("receiver_mobile", authResponse.getUser().getMobile());
            startActivity(intent);
            return;
        }
        MyAlertUtils.showServerAlertDialog(requireActivity(), authResponse.getMessage());
    }

    public void showMessage(String message) {
        MyAlertUtils.showServerAlertDialog(requireActivity(), message);
    }

    public void showProgress(String message) {
        MyAlertUtils.showProgressAlertDialog(requireActivity());
    }
}
