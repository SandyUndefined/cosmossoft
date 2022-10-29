package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;

public abstract class SendPayoutDesignBinding extends ViewDataBinding {
    public final TextInputEditText amount;
    public final TextInputLayout amountLayout;
    public final ImageView cancel;
    public final CardView creditCardCard;
    public final RadioButton imps;
    public final RadioButton neft;
    public final RadioGroup paySelection;
    public final MaterialButton sendAmountUser;
    public final TextView title;

    protected SendPayoutDesignBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputEditText amount2, TextInputLayout amountLayout2, ImageView cancel2, CardView creditCardCard2, RadioButton imps2, RadioButton neft2, RadioGroup paySelection2, MaterialButton sendAmountUser2, TextView title2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.amount = amount2;
        this.amountLayout = amountLayout2;
        this.cancel = cancel2;
        this.creditCardCard = creditCardCard2;
        this.imps = imps2;
        this.neft = neft2;
        this.paySelection = paySelection2;
        this.sendAmountUser = sendAmountUser2;
        this.title = title2;
    }

    public static SendPayoutDesignBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static SendPayoutDesignBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (SendPayoutDesignBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.send_payout_design, root, attachToRoot, component);
    }

    public static SendPayoutDesignBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static SendPayoutDesignBinding inflate(LayoutInflater inflater, Object component) {
        return (SendPayoutDesignBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.send_payout_design, (ViewGroup) null, false, component);
    }

    public static SendPayoutDesignBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static SendPayoutDesignBinding bind(View view, Object component) {
        return (SendPayoutDesignBinding) bind(component, view, C0330R.layout.send_payout_design);
    }
}
