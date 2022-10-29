package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.data.network.responses.ROfferModel;
import com.sandy.cosmossoft.databinding.ROfferLayoutBinding;
import com.sandy.cosmossoft.listeners.RegularClick;
import java.util.ArrayList;
import java.util.List;

public class ROfferAdapter extends RecyclerView.Adapter<ROfferViewHolder> implements Filterable {
    LayoutInflater inflater;
    List<ROfferModel> list = new ArrayList();
    List<ROfferModel> listFilter;
    private RegularClick listener;

    public ROfferAdapter(List<ROfferModel> list2, RegularClick listener2) {
        this.list = list2;
        this.listener = listener2;
        this.listFilter = new ArrayList();
        this.listFilter = list2;
    }

    public ROfferViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (this.inflater == null) {
            this.inflater = LayoutInflater.from(parent.getContext());
        }
        return new ROfferViewHolder(ROfferLayoutBinding.inflate(this.inflater));
    }

    public void onBindViewHolder(ROfferViewHolder holder, int position) {
        holder.binding.setROfferDataModel(this.listFilter.get(position));
        holder.binding.getRoot().setOnClickListener(new ROfferAdapter$$ExternalSyntheticLambda0(this, position));
    }

    /* renamed from: lambda$onBindViewHolder$0$com-sandy-cosmossoft-adapters-ROfferAdapter */
    public /* synthetic */ void mo749x244ef94f(int position, View v) {
        this.listener.onClickItem(v, this.listFilter.get(position).getRs());
    }

    public int getItemCount() {
        List<ROfferModel> list2 = this.listFilter;
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
                    ROfferAdapter rOfferAdapter = ROfferAdapter.this;
                    rOfferAdapter.listFilter = rOfferAdapter.list;
                } else {
                    ArrayList<ROfferModel> filterList = new ArrayList<>();
                    for (ROfferModel p : ROfferAdapter.this.list) {
                        if (p.getRs().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        }
                    }
                    ROfferAdapter.this.listFilter = filterList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = ROfferAdapter.this.listFilter;
                return filterResults;
            }

            /* access modifiers changed from: protected */
            public void publishResults(CharSequence constraint, FilterResults results) {
                ROfferAdapter.this.listFilter = (List) results.values;
                ROfferAdapter.this.notifyDataSetChanged();
            }
        };
    }

    public static class ROfferViewHolder extends RecyclerView.ViewHolder {
        ROfferLayoutBinding binding;

        public ROfferViewHolder(ROfferLayoutBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
