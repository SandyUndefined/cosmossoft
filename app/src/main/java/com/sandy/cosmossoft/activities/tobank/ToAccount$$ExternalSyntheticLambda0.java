package com.sandy.cosmossoft.activities.tobank;

import android.content.DialogInterface;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryBank;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ToAccount$$ExternalSyntheticLambda0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ToAccount f$0;
    public final /* synthetic */ BeneficiaryBank f$1;
    public final /* synthetic */ BottomSheetDialog f$2;

    public /* synthetic */ ToAccount$$ExternalSyntheticLambda0(ToAccount toAccount, BeneficiaryBank beneficiaryBank, BottomSheetDialog bottomSheetDialog) {
        this.f$0 = toAccount;
        this.f$1 = beneficiaryBank;
        this.f$2 = bottomSheetDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f$0.mo78xf02d53ab(this.f$1, this.f$2, dialogInterface, i);
    }
}
