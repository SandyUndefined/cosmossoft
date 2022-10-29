package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.HistoryModel;

public abstract class HistoryListLayoutBinding extends ViewDataBinding {
    public final TextView historyAmount;
    public final CardView historyCard;
    public final ImageView historyLogo;
    public final LinearLayout historyLogoLayout;
    @Bindable
    protected HistoryModel mMyHistoryModel;

    public abstract void setMyHistoryModel(HistoryModel historyModel);

    protected HistoryListLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView historyAmount2, CardView historyCard2, ImageView historyLogo2, LinearLayout historyLogoLayout2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.historyAmount = historyAmount2;
        this.historyCard = historyCard2;
        this.historyLogo = historyLogo2;
        this.historyLogoLayout = historyLogoLayout2;
    }

    public HistoryModel getMyHistoryModel() {
        return this.mMyHistoryModel;
    }

    public static HistoryListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static HistoryListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (HistoryListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.history_list_layout, root, attachToRoot, component);
    }

    public static HistoryListLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static HistoryListLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (HistoryListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.history_list_layout, (ViewGroup) null, false, component);
    }

    public static HistoryListLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static HistoryListLayoutBinding bind(View view, Object component) {
        return (HistoryListLayoutBinding) bind(component, view, C0330R.layout.history_list_layout);
    }
}
