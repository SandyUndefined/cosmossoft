package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;
import info.androidhive.fontawesome.FontTextView;

public class ActivityProfileBindingImpl extends ActivityProfileBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl mProfileViewModelOnEditDetailsAndroidViewViewOnClickListener;
    private final RelativeLayout mboundView0;
    /* access modifiers changed from: private */
    public final FontTextView mboundView1;
    private InverseBindingListener mboundView1androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final FontTextView mboundView2;
    private InverseBindingListener mboundView2androidTextAttrChanged;
    private final FontTextView mboundView3;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"profile_top_toolbar"}, new int[]{4}, new int[]{C0330R.layout.profile_top_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.picture_sections, 5);
        sparseIntArray.put(C0330R.C0333id.profileImage, 6);
        sparseIntArray.put(C0330R.C0333id.onChangePicture, 7);
        sparseIntArray.put(C0330R.C0333id.listRecycler, 8);
    }

    public ActivityProfileBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    private ActivityProfileBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, bindings[8], bindings[7], bindings[5], bindings[6], bindings[4]);
        this.mboundView1androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityProfileBindingImpl.this.mboundView1);
                User nameNumber = ActivityProfileBindingImpl.this.mNameNumber;
                if (nameNumber != null) {
                    nameNumber.setMobile(callbackArg_0);
                }
            }
        };
        this.mboundView2androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityProfileBindingImpl.this.mboundView2);
                User nameNumber = ActivityProfileBindingImpl.this.mNameNumber;
                if (nameNumber != null) {
                    nameNumber.setName(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        FontTextView fontTextView = bindings[1];
        this.mboundView1 = fontTextView;
        fontTextView.setTag((Object) null);
        FontTextView fontTextView2 = bindings[2];
        this.mboundView2 = fontTextView2;
        fontTextView2.setTag((Object) null);
        FontTextView fontTextView3 = bindings[3];
        this.mboundView3 = fontTextView3;
        fontTextView3.setTag((Object) null);
        setContainedBinding(this.toolbar);
        setRootTag(root);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 16;
        }
        this.toolbar.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4.toolbar.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasPendingBindings() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch:{ all -> 0x0018 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            com.sandy.cosmossoft.databinding.ProfileTopToolbarBinding r0 = r4.toolbar
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            r0 = 0
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandy.cosmossoft.databinding.ActivityProfileBindingImpl.hasPendingBindings():boolean");
    }

    public boolean setVariable(int variableId, Object variable) {
        if (34 == variableId) {
            setNameNumber((User) variable);
            return true;
        } else if (40 == variableId) {
            setProfileViewModel((ProfileViewModel) variable);
            return true;
        } else if (55 != variableId) {
            return false;
        } else {
            setUserProfile((UserProfile) variable);
            return true;
        }
    }

    public void setNameNumber(User NameNumber) {
        this.mNameNumber = NameNumber;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    public void setProfileViewModel(ProfileViewModel ProfileViewModel) {
        this.mProfileViewModel = ProfileViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(40);
        super.requestRebind();
    }

    public void setUserProfile(UserProfile UserProfile) {
        this.mUserProfile = UserProfile;
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.toolbar.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return onChangeToolbar((ProfileTopToolbarBinding) object, fieldId);
            default:
                return false;
        }
    }

    private boolean onChangeToolbar(ProfileTopToolbarBinding Toolbar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long dirtyFlags;
        synchronized (this) {
            dirtyFlags = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        View.OnClickListener profileViewModelOnEditDetailsAndroidViewViewOnClickListener = null;
        String nameNumberMobile = null;
        User nameNumber = this.mNameNumber;
        ProfileViewModel profileViewModel = this.mProfileViewModel;
        String nameNumberName = null;
        if (!((dirtyFlags & 18) == 0 || nameNumber == null)) {
            nameNumberMobile = nameNumber.getMobile();
            nameNumberName = nameNumber.getName();
        }
        if (!((dirtyFlags & 20) == 0 || profileViewModel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.mProfileViewModelOnEditDetailsAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.mProfileViewModelOnEditDetailsAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            profileViewModelOnEditDetailsAndroidViewViewOnClickListener = onClickListenerImpl.setValue(profileViewModel);
        }
        if ((18 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.mboundView1, nameNumberMobile);
            TextViewBindingAdapter.setText(this.mboundView2, nameNumberName);
        }
        if ((16 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.mboundView1, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView1androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView2, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView2androidTextAttrChanged);
        }
        if ((dirtyFlags & 20) != 0) {
            this.mboundView3.setOnClickListener(profileViewModelOnEditDetailsAndroidViewViewOnClickListener);
        }
        executeBindingsOn(this.toolbar);
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private ProfileViewModel value;

        public OnClickListenerImpl setValue(ProfileViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onEditDetails(arg0);
        }
    }
}
