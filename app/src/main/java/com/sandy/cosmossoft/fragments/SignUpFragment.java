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
import androidx.room.RoomDatabase;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.NetworkConnectionInterceptor;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.network.responses.RegularResponse;
import com.sandy.cosmossoft.databinding.FragmentSignUpBinding;
import com.sandy.cosmossoft.listeners.AuthListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.AuthViewModel;
import javax.inject.Inject;

public class SignUpFragment extends Hilt_SignUpFragment implements AuthListener {
    AuthViewModel authviewModel;
    FragmentSignUpBinding binding;
    private FragmentContainerView fragmentContainerView;
    @Inject
    NetworkConnectionInterceptor networkConnectionInterceptor;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.binding = (FragmentSignUpBinding) DataBindingUtil.inflate(inflater, C0330R.layout.fragment_sign_up, container, false);
        this.fragmentContainerView = (FragmentContainerView) requireActivity().findViewById(C0330R.C0333id.ScreenFrame);
        AuthViewModel authViewModel = (AuthViewModel) new ViewModelProvider(this).get(AuthViewModel.class);
        this.authviewModel = authViewModel;
        this.binding.setMyviewmodel(authViewModel);
        this.authviewModel.authListener = this;
        return this.binding.getRoot();
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewUtils.setFocusable(this.binding.firstNumber, requireActivity());
    }

    public void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(this.fragmentContainerView.getId(), fragment);
        fragmentTransaction.commit();
    }

    public void onStarted() {
        MyAlertUtils.showProgressAlertDialog(requireContext());
    }

    public void onSuccess(AuthResponse authResponse) {
        MyAlertUtils.dismissAlertDialog();
    }

    public void onFailure(String message) {
        MyAlertUtils.showServerAlertDialog(requireContext(), message);
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
        if (response.status && !response.getResponse_code().equals(Integer.valueOf(RoomDatabase.MAX_BIND_PARAMETER_CNT))) {
            MyAlertUtils.dismissAlertDialog();
            setFragment(new OtpFragment());
        }
    }
}
