package com.sandy.cosmossoft.activities.cashdeposit;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.databinding.ActivityCashDepositBinding;
import com.sandy.cosmossoft.viewmodel.CashDepositViewModel;

public class CashDeposit extends Hilt_CashDeposit {
    ActivityCashDepositBinding binding;
    CashDepositViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCashDepositBinding inflate = ActivityCashDepositBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        CashDepositViewModel cashDepositViewModel = (CashDepositViewModel) new ViewModelProvider(this).get(CashDepositViewModel.class);
        this.viewModel = cashDepositViewModel;
        this.binding.setDepositViewModel(cashDepositViewModel);
    }
}
