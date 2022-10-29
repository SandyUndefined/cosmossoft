package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.MobileNumberPayViewModel;

public abstract class ActivitySendMoneyBinding extends ViewDataBinding {
    public final EditText amountbalance;
    public final LinearLayout buttonsLayout;
    public final TextView eight;
    public final ImageButton erase;
    public final TextView five;
    public final TextView four;
    @Bindable
    protected MobileNumberPayViewModel mSendMoneyViewModel;
    public final TextView nine;
    public final Button onRequestMoneyButton;
    public final Button onSendMoneyButton;
    public final TextView one;
    public final LinearLayout payLayouts;
    public final TextView point;
    public final TextView seven;
    public final TextView six;
    public final TextView three;
    public final TextView two;
    public final TextView zeo;

    public abstract void setSendMoneyViewModel(MobileNumberPayViewModel mobileNumberPayViewModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ActivitySendMoneyBinding(Object _bindingComponent, View _root, int _localFieldCount, EditText amountbalance2, LinearLayout buttonsLayout2, TextView eight2, ImageButton erase2, TextView five2, TextView four2, TextView nine2, Button onRequestMoneyButton2, Button onSendMoneyButton2, TextView one2, LinearLayout payLayouts2, TextView point2, TextView seven2, TextView six2, TextView three2, TextView two2, TextView zeo2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.amountbalance = amountbalance2;
        this.buttonsLayout = buttonsLayout2;
        this.eight = eight2;
        this.erase = erase2;
        this.five = five2;
        this.four = four2;
        this.nine = nine2;
        this.onRequestMoneyButton = onRequestMoneyButton2;
        this.onSendMoneyButton = onSendMoneyButton2;
        this.one = one2;
        this.payLayouts = payLayouts2;
        this.point = point2;
        this.seven = seven2;
        this.six = six2;
        this.three = three2;
        this.two = two2;
        this.zeo = zeo2;
    }

    public MobileNumberPayViewModel getSendMoneyViewModel() {
        return this.mSendMoneyViewModel;
    }

    public static ActivitySendMoneyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySendMoneyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivitySendMoneyBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_send_money, root, attachToRoot, component);
    }

    public static ActivitySendMoneyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySendMoneyBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivitySendMoneyBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_send_money, (ViewGroup) null, false, component);
    }

    public static ActivitySendMoneyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySendMoneyBinding bind(View view, Object component) {
        return (ActivitySendMoneyBinding) bind(component, view, C0330R.layout.activity_send_money);
    }
}
