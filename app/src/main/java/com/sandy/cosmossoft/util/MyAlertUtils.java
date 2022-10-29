package com.sandy.cosmossoft.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.app.AlertDialog;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.databinding.CustomAlertDialogBinding;

public class MyAlertUtils {
    static AlertDialog alertDialog;
    static ProgressDialog progressDialog;

    public static void showAlertDialog(Context context, String title, String message, int gifIcon) {
        AlertDialog alertDialog2 = alertDialog;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        ProgressDialog progressDialog2 = progressDialog;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
        AlertDialog.Builder alert = new AlertDialog.Builder(context, C0330R.C0337style.CustomDialog);
        CustomAlertDialogBinding binding = CustomAlertDialogBinding.inflate(LayoutInflater.from(context));
        alert.setView(binding.getRoot());
        AlertDialog create = alert.create();
        alertDialog = create;
        create.setCanceledOnTouchOutside(false);
        alertDialog.show();
        binding.alertCancel.setOnClickListener(MyAlertUtils$$ExternalSyntheticLambda4.INSTANCE);
        binding.alertOkay.setOnClickListener(MyAlertUtils$$ExternalSyntheticLambda5.INSTANCE);
        binding.alertTitle.setText(title);
        binding.alertMessage.setText(message);
        binding.centerLogo.setImageResource(gifIcon);
    }

    public static void showProgressAlertDialog(Context context) {
        AlertDialog alertDialog2 = alertDialog;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        ProgressDialog progressDialog2 = progressDialog;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
        ProgressDialog progressDialog3 = new ProgressDialog(context);
        progressDialog = progressDialog3;
        progressDialog3.setMessage("Please wait");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
    }

    public static void showServerAlertDialog(Context context, String message) {
        AlertDialog alertDialog2 = alertDialog;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        ProgressDialog progressDialog2 = progressDialog;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
        AlertDialog.Builder alert = new AlertDialog.Builder(context, C0330R.C0337style.CustomDialog);
        CustomAlertDialogBinding binding = CustomAlertDialogBinding.inflate(LayoutInflater.from(context));
        alert.setView(binding.getRoot());
        AlertDialog create = alert.create();
        alertDialog = create;
        create.setCanceledOnTouchOutside(false);
        alertDialog.show();
        binding.alertCancel.setVisibility(4);
        binding.alertOkay.setOnClickListener(MyAlertUtils$$ExternalSyntheticLambda6.INSTANCE);
        binding.alertTitle.setText("Failed");
        binding.alertMessage.setText(message);
        binding.centerLogo.setImageResource(C0330R.C0332drawable.warning);
    }

    public static void dismissAlertDialog() {
        AlertDialog alertDialog2 = alertDialog;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        ProgressDialog progressDialog2 = progressDialog;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
    }

    public static void anotherAlertDialog(Context context, String message, String title, Integer gifIcon) {
        AlertDialog.Builder alert = new AlertDialog.Builder(context, C0330R.C0337style.CustomDialog);
        CustomAlertDialogBinding binding = CustomAlertDialogBinding.inflate(LayoutInflater.from(context));
        alert.setView(binding.getRoot());
        AlertDialog alertDialogAnother = alert.create();
        alertDialogAnother.setCanceledOnTouchOutside(false);
        alertDialogAnother.show();
        binding.alertCancel.setOnClickListener(new MyAlertUtils$$ExternalSyntheticLambda0(alertDialogAnother));
        binding.alertOkay.setOnClickListener(new MyAlertUtils$$ExternalSyntheticLambda1(alertDialogAnother));
        binding.alertTitle.setText(title);
        binding.alertMessage.setText(message);
        binding.centerLogo.setImageResource(gifIcon.intValue());
    }

    public static void showAnotherDialog(Context context, String title, String message, int gifIcon) {
        AlertDialog.Builder alert = new AlertDialog.Builder(context, C0330R.C0337style.CustomDialog);
        CustomAlertDialogBinding binding = CustomAlertDialogBinding.inflate(LayoutInflater.from(context));
        alert.setView(binding.getRoot());
        AlertDialog alertDialog2 = alert.create();
        alertDialog2.setCanceledOnTouchOutside(false);
        alertDialog2.show();
        binding.alertCancel.setOnClickListener(new MyAlertUtils$$ExternalSyntheticLambda2(alertDialog2));
        binding.alertOkay.setOnClickListener(new MyAlertUtils$$ExternalSyntheticLambda3(alertDialog2));
        binding.alertTitle.setText(title);
        binding.alertMessage.setText(message);
        binding.centerLogo.setImageResource(gifIcon);
    }

    public static void showWarningAlertDialog(Context context, String message) {
        AlertDialog alertDialog2 = alertDialog;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        ProgressDialog progressDialog2 = progressDialog;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
        AlertDialog.Builder alert = new AlertDialog.Builder(context, C0330R.C0337style.CustomDialog);
        CustomAlertDialogBinding binding = CustomAlertDialogBinding.inflate(LayoutInflater.from(context));
        alert.setView(binding.getRoot());
        AlertDialog create = alert.create();
        alertDialog = create;
        create.setCanceledOnTouchOutside(false);
        alertDialog.show();
        binding.alertCancel.setVisibility(4);
        binding.alertOkay.setOnClickListener(MyAlertUtils$$ExternalSyntheticLambda7.INSTANCE);
        binding.alertTitle.setText("Warning");
        binding.alertMessage.setText(message);
        binding.centerLogo.setImageResource(C0330R.C0332drawable.warning);
    }
}
