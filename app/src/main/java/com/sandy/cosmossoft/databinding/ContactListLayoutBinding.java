package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.ContactsModel;

public abstract class ContactListLayoutBinding extends ViewDataBinding {
    public final View contactDivider;
    public final TextView contactName;
    public final LinearLayout contactNameNumbers;
    public final TextView contactNumber;
    public final ImageView contactsImage;
    @Bindable
    protected ContactsModel mMyContactList;

    public abstract void setMyContactList(ContactsModel contactsModel);

    protected ContactListLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, View contactDivider2, TextView contactName2, LinearLayout contactNameNumbers2, TextView contactNumber2, ImageView contactsImage2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.contactDivider = contactDivider2;
        this.contactName = contactName2;
        this.contactNameNumbers = contactNameNumbers2;
        this.contactNumber = contactNumber2;
        this.contactsImage = contactsImage2;
    }

    public ContactsModel getMyContactList() {
        return this.mMyContactList;
    }

    public static ContactListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ContactListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ContactListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.contact_list_layout, root, attachToRoot, component);
    }

    public static ContactListLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ContactListLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (ContactListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.contact_list_layout, (ViewGroup) null, false, component);
    }

    public static ContactListLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ContactListLayoutBinding bind(View view, Object component) {
        return (ContactListLayoutBinding) bind(component, view, C0330R.layout.contact_list_layout);
    }
}
