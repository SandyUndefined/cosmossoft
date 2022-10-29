package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.PackageType;
import com.sandy.cosmossoft.data.model.PersonUserModel;
import com.sandy.cosmossoft.data.model.UserTypeModel;
import com.sandy.cosmossoft.viewmodel.CreationViewModel;

public class ActivityCreationBindingImpl extends ActivityCreationBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener emailIdandroidTextAttrChanged;
    private InverseBindingListener firstNameAddandroidTextAttrChanged;
    private InverseBindingListener lastNameAddandroidTextAttrChanged;
    private OnClickListenerImpl3 mCreationViewModelOnAddUserClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl mCreationViewModelOnOwnerClickAndroidViewViewOnClickListener;

    /* renamed from: mCreationViewModelOnUserPackageTypeClickAndroidViewViewOnClickListener */
    private OnClickListenerImpl2 f176xc332c56e;
    private OnClickListenerImpl1 mCreationViewModelOnUserTypeClickAndroidViewViewOnClickListener;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    private InverseBindingListener mobileNumberandroidTextAttrChanged;
    private InverseBindingListener ownerandroidTextAttrChanged;
    private InverseBindingListener packageTypeandroidTextAttrChanged;
    private InverseBindingListener userTypeandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.infoSection, 9);
        sparseIntArray.put(C0330R.C0333id.user_type_layout, 10);
        sparseIntArray.put(C0330R.C0333id.person_layout, 11);
        sparseIntArray.put(C0330R.C0333id.package_type_layout, 12);
        sparseIntArray.put(C0330R.C0333id.first_NameAdd_layout, 13);
        sparseIntArray.put(C0330R.C0333id.last_NameAdd_layout, 14);
        sparseIntArray.put(C0330R.C0333id.mobile_number_layout, 15);
        sparseIntArray.put(C0330R.C0333id.email_layout, 16);
    }

    public ActivityCreationBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }

    private ActivityCreationBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[8], bindings[7], bindings[16], bindings[4], bindings[13], bindings[9], bindings[5], bindings[14], bindings[6], bindings[15], bindings[2], bindings[3], bindings[12], bindings[11], bindings[1], bindings[10]);
        this.emailIdandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCreationBindingImpl.this.emailId);
                CreationViewModel creationViewModel = ActivityCreationBindingImpl.this.mCreationViewModel;
                if (creationViewModel != null) {
                    creationViewModel.email = callbackArg_0;
                }
            }
        };
        this.firstNameAddandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCreationBindingImpl.this.firstNameAdd);
                CreationViewModel creationViewModel = ActivityCreationBindingImpl.this.mCreationViewModel;
                if (creationViewModel != null) {
                    creationViewModel.first_name = callbackArg_0;
                }
            }
        };
        this.lastNameAddandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCreationBindingImpl.this.lastNameAdd);
                CreationViewModel creationViewModel = ActivityCreationBindingImpl.this.mCreationViewModel;
                if (creationViewModel != null) {
                    creationViewModel.last_name = callbackArg_0;
                }
            }
        };
        this.mobileNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCreationBindingImpl.this.mobileNumber);
                CreationViewModel creationViewModel = ActivityCreationBindingImpl.this.mCreationViewModel;
                if (creationViewModel != null) {
                    creationViewModel.mobile = callbackArg_0;
                }
            }
        };
        this.ownerandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCreationBindingImpl.this.owner);
                CreationViewModel creationViewModel = ActivityCreationBindingImpl.this.mCreationViewModel;
                boolean creationViewModelPersonUserModelJavaLangObjectNull = true;
                if (creationViewModel != null) {
                    PersonUserModel creationViewModelPersonUserModel = creationViewModel.personUserModel;
                    if (creationViewModelPersonUserModel == null) {
                        creationViewModelPersonUserModelJavaLangObjectNull = false;
                    }
                    if (creationViewModelPersonUserModelJavaLangObjectNull) {
                        creationViewModelPersonUserModel.setFirst_name(callbackArg_0);
                    }
                }
            }
        };
        this.packageTypeandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCreationBindingImpl.this.packageType);
                CreationViewModel creationViewModel = ActivityCreationBindingImpl.this.mCreationViewModel;
                boolean creationViewModelPackageTypeJavaLangObjectNull = true;
                if (creationViewModel != null) {
                    PackageType creationViewModelPackageType = creationViewModel.packageType;
                    if (creationViewModelPackageType == null) {
                        creationViewModelPackageTypeJavaLangObjectNull = false;
                    }
                    if (creationViewModelPackageTypeJavaLangObjectNull) {
                        creationViewModelPackageType.setName(callbackArg_0);
                    }
                }
            }
        };
        this.userTypeandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCreationBindingImpl.this.userType);
                CreationViewModel creationViewModel = ActivityCreationBindingImpl.this.mCreationViewModel;
                boolean creationViewModelUserTypemodelJavaLangObjectNull = true;
                if (creationViewModel != null) {
                    UserTypeModel creationViewModelUserTypemodel = creationViewModel.userTypemodel;
                    if (creationViewModelUserTypemodel == null) {
                        creationViewModelUserTypemodelJavaLangObjectNull = false;
                    }
                    if (creationViewModelUserTypemodelJavaLangObjectNull) {
                        creationViewModelUserTypemodel.setName(callbackArg_0);
                    }
                }
            }
        };
        this.mDirtyFlags = -1;
        this.SubmitUserAdd.setTag((Object) null);
        this.emailId.setTag((Object) null);
        this.firstNameAdd.setTag((Object) null);
        this.lastNameAdd.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.mobileNumber.setTag((Object) null);
        this.owner.setTag((Object) null);
        this.packageType.setTag((Object) null);
        this.userType.setTag((Object) null);
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
        if (13 != variableId) {
            return false;
        }
        setCreationViewModel((CreationViewModel) variable);
        return true;
    }

    public void setCreationViewModel(CreationViewModel CreationViewModel) {
        this.mCreationViewModel = CreationViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(13);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r4 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        r0 = r1.mCreationViewModelOnOwnerClickAndroidViewViewOnClickListener;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r0 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r0 = new com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl.OnClickListenerImpl();
        r1.mCreationViewModelOnOwnerClickAndroidViewViewOnClickListener = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r22 = r0.setValue(r4);
        r0 = r1.mCreationViewModelOnUserTypeClickAndroidViewViewOnClickListener;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r0 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r0 = new com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl.OnClickListenerImpl1();
        r1.mCreationViewModelOnUserTypeClickAndroidViewViewOnClickListener = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r0 = r0.setValue(r4);
        r6 = r4.email;
        r7 = r4.userTypemodel;
        r8 = r4.personUserModel;
        r9 = r1.f176xc332c56e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r9 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r9 = new com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl.OnClickListenerImpl2();
        r1.f176xc332c56e = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        r9 = r9.setValue(r4);
        r12 = r4.last_name;
        r13 = r4.packageType;
        r14 = r1.mCreationViewModelOnAddUserClickAndroidViewViewOnClickListener;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r14 != null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r14 = new com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl.OnClickListenerImpl3();
        r1.mCreationViewModelOnAddUserClickAndroidViewViewOnClickListener = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        r14 = r14.setValue(r4);
        r5 = r4.first_name;
        r19 = r4.mobile;
        r15 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r0;
        r0 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
        if (r8 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        r11 = r8.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r9 == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0090, code lost:
        r18 = r9.getFirst_name();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        if (r14 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        r10 = r14.getName();
        r24 = r18;
        r18 = r4;
        r4 = r24;
        r25 = r19;
        r19 = r8;
        r8 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        r24 = r18;
        r18 = r4;
        r4 = r24;
        r25 = r19;
        r19 = r8;
        r8 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r18 = r4;
        r4 = null;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if ((r2 & 3) == 0) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ca, code lost:
        r20 = r9;
        r1.SubmitUserAdd.setOnClickListener(r15);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.emailId, r7);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.firstNameAdd, r5);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.lastNameAdd, r13);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.mobileNumber, r8);
        r1.owner.setOnClickListener(r0);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.owner, r4);
        r1.packageType.setOnClickListener(r12);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.packageType, r10);
        r1.userType.setOnClickListener(r6);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.userType, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0104, code lost:
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010e, code lost:
        if ((r2 & 2) == 0) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0110, code lost:
        r16 = r0;
        r17 = null;
        r17 = null;
        r17 = null;
        r21 = r2;
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.emailId, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.emailIdandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.firstNameAdd, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.firstNameAddandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.lastNameAdd, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.lastNameAddandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.mobileNumber, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.mobileNumberandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.owner, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.ownerandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.packageType, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.packageTypeandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.userType, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.userTypeandroidTextAttrChanged);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0153, code lost:
        r16 = r0;
        r21 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        r0 = null;
        r6 = null;
        r7 = null;
        r8 = null;
        r9 = null;
        r10 = null;
        r11 = null;
        r12 = null;
        r13 = null;
        r14 = null;
        r15 = null;
        r4 = r1.mCreationViewModel;
        r5 = null;
        r18 = null;
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if ((r2 & 3) == 0) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r26 = this;
            r1 = r26
            r2 = 0
            monitor-enter(r26)
            long r4 = r1.mDirtyFlags     // Catch:{ all -> 0x015c }
            r2 = r4
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x0158 }
            monitor-exit(r26)     // Catch:{ all -> 0x0158 }
            r0 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            com.sandy.cosmossoft.viewmodel.CreationViewModel r4 = r1.mCreationViewModel
            r5 = 0
            r18 = 0
            r19 = 0
            r20 = 3
            long r22 = r2 & r20
            r16 = 0
            int r22 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r22 == 0) goto L_0x00b4
            if (r4 == 0) goto L_0x0086
            r22 = r0
            com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl r0 = r1.mCreationViewModelOnOwnerClickAndroidViewViewOnClickListener
            if (r0 != 0) goto L_0x0038
            com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl r0 = new com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl
            r0.<init>()
            r1.mCreationViewModelOnOwnerClickAndroidViewViewOnClickListener = r0
        L_0x0038:
            com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl r0 = r0.setValue(r4)
            r22 = r0
            com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl1 r0 = r1.mCreationViewModelOnUserTypeClickAndroidViewViewOnClickListener
            if (r0 != 0) goto L_0x0049
            com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl1 r0 = new com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl1
            r0.<init>()
            r1.mCreationViewModelOnUserTypeClickAndroidViewViewOnClickListener = r0
        L_0x0049:
            com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl1 r0 = r0.setValue(r4)
            java.lang.String r6 = r4.email
            com.sandy.cosmossoft.data.model.UserTypeModel r7 = r4.userTypemodel
            com.sandy.cosmossoft.data.model.PersonUserModel r8 = r4.personUserModel
            com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl2 r9 = r1.f176xc332c56e
            if (r9 != 0) goto L_0x005e
            com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl2 r9 = new com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl2
            r9.<init>()
            r1.f176xc332c56e = r9
        L_0x005e:
            com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl2 r9 = r9.setValue(r4)
            java.lang.String r12 = r4.last_name
            com.sandy.cosmossoft.data.model.PackageType r13 = r4.packageType
            com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl3 r14 = r1.mCreationViewModelOnAddUserClickAndroidViewViewOnClickListener
            if (r14 != 0) goto L_0x0071
            com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl3 r14 = new com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl3
            r14.<init>()
            r1.mCreationViewModelOnAddUserClickAndroidViewViewOnClickListener = r14
        L_0x0071:
            com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl$OnClickListenerImpl3 r14 = r14.setValue(r4)
            java.lang.String r5 = r4.first_name
            java.lang.String r15 = r4.mobile
            r19 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r0
            r0 = r22
            goto L_0x0088
        L_0x0086:
            r22 = r0
        L_0x0088:
            if (r8 == 0) goto L_0x008e
            java.lang.String r11 = r8.getName()
        L_0x008e:
            if (r9 == 0) goto L_0x0094
            java.lang.String r18 = r9.getFirst_name()
        L_0x0094:
            if (r14 == 0) goto L_0x00a7
            java.lang.String r10 = r14.getName()
            r24 = r18
            r18 = r4
            r4 = r24
            r25 = r19
            r19 = r8
            r8 = r25
            goto L_0x00c2
        L_0x00a7:
            r24 = r18
            r18 = r4
            r4 = r24
            r25 = r19
            r19 = r8
            r8 = r25
            goto L_0x00c2
        L_0x00b4:
            r22 = r0
            r24 = r18
            r18 = r4
            r4 = r24
            r25 = r19
            r19 = r8
            r8 = r25
        L_0x00c2:
            long r20 = r2 & r20
            r16 = 0
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 == 0) goto L_0x0104
            r20 = r9
            android.widget.Button r9 = r1.SubmitUserAdd
            r9.setOnClickListener(r15)
            com.google.android.material.textfield.TextInputEditText r9 = r1.emailId
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r9, r7)
            com.google.android.material.textfield.TextInputEditText r9 = r1.firstNameAdd
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r9, r5)
            com.google.android.material.textfield.TextInputEditText r9 = r1.lastNameAdd
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r9, r13)
            com.google.android.material.textfield.TextInputEditText r9 = r1.mobileNumber
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r9, r8)
            com.google.android.material.textfield.TextInputEditText r9 = r1.owner
            r9.setOnClickListener(r0)
            com.google.android.material.textfield.TextInputEditText r9 = r1.owner
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r9, r4)
            com.google.android.material.textfield.TextInputEditText r9 = r1.packageType
            r9.setOnClickListener(r12)
            com.google.android.material.textfield.TextInputEditText r9 = r1.packageType
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r9, r10)
            com.google.android.material.textfield.TextInputEditText r9 = r1.userType
            r9.setOnClickListener(r6)
            com.google.android.material.textfield.TextInputEditText r9 = r1.userType
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r9, r11)
            goto L_0x0106
        L_0x0104:
            r20 = r9
        L_0x0106:
            r21 = 2
            long r21 = r2 & r21
            r16 = 0
            int r9 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r9 == 0) goto L_0x0153
            com.google.android.material.textfield.TextInputEditText r9 = r1.emailId
            r16 = r0
            r0 = 0
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$BeforeTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) r17
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$OnTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) r17
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$AfterTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) r17
            r21 = r2
            androidx.databinding.InverseBindingListener r2 = r1.emailIdandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r9, r0, r0, r0, r2)
            com.google.android.material.textfield.TextInputEditText r2 = r1.firstNameAdd
            androidx.databinding.InverseBindingListener r3 = r1.firstNameAddandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            com.google.android.material.textfield.TextInputEditText r2 = r1.lastNameAdd
            androidx.databinding.InverseBindingListener r3 = r1.lastNameAddandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            com.google.android.material.textfield.TextInputEditText r2 = r1.mobileNumber
            androidx.databinding.InverseBindingListener r3 = r1.mobileNumberandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            com.google.android.material.textfield.TextInputEditText r2 = r1.owner
            androidx.databinding.InverseBindingListener r3 = r1.ownerandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            com.google.android.material.textfield.TextInputEditText r2 = r1.packageType
            androidx.databinding.InverseBindingListener r3 = r1.packageTypeandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            com.google.android.material.textfield.TextInputEditText r2 = r1.userType
            androidx.databinding.InverseBindingListener r3 = r1.userTypeandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            goto L_0x0157
        L_0x0153:
            r16 = r0
            r21 = r2
        L_0x0157:
            return
        L_0x0158:
            r0 = move-exception
            r21 = r2
            goto L_0x015d
        L_0x015c:
            r0 = move-exception
        L_0x015d:
            monitor-exit(r26)     // Catch:{ all -> 0x015c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl.executeBindings():void");
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private CreationViewModel value;

        public OnClickListenerImpl setValue(CreationViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onOwnerClick(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private CreationViewModel value;

        public OnClickListenerImpl1 setValue(CreationViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onUserTypeClick(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements View.OnClickListener {
        private CreationViewModel value;

        public OnClickListenerImpl2 setValue(CreationViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onUserPackageTypeClick(arg0);
        }
    }

    public static class OnClickListenerImpl3 implements View.OnClickListener {
        private CreationViewModel value;

        public OnClickListenerImpl3 setValue(CreationViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onAddUserClick(arg0);
        }
    }
}
