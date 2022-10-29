package com.sandy.cosmossoft.fragments;

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
import com.sandy.cosmossoft.databinding.FragmentChangePasswordBinding;
import com.sandy.cosmossoft.listeners.AuthListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.viewmodel.AuthViewModel;

public class ChangePasswordFragment extends Hilt_ChangePasswordFragment implements AuthListener {
    FragmentChangePasswordBinding binding;
    private FragmentContainerView fragmentContainerView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.binding = (FragmentChangePasswordBinding) DataBindingUtil.inflate(inflater, C0330R.layout.fragment_change_password, container, false);
        this.fragmentContainerView = (FragmentContainerView) requireActivity().findViewById(C0330R.C0333id.ScreenFrame);
        AuthViewModel authviewModel = (AuthViewModel) new ViewModelProvider(this).get(AuthViewModel.class);
        this.binding.setMyviewmodel(authviewModel);
        authviewModel.authListener = this;
        return this.binding.getRoot();
    }

    public void onStarted() {
        MyAlertUtils.showProgressAlertDialog(requireActivity());
    }

    public void onSuccess(AuthResponse authResponse) {
    }

    public void onFailure(String message) {
        MyAlertUtils.showServerAlertDialog(requireActivity(), message);
    }

    public void onChangeFragmentPage(String fragmentName) {
        if (fragmentName.equals("sign_in")) {
            setFragment(new SignInFragment());
        } else if (fragmentName.equals("forgot")) {
            setFragment(new ForgotPasswordFragment());
        }
    }

    public void displayMessage(String message) {
    }

    public void otp_verification(RegularResponse response) {
        if (!response.isStatus() || !response.getResponse_code().equals(1)) {
            MyAlertUtils.showAlertDialog(requireActivity(), "Result", response.message, C0330R.C0332drawable.failed);
            return;
        }
        MyAlertUtils.showAlertDialog(requireActivity(), "Result", response.message, C0330R.C0332drawable.success);
        setFragment(new SignInFragment());
        AuthViewModel.password_one = "";
        AuthViewModel.password_two = "";
        AuthViewModel.editOtp = "";
    }

    public void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(this.fragmentContainerView.getId(), fragment);
        fragmentTransaction.commit();
    }
}
