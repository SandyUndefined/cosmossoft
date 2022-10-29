package com.sandy.cosmossoft.util;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.sandy.cosmossoft.data.network.responses.RegularResponse;
import com.sandy.cosmossoft.databinding.TPinLayoutBinding;
import com.sandy.cosmossoft.util.PopupUtil;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PopupUtil$1$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final /* synthetic */ TPinLayoutBinding f$0;
    public final /* synthetic */ RegularResponse f$1;
    public final /* synthetic */ Context f$2;
    public final /* synthetic */ AlertDialog f$3;

    public /* synthetic */ PopupUtil$1$$ExternalSyntheticLambda1(TPinLayoutBinding tPinLayoutBinding, RegularResponse regularResponse, Context context, AlertDialog alertDialog) {
        this.f$0 = tPinLayoutBinding;
        this.f$1 = regularResponse;
        this.f$2 = context;
        this.f$3 = alertDialog;
    }

    public final void onClick(View view) {
        PopupUtil.C00491.lambda$onNext$1(this.f$0, this.f$1, this.f$2, this.f$3, view);
    }
}
