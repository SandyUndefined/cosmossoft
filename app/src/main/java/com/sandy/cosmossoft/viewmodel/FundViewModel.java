package com.sandy.cosmossoft.viewmodel;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import androidx.lifecycle.ViewModel;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.activities.addfunds.FundExchange;
import com.sandy.cosmossoft.activities.addfunds.PayActivity;
import com.sandy.cosmossoft.activities.addfunds.PayActivityWithPayTm;
import com.sandy.cosmossoft.activities.addfunds.RequestOffline;
import com.sandy.cosmossoft.data.network.responses.RegularResponse;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.repositories.FundRepository;
import com.sandy.cosmossoft.listeners.ChangerListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class FundViewModel extends ViewModel {
    public String amount = "";
    public FundRepository fundRepository;
    public ChangerListener listener = null;
    private long mLastClickTime = 0;
    public String payment_mode = "";
    public String receiptImageEncoded = "";
    public String remarks = "";
    public String transaction_id = "";

    @Inject
    public FundViewModel(FundRepository fundRepository2) {
        this.fundRepository = fundRepository2;
    }

    public void onRazorPayAddFund(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), PayActivity.class));
    }

    public void onOfflineAddFund(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), RequestOffline.class));
    }

    public void onPayTmAddFund(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), PayActivityWithPayTm.class));
    }

    public void onWalletExchange(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), FundExchange.class));
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
        myOperatorListView.setOnItemClickListener(new FundViewModel$$ExternalSyntheticLambda0(this, adapter, dialog));
    }

    /* renamed from: lambda$onSpinnerClick$0$com-sandy-cosmossoft-viewmodel-FundViewModel */
    public /* synthetic */ void mo48059xa7994364(ArrayAdapter adapter, Dialog dialog, AdapterView parent, View view1, int position, long id) {
        this.listener.changeData((String) adapter.getItem(position));
        this.payment_mode = (String) adapter.getItem(position);
        dialog.dismiss();
    }

    public void onRequestOffline(final View view) {
        if (SystemClock.elapsedRealtime() - this.mLastClickTime >= 1000) {
            if (this.amount.isEmpty()) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Enter valid amount");
            } else if (this.transaction_id.isEmpty()) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Enter valid Transaction Id");
            } else if (this.payment_mode.isEmpty()) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Select valid Payment Mode");
            } else if (this.receiptImageEncoded.isEmpty()) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Select a Receipt");
            } else {
                User user = this.fundRepository.appDatabase.getUserDao().getRegularUser();
                if (user != null) {
                    MyAlertUtils.showProgressAlertDialog(view.getContext());
                    this.fundRepository.apiServices.offlineWalletDemand(user.mobile, user.getPassword(), user.getToken(), this.amount, this.payment_mode, this.transaction_id, this.remarks, this.receiptImageEncoded).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
                        public void onSubscribe(Disposable d) {
                        }

                        public void onNext(RegularResponse regularResponse) {
                            if (regularResponse.isStatus()) {
                                MyAlertUtils.showAlertDialog(view.getContext(), "Result", regularResponse.getMessage(), C0330R.C0332drawable.success);
                                FundViewModel.this.listener.eraseAll();
                                FundViewModel.this.payment_mode = "";
                                FundViewModel.this.receiptImageEncoded = "";
                                FundViewModel.this.remarks = "";
                                FundViewModel.this.amount = "";
                                FundViewModel.this.transaction_id = "";
                                return;
                            }
                            MyAlertUtils.showServerAlertDialog(view.getContext(), regularResponse.getMessage());
                        }

                        public void onError(Throwable e) {
                            MyAlertUtils.showServerAlertDialog(view.getContext(), e.getMessage());
                        }

                        public void onComplete() {
                        }
                    });
                }
            }
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }

    public void onFundExchangeClick(View view) {
        User user = this.fundRepository.appDatabase.getUserDao().getRegularUser();
        if (user.getAepsbalance() == null) {
            return;
        }
        if (user.getAepsbalance().isEmpty()) {
            MyAlertUtils.showServerAlertDialog(view.getContext(), "Not Enough AePS Balance");
        } else if (this.amount.isEmpty()) {
            MyAlertUtils.showServerAlertDialog(view.getContext(), "Provide valid amount");
        } else if (SystemClock.elapsedRealtime() - this.mLastClickTime >= 1000) {
            if (Double.parseDouble(user.getAepsbalance()) < Double.parseDouble(this.amount)) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Not Enough AePS Balance");
            } else {
                this.fundRepository.exchangeWallet(view.getContext(), this.amount);
            }
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }
}
