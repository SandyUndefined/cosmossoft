package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.data.network.responses.RegularHistoryResponse;
import com.sandy.cosmossoft.databinding.RegularHistoryDesignBinding;
import com.sandy.cosmossoft.listeners.RegularHistoryListener;
import java.util.ArrayList;
import java.util.List;

public class RegularHistoryAdapter extends RecyclerView.Adapter<HistViewHolder> implements Filterable {
    List<RegularHistoryResponse.EveryDayData> arrayList;
    List<RegularHistoryResponse.EveryDayData> arrayListFilter;
    LayoutInflater inflater;
    RegularHistoryListener listener;

    public RegularHistoryAdapter(List<RegularHistoryResponse.EveryDayData> list, RegularHistoryListener listener2) {
        this.arrayList = list;
        this.listener = listener2;
        this.arrayListFilter = new ArrayList();
        this.arrayListFilter = this.arrayList;
    }

    public HistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (this.inflater == null) {
            this.inflater = LayoutInflater.from(parent.getContext());
        }
        return new HistViewHolder(RegularHistoryDesignBinding.inflate(this.inflater));
    }

    public void onBindViewHolder(HistViewHolder holder, int position) {
        holder.binding.setHistData(this.arrayListFilter.get(position));
        holder.binding.historyClick.setOnClickListener(new RegularHistoryAdapter$$ExternalSyntheticLambda0(this, position));
        this.listener.disableListener(holder.binding, this.arrayListFilter.get(position));
        holder.binding.claimRefund.setOnClickListener(new RegularHistoryAdapter$$ExternalSyntheticLambda1(this, position));
    }

    /* renamed from: lambda$onBindViewHolder$0$com-sandy-cosmossoft-adapters-RegularHistoryAdapter */
    public /* synthetic */ void mo755x8854e741(int position, View v) {
        this.listener.onCheckStatusData(this.arrayListFilter.get(position));
    }

    /* renamed from: lambda$onBindViewHolder$1$com-sandy-cosmossoft-adapters-RegularHistoryAdapter */
    public /* synthetic */ void mo756x898b3a20(int position, View v) {
        this.listener.onRefundClick(this.arrayListFilter.get(position));
    }

    public int getItemCount() {
        List<RegularHistoryResponse.EveryDayData> list = this.arrayListFilter;
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
                    RegularHistoryAdapter regularHistoryAdapter = RegularHistoryAdapter.this;
                    regularHistoryAdapter.arrayListFilter = regularHistoryAdapter.arrayList;
                } else {
                    ArrayList<RegularHistoryResponse.EveryDayData> filterList = new ArrayList<>();
                    for (RegularHistoryResponse.EveryDayData p : RegularHistoryAdapter.this.arrayList) {
                        if (p.getAmount().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        } else if (p.getNumber().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        } else if (p.getStatus().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        } else if (p.getReference().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        }
                    }
                    RegularHistoryAdapter.this.arrayListFilter = filterList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = RegularHistoryAdapter.this.arrayListFilter;
                return filterResults;
            }

            /* access modifiers changed from: protected */
            public void publishResults(CharSequence constraint, FilterResults results) {
                RegularHistoryAdapter.this.arrayListFilter = (ArrayList) results.values;
                RegularHistoryAdapter.this.notifyDataSetChanged();
            }
        };
    }

    public static class HistViewHolder extends RecyclerView.ViewHolder {
        RegularHistoryDesignBinding binding;

        public HistViewHolder(RegularHistoryDesignBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
