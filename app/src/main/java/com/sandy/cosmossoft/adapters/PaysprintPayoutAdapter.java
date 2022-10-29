package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.data.network.responses.PayoutList;
import com.sandy.cosmossoft.databinding.PayoutListLayoutBinding;
import com.sandy.cosmossoft.listeners.PayoutHomeListener;
import java.util.ArrayList;
import java.util.List;

public class PaysprintPayoutAdapter extends RecyclerView.Adapter<PayoutAccHolder> implements Filterable {
    LayoutInflater inflater;
    List<PayoutList> list;
    List<PayoutList> listFilter = new ArrayList();
    PayoutHomeListener listener;

    public PaysprintPayoutAdapter(List<PayoutList> list2, PayoutHomeListener listener2) {
        this.listener = listener2;
        this.list = list2;
        this.listFilter = list2;
    }

    public PayoutAccHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (this.inflater == null) {
            this.inflater = LayoutInflater.from(parent.getContext());
        }
        return new PayoutAccHolder(PayoutListLayoutBinding.inflate(this.inflater));
    }

    public void onBindViewHolder(PayoutAccHolder holder, int position) {
        holder.binding.setPaySprintList(this.listFilter.get(position));
        holder.binding.getRoot().setOnClickListener(new PaysprintPayoutAdapter$$ExternalSyntheticLambda0(this, position));
        holder.binding.verifyAccount.setOnClickListener(new PaysprintPayoutAdapter$$ExternalSyntheticLambda1(this, position));
        if (this.listFilter.get(position).getStatus() == null || !this.listFilter.get(position).getStatus().equals(ExifInterface.GPS_MEASUREMENT_2D)) {
            holder.binding.verifyAccount.setVisibility(4);
        } else {
            holder.binding.verifyAccount.setVisibility(0);
        }
    }

    /* renamed from: lambda$onBindViewHolder$0$com-sandy-cosmossoft-adapters-PaysprintPayoutAdapter */
    public /* synthetic */ void mo736x6b0015fd(int position, View v) {
        this.listener.openBeneficiary(v, this.listFilter.get(position));
    }

    /* renamed from: lambda$onBindViewHolder$1$com-sandy-cosmossoft-adapters-PaysprintPayoutAdapter */
    public /* synthetic */ void mo737x90941efe(int position, View v) {
        this.listener.verifyPayoutBeneficiary(v, this.listFilter.get(position));
    }

    public int getItemCount() {
        List<PayoutList> list2 = this.listFilter;
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
                    PaysprintPayoutAdapter paysprintPayoutAdapter = PaysprintPayoutAdapter.this;
                    paysprintPayoutAdapter.listFilter = paysprintPayoutAdapter.list;
                } else {
                    List<PayoutList> filterList = new ArrayList<>();
                    for (PayoutList p : PaysprintPayoutAdapter.this.list) {
                        if (p.getName().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        } else if (p.getBankname().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        } else if (p.getAccount().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        }
                    }
                    PaysprintPayoutAdapter.this.listFilter = filterList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = PaysprintPayoutAdapter.this.listFilter;
                return filterResults;
            }

            /* access modifiers changed from: protected */
            public void publishResults(CharSequence constraint, FilterResults results) {
                PaysprintPayoutAdapter.this.listFilter = (List) results.values;
                PaysprintPayoutAdapter.this.notifyDataSetChanged();
            }
        };
    }

    public static class PayoutAccHolder extends RecyclerView.ViewHolder {
        PayoutListLayoutBinding binding;

        public PayoutAccHolder(PayoutListLayoutBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
