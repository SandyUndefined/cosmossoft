package com.sandy.cosmossoft.viewmodel;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import com.google.android.material.textfield.TextInputEditText;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PayoutViewModel$$ExternalSyntheticLambda3 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ PayoutViewModel f$0;
    public final /* synthetic */ TextInputEditText f$1;
    public final /* synthetic */ ArrayAdapter f$2;
    public final /* synthetic */ Dialog f$3;

    public /* synthetic */ PayoutViewModel$$ExternalSyntheticLambda3(PayoutViewModel payoutViewModel, TextInputEditText textInputEditText, ArrayAdapter arrayAdapter, Dialog dialog) {
        this.f$0 = payoutViewModel;
        this.f$1 = textInputEditText;
        this.f$2 = arrayAdapter;
        this.f$3 = dialog;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f$0.mo48099x800479c8(this.f$1, this.f$2, this.f$3, adapterView, view, i, j);
    }
}
