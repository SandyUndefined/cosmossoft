package com.sandy.cosmossoft.activities.tobank;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.tabs.TabLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.BankModel;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryBank;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryHistoryResponse;
import com.sandy.cosmossoft.databinding.ActivityToAccountBinding;
import com.sandy.cosmossoft.databinding.BottomBeneficiaryMoreSheetBinding;
import com.sandy.cosmossoft.listeners.BeneficiaryClickListener;
import com.sandy.cosmossoft.listeners.BeneficiaryHistoryListener;
import com.sandy.cosmossoft.listeners.ToBankListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;
import java.util.ArrayList;
import java.util.Objects;

public class ToAccount extends Hilt_ToAccount implements ToBankListener, BeneficiaryClickListener, BeneficiaryHistoryListener {
    ActivityToAccountBinding classBinding;
    ProgressDialog dialog;
    String mobile = "";
    ToBankViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityToAccountBinding inflate = ActivityToAccountBinding.inflate(getLayoutInflater());
        this.classBinding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "To Accounts");
        ToBankViewModel toBankViewModel = (ToBankViewModel) new ViewModelProvider(this).get(ToBankViewModel.class);
        this.viewModel = toBankViewModel;
        this.classBinding.setMyBankViewModel(toBankViewModel);
        this.viewModel.listener = this;
        this.classBinding.bankSearchView.findViewById(getResources().getIdentifier("android:id/search_plate", (String) null, (String) null)).setBackgroundColor(0);
        addTabs();
        String string = getIntent().getExtras().getString("number");
        this.mobile = string;
        ToBankViewModel.globalSelectedMobile = string;
        this.classBinding.myBankListRecycler.setLayoutManager(new GridLayoutManager((Context) this, 1, 1, false));
        this.viewModel.getBeneficiaries(this, this.classBinding.myBankListRecycler, this, this.classBinding.bankSearchView, this.mobile);
    }

    private void addTabs() {
        this.classBinding.bankOptionTabs.addTab(this.classBinding.bankOptionTabs.newTab().setText((CharSequence) "Bank\nAccounts"));
        this.classBinding.bankOptionTabs.addTab(this.classBinding.bankOptionTabs.newTab().setText((CharSequence) "Histories"));
        setListeners();
    }

    private void setListeners() {
        this.classBinding.bankOptionTabs.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {
            public void onTabSelected(TabLayout.Tab tab) {
                CharSequence text = tab.getText();
                Objects.requireNonNull(text);
                CharSequence charSequence = text;
                if (text.toString().equals("Histories")) {
                    ToAccount.this.classBinding.myBankListRecycler.setVisibility(8);
                    ToAccount.this.classBinding.myHistoryListRecycler.setVisibility(0);
                    ToBankViewModel toBankViewModel = ToAccount.this.viewModel;
                    ToAccount toAccount = ToAccount.this;
                    toBankViewModel.setAllHistories(toAccount, toAccount.classBinding.myHistoryListRecycler, ToAccount.this);
                    return;
                }
                ToAccount.this.classBinding.myBankListRecycler.setVisibility(0);
                ToAccount.this.classBinding.myHistoryListRecycler.setVisibility(8);
            }

            public void onTabUnselected(TabLayout.Tab tab) {
            }

            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    public void onStarted(String message) {
        if (this.dialog == null) {
            this.dialog = new ProgressDialog(this);
        }
        this.dialog.setTitle(message);
        this.dialog.show();
    }

    public void onCompleted(String message) {
        ProgressDialog progressDialog = this.dialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
            ViewUtils.showToast(this, message);
        }
    }

    public void onError(String message) {
        ViewUtils.showToast(this, message);
    }

    public void setAllBanks(ArrayList<BankModel> arrayList) {
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    public void onItemClicked(View view, BeneficiaryBank model) {
        ToBankViewModel.selectedBeneficiaryModel = model;
        startActivity(new Intent(this, SendAmountDMT.class));
    }

    public void onMoreClickListener(View view, final BeneficiaryBank model) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(view.getContext(), C0330R.C0337style.MyTransparentBottomSheetDialogTheme);
        BottomBeneficiaryMoreSheetBinding binding = BottomBeneficiaryMoreSheetBinding.inflate(LayoutInflater.from(view.getContext()));
        bottomSheetDialog.setContentView(binding.getRoot());
        bottomSheetDialog.show();
        bottomSheetDialog.setDismissWithAnimation(true);
        bottomSheetDialog.setCanceledOnTouchOutside(false);
        binding.cancelLayout.setOnClickListener(new ToAccount$$ExternalSyntheticLambda1(bottomSheetDialog));
        binding.removeLayout.setOnClickListener(new ToAccount$$ExternalSyntheticLambda3(this, model, bottomSheetDialog));
        binding.historyLayout.setOnClickListener(new ToAccount$$ExternalSyntheticLambda2(this, model));
        binding.pennyDrop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ToBankViewModel toBankViewModel = ToAccount.this.viewModel;
                ToAccount toAccount = ToAccount.this;
                toBankViewModel.pennyDropSelf(toAccount, toAccount.mobile, model.getAccno());
            }
        });
    }

    /* renamed from: lambda$onMoreClickListener$2$com-sandy-cosmossoft-activities-tobank-ToAccount */
    public /* synthetic */ void mo79x7d68052c(BeneficiaryBank model, BottomSheetDialog bottomSheetDialog, View v) {
        DialogInterface.OnClickListener dialogClickListener = new ToAccount$$ExternalSyntheticLambda0(this, model, bottomSheetDialog);
        new AlertDialog.Builder(this).setMessage("Are you sure?").setPositiveButton("Yes", dialogClickListener).setNegativeButton("No", dialogClickListener).show();
    }

    /* renamed from: lambda$onMoreClickListener$1$com-sandy-cosmossoft-activities-tobank-ToAccount */
    public /* synthetic */ void mo78xf02d53ab(BeneficiaryBank model, BottomSheetDialog bottomSheetDialog, DialogInterface dialog2, int which) {
        switch (which) {
            case -1:
                this.viewModel.deleteThisBeneficiary(this, model.getBene_id(), model.getAccno(), this.classBinding.myBankListRecycler, this, this.classBinding.bankSearchView);
                bottomSheetDialog.dismiss();
                return;
            default:
                return;
        }
    }

    /* renamed from: lambda$onMoreClickListener$3$com-sandy-cosmossoft-activities-tobank-ToAccount */
    public /* synthetic */ void mo80xaa2b6ad(BeneficiaryBank model, View v) {
        Intent intent = new Intent(this, SelectedBeneficiaryHistory.class);
        ToBankViewModel.selectedBeneficiaryModel = model;
        startActivity(intent);
    }

    public void clickOnMoreInfo(View view, BeneficiaryHistoryResponse history) {
        Intent intent = new Intent(this, DetailedHistoryScreen.class);
        SelectedBeneficiaryHistory.selectedHistory = history;
        startActivity(intent);
    }

    public void clickOnUpdateInfo(View view, BeneficiaryHistoryResponse history) {
        this.viewModel.updateDMTTransactionNow(this, history.getReference_id(), this.classBinding.myHistoryListRecycler, this, SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL);
    }

    public void notifierScreen(boolean result) {
    }

    public void clickOnRefund(View view, BeneficiaryHistoryResponse history) {
        if (history.getData().getAckno() == null || history.getData().getAckno().isEmpty()) {
            MyAlertUtils.showAlertDialog(this, "Result", "Not Eligible for refund", C0330R.C0332drawable.warning);
        } else if (history.refundable) {
            this.viewModel.applyForRefundDmtTransaction(this, this, history.getData().getAckno(), history.getReference_id());
        } else {
            MyAlertUtils.showAlertDialog(this, "Result", "Not Eligible for refund", C0330R.C0332drawable.warning);
        }
    }

    public void bringAllOverHistoryAgain(boolean status) {
        if (status) {
            this.viewModel.setAllHistories(this, this.classBinding.myHistoryListRecycler, this);
        }
    }
}
