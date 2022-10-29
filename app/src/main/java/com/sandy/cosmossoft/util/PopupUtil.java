package com.sandy.cosmossoft.util;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.room.RoomDatabase;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.activities.HomeActivity;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.network.responses.RegularResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.TPinLayoutBinding;
import com.sandy.cosmossoft.pins.TPinRegister;
import java.util.Objects;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class PopupUtil {
    public static boolean access = true;
    static AlertDialog alertDialog;

    public static void displayTPinDialog(Context context, String pin) {
        AlertDialog alertDialog2 = alertDialog;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        AlertDialog.Builder alert = new AlertDialog.Builder(context, C0330R.C0337style.CustomDialog);
        TPinLayoutBinding binding = TPinLayoutBinding.inflate(LayoutInflater.from(context));
        alert.setView(binding.getRoot());
        AlertDialog create = alert.create();
        alertDialog = create;
        create.setCanceledOnTouchOutside(false);
        alertDialog.show();
        binding.cancelButton.setOnClickListener(PopupUtil$$ExternalSyntheticLambda0.INSTANCE);
        binding.confirmButton.setOnClickListener(PopupUtil$$ExternalSyntheticLambda1.INSTANCE);
    }

    public static void tPinSystem(final Context context, APIServices apiServices) {
        User user = AppDatabase.getAppDatabase(context).getUserDao().getRegularUser();
        MyAlertUtils.showProgressAlertDialog(context);
        apiServices.TpinSecuritySystem(user.getId(), user.getPassword(), user.getToken()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(RegularResponse response) {
                MyAlertUtils.dismissAlertDialog();
                if (response.isStatus() && response.getResponse_code().equals(1)) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(context, C0330R.C0337style.CustomDialog);
                    TPinLayoutBinding binding = TPinLayoutBinding.inflate(LayoutInflater.from(context));
                    alert.setView(binding.getRoot());
                    AlertDialog alertDialog = alert.create();
                    alertDialog.setCanceledOnTouchOutside(false);
                    alertDialog.show();
                    binding.cancelButton.setOnClickListener(new PopupUtil$1$$ExternalSyntheticLambda0(alertDialog));
                    binding.confirmButton.setOnClickListener(new PopupUtil$1$$ExternalSyntheticLambda1(binding, response, context, alertDialog));
                } else if (response.getResponse_code().equals(2)) {
                    context.startActivity(new Intent(context, TPinRegister.class));
                } else if (response.getResponse_code().equals(Integer.valueOf(RoomDatabase.MAX_BIND_PARAMETER_CNT))) {
                    MyAlertUtils.dismissAlertDialog();
                    Intent intent = new Intent(context, HomeActivity.class);
                    intent.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                }
            }

            static /* synthetic */ void lambda$onNext$1(TPinLayoutBinding binding, RegularResponse response, Context context, AlertDialog alertDialog, View v) {
                Editable text = binding.tPinEdit.getText();
                Objects.requireNonNull(text);
                Editable editable = text;
                if (!text.toString().equals(response.getMessage())) {
                    MyAlertUtils.showAlertDialog(context, "Warning", "Provide your valid T-PIN", C0330R.C0332drawable.warning);
                    return;
                }
                PopupUtil.access = true;
                alertDialog.dismiss();
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
