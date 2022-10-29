package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryBank;
import com.sandy.cosmossoft.databinding.BeneficiaryListLayoutBinding;
import com.sandy.cosmossoft.listeners.BeneficiaryClickListener;
import java.util.ArrayList;
import java.util.List;

public class BeneficiaryAdapter extends RecyclerView.Adapter<BeneficiaryViewHolder> implements Filterable {
    List<BeneficiaryBank> filterList = new ArrayList();
    List<BeneficiaryBank> list;
    BeneficiaryClickListener listener;

    public BeneficiaryAdapter(List<BeneficiaryBank> list2, BeneficiaryClickListener listener2) {
        this.list = list2;
        this.filterList = list2;
        this.listener = listener2;
    }

    public BeneficiaryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BeneficiaryViewHolder(BeneficiaryListLayoutBinding.inflate(LayoutInflater.from(parent.getContext())));
    }

    public void onBindViewHolder(BeneficiaryViewHolder holder, int position) {
        holder.binding.setBeneficiaryModel(this.filterList.get(position));
        holder.binding.getRoot().setOnClickListener(new BeneficiaryAdapter$$ExternalSyntheticLambda0(this, position));
        holder.binding.deleteBeneficiary.setOnClickListener(new BeneficiaryAdapter$$ExternalSyntheticLambda1(this, position));
    }

    /* renamed from: lambda$onBindViewHolder$0$com-sandy-cosmossoft-adapters-BeneficiaryAdapter */
    public /* synthetic */ void mo688x3caa1c80(int position, View v) {
        this.listener.onItemClicked(v, this.filterList.get(position));
    }

    /* renamed from: lambda$onBindViewHolder$1$com-sandy-cosmossoft-adapters-BeneficiaryAdapter */
    public /* synthetic */ void mo689xc9e4ce01(int position, View v) {
        this.listener.onMoreClickListener(v, this.filterList.get(position));
    }

    public int getItemCount() {
        List<BeneficiaryBank> list2 = this.filterList;
        if (list2 == null) {
            return 0;
        }
        return list2.size();
    }

    public Filter getFilter() {
        return new Filter() {
            /* access modifiers changed from: protected */
            public FilterResults performFiltering(CharSequence constraint) {
                String character = constraint.toString();
                if (character.isEmpty()) {
                    BeneficiaryAdapter beneficiaryAdapter = BeneficiaryAdapter.this;
                    beneficiaryAdapter.filterList = beneficiaryAdapter.list;
                } else {
                    List<BeneficiaryBank> myFilterList = new ArrayList<>();
                    for (BeneficiaryBank p : BeneficiaryAdapter.this.list) {
                        if (p.bankname.toLowerCase().contains(character.toLowerCase())) {
                            myFilterList.add(p);
                        } else if (p.name.toLowerCase().contains(character.toLowerCase())) {
                            myFilterList.add(p);
                        }
                    }
                    BeneficiaryAdapter.this.filterList = myFilterList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = BeneficiaryAdapter.this.filterList;
                return filterResults;
            }

            /* access modifiers changed from: protected */
            public void publishResults(CharSequence constraint, FilterResults results) {
                BeneficiaryAdapter.this.filterList = (ArrayList) results.values;
                BeneficiaryAdapter.this.notifyDataSetChanged();
            }
        };
    }

    public static class BeneficiaryViewHolder extends RecyclerView.ViewHolder {
        BeneficiaryListLayoutBinding binding;

        public BeneficiaryViewHolder(BeneficiaryListLayoutBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
