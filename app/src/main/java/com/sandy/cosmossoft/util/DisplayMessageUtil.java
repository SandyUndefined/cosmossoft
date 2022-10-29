package com.sandy.cosmossoft.util;

import android.content.Context;
import com.sandy.cosmossoft.C0330R;

public class DisplayMessageUtil {
    public static void success(Context context, String message) {
        MyAlertUtils.showAlertDialog(context, "Success", message, C0330R.C0332drawable.success);
    }

    public static void error(Context context, String message) {
        MyAlertUtils.showAlertDialog(context, "Failure", message, C0330R.C0332drawable.warning);
    }

    public static void loading(Context context) {
        MyAlertUtils.showProgressAlertDialog(context);
    }

    public static void dismissDialog() {
        MyAlertUtils.dismissAlertDialog();
    }

    public static void anotherDialogSuccess(Context context, String message) {
        MyAlertUtils.anotherAlertDialog(context, message, "Success", Integer.valueOf(C0330R.C0332drawable.success));
    }

    public static void anotherDialogFailure(Context context, String message) {
        MyAlertUtils.anotherAlertDialog(context, message, "Failed", Integer.valueOf(C0330R.C0332drawable.warning));
    }
}
