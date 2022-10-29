package com.sandy.cosmossoft.fragments;

import android.content.Intent;
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
import com.sandy.cosmossoft.activities.HomeActivity;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.network.responses.RegularResponse;
import com.sandy.cosmossoft.databinding.ActivityMainBinding;
import com.sandy.cosmossoft.databinding.FragmentSignInBinding;
import com.sandy.cosmossoft.listeners.AuthListener;
import com.sandy.cosmossoft.listeners.ManipulationListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.AuthViewModel;

public class SignInFragment extends Hilt_SignInFragment implements AuthListener, ManipulationListener {
    ActivityMainBinding activityMainBinding;
    private AuthViewModel authviewModel;
    private FragmentSignInBinding binding;
    private FragmentContainerView fragmentContainerView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.binding = (FragmentSignInBinding) DataBindingUtil.inflate(inflater, C0330R.layout.fragment_sign_in, container, false);
        this.fragmentContainerView = (FragmentContainerView) requireActivity().findViewById(C0330R.C0333id.ScreenFrame);
        AuthViewModel authViewModel = (AuthViewModel) new ViewModelProvider(this).get(AuthViewModel.class);
        this.authviewModel = authViewModel;
        this.binding.setMyviewmodel(authViewModel);
        this.authviewModel.authListener = this;
        this.authviewModel.manipulationListener = this;
        return this.binding.getRoot();
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewUtils.setFocusable(this.binding.mobileNumber, requireActivity());
    }

    public void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(this.fragmentContainerView.getId(), fragment);
        fragmentTransaction.commit();
    }

    public void setFragmentLower(Fragment fragment, FragmentContainerView myFragmentContainerView) {
        FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(myFragmentContainerView.getId(), fragment);
        fragmentTransaction.commit();
    }

    public void onStarted() {
        MyAlertUtils.showProgressAlertDialog(requireContext());
    }

    public void onSuccess(AuthResponse authResponse) {
        if (authResponse.isStatus()) {
            Intent intent = new Intent(requireActivity(), HomeActivity.class);
            intent.setFlags(32768);
            intent.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
            intent.addFlags(268435456);
            MyAlertUtils.dismissAlertDialog();
            startActivity(intent);
            return;
        }
        MyAlertUtils.dismissAlertDialog();
        ViewUtils.showToast(requireActivity(), authResponse.getMessage());
    }

    public void onFailure(String message) {
        MyAlertUtils.showServerAlertDialog(requireContext(), message);
    }

    public void onChangeFragmentPage(String fragmentName) {
        if (fragmentName.equals("register")) {
            setFragment(new SignUpFragment());
        } else if (fragmentName.equals("forgot")) {
            setFragment(new ForgotPasswordFragment());
        }
    }

    public void displayMessage(String message) {
        ViewUtils.showToast(requireActivity(), message);
    }

    public void otp_verification(RegularResponse response) {
    }

    public void doManipulate(boolean withOtp) {
        MyAlertUtils.dismissAlertDialog();
        this.binding.otpfield.setVisibility(0);
        this.authviewModel.withOtp = withOtp;
    }
}
