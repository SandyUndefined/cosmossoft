package com.sandy.cosmossoft.fragments;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.databinding.DataBindingUtil;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fingpay.microatmsdk.utils.Constants;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.adapters.AnalyticAdapter;
import com.sandy.cosmossoft.data.model.HistoryModel;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import com.sandy.cosmossoft.databinding.BottomSheetTransactionTypeBinding;
import com.sandy.cosmossoft.databinding.FragmentAnalyticBinding;
import com.sandy.cosmossoft.listeners.AnalyticOperationListener;
import com.sandy.cosmossoft.listeners.BringHistoryListener;
import com.sandy.cosmossoft.util.DisplayMessageUtil;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.HomeViewModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class AnalyticFragment extends Hilt_AnalyticFragment implements BringHistoryListener, AnalyticOperationListener {
    AnalyticAdapter adapter;
    AlertDialog alertDialog;
    FragmentAnalyticBinding binding;
    ProgressDialog dialog;
    String fromDate = "";
    GridLayoutManager gridLayoutManager;
    List<AnalyticsResponseModel> historyList = new ArrayList();
    HomeViewModel homeViewModel;

    /* renamed from: id */
    String f155id = "";
    String indexing = "0";
    final Calendar myCalendar = Calendar.getInstance();
    String result = "";
    String tAddfund = "";
    String tAePS = "";
    String tBBPS = "";
    String tDMT = "";
    String tMicroAtm = "";
    String tPayout = "";
    String tRecharge = "";
    String toDate = "";
    String transType = "";

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.binding = (FragmentAnalyticBinding) DataBindingUtil.inflate(inflater, C0330R.layout.fragment_analytic, container, false);
        HomeViewModel homeViewModel2 = (HomeViewModel) new ViewModelProvider(this).get(HomeViewModel.class);
        this.homeViewModel = homeViewModel2;
        this.binding.setAnalyticsViewModel(homeViewModel2);
        this.homeViewModel.historyListener = this;
        this.dialog = new ProgressDialog(requireActivity());
        this.gridLayoutManager = new GridLayoutManager((Context) requireActivity(), 1, 1, false);
        this.binding.historyData.setLayoutManager(this.gridLayoutManager);
        this.adapter = new AnalyticAdapter(this.historyList, this);
        this.binding.historyData.setAdapter(this.adapter);
        startFiltering();
        onScrolledToBottom();
        return this.binding.getRoot();
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setListeners();
    }

    public void onStart(String message) {
        this.dialog.setMessage(message);
        this.dialog.show();
    }

    public void onComplete(String message) {
        this.dialog.dismiss();
    }

    public void onHistoryBrought(List<HistoryModel> list) {
    }

    public void onAnalyticsBrought(List<AnalyticsResponseModel> list) {
        if (list.size() != 0 || !this.indexing.equals("0")) {
            this.binding.noRecords.setVisibility(8);
        } else {
            this.binding.noRecords.setVisibility(0);
        }
        setHistory(list);
    }

    public void onFailure(String message) {
        this.dialog.setMessage(message);
    }

    private void setHistory(List<AnalyticsResponseModel> historyList2) {
        this.adapter.setAllData(historyList2);
        this.adapter.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    public void startFiltering() {
        AnalyticAdapter analyticAdapter = this.adapter;
        if (analyticAdapter != null) {
            this.f155id = analyticAdapter.getLastPositionId();
        }
        this.homeViewModel.homeRepository.getAnalyticsData(this, this.indexing, this.fromDate, this.toDate, this.transType, this.result, this.f155id);
    }

    private void onScrolledToBottom() {
        this.binding.historyData.addOnScrollListener(new RecyclerView.OnScrollListener() {
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                int position;
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == 0 && (position = AnalyticFragment.this.getLast()) == AnalyticFragment.this.adapter.getItemCount() - 1) {
                    AnalyticFragment analyticFragment = AnalyticFragment.this;
                    analyticFragment.f155id = analyticFragment.adapter.getLastPositionId();
                    AnalyticFragment.this.indexing = String.valueOf(position + 1);
                    AnalyticFragment.this.startFiltering();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public int getLast() {
        RecyclerView.LayoutManager layoutManager = this.binding.historyData.getLayoutManager();
        Objects.requireNonNull(layoutManager);
        return ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
    }

    private void setListeners() {
        this.binding.selectedDate.setOnClickListener(new AnalyticFragment$$ExternalSyntheticLambda14(this));
        this.binding.categories.setOnClickListener(new AnalyticFragment$$ExternalSyntheticLambda15(this));
        this.binding.statusFilter.setOnClickListener(new AnalyticFragment$$ExternalSyntheticLambda16(this));
    }

    /* renamed from: lambda$setListeners$0$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1389x9f79e8aa(View view) {
        setPopUpFilterDates();
    }

    /* renamed from: lambda$setListeners$1$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1390xcd528309(View view) {
        bottomSheetTransactionType();
    }

    /* renamed from: lambda$setListeners$2$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1391xfb2b1d68(View view) {
        onSpinnerClickResult();
    }

    public void setPopUpFilterDates() {
        AlertDialog.Builder alert = new AlertDialog.Builder(requireActivity(), C0330R.C0337style.MyTransparentBottomSheetDialogTheme);
        View view = LayoutInflater.from(requireActivity()).inflate(C0330R.layout.pop_up_filter, (ViewGroup) null, false);
        TextView fromDate2 = (TextView) view.findViewById(C0330R.C0333id.FromFilterAnalyticDate);
        TextView toDate2 = (TextView) view.findViewById(C0330R.C0333id.ToFilterAnalyticDate);
        toDate2.setCompoundDrawablesWithIntrinsicBounds(C0330R.C0332drawable.ic_baseline_calendar_today_24, 0, 0, 0);
        toDate2.setCompoundDrawablePadding(20);
        fromDate2.setCompoundDrawablesWithIntrinsicBounds(C0330R.C0332drawable.ic_baseline_calendar_today_24, 0, 0, 0);
        fromDate2.setCompoundDrawablePadding(20);
        alert.setView(view);
        AlertDialog create = alert.create();
        this.alertDialog = create;
        create.setCanceledOnTouchOutside(false);
        this.alertDialog.show();
        toDate2.setText(getToDate());
        fromDate2.setText(getFromDate());
        DatePickerDialog.OnDateSetListener fromDatePicker = new AnalyticFragment$$ExternalSyntheticLambda0(this, fromDate2);
        toDate2.setOnClickListener(new AnalyticFragment$$ExternalSyntheticLambda18(this, new AnalyticFragment$$ExternalSyntheticLambda11(this, toDate2)));
        fromDate2.setOnClickListener(new AnalyticFragment$$ExternalSyntheticLambda19(this, fromDatePicker));
        ((Button) view.findViewById(C0330R.C0333id.FilterAnalyticResetButton)).setOnClickListener(new AnalyticFragment$$ExternalSyntheticLambda20(this, toDate2, fromDate2));
        ((Button) view.findViewById(C0330R.C0333id.FilterAnalyticButton)).setOnClickListener(new AnalyticFragment$$ExternalSyntheticLambda1(this, toDate2, fromDate2));
        ((ImageView) view.findViewById(C0330R.C0333id.cancel_image)).setOnClickListener(new AnalyticFragment$$ExternalSyntheticLambda17(this));
    }

    /* renamed from: lambda$setPopUpFilterDates$3$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1392x6b40035b(TextView fromDate2, DatePicker view1, int year, int monthOfYear, int dayOfMonth) {
        this.myCalendar.set(1, year);
        this.myCalendar.set(2, monthOfYear);
        this.myCalendar.set(5, dayOfMonth);
        setFromDates(updateLabel(fromDate2));
    }

    /* renamed from: lambda$setPopUpFilterDates$4$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1393x99189dba(TextView toDate2, DatePicker view1, int year, int monthOfYear, int dayOfMonth) {
        this.myCalendar.set(1, year);
        this.myCalendar.set(2, monthOfYear);
        this.myCalendar.set(5, dayOfMonth);
        setToDates(updateLabel(toDate2));
    }

    /* renamed from: lambda$setPopUpFilterDates$5$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1394xc6f13819(DatePickerDialog.OnDateSetListener toDatePicker, View view12) {
        new DatePickerDialog(requireActivity(), toDatePicker, this.myCalendar.get(1), this.myCalendar.get(2), this.myCalendar.get(5)).show();
    }

    /* renamed from: lambda$setPopUpFilterDates$6$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1395xf4c9d278(DatePickerDialog.OnDateSetListener fromDatePicker, View view13) {
        new DatePickerDialog(requireActivity(), fromDatePicker, this.myCalendar.get(1), this.myCalendar.get(2), this.myCalendar.get(5)).show();
    }

    /* renamed from: lambda$setPopUpFilterDates$7$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1396x22a26cd7(TextView toDate2, TextView fromDate2, View view15) {
        toDate2.setText("");
        fromDate2.setText("");
        resetDates();
        this.f155id = "0";
        this.indexing = "0";
        this.adapter.resetTheList();
        startFiltering();
        this.alertDialog.dismiss();
    }

    /* renamed from: lambda$setPopUpFilterDates$8$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1397x507b0736(TextView toDate2, TextView fromDate2, View v) {
        if (toDate2.getText().toString().isEmpty() || fromDate2.getText().toString().isEmpty()) {
            MyAlertUtils.showAlertDialog(requireActivity(), "Warning", "Provide both dates", C0330R.C0332drawable.warning);
            return;
        }
        this.adapter.resetTheList();
        this.indexing = "0";
        startFiltering();
        this.alertDialog.dismiss();
    }

    /* renamed from: lambda$setPopUpFilterDates$9$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1398x7e53a195(View view14) {
        this.alertDialog.dismiss();
    }

    private String updateLabel(TextView textView) {
        textView.setText(new SimpleDateFormat(Constants.DATE_FORMAT2, Locale.ENGLISH).format(this.myCalendar.getTime()));
        return textView.getText().toString();
    }

    private void resetDates() {
        this.toDate = "";
        this.fromDate = "";
    }

    private void setToDates(String value) {
        this.toDate = value;
    }

    private void setFromDates(String value) {
        this.fromDate = value;
    }

    private String getFromDate() {
        return this.fromDate;
    }

    private String getToDate() {
        return this.toDate;
    }

    private void bottomSheetTransactionType() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(requireActivity(), C0330R.C0337style.MyTransparentBottomSheetDialogTheme);
        BottomSheetTransactionTypeBinding categoryBinding = BottomSheetTransactionTypeBinding.inflate(LayoutInflater.from(requireActivity()));
        bottomSheetDialog.setContentView(categoryBinding.getRoot());
        bottomSheetDialog.show();
        bottomSheetDialog.setDismissWithAnimation(true);
        bottomSheetDialog.setCanceledOnTouchOutside(false);
        categoryBinding.cancelImage.setOnClickListener(new AnalyticFragment$$ExternalSyntheticLambda13(bottomSheetDialog));
        categoryBinding.rechargeCheck.setOnCheckedChangeListener(new AnalyticFragment$$ExternalSyntheticLambda5(this));
        categoryBinding.bbpsCheck.setOnCheckedChangeListener(new AnalyticFragment$$ExternalSyntheticLambda6(this));
        categoryBinding.aepsCheck.setOnCheckedChangeListener(new AnalyticFragment$$ExternalSyntheticLambda7(this));
        categoryBinding.dmtCheck.setOnCheckedChangeListener(new AnalyticFragment$$ExternalSyntheticLambda8(this));
        categoryBinding.microatmCheck.setOnCheckedChangeListener(new AnalyticFragment$$ExternalSyntheticLambda9(this));
        categoryBinding.addFundCheck.setOnCheckedChangeListener(new AnalyticFragment$$ExternalSyntheticLambda10(this));
        categoryBinding.payoutCheck.setOnCheckedChangeListener(new AnalyticFragment$$ExternalSyntheticLambda12(this));
        if (this.tRecharge.equals("R")) {
            categoryBinding.rechargeCheck.setChecked(true);
        }
        if (this.tBBPS.equals("B")) {
            categoryBinding.bbpsCheck.setChecked(true);
        }
        if (this.tAePS.equals(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) {
            categoryBinding.aepsCheck.setChecked(true);
        }
        if (this.tDMT.equals("D")) {
            categoryBinding.dmtCheck.setChecked(true);
        }
        if (this.tMicroAtm.equals("M")) {
            categoryBinding.microatmCheck.setChecked(true);
        }
        if (this.tAddfund.equals("F")) {
            categoryBinding.addFundCheck.setChecked(true);
        }
        if (this.tPayout.equals(org.apache.xml.security.utils.Constants._TAG_P)) {
            categoryBinding.payoutCheck.setChecked(true);
        }
        categoryBinding.clearText.setOnClickListener(new AnalyticFragment$$ExternalSyntheticLambda3(this, categoryBinding));
        categoryBinding.applyFilter.setOnClickListener(new AnalyticFragment$$ExternalSyntheticLambda2(this, bottomSheetDialog));
    }

    /* renamed from: lambda$bottomSheetTransactionType$11$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1379xaddb7d4d(CompoundButton compoundButton, boolean b) {
        if (b) {
            this.tRecharge = "R";
        } else {
            this.tRecharge = "";
        }
    }

    /* renamed from: lambda$bottomSheetTransactionType$12$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1380xdbb417ac(CompoundButton compoundButton, boolean b) {
        if (b) {
            this.tBBPS = "B";
        } else {
            this.tBBPS = "";
        }
    }

    /* renamed from: lambda$bottomSheetTransactionType$13$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1381x98cb20b(CompoundButton compoundButton, boolean b) {
        if (b) {
            this.tAePS = ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
        } else {
            this.tAePS = "";
        }
    }

    /* renamed from: lambda$bottomSheetTransactionType$14$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1382x37654c6a(CompoundButton compoundButton, boolean b) {
        if (b) {
            this.tDMT = "D";
        } else {
            this.tDMT = "";
        }
    }

    /* renamed from: lambda$bottomSheetTransactionType$15$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1383x653de6c9(CompoundButton compoundButton, boolean b) {
        if (b) {
            this.tMicroAtm = "M";
        } else {
            this.tMicroAtm = "";
        }
    }

    /* renamed from: lambda$bottomSheetTransactionType$16$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1384x93168128(CompoundButton compoundButton, boolean b) {
        if (b) {
            this.tAddfund = "F";
        } else {
            this.tAddfund = "";
        }
    }

    /* renamed from: lambda$bottomSheetTransactionType$17$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1385xc0ef1b87(CompoundButton compoundButton, boolean b) {
        if (b) {
            this.tPayout = org.apache.xml.security.utils.Constants._TAG_P;
        } else {
            this.tPayout = "";
        }
    }

    /* renamed from: lambda$bottomSheetTransactionType$18$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1386xeec7b5e6(BottomSheetTransactionTypeBinding categoryBinding, View view) {
        categoryBinding.rechargeCheck.setChecked(false);
        categoryBinding.bbpsCheck.setChecked(false);
        categoryBinding.aepsCheck.setChecked(false);
        categoryBinding.dmtCheck.setChecked(false);
        categoryBinding.microatmCheck.setChecked(false);
        categoryBinding.addFundCheck.setChecked(false);
        categoryBinding.payoutCheck.setChecked(false);
        this.tAddfund = "";
        this.tRecharge = "";
        this.tBBPS = "";
        this.tAePS = "";
        this.tDMT = "";
        this.tMicroAtm = "";
        this.transType = "";
        this.tPayout = "";
    }

    /* renamed from: lambda$bottomSheetTransactionType$19$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1387x1ca05045(BottomSheetDialog bottomSheetDialog, View view) {
        String str = this.tRecharge + this.tBBPS + this.tAePS + this.tDMT + this.tMicroAtm + this.tAddfund + this.tPayout;
        this.transType = str;
        if (str.isEmpty()) {
            MyAlertUtils.showAlertDialog(requireActivity(), "Warning", "Select any category", C0330R.C0332drawable.warning);
            return;
        }
        this.adapter.resetTheList();
        this.indexing = "0";
        startFiltering();
        bottomSheetDialog.dismiss();
    }

    public void onSpinnerClickResult() {
        Dialog dialog2 = new Dialog(requireActivity());
        dialog2.setContentView(C0330R.layout.my_spinner_row);
        dialog2.getWindow().setLayout(-1, -2);
        dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog2.setCanceledOnTouchOutside(false);
        dialog2.show();
        ListView myOperatorListView = (ListView) dialog2.findViewById(C0330R.C0333id.MyOperatorListView);
        List<String> list = new ArrayList<>();
        ((TextView) dialog2.findViewById(C0330R.C0333id.head_title_section)).setText("Transaction Status");
        list.add("All");
        list.add("Success");
        list.add("Failed");
        final ArrayAdapter<String> adapter2 = new ArrayAdapter<>(requireActivity(), 17367043, list);
        myOperatorListView.setAdapter(adapter2);
        ((EditText) dialog2.findViewById(C0330R.C0333id.SearchOperator)).addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter2.getFilter().filter(s);
            }

            public void afterTextChanged(Editable s) {
            }
        });
        myOperatorListView.setOnItemClickListener(new AnalyticFragment$$ExternalSyntheticLambda4(this, adapter2, dialog2));
    }

    /* renamed from: lambda$onSpinnerClickResult$20$com-sandy-cosmossoft-fragments-AnalyticFragment */
    public /* synthetic */ void mo1388xc213a876(ArrayAdapter adapter2, Dialog dialog2, AdapterView parent, View view1, int position, long id) {
        this.result = ((String) adapter2.getItem(position)).toLowerCase();
        this.adapter.resetTheList();
        this.indexing = "0";
        startFiltering();
        dialog2.dismiss();
    }

    public void checkMyDetailsOf(View view, AnalyticsResponseModel model) {
        if (model.getId() != null) {
            this.homeViewModel.homeRepository.fullDetailsOfAnalytics(requireActivity(), model.getId(), model);
            return;
        }
        ViewUtils.showToast(requireActivity(), "No Data Response for this report");
    }

    public void updateMyDetailsOf(View view, AnalyticsResponseModel model) {
        try {
            this.homeViewModel.homeRepository.updatePendingStatus(model.getTxn_id(), model.getTransactionType(), requireActivity(), this);
        } catch (NullPointerException e) {
            FragmentActivity requireActivity = requireActivity();
            DisplayMessageUtil.error(requireActivity, "Not Eligible Because of " + e.getLocalizedMessage());
        }
    }

    public void observerData(MaterialButton button, AnalyticsResponseModel model) {
        try {
            if (model.getTransactionType().equals("PAN")) {
                button.setVisibility(8);
            } else {
                button.setVisibility(0);
            }
        } catch (NullPointerException e) {
            button.setVisibility(8);
        }
    }

    public void resetAllData() {
        this.adapter.resetTheList();
        this.indexing = "0";
        startFiltering();
    }
}
