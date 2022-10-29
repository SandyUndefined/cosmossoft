package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.ContactsModel;

public class ContactListLayoutBindingImpl extends ContactListLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.contacts_image, 3);
        sparseIntArray.put(C0330R.C0333id.contactNameNumbers, 4);
        sparseIntArray.put(C0330R.C0333id.contactDivider, 5);
    }

    public ContactListLayoutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }

    private ContactListLayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[5], bindings[1], bindings[4], bindings[2], bindings[3]);
        this.mDirtyFlags = -1;
        this.contactName.setTag((Object) null);
        this.contactNumber.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        setRootTag(root);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean setVariable(int variableId, Object variable) {
        if (29 != variableId) {
            return false;
        }
        setMyContactList((ContactsModel) variable);
        return true;
    }

    public void setMyContactList(ContactsModel MyContactList) {
        this.mMyContactList = MyContactList;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(29);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long dirtyFlags;
        synchronized (this) {
            dirtyFlags = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        String myContactListNumber = null;
        String myContactListName = null;
        ContactsModel myContactList = this.mMyContactList;
        if (!((dirtyFlags & 3) == 0 || myContactList == null)) {
            myContactListNumber = myContactList.getNumber();
            myContactListName = myContactList.getName();
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.contactName, myContactListName);
            TextViewBindingAdapter.setText(this.contactNumber, myContactListNumber);
        }
    }
}
