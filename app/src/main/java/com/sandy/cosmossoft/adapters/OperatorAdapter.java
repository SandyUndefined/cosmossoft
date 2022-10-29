package com.sandy.cosmossoft.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.OperatorModel;
import com.sandy.cosmossoft.databinding.OperatorListLayoutBinding;
import com.sandy.cosmossoft.listeners.OperatorListener;
import java.util.ArrayList;
import java.util.List;

public class OperatorAdapter extends RecyclerView.Adapter<OperatorViewModel> implements Filterable {
    List<OperatorModel> arrayList = new ArrayList();
    List<OperatorModel> arrayListFilter;
    OperatorListener listener;

    public OperatorAdapter(List<OperatorModel> list, OperatorListener listener2) {
        this.arrayList = list;
        this.listener = listener2;
        this.arrayListFilter = new ArrayList();
        this.arrayListFilter = this.arrayList;
    }

    public OperatorViewModel onCreateViewHolder(ViewGroup parent, int viewType) {
        return new OperatorViewModel((OperatorListLayoutBinding) DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), C0330R.layout.operator_list_layout, parent, false));
    }

    public void onBindViewHolder(OperatorViewModel holder, int position) {
        holder.binding.setOperatorModel(this.arrayListFilter.get(position));
        Log.d("OperatorImages", this.arrayListFilter.get(position).getLogo());
        holder.binding.getRoot().setOnClickListener(new OperatorAdapter$$ExternalSyntheticLambda0(this, position));
    }

    /* renamed from: lambda$onBindViewHolder$0$com-sandy-cosmossoft-adapters-OperatorAdapter */
    public /* synthetic */ void mo722xff9f9df5(int position, View v) {
        this.listener.myOperatorClicks(v, this.arrayListFilter.get(position));
    }

    public int getItemCount() {
        List<OperatorModel> list = this.arrayListFilter;
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
                    OperatorAdapter operatorAdapter = OperatorAdapter.this;
                    operatorAdapter.arrayListFilter = operatorAdapter.arrayList;
                } else {
                    ArrayList<OperatorModel> filterList = new ArrayList<>();
                    for (OperatorModel p : OperatorAdapter.this.arrayList) {
                        if (p.getName().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        } else if (p.getName().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        }
                    }
                    OperatorAdapter.this.arrayListFilter = filterList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = OperatorAdapter.this.arrayListFilter;
                return filterResults;
            }

            /* access modifiers changed from: protected */
            public void publishResults(CharSequence constraint, FilterResults results) {
                OperatorAdapter.this.arrayListFilter = (ArrayList) results.values;
                OperatorAdapter.this.notifyDataSetChanged();
            }
        };
    }

    public static class OperatorViewModel extends RecyclerView.ViewHolder {
        OperatorListLayoutBinding binding;

        public OperatorViewModel(OperatorListLayoutBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
