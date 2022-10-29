package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.data.network.responses.DmtUserData;
import com.sandy.cosmossoft.databinding.DmtUserLayoutBinding;
import com.sandy.cosmossoft.listeners.DMTAccountListener;
import java.util.ArrayList;
import java.util.List;

public class DmtUserAdapter extends RecyclerView.Adapter<UserHolder> implements Filterable {
    LayoutInflater inflater;
    List<DmtUserData> list;
    List<DmtUserData> listFilter = new ArrayList();
    DMTAccountListener listener;

    public DmtUserAdapter(List<DmtUserData> list2, DMTAccountListener listener2) {
        this.listener = listener2;
        this.list = list2;
        this.listFilter = list2;
    }

    public UserHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (this.inflater == null) {
            this.inflater = LayoutInflater.from(parent.getContext());
        }
        return new UserHolder(DmtUserLayoutBinding.inflate(this.inflater));
    }

    public void onBindViewHolder(UserHolder holder, int position) {
        holder.binding.setDmtUserData(this.listFilter.get(position));
        holder.binding.getRoot().setOnClickListener(new DmtUserAdapter$$ExternalSyntheticLambda0(this, position));
        holder.binding.refreshDmtUser.setOnClickListener(new DmtUserAdapter$$ExternalSyntheticLambda1(this, position));
        holder.binding.deleteDmtUser.setOnClickListener(new DmtUserAdapter$$ExternalSyntheticLambda2(this, position));
    }

    /* renamed from: lambda$onBindViewHolder$0$com-sandy-cosmossoft-adapters-DmtUserAdapter */
    public /* synthetic */ void mo704x6c4b1cf(int position, View v) {
        this.listener.onAccountClick(v, this.listFilter.get(position));
    }

    /* renamed from: lambda$onBindViewHolder$1$com-sandy-cosmossoft-adapters-DmtUserAdapter */
    public /* synthetic */ void mo705x64e4bd0(int position, View v) {
        this.listener.onRefreshClick(v, this.listFilter.get(position));
    }

    /* renamed from: lambda$onBindViewHolder$2$com-sandy-cosmossoft-adapters-DmtUserAdapter */
    public /* synthetic */ void mo706x5d7e5d1(int position, View v) {
        this.listener.onDeleteClick(v, this.listFilter.get(position));
    }

    public int getItemCount() {
        List<DmtUserData> list2 = this.listFilter;
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
                    DmtUserAdapter dmtUserAdapter = DmtUserAdapter.this;
                    dmtUserAdapter.listFilter = dmtUserAdapter.list;
                } else {
                    List<DmtUserData> filterList = new ArrayList<>();
                    for (DmtUserData p : DmtUserAdapter.this.list) {
                        if (p.getMobile().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        } else if (p.getFname().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        } else if (p.getLname().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        }
                    }
                    DmtUserAdapter.this.listFilter = filterList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = DmtUserAdapter.this.listFilter;
                return filterResults;
            }

            /* access modifiers changed from: protected */
            public void publishResults(CharSequence constraint, FilterResults results) {
                DmtUserAdapter.this.listFilter = (List) results.values;
                DmtUserAdapter.this.notifyDataSetChanged();
            }
        };
    }

    public static class UserHolder extends RecyclerView.ViewHolder {
        DmtUserLayoutBinding binding;

        public UserHolder(DmtUserLayoutBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
