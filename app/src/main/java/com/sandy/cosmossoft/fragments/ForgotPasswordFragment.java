package com.sandy.cosmossoft.fragments;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.network.responses.RegularResponse;
import com.sandy.cosmossoft.databinding.FragmentForgotPasswordBinding;
import com.sandy.cosmossoft.databinding.OtpScreenLayoutBinding;
import com.sandy.cosmossoft.listeners.AuthListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.AuthViewModel;
import java.util.Objects;

public class ForgotPasswordFragment extends Hilt_ForgotPasswordFragment implements AuthListener {
    FragmentForgotPasswordBinding binding;
    FragmentContainerView fragmentContainerView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.binding = (FragmentForgotPasswordBinding) DataBindingUtil.inflate(inflater, C0330R.layout.fragment_forgot_password, container, false);
        this.fragmentContainerView = (FragmentContainerView) requireActivity().findViewById(C0330R.C0333id.ScreenFrame);
        AuthViewModel viewModel = (AuthViewModel) new ViewModelProvider(this).get(AuthViewModel.class);
        this.binding.setMyviewmodel(viewModel);
        viewModel.authListener = this;
        return this.binding.getRoot();
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewUtils.setFocusable(this.binding.mobileNumber, requireActivity());
    }

    public void onStarted() {
        MyAlertUtils.showProgressAlertDialog(requireActivity());
    }

    public void onSuccess(AuthResponse authResponse) {
        if (authResponse.isStatus()) {
            MyAlertUtils.showAlertDialog(requireContext(), "Success", authResponse.getMessage(), C0330R.C0332drawable.success);
        } else {
            MyAlertUtils.showAlertDialog(requireContext(), "Failed", authResponse.getMessage(), C0330R.C0332drawable.failed);
        }
    }

    public void onFailure(String message) {
        MyAlertUtils.showServerAlertDialog(requireActivity(), message);
    }

    public void onChangeFragmentPage(String fragmentName) {
        if (fragmentName.equals("sign_in")) {
            setFragment(new SignInFragment());
        }
    }

    public void displayMessage(String message) {
    }

    public void otp_verification(RegularResponse response) {
        MyAlertUtils.dismissAlertDialog();
        if (response.status) {
            otpPassingDesign(response.getMessage());
        } else {
            MyAlertUtils.showAlertDialog(requireActivity(), "Result", response.getMessage(), C0330R.C0332drawable.warning);
        }
    }

    public void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(this.fragmentContainerView.getId(), fragment);
        fragmentTransaction.commit();
    }

    private void otpPassingDesign(String server_pin) {
        Dialog dialog = new Dialog(requireActivity());
        OtpScreenLayoutBinding binding2 = OtpScreenLayoutBinding.inflate(LayoutInflater.from(requireActivity()));
        dialog.setContentView(binding2.getRoot());
        dialog.getWindow().setLayout(-1, -2);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        dialog.setCanceledOnTouchOutside(false);
        binding2.cancelLayout.setOnClickListener(new ForgotPasswordFragment$$ExternalSyntheticLambda0(dialog));
        binding2.verifyOtp.setOnClickListener(new ForgotPasswordFragment$$ExternalSyntheticLambda1(this, binding2, server_pin, dialog));
    }

    /* renamed from: lambda$otpPassingDesign$1$com-sandy-cosmossoft-fragments-ForgotPasswordFragment */
    public /* synthetic */ void mo1443xcd3c0d93(OtpScreenLayoutBinding binding2, String server_pin, Dialog dialog, View v) {
        Editable text = binding2.enterOtpDmt.getText();
        Objects.requireNonNull(text);
        Editable editable = text;
        if (text.toString().isEmpty()) {
            MyAlertUtils.showAlertDialog(requireActivity(), "Warning", "Provide OTP", C0330R.C0332drawable.warning);
        } else if (server_pin.equals(binding2.enterOtpDmt.getText().toString())) {
            dialog.dismiss();
            AuthViewModel.editOtp = server_pin;
            setFragment(new ChangePasswordFragment());
        } else {
            MyAlertUtils.showAlertDialog(requireActivity(), "Result", "Invalid OTP", C0330R.C0332drawable.warning);
        }
    }
}
