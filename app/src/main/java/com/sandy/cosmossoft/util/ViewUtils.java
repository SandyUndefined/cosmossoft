package com.sandy.cosmossoft.util;

import android.app.Activity;
import android.content.Context;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;
import java.util.regex.Pattern;

public class ViewUtils {
    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, 0).show();
    }

    public static void showProgressBar(ProgressBar progressBar) {
        progressBar.setVisibility(0);
    }

    public static void hideProgressBar(ProgressBar progressBar) {
        progressBar.setVisibility(8);
    }

    public static void setFocusable(TextInputEditText editText, Activity activity) {
        editText.setShowSoftInputOnFocus(true);
        activity.getWindow().setSoftInputMode(4);
        editText.requestFocus();
    }

    public static boolean checkIfNameIsValid(String namVar) {
        return namVar.matches("[A-Z][a-z]*");
    }

    public static boolean isEmailValid(String email) {
        Pattern pat = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
        if (email == null) {
            return false;
        }
        return pat.matcher(email).matches();
    }
}
