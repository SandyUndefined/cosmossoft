package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.CreationViewModel;

public abstract class ActivityCreationBinding extends ViewDataBinding {
    public final Button SubmitUserAdd;
    public final TextInputEditText emailId;
    public final TextInputLayout emailLayout;
    public final TextInputEditText firstNameAdd;
    public final TextInputLayout firstNameAddLayout;
    public final CardView infoSection;
    public final TextInputEditText lastNameAdd;
    public final TextInputLayout lastNameAddLayout;
    @Bindable
    protected CreationViewModel mCreationViewModel;
    public final TextInputEditText mobileNumber;
    public final TextInputLayout mobileNumberLayout;
    public final TextInputEditText owner;
    public final TextInputEditText packageType;
    public final TextInputLayout packageTypeLayout;
    public final TextInputLayout personLayout;
    public final TextInputEditText userType;
    public final TextInputLayout userTypeLayout;

    public abstract void setCreationViewModel(CreationViewModel creationViewModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ActivityCreationBinding(Object _bindingComponent, View _root, int _localFieldCount, Button SubmitUserAdd2, TextInputEditText emailId2, TextInputLayout emailLayout2, TextInputEditText firstNameAdd2, TextInputLayout firstNameAddLayout2, CardView infoSection2, TextInputEditText lastNameAdd2, TextInputLayout lastNameAddLayout2, TextInputEditText mobileNumber2, TextInputLayout mobileNumberLayout2, TextInputEditText owner2, TextInputEditText packageType2, TextInputLayout packageTypeLayout2, TextInputLayout personLayout2, TextInputEditText userType2, TextInputLayout userTypeLayout2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.SubmitUserAdd = SubmitUserAdd2;
        this.emailId = emailId2;
        this.emailLayout = emailLayout2;
        this.firstNameAdd = firstNameAdd2;
        this.firstNameAddLayout = firstNameAddLayout2;
        this.infoSection = infoSection2;
        this.lastNameAdd = lastNameAdd2;
        this.lastNameAddLayout = lastNameAddLayout2;
        this.mobileNumber = mobileNumber2;
        this.mobileNumberLayout = mobileNumberLayout2;
        this.owner = owner2;
        this.packageType = packageType2;
        this.packageTypeLayout = packageTypeLayout2;
        this.personLayout = personLayout2;
        this.userType = userType2;
        this.userTypeLayout = userTypeLayout2;
    }

    public CreationViewModel getCreationViewModel() {
        return this.mCreationViewModel;
    }

    public static ActivityCreationBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCreationBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityCreationBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_creation, root, attachToRoot, component);
    }

    public static ActivityCreationBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCreationBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityCreationBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_creation, (ViewGroup) null, false, component);
    }

    public static ActivityCreationBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCreationBinding bind(View view, Object component) {
        return (ActivityCreationBinding) bind(component, view, C0330R.layout.activity_creation);
    }
}
