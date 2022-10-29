package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.data.model.AEPSBanksModel;
import com.sandy.cosmossoft.databinding.AepsBankListLayoutBinding;
import com.sandy.cosmossoft.listeners.AepsBankListener;
import java.util.ArrayList;
import java.util.List;

public class AEPSBankAdapter extends RecyclerView.Adapter<AEPSViewHolder> implements Filterable {
    List<AEPSBanksModel> arrayList = new ArrayList();
    LayoutInflater layoutInflater;
    List<AEPSBanksModel> listFilter;
    AepsBankListener listener;

    public AEPSBankAdapter(List<AEPSBanksModel> list, AepsBankListener listener2) {
        this.arrayList = list;
        this.listener = listener2;
        this.listFilter = new ArrayList();
        this.listFilter = this.arrayList;
    }

    public AEPSViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (this.layoutInflater == null) {
            this.layoutInflater = LayoutInflater.from(parent.getContext());
        }
        return new AEPSViewHolder(AepsBankListLayoutBinding.inflate(this.layoutInflater));
    }

    public void onBindViewHolder(AEPSViewHolder holder, int position) {
        holder.binding.setBankListModel(this.listFilter.get(position));
        holder.binding.getRoot().setOnClickListener(new AEPSBankAdapter$$ExternalSyntheticLambda0(this, position));
    }

    /* renamed from: lambda$onBindViewHolder$0$com-sandy-cosmossoft-adapters-AEPSBankAdapter */
    public /* synthetic */ void mo666x118aadd6(int position, View v) {
        this.listener.selectedAepsBanks(v, this.listFilter.get(position));
    }

    public int getItemCount() {
        List<AEPSBanksModel> list = this.listFilter;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Filter getFilter() {
        return new Filter() {
            /* access modifiers changed from: protected */
            public FilterResults performFiltering(CharSequence constraint) {
                String character = constraint.toString();
                if (character.isEmpty()) {
                    AEPSBankAdapter aEPSBankAdapter = AEPSBankAdapter.this;
                    aEPSBankAdapter.listFilter = aEPSBankAdapter.arrayList;
                } else {
                    List<AEPSBanksModel> filterList = new ArrayList<>();
                    for (AEPSBanksModel p : AEPSBankAdapter.this.arrayList) {
                        if (p.getBankname().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        }
                    }
                    AEPSBankAdapter.this.listFilter = filterList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = AEPSBankAdapter.this.listFilter;
                return filterResults;
            }

            /* access modifiers changed from: protected */
            public void publishResults(CharSequence constraint, FilterResults results) {
                AEPSBankAdapter.this.listFilter = (List) results.values;
                AEPSBankAdapter.this.notifyDataSetChanged();
            }
        };
    }

    public static class AEPSViewHolder extends RecyclerView.ViewHolder {
        AepsBankListLayoutBinding binding;

        public AEPSViewHolder(AepsBankListLayoutBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
