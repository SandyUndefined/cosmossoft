package com.sandy.cosmossoft.fragments;

import android.app.ProgressDialog;
import android.os.Bundle;
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
import com.sandy.cosmossoft.databinding.FragmentOtpBinding;
import com.sandy.cosmossoft.listeners.AuthListener;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.AuthViewModel;

public class OtpFragment extends Hilt_OtpFragment implements AuthListener {
    AuthViewModel authviewModel;
    private FragmentOtpBinding binding;
    ProgressDialog dialog;
    private FragmentContainerView fragmentContainerView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentOtpBinding fragmentOtpBinding = (FragmentOtpBinding) DataBindingUtil.inflate(inflater, C0330R.layout.fragment_otp, container, false);
        this.binding = fragmentOtpBinding;
        fragmentOtpBinding.OtpSection.setVisibility(0);
        this.binding.createPasswordSection.setVisibility(8);
        this.fragmentContainerView = (FragmentContainerView) requireActivity().findViewById(C0330R.C0333id.ScreenFrame);
        AuthViewModel authViewModel = (AuthViewModel) new ViewModelProvider(this).get(AuthViewModel.class);
        this.authviewModel = authViewModel;
        this.binding.setMyviewmodel(authViewModel);
        this.authviewModel.authListener = this;
        this.dialog = new ProgressDialog(requireActivity());
        return this.binding.getRoot();
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewUtils.setFocusable(this.binding.otp, requireActivity());
    }

    public void onStarted() {
        this.dialog.setMessage("Processing, please wait.");
        this.dialog.show();
    }

    public void onSuccess(AuthResponse authResponse) {
        this.dialog.dismiss();
    }

    public void onFailure(String message) {
        this.dialog.dismiss();
        ViewUtils.showToast(requireActivity(), message);
    }

    public void onChangeFragmentPage(String fragmentName) {
    }

    public void displayMessage(String message) {
        String message2 = message.trim();
        this.dialog.dismiss();
        if (message2.equals("Account created")) {
            ViewUtils.showToast(requireActivity(), message2);
            setFragment(new SignInFragment());
        } else if (message2.equals("9900")) {
            this.binding.OtpSection.setVisibility(8);
            this.binding.createPasswordSection.setVisibility(0);
        } else {
            ViewUtils.showToast(requireActivity(), message2);
        }
    }

    public void otp_verification(RegularResponse response) {
    }

    public void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(this.fragmentContainerView.getId(), fragment);
        fragmentTransaction.commit();
    }
}
