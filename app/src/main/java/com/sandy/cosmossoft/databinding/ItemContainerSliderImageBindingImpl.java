package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.makeramen.roundedimageview.RoundedImageView;
import com.sandy.cosmossoft.data.model.SliderItem;
import com.sandy.cosmossoft.util.BindingUtils;

public class ItemContainerSliderImageBindingImpl extends ItemContainerSliderImageBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private final RoundedImageView mboundView0;

    public ItemContainerSliderImageBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }

    private ItemContainerSliderImageBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0);
        this.mDirtyFlags = -1;
        RoundedImageView roundedImageView = bindings[0];
        this.mboundView0 = roundedImageView;
        roundedImageView.setTag((Object) null);
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
        if (51 != variableId) {
            return false;
        }
        setSliderItem((SliderItem) variable);
        return true;
    }

    public void setSliderItem(SliderItem SliderItem) {
        this.mSliderItem = SliderItem;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(51);
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
        String sliderItemImages = null;
        SliderItem sliderItem = this.mSliderItem;
        if (!((dirtyFlags & 3) == 0 || sliderItem == null)) {
            sliderItemImages = sliderItem.getImages();
        }
        if ((3 & dirtyFlags) != 0) {
            BindingUtils.loadUrlImage(this.mboundView0, sliderItemImages);
        }
    }
}
