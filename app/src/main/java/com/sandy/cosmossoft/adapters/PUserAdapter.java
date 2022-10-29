package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.data.network.responses.PBeneficiaryModel;
import com.sandy.cosmossoft.databinding.PayoutBeneficiaryCardBinding;
import com.sandy.cosmossoft.listeners.PDMTListener;
import java.util.ArrayList;
import java.util.List;

public class PUserAdapter extends RecyclerView.Adapter<BeneViewHolder> implements Filterable {
    LayoutInflater inflater;
    List<PBeneficiaryModel> list;
    List<PBeneficiaryModel> listFilter = new ArrayList();
    PDMTListener listener;

    public PUserAdapter(List<PBeneficiaryModel> list2, PDMTListener listener2) {
        this.listener = listener2;
        this.list = list2;
        this.listFilter = list2;
    }

    public void onBindViewHolder(BeneViewHolder holder, int position) {
        holder.binding.setPBemeModel(this.listFilter.get(position));
        holder.binding.getRoot().setOnClickListener(new PUserAdapter$$ExternalSyntheticLambda0(this, position));
        holder.binding.deleteDmtUser.setOnClickListener(new PUserAdapter$$ExternalSyntheticLambda1(this, position));
    }

    /* renamed from: lambda$onBindViewHolder$0$com-sandy-cosmossoft-adapters-PUserAdapter */
    public /* synthetic */ void mo728xb51352ca(int position, View v) {
        this.listener.onClickBeneficiary(v, this.listFilter.get(position));
    }

    /* renamed from: lambda$onBindViewHolder$1$com-sandy-cosmossoft-adapters-PUserAdapter */
    public /* synthetic */ void mo729x2a8d790b(int position, View v) {
        this.listener.onDeleteBeneficiary(v, this.listFilter.get(position));
    }

    public BeneViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (this.inflater == null) {
            this.inflater = LayoutInflater.from(parent.getContext());
        }
        return new BeneViewHolder(PayoutBeneficiaryCardBinding.inflate(this.inflater));
    }

    public int getItemCount() {
        List<PBeneficiaryModel> list2 = this.listFilter;
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
                    PUserAdapter pUserAdapter = PUserAdapter.this;
                    pUserAdapter.listFilter = pUserAdapter.list;
                } else {
                    List<PBeneficiaryModel> filterList = new ArrayList<>();
                    for (PBeneficiaryModel p : PUserAdapter.this.list) {
                        if (p.getName().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        } else if (p.getAcc_num().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        }
                    }
                    PUserAdapter.this.listFilter = filterList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = PUserAdapter.this.listFilter;
                return filterResults;
            }

            /* access modifiers changed from: protected */
            public void publishResults(CharSequence constraint, FilterResults results) {
                PUserAdapter.this.listFilter = (List) results.values;
                PUserAdapter.this.notifyDataSetChanged();
            }
        };
    }

    public static class BeneViewHolder extends RecyclerView.ViewHolder {
        PayoutBeneficiaryCardBinding binding;

        public BeneViewHolder(PayoutBeneficiaryCardBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
