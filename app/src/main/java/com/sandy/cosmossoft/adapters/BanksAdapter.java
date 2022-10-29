package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.data.model.BankModel;
import com.sandy.cosmossoft.databinding.BankListLayoutBinding;
import com.sandy.cosmossoft.listeners.BanksListener;
import java.util.ArrayList;
import java.util.Iterator;

public class BanksAdapter extends RecyclerView.Adapter<BanksViewHolder> implements Filterable {
    ArrayList<BankModel> arrayList = new ArrayList<>();
    ArrayList<BankModel> arrayListFilter;
    BanksListener listener;

    public BanksAdapter(ArrayList<BankModel> arrayList2, BanksListener listener2) {
        this.arrayList = arrayList2;
        this.listener = listener2;
        this.arrayListFilter = new ArrayList<>();
        this.arrayListFilter = arrayList2;
    }

    public BanksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BanksViewHolder(BankListLayoutBinding.inflate(LayoutInflater.from(parent.getContext())));
    }

    public void onBindViewHolder(BanksViewHolder holder, int position) {
        holder.binding.setBankModel(this.arrayListFilter.get(position));
        holder.binding.getRoot().setOnClickListener(new BanksAdapter$$ExternalSyntheticLambda0(this, position));
    }

    /* renamed from: lambda$onBindViewHolder$0$com-sandy-cosmossoft-adapters-BanksAdapter */
    public /* synthetic */ void mo682x602139ee(int position, View v) {
        this.listener.selectedBanks(v, this.arrayListFilter.get(position));
    }

    public int getItemCount() {
        ArrayList<BankModel> arrayList2 = this.arrayListFilter;
        if (arrayList2 == null) {
            return 0;
        }
        return arrayList2.size();
    }

    public Filter getFilter() {
        return new Filter() {
            /* access modifiers changed from: protected */
            public FilterResults performFiltering(CharSequence constraint) {
                String character = constraint.toString();
                if (character.isEmpty()) {
                    BanksAdapter banksAdapter = BanksAdapter.this;
                    banksAdapter.arrayListFilter = banksAdapter.arrayList;
                } else {
                    ArrayList<BankModel> filterList = new ArrayList<>();
                    Iterator<BankModel> it = BanksAdapter.this.arrayList.iterator();
                    while (it.hasNext()) {
                        BankModel p = it.next();
                        if (p.getBankname().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        }
                    }
                    BanksAdapter.this.arrayListFilter = filterList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = BanksAdapter.this.arrayListFilter;
                return filterResults;
            }

            /* access modifiers changed from: protected */
            public void publishResults(CharSequence constraint, FilterResults results) {
                BanksAdapter.this.arrayListFilter = (ArrayList) results.values;
                BanksAdapter.this.notifyDataSetChanged();
            }
        };
    }

    public static class BanksViewHolder extends RecyclerView.ViewHolder {
        BankListLayoutBinding binding;

        public BanksViewHolder(BankListLayoutBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
