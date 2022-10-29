package com.sandy.cosmossoft.viewmodel;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fingpay.microatmsdk.utils.Constants;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.Provider;
import com.sandy.cosmossoft.activities.tobank.SelectBank;
import com.sandy.cosmossoft.activities.tobank.SelectedBeneficiaryHistory;
import com.sandy.cosmossoft.adapters.BeneficiaryAdapter;
import com.sandy.cosmossoft.adapters.SimpleBeneficiaryHistoryAdapter;
import com.sandy.cosmossoft.data.model.BankModel;
import com.sandy.cosmossoft.data.network.responses.BeneHistoryUpdateResponse;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryBank;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryDeleteResponse;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryHistoryResponse;
import com.sandy.cosmossoft.data.network.responses.DMTSendAmountResponse;
import com.sandy.cosmossoft.data.network.responses.QueryRemitterResponse;
import com.sandy.cosmossoft.data.network.responses.RegularResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.repositories.ToBankRepository;
import com.sandy.cosmossoft.databinding.OtpScreenLayoutBinding;
import com.sandy.cosmossoft.listeners.BeneficiaryClickListener;
import com.sandy.cosmossoft.listeners.BeneficiaryHistoryListener;
import com.sandy.cosmossoft.listeners.DMTHomeListeners;
import com.sandy.cosmossoft.listeners.PayoutListener;
import com.sandy.cosmossoft.listeners.RemitterListener;
import com.sandy.cosmossoft.listeners.SendAmountViewsListener;
import com.sandy.cosmossoft.listeners.ToBankListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.PopupUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class ToBankViewModel extends ViewModel {
    public static QueryRemitterResponse MyQueryRemitterResponse;
    public static String amount = null;
    public static String globalSelectedMobile = null;
    public static String pin_code = null;
    public static String remitter_dob = null;
    public static String remitter_mobile = null;
    public static BankModel selectedBank = null;
    public static BeneficiaryBank selectedBeneficiaryModel = null;
    public static String transType = null;
    public String account_holder_name = null;
    public String account_number = null;
    public String confirm_account_number = null;
    DatePickerDialog.OnDateSetListener date = new ToBankViewModel$$ExternalSyntheticLambda0(this);
    public String ifsc = null;
    public ToBankListener listener;
    private long mLastClickTime = 0;
    final Calendar myCalendar = Calendar.getInstance();
    public String nick_name = null;
    public PayoutListener payoutListener;
    public String phone_number = null;
    public RemitterListener remitterListener;
    public String remitter_address = null;
    public String remitter_first_name = null;
    public String remitter_last_name = null;
    public String remitter_otp = null;
    public SendAmountViewsListener sendAmountViewsListener;
    public ToBankRepository toBankRepository;

    @Inject
    public ToBankViewModel(ToBankRepository toBankRepository2) {
        this.toBankRepository = toBankRepository2;
    }

    public void getBankListsOnline() {
        this.toBankRepository.getAllBanksFromApi(this.listener);
    }

    public void onAddBankPage(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), SelectBank.class));
    }

    public void onConfirmBeneficiary(View view) {
        String str = globalSelectedMobile;
        if (str == null || str.isEmpty()) {
            MyAlertUtils.showServerAlertDialog(view.getContext(), "you are not authorised.");
            return;
        }
        String str2 = this.account_number;
        if (str2 == null || str2.isEmpty()) {
            MyAlertUtils.showServerAlertDialog(view.getContext(), "Provide Account number.");
            return;
        }
        String str3 = this.confirm_account_number;
        if (str3 == null || str3.isEmpty()) {
            MyAlertUtils.showServerAlertDialog(view.getContext(), "Confirm Account number.");
        } else if (!this.account_number.equals(this.confirm_account_number)) {
            MyAlertUtils.showServerAlertDialog(view.getContext(), "Account Numbers don't match.");
        } else {
            String str4 = this.ifsc;
            if (str4 == null || str4.isEmpty()) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Enter valid IFSC code.");
                return;
            }
            String str5 = this.account_holder_name;
            if (str5 == null || str5.isEmpty()) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Provide valid Account holder name.");
                return;
            }
            String str6 = remitter_dob;
            if (str6 == null || str6.isEmpty()) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Provide valid DOB.");
                return;
            }
            String str7 = this.remitter_address;
            if (str7 == null || str7.isEmpty()) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Provide valid Pin Code.");
                return;
            }
            String str8 = pin_code;
            if (str8 == null || str8.isEmpty() || pin_code.length() < 6) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Provide valid Pin Code.");
                return;
            }
            String str9 = this.nick_name;
            if (str9 == null || str9.isEmpty()) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Provide valid Nick Name.");
            } else {
                this.toBankRepository.addMyBeneficiary(view.getContext(), this.nick_name, this.phone_number, this.account_holder_name, this.ifsc, this.account_number, remitter_dob, this.remitter_address, pin_code, globalSelectedMobile);
            }
        }
    }

    public void onQueryRemitterButtonClick(View view) {
        String str = remitter_mobile;
        if (str == null || str.isEmpty()) {
            MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Provide valid Mobile Number", C0330R.C0332drawable.warning);
        } else {
            this.toBankRepository.query_remitter_checking(remitter_mobile, "", "", view.getContext());
        }
    }

    public void onRegisterRemitterButtonClick(View view) {
        String str = this.remitter_first_name;
        if (str == null || str.isEmpty()) {
            MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Provide valid First name", C0330R.C0332drawable.warning);
            return;
        }
        String str2 = this.remitter_last_name;
        if (str2 == null || str2.isEmpty()) {
            MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Provide valid Last name", C0330R.C0332drawable.warning);
            return;
        }
        String str3 = remitter_mobile;
        if (str3 == null || str3.isEmpty()) {
            MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Provide valid Last name", C0330R.C0332drawable.warning);
            return;
        }
        String str4 = this.remitter_otp;
        if (str4 == null || str4.isEmpty()) {
            MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Provide valid OTP", C0330R.C0332drawable.warning);
            return;
        }
        String str5 = remitter_dob;
        if (str5 == null || str5.isEmpty()) {
            MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Provide Date of Birth", C0330R.C0332drawable.warning);
            return;
        }
        String str6 = this.remitter_address;
        if (str6 == null || str6.isEmpty()) {
            MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Provide Address", C0330R.C0332drawable.warning);
            return;
        }
        String str7 = pin_code;
        if (str7 == null || str7.isEmpty()) {
            MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Provide Pin Code", C0330R.C0332drawable.warning);
        } else {
            this.toBankRepository.register_remitter(this.remitter_otp, remitter_dob, pin_code, view.getContext(), this.remitter_first_name, this.remitter_last_name, remitter_mobile, this.remitter_address);
        }
    }

    /* renamed from: lambda$new$0$com-sandy-cosmossoft-viewmodel-ToBankViewModel  reason: not valid java name */
    public /* synthetic */ void m2694lambda$new$0$comsandycosmossoftviewmodelToBankViewModel(DatePicker view1, int year, int monthOfYear, int dayOfMonth) {
        this.myCalendar.set(1, year);
        this.myCalendar.set(2, monthOfYear);
        this.myCalendar.set(5, dayOfMonth);
        updateLabel();
    }

    public void onDateSelectionClick(View view) {
        new DatePickerDialog(view.getContext(), this.date, this.myCalendar.get(1), this.myCalendar.get(2), this.myCalendar.get(5)).show();
    }

    private void updateLabel() {
        this.remitterListener.dateSetter(new SimpleDateFormat(Constants.DATE_FORMAT_HISTORY, Locale.ENGLISH).format(this.myCalendar.getTime()));
    }

    public void getBeneficiaries(Context context, RecyclerView recyclerView, BeneficiaryClickListener listener2, SearchView searchView, String givenMobile) {
        User user = AppDatabase.getAppDatabase(context).getUserDao().getRegularUser();
        if (givenMobile != null || user != null) {
            MyAlertUtils.showProgressAlertDialog(context);
            final RecyclerView recyclerView2 = recyclerView;
            final Context context2 = context;
            final BeneficiaryClickListener beneficiaryClickListener = listener2;
            final SearchView searchView2 = searchView;
            this.toBankRepository.apiServices.bringBeneficiary(givenMobile, user.getId(), user.getUserstatus()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<BeneficiaryBank>>() {
                public void onSubscribe(Disposable d) {
                }

                public void onNext(List<BeneficiaryBank> beneficiaryBankList) {
                    if (beneficiaryBankList.size() > 0) {
                        MyAlertUtils.dismissAlertDialog();
                        recyclerView2.setLayoutManager(new GridLayoutManager(context2, 1, 1, false));
                        final BeneficiaryAdapter adapter = new BeneficiaryAdapter(beneficiaryBankList, beneficiaryClickListener);
                        recyclerView2.setAdapter(adapter);
                        searchView2.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                            public boolean onQueryTextSubmit(String query) {
                                adapter.getFilter().filter(query);
                                return false;
                            }

                            public boolean onQueryTextChange(String newText) {
                                adapter.getFilter().filter(newText);
                                return false;
                            }
                        });
                        return;
                    }
                    MyAlertUtils.showAlertDialog(context2, "Warning", "No Beneficiary in Records", C0330R.C0332drawable.warning);
                }

                public void onError(Throwable e) {
                    Context context = context2;
                    MyAlertUtils.showServerAlertDialog(context, "Failed Due to: " + e.getMessage());
                }

                public void onComplete() {
                }
            });
        }
    }

    public void deleteThisBeneficiary(Context context, String bene_id, String bene_acc, RecyclerView recyclerView, BeneficiaryClickListener listener2, SearchView searchView) {
        User user = AppDatabase.getAppDatabase(context).getUserDao().getRegularUser();
        if (globalSelectedMobile != null) {
            MyAlertUtils.showProgressAlertDialog(context);
            final Context context2 = context;
            final RecyclerView recyclerView2 = recyclerView;
            final BeneficiaryClickListener beneficiaryClickListener = listener2;
            final SearchView searchView2 = searchView;
            this.toBankRepository.apiServices.deleteBeneficiary(user.getId(), user.getUserstatus(), bene_id, bene_acc, "delete_this", globalSelectedMobile).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<BeneficiaryDeleteResponse>() {
                public void onSubscribe(Disposable d) {
                }

                public void onNext(BeneficiaryDeleteResponse deleteResponse) {
                    if (!deleteResponse.isStatus() || ToBankViewModel.globalSelectedMobile == null || !deleteResponse.response_code.equals(1)) {
                        MyAlertUtils.showAlertDialog(context2, "Failed", deleteResponse.getMessage(), C0330R.C0332drawable.failed);
                    } else {
                        ToBankViewModel.this.getBeneficiaries(context2, recyclerView2, beneficiaryClickListener, searchView2, ToBankViewModel.globalSelectedMobile);
                    }
                }

                public void onError(Throwable e) {
                    Context context = context2;
                    MyAlertUtils.showServerAlertDialog(context, "Failed due to: " + e.getMessage());
                }

                public void onComplete() {
                }
            });
            return;
        }
    }

    public void onSpinnerClick(View view) {
        Dialog dialog = new Dialog(view.getContext());
        dialog.setContentView(C0330R.layout.my_spinner_row);
        dialog.getWindow().setLayout(-1, -2);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        ListView myOperatorListView = (ListView) dialog.findViewById(C0330R.C0333id.MyOperatorListView);
        List<String> list = new ArrayList<>();
        list.add("IMPS");
        list.add("NEFT");
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(view.getContext(), 17367043, list);
        myOperatorListView.setAdapter(adapter);
        ((EditText) dialog.findViewById(C0330R.C0333id.SearchOperator)).addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s);
            }

            public void afterTextChanged(Editable s) {
            }
        });
        myOperatorListView.setOnItemClickListener(new ToBankViewModel$$ExternalSyntheticLambda3(this, adapter, dialog));
    }

    /* renamed from: lambda$onSpinnerClick$1$com-sandy-cosmossoft-viewmodel-ToBankViewModel */
    public /* synthetic */ void mo48142x74c17f93(ArrayAdapter adapter, Dialog dialog, AdapterView parent, View view1, int position, long id) {
        this.payoutListener.onTransactionTypeChange((String) adapter.getItem(position));
        transType = (String) adapter.getItem(position);
        dialog.dismiss();
    }

    public void onSendDMTButtonClick(View view) {
        if (SystemClock.elapsedRealtime() - this.mLastClickTime >= 1000) {
            String str = amount;
            if (str == null) {
                View view2 = view;
            } else if (str.isEmpty()) {
                View view3 = view;
            } else {
                String str2 = transType;
                if (str2 == null) {
                    View view4 = view;
                } else if (str2.isEmpty()) {
                    View view5 = view;
                } else {
                    String str3 = globalSelectedMobile;
                    if (str3 == null) {
                        View view6 = view;
                    } else if (str3.isEmpty()) {
                        View view7 = view;
                    } else {
                        if (PopupUtil.access) {
                            String device = Provider.getDeviceModel();
                            String ip = Provider.getLocalIpAddress();
                            User user = AppDatabase.getAppDatabase(view.getContext()).getUserDao().getRegularUser();
                            if (user != null) {
                                MyAlertUtils.showProgressAlertDialog(view.getContext());
                                final View view8 = view;
                                this.toBankRepository.apiServices.sendAmountDMT(user.getId(), user.getUserstatus(), selectedBeneficiaryModel.getBene_id(), amount, selectedBeneficiaryModel.getAccno(), transType, device, ip, selectedBeneficiaryModel.getIfsc(), globalSelectedMobile).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<DMTSendAmountResponse>() {
                                    public void onSubscribe(Disposable d) {
                                    }

                                    public void onNext(DMTSendAmountResponse sendAmountResponse) {
                                        if (!sendAmountResponse.isStatus() || !sendAmountResponse.response_code.equals(1)) {
                                            MyAlertUtils.showAlertDialog(view8.getContext(), "Failed", sendAmountResponse.getMessage(), C0330R.C0332drawable.failed);
                                            return;
                                        }
                                        ToBankViewModel.this.sendAmountViewsListener.eraseAmountText();
                                        ToBankViewModel.amount = null;
                                        ToBankViewModel.transType = null;
                                        MyAlertUtils.showAlertDialog(view8.getContext(), "Success", sendAmountResponse.getMessage(), C0330R.C0332drawable.success);
                                    }

                                    public void onError(Throwable e) {
                                        Context context = view8.getContext();
                                        MyAlertUtils.showServerAlertDialog(context, "Failed due to: " + e.getMessage());
                                    }

                                    public void onComplete() {
                                    }
                                });
                            } else {
                                View view9 = view;
                            }
                        } else {
                            View view10 = view;
                            PopupUtil.tPinSystem(view.getContext(), this.toBankRepository.apiServices);
                        }
                        this.mLastClickTime = SystemClock.elapsedRealtime();
                    }
                    MyAlertUtils.showServerAlertDialog(view.getContext(), "You are not authorised.");
                    this.mLastClickTime = SystemClock.elapsedRealtime();
                }
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Please, select transaction type.");
                this.mLastClickTime = SystemClock.elapsedRealtime();
            }
            MyAlertUtils.showServerAlertDialog(view.getContext(), "Please, Provide right amount.");
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }

    public void onHistoryCheckOfBeneficiary(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), SelectedBeneficiaryHistory.class));
    }

    public void getSelectedBeneficiaryHistory(final Context context, final RecyclerView recyclerView, final BeneficiaryHistoryListener listener2) {
        User user = AppDatabase.getAppDatabase(context).getUserDao().getRegularUser();
        if (user != null) {
            MyAlertUtils.showProgressAlertDialog(context);
            this.toBankRepository.apiServices.getSelectedBeneficiaryHistory(user.getId(), user.getUserstatus(), selectedBeneficiaryModel.getBene_id()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<BeneficiaryHistoryResponse>>() {
                public void onSubscribe(Disposable d) {
                }

                public void onNext(List<BeneficiaryHistoryResponse> beneficiaryHistoryResponses) {
                    recyclerView.setLayoutManager(new GridLayoutManager(context, 1, 1, false));
                    recyclerView.setAdapter(new SimpleBeneficiaryHistoryAdapter(beneficiaryHistoryResponses, listener2));
                    MyAlertUtils.dismissAlertDialog();
                    if (beneficiaryHistoryResponses.isEmpty()) {
                        listener2.notifierScreen(true);
                        MyAlertUtils.showAlertDialog(context, "Information", "No History Exist of now", C0330R.C0332drawable.warning);
                    }
                }

                public void onError(Throwable e) {
                    Context context = context;
                    MyAlertUtils.showServerAlertDialog(context, "Failed due to: " + e.getMessage());
                    listener2.notifierScreen(true);
                }

                public void onComplete() {
                }
            });
        }
    }

    public void updateDMTTransactionNow(Context context, String reference_id, RecyclerView recyclerView, BeneficiaryHistoryListener listener2, String loc) {
        MyAlertUtils.showProgressAlertDialog(context);
        final Context context2 = context;
        final String str = loc;
        final RecyclerView recyclerView2 = recyclerView;
        final BeneficiaryHistoryListener beneficiaryHistoryListener = listener2;
        this.toBankRepository.apiServices.updateDMTTransaction(reference_id, "check_dmt_status").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<BeneHistoryUpdateResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(BeneHistoryUpdateResponse beneHistoryUpdateResponse) {
                if (beneHistoryUpdateResponse.isStatus() || beneHistoryUpdateResponse.response_code.equals(1)) {
                    MyAlertUtils.anotherAlertDialog(context2, "Success", beneHistoryUpdateResponse.getMessage(), Integer.valueOf(C0330R.C0332drawable.success));
                } else {
                    MyAlertUtils.anotherAlertDialog(context2, "Result", beneHistoryUpdateResponse.getMessage(), Integer.valueOf(C0330R.C0332drawable.warning));
                }
                if (str.equals(SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL)) {
                    ToBankViewModel.this.setAllHistories(context2, recyclerView2, beneficiaryHistoryListener);
                } else {
                    ToBankViewModel.this.getSelectedBeneficiaryHistory(context2, recyclerView2, beneficiaryHistoryListener);
                }
            }

            public void onError(Throwable e) {
                Context context = context2;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to: " + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void setAllHistories(final Context context, final RecyclerView recyclerView, final BeneficiaryHistoryListener listener2) {
        User user = AppDatabase.getAppDatabase(context).getUserDao().getRegularUser();
        if (user != null && globalSelectedMobile != null) {
            MyAlertUtils.showProgressAlertDialog(context);
            this.toBankRepository.apiServices.getAllBeneficiaryHistories(user.getId(), user.getUserstatus(), globalSelectedMobile).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<BeneficiaryHistoryResponse>>() {
                public void onSubscribe(Disposable d) {
                }

                public void onNext(List<BeneficiaryHistoryResponse> beneficiaryHistoryResponses) {
                    recyclerView.setLayoutManager(new GridLayoutManager(context, 1, 1, false));
                    recyclerView.setAdapter(new SimpleBeneficiaryHistoryAdapter(beneficiaryHistoryResponses, listener2));
                    MyAlertUtils.dismissAlertDialog();
                    if (beneficiaryHistoryResponses.isEmpty()) {
                        MyAlertUtils.showAlertDialog(context, "Information", "No History Exist of now", C0330R.C0332drawable.warning);
                    }
                }

                public void onError(Throwable e) {
                    Context context = context;
                    MyAlertUtils.showServerAlertDialog(context, "Failed due to: " + e.getMessage());
                }

                public void onComplete() {
                }
            });
        }
    }

    public void deleteDMTUserAccount(String id, final Context context, final DMTHomeListeners listeners) {
        MyAlertUtils.showProgressAlertDialog(context);
        this.toBankRepository.apiServices.deleteDmtUserAccount(id).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<Integer>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(Integer integer) {
                if (integer.intValue() == 1) {
                    ToBankViewModel.this.toBankRepository.getAllMyDMTReports(listeners);
                } else {
                    MyAlertUtils.showServerAlertDialog(context, "Failed to delete");
                }
            }

            public void onError(Throwable e) {
                Context context = context;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void refreshDMTUserAccount(String id, String mobile, final Context context, final DMTHomeListeners listeners) {
        MyAlertUtils.showProgressAlertDialog(context);
        this.toBankRepository.apiServices.refreshDmtUserAccount(id, mobile).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<QueryRemitterResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(QueryRemitterResponse queryRemitterResponse) {
                if (!queryRemitterResponse.isStatus() || queryRemitterResponse.response_code.intValue() != 1) {
                    MyAlertUtils.showServerAlertDialog(context, "Failed to refresh");
                } else {
                    ToBankViewModel.this.toBankRepository.getAllMyDMTReports(listeners);
                }
            }

            public void onError(Throwable e) {
                Context context = context;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void applyForRefundDmtTransaction(BeneficiaryHistoryListener listener2, Context context, String ackno, String refrence) {
        MyAlertUtils.showProgressAlertDialog(context);
        final BeneficiaryHistoryListener beneficiaryHistoryListener = listener2;
        final Context context2 = context;
        final String str = refrence;
        final String str2 = ackno;
        this.toBankRepository.apiServices.refundDmtTransaction(ackno, refrence).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(RegularResponse regularResponse) {
                if (!regularResponse.isStatus() || !regularResponse.getResponse_code().equals(1)) {
                    MyAlertUtils.showServerAlertDialog(context2, regularResponse.getMessage());
                    return;
                }
                MyAlertUtils.dismissAlertDialog();
                ToBankViewModel.this.otpPassingDesign(beneficiaryHistoryListener, context2, str, str2);
            }

            public void onError(Throwable e) {
                Context context = context2;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    /* access modifiers changed from: private */
    public void otpPassingDesign(BeneficiaryHistoryListener listener2, Context context, String refrence, String ackno) {
        Context context2 = context;
        Dialog dialog = new Dialog(context);
        OtpScreenLayoutBinding binding = OtpScreenLayoutBinding.inflate(LayoutInflater.from(context));
        dialog.setContentView(binding.getRoot());
        dialog.getWindow().setLayout(-1, -2);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        dialog.setCanceledOnTouchOutside(false);
        binding.cancelLayout.setOnClickListener(new ToBankViewModel$$ExternalSyntheticLambda1(dialog));
        binding.verifyOtp.setOnClickListener(new ToBankViewModel$$ExternalSyntheticLambda2(this, binding, context, listener2, dialog, refrence, ackno));
    }

    /* renamed from: lambda$otpPassingDesign$3$com-sandy-cosmossoft-viewmodel-ToBankViewModel */
    public /* synthetic */ void mo48143xe5191c4b(OtpScreenLayoutBinding binding, Context context, BeneficiaryHistoryListener listener2, Dialog dialog, String refrence, String ackno, View v) {
        OtpScreenLayoutBinding otpScreenLayoutBinding = binding;
        Editable text = otpScreenLayoutBinding.enterOtpDmt.getText();
        Objects.requireNonNull(text);
        Editable editable = text;
        if (text.toString().isEmpty()) {
            Context context2 = context;
            MyAlertUtils.showAlertDialog(context, "Warning", "Provide OTP", C0330R.C0332drawable.warning);
            return;
        }
        Context context3 = context;
        Editable text2 = otpScreenLayoutBinding.enterOtpDmt.getText();
        Objects.requireNonNull(text2);
        Editable editable2 = text2;
        verifyRefundAmountOTP(listener2, dialog, context, refrence, ackno, text2.toString());
    }

    private void verifyRefundAmountOTP(final BeneficiaryHistoryListener listener2, final Dialog dialog, final Context context, String refrence, String ackno, String otp) {
        MyAlertUtils.showProgressAlertDialog(context);
        this.toBankRepository.apiServices.verifyDmtTransaction(ackno, refrence, otp).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(RegularResponse regularResponse) {
                if (regularResponse.isStatus() || regularResponse.getResponse_code().equals(1)) {
                    dialog.dismiss();
                    listener2.bringAllOverHistoryAgain(true);
                    MyAlertUtils.anotherAlertDialog(context, "Result", regularResponse.getMessage(), Integer.valueOf(C0330R.C0332drawable.success));
                    return;
                }
                MyAlertUtils.showServerAlertDialog(context, regularResponse.getMessage());
            }

            public void onError(Throwable e) {
                Context context = context;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void pennyDropSelf(final Context context, String dmt_mobile, String acc) {
        User user = AppDatabase.getAppDatabase(context).getUserDao().getRegularUser();
        MyAlertUtils.showProgressAlertDialog(context);
        this.toBankRepository.apiServices.getThePennyDrop(dmt_mobile, acc, user.getId()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(RegularResponse response) {
                if (!response.status || !response.getResponse_code().equals(1)) {
                    MyAlertUtils.showAlertDialog(context, "Result", response.getMessage(), C0330R.C0332drawable.warning);
                } else {
                    MyAlertUtils.showAlertDialog(context, "Result", response.getMessage(), C0330R.C0332drawable.success);
                }
            }

            public void onError(Throwable e) {
                Context context = context;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }
}
