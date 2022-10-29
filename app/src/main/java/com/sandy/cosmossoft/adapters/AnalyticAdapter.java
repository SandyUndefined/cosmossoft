package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import com.sandy.cosmossoft.databinding.AnalyticDesignLayoutBinding;
import com.sandy.cosmossoft.listeners.AnalyticOperationListener;
import java.util.ArrayList;
import java.util.List;

public class AnalyticAdapter extends RecyclerView.Adapter<AnalyticViewHolder> {
    List<AnalyticsResponseModel> analyticsList;
    LayoutInflater inflater;
    AnalyticOperationListener listener;

    public AnalyticAdapter(List<AnalyticsResponseModel> analyticsList2, AnalyticOperationListener listener2) {
        this.analyticsList = analyticsList2;
        this.listener = listener2;
    }

    public AnalyticViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (this.inflater == null) {
            this.inflater = LayoutInflater.from(parent.getContext());
        }
        return new AnalyticViewHolder(AnalyticDesignLayoutBinding.inflate(this.inflater));
    }

    public void onBindViewHolder(AnalyticViewHolder holder, int position) {
        holder.binding.setAnalyticDataModel(this.analyticsList.get(position));
        holder.binding.checkDetails.setOnClickListener(new AnalyticAdapter$$ExternalSyntheticLambda0(this, position));
        holder.binding.updateButton.setOnClickListener(new AnalyticAdapter$$ExternalSyntheticLambda1(this, position));
        this.listener.observerData(holder.binding.updateButton, this.analyticsList.get(position));
    }

    /* renamed from: lambda$onBindViewHolder$0$com-sandy-cosmossoft-adapters-AnalyticAdapter */
    public /* synthetic */ void mo674xcf52c7ec(int position, View v) {
        this.listener.checkMyDetailsOf(v, this.analyticsList.get(position));
    }

    /* renamed from: lambda$onBindViewHolder$1$com-sandy-cosmossoft-adapters-AnalyticAdapter */
    public /* synthetic */ void mo675xc0fc6e0b(int position, View v) {
        this.listener.updateMyDetailsOf(v, this.analyticsList.get(position));
    }

    public int getItemCount() {
        List<AnalyticsResponseModel> list = this.analyticsList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void setAllData(List<AnalyticsResponseModel> list) {
        this.analyticsList.addAll(list);
    }

    public void resetTheList() {
        this.analyticsList = new ArrayList();
        notifyDataSetChanged();
    }

    public static class AnalyticViewHolder extends RecyclerView.ViewHolder {
        AnalyticDesignLayoutBinding binding;

        public AnalyticViewHolder(AnalyticDesignLayoutBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }

    public String getLastPositionId() {
        if (this.analyticsList.size() == 0) {
            return "0";
        }
        List<AnalyticsResponseModel> list = this.analyticsList;
        return String.valueOf(list.get(list.size() - 1).getId());
    }
}
