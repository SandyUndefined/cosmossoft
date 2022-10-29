package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryHistoryResponse;
import com.sandy.cosmossoft.databinding.BeneficiaryHistoryLayoutBinding;
import com.sandy.cosmossoft.listeners.BeneficiaryHistoryListener;
import java.util.List;

public class SimpleBeneficiaryHistoryAdapter extends RecyclerView.Adapter<MyViewHolder> {
    List<BeneficiaryHistoryResponse> filterList;
    List<BeneficiaryHistoryResponse> list;
    BeneficiaryHistoryListener listener;

    public SimpleBeneficiaryHistoryAdapter(List<BeneficiaryHistoryResponse> list2, BeneficiaryHistoryListener listener2) {
        this.filterList = list2;
        this.list = list2;
        this.listener = listener2;
    }

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(BeneficiaryHistoryLayoutBinding.inflate(LayoutInflater.from(parent.getContext())));
    }

    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.binding.setHistoryModelResponse(this.filterList.get(position));
        if (this.filterList.get(position).getData() == null || (!this.filterList.get(position).getData().isStatus() && !this.filterList.get(position).getData().response_code.equals(1))) {
            holder.binding.clickUpdate.setVisibility(0);
        } else {
            holder.binding.clickUpdate.setVisibility(8);
            holder.binding.getRoot().setOnClickListener(new SimpleBeneficiaryHistoryAdapter$$ExternalSyntheticLambda0(this, position));
        }
        holder.binding.clickUpdate.setOnClickListener(new SimpleBeneficiaryHistoryAdapter$$ExternalSyntheticLambda1(this, position));
        holder.binding.refundButton.setOnClickListener(new SimpleBeneficiaryHistoryAdapter$$ExternalSyntheticLambda2(this, position));
        if (!this.filterList.get(position).refundable || this.filterList.get(position).getData().getAckno() == null) {
            holder.binding.refundButton.setVisibility(0);
        } else {
            holder.binding.refundButton.setVisibility(0);
        }
    }

    /* renamed from: lambda$onBindViewHolder$0$com-sandy-cosmossoft-adapters-SimpleBeneficiaryHistoryAdapter */
    public /* synthetic */ void mo762x316528b8(int position, View v) {
        this.listener.clickOnMoreInfo(v, this.filterList.get(position));
    }

    /* renamed from: lambda$onBindViewHolder$1$com-sandy-cosmossoft-adapters-SimpleBeneficiaryHistoryAdapter */
    public /* synthetic */ void mo763x9b94b0d7(int position, View v) {
        this.listener.clickOnUpdateInfo(v, this.filterList.get(position));
    }

    /* renamed from: lambda$onBindViewHolder$2$com-sandy-cosmossoft-adapters-SimpleBeneficiaryHistoryAdapter */
    public /* synthetic */ void mo764x5c438f6(int position, View v) {
        this.listener.clickOnRefund(v, this.filterList.get(position));
    }

    public int getItemCount() {
        List<BeneficiaryHistoryResponse> list2 = this.filterList;
        if (list2 == null) {
            return 0;
        }
        return list2.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        BeneficiaryHistoryLayoutBinding binding;

        public MyViewHolder(BeneficiaryHistoryLayoutBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
