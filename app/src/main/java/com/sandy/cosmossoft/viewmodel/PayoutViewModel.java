package com.sandy.cosmossoft.viewmodel;

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
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModel;
import com.google.android.material.textfield.TextInputEditText;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.activities.payoutpaysprint.PayoutAddAccount;
import com.sandy.cosmossoft.data.model.BankModel;
import com.sandy.cosmossoft.data.repositories.PayoutRepository;
import com.sandy.cosmossoft.databinding.SendPayoutDesignBinding;
import com.sandy.cosmossoft.listeners.PayoutListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class PayoutViewModel extends ViewModel {
    public String IFSC = "";
    public String accountNumber = "";
    public String account_holder_name = "";
    public String account_no = "";
    public String account_number = "";
    public String backAadhaarEncodedImage = "";
    /* access modifiers changed from: private */
    public ArrayList<BankModel> bankList;
    private String bank_id = "";
    private String bank_name = "";
    public String bene_id = "";
    public String beneficiaryName = "";
    public String confirm_account_number = "";
    public String doc_type = "";
    public String enteredAmount = "";
    public String frontAadhaarEncodedImage = "";
    public String ifsc = "";
    public PayoutListener listener;
    private long mLastClickTime = 0;
    String mode = "";
    public String panCardEncodedImage = "";
    public String passbookEncodedImage = "";
    public PayoutRepository repository;
    public String transType = "";

    @Inject
    public PayoutViewModel(PayoutRepository repository2) {
        this.repository = repository2;
    }

    public void onPayToBankClick(View view) {
        if (SystemClock.elapsedRealtime() - this.mLastClickTime >= 1000) {
            String str = this.accountNumber;
            if (str == null || str.isEmpty()) {
                MyAlertUtils.showWarningAlertDialog(view.getContext(), "Provide Account Number");
            } else {
                String str2 = this.IFSC;
                if (str2 == null || str2.isEmpty()) {
                    MyAlertUtils.showWarningAlertDialog(view.getContext(), "Provide IFSC Number");
                } else {
                    String str3 = this.enteredAmount;
                    if (str3 == null || str3.isEmpty()) {
                        MyAlertUtils.showWarningAlertDialog(view.getContext(), "Provide Amount");
                    } else {
                        String str4 = this.transType;
                        if (str4 == null || str4.isEmpty()) {
                            MyAlertUtils.showWarningAlertDialog(view.getContext(), "Provide Transaction type");
                        } else {
                            this.repository.reAuthenticateTheUser("dmt", view.getContext(), this.enteredAmount, this.account_number, this.ifsc, this.transType, this.listener);
                        }
                    }
                }
            }
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }

    public void verifyPayoutDocuments(View view) {
        if (SystemClock.elapsedRealtime() - this.mLastClickTime >= 1000) {
            if (this.doc_type.isEmpty()) {
                MyAlertUtils.showWarningAlertDialog(view.getContext(), "Select Document Type");
            } else if (this.passbookEncodedImage.isEmpty()) {
                MyAlertUtils.showWarningAlertDialog(view.getContext(), "Select Passbook Image");
            } else if (this.doc_type.equals("PAN")) {
                if (this.panCardEncodedImage.isEmpty()) {
                    MyAlertUtils.showWarningAlertDialog(view.getContext(), "Select Pan Card");
                } else {
                    this.repository.verifyAccount(view.getContext(), this.panCardEncodedImage, this.frontAadhaarEncodedImage, this.backAadhaarEncodedImage, this.passbookEncodedImage, this.doc_type, this.account_no, this.bene_id);
                }
            } else if (this.doc_type.equals("AADHAAR")) {
                if (this.frontAadhaarEncodedImage.isEmpty()) {
                    MyAlertUtils.showWarningAlertDialog(view.getContext(), "Select Front Aadhaar");
                } else if (this.backAadhaarEncodedImage.isEmpty()) {
                    MyAlertUtils.showWarningAlertDialog(view.getContext(), "Select Back Aadhaar");
                } else {
                    this.repository.verifyAccount(view.getContext(), this.panCardEncodedImage, this.frontAadhaarEncodedImage, this.backAadhaarEncodedImage, this.passbookEncodedImage, this.doc_type, this.account_no, this.bene_id);
                }
            }
            this.mLastClickTime = SystemClock.elapsedRealtime();
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
        myOperatorListView.setOnItemClickListener(new PayoutViewModel$$ExternalSyntheticLambda2(this, adapter, dialog));
    }

    /* renamed from: lambda$onSpinnerClick$0$com-sandy-cosmossoft-viewmodel-PayoutViewModel */
    public /* synthetic */ void mo48100xc25b0063(ArrayAdapter adapter, Dialog dialog, AdapterView parent, View view1, int position, long id) {
        this.listener.onTransactionTypeChange((String) adapter.getItem(position));
        this.transType = (String) adapter.getItem(position);
        dialog.dismiss();
    }

    public void onConfirmBeneficiary(View view) {
    }

    public void addMorePayoutAccount(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), PayoutAddAccount.class));
    }

    public void onAddPayoutAccountButton(View view) {
        if (SystemClock.elapsedRealtime() - this.mLastClickTime >= 1000) {
            String str = this.accountNumber;
            if (str == null || str.isEmpty()) {
                MyAlertUtils.showWarningAlertDialog(view.getContext(), "Provide Account Number");
            } else {
                String str2 = this.IFSC;
                if (str2 == null || str2.isEmpty()) {
                    MyAlertUtils.showWarningAlertDialog(view.getContext(), "Provide IFSC Number");
                } else {
                    String str3 = this.beneficiaryName;
                    if (str3 == null || str3.isEmpty()) {
                        MyAlertUtils.showWarningAlertDialog(view.getContext(), "Provide Beneficiary Name");
                    } else {
                        String str4 = this.bank_id;
                        if (str4 == null || str4.isEmpty()) {
                            MyAlertUtils.showWarningAlertDialog(view.getContext(), "Select a bank");
                        } else {
                            this.repository.addPayoutAccount(view.getContext(), this.bank_id, this.accountNumber, this.IFSC, this.beneficiaryName, this.bank_name);
                        }
                    }
                }
            }
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }

    public void onSelectBankClick(View view) {
        TextInputEditText editText = (TextInputEditText) view.findViewById(C0330R.C0333id.bankName);
        if (this.bankList == null) {
            getAllBanksFromApi(editText);
        } else {
            onSpinnerBankClick(editText);
        }
    }

    public void getAllBanksFromApi(final TextInputEditText editText) {
        MyAlertUtils.showProgressAlertDialog(editText.getContext());
        this.repository.apiServices.getAllBanks().subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<ArrayList<BankModel>>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(ArrayList<BankModel> bankModelList) {
                MyAlertUtils.dismissAlertDialog();
                ArrayList unused = PayoutViewModel.this.bankList = bankModelList;
                PayoutViewModel.this.onSpinnerBankClick(editText);
            }

            public void onError(Throwable e) {
                Context context = editText.getContext();
                MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getLocalizedMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void onSpinnerBankClick(TextInputEditText editText) {
        Dialog dialog = new Dialog(editText.getContext());
        dialog.setContentView(C0330R.layout.my_spinner_row);
        dialog.getWindow().setLayout(-1, -2);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        ListView myOperatorListView = (ListView) dialog.findViewById(C0330R.C0333id.MyOperatorListView);
        ((TextView) dialog.findViewById(C0330R.C0333id.head_title_section)).setText("Select Bank");
        final ArrayAdapter<BankModel> adapter = new ArrayAdapter<>(editText.getContext(), 17367043, this.bankList);
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
        myOperatorListView.setOnItemClickListener(new PayoutViewModel$$ExternalSyntheticLambda3(this, editText, adapter, dialog));
    }

    /* renamed from: lambda$onSpinnerBankClick$1$com-sandy-cosmossoft-viewmodel-PayoutViewModel */
    public /* synthetic */ void mo48099x800479c8(TextInputEditText editText, ArrayAdapter adapter, Dialog dialog, AdapterView parent, View view1, int position, long id) {
        editText.setText(((BankModel) adapter.getItem(position)).getBankname());
        this.bank_id = ((BankModel) adapter.getItem(position)).getBankid();
        this.bank_name = ((BankModel) adapter.getItem(position)).getBankname();
        dialog.dismiss();
    }

    public void sendPayoutScreen(String bene_id2, Context context) {
        this.mode = "";
        SendPayoutDesignBinding binding = SendPayoutDesignBinding.inflate(LayoutInflater.from(context));
        Dialog dialog = new Dialog(context, C0330R.C0337style.MyTransparentBottomSheetDialogTheme);
        dialog.setContentView(binding.getRoot());
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
        binding.cancel.setOnClickListener(new PayoutViewModel$$ExternalSyntheticLambda0(dialog));
        binding.paySelection.setOnCheckedChangeListener(new PayoutViewModel$$ExternalSyntheticLambda4(this));
        binding.sendAmountUser.setOnClickListener(new PayoutViewModel$$ExternalSyntheticLambda1(this, binding, context, dialog, bene_id2));
    }

    /* renamed from: lambda$sendPayoutScreen$3$com-sandy-cosmossoft-viewmodel-PayoutViewModel */
    public /* synthetic */ void mo48101xb9392752(RadioGroup group, int checkedId) {
        if (checkedId == C0330R.C0333id.imps) {
            this.mode = "IMPS";
        } else {
            this.mode = "NEFT";
        }
    }

    /* renamed from: lambda$sendPayoutScreen$4$com-sandy-cosmossoft-viewmodel-PayoutViewModel */
    public /* synthetic */ void mo48102xfcc44513(SendPayoutDesignBinding binding, Context context, Dialog dialog, String bene_id2, View v) {
        Editable text = binding.amount.getText();
        Objects.requireNonNull(text);
        Editable editable = text;
        String amount = text.toString();
        if (this.mode.isEmpty()) {
            ViewUtils.showToast(context, "Select payment mode");
        } else if (amount.isEmpty()) {
            binding.amount.setError("Enter amount");
            binding.amount.requestFocus();
        } else {
            try {
                long parseLong = Long.parseLong(amount);
                this.repository.sendMoneyPayouts(context, dialog, bene_id2, this.mode, amount);
            } catch (NumberFormatException e) {
                MyAlertUtils.showWarningAlertDialog(context, "Provide a valid amount");
            }
        }
    }

    public void onPayToBankClickPayTmPayouts(View view) {
        if (SystemClock.elapsedRealtime() - this.mLastClickTime >= 1000) {
            String str = this.account_number;
            if (str == null || str.isEmpty()) {
                ViewUtils.showToast(view.getContext(), "Provide Account Number");
            } else {
                String str2 = this.ifsc;
                if (str2 == null || str2.isEmpty()) {
                    ViewUtils.showToast(view.getContext(), "Provide IFSC Number");
                } else {
                    String str3 = this.enteredAmount;
                    if (str3 == null || str3.isEmpty()) {
                        ViewUtils.showToast(view.getContext(), "Provide Amount");
                    } else {
                        String str4 = this.transType;
                        if (str4 == null || str4.isEmpty()) {
                            ViewUtils.showToast(view.getContext(), "Provide Transaction type");
                        } else {
                            this.repository.reAuthenticateTheUser("payout", view.getContext(), this.enteredAmount, this.account_number, this.ifsc, this.transType, this.listener);
                        }
                    }
                }
            }
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }
}
