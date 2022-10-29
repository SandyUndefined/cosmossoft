package com.sandy.cosmossoft.activities.payoutpaysprint;

import android.os.Bundle;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;

public class PaysprintHome extends Hilt_PaysprintHome {
    PayoutViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0330R.layout.activity_paysprint_home);
    }
}
