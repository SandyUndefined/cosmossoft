package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.HistoryModel;
import com.sandy.cosmossoft.databinding.HistoryListLayoutBinding;
import java.util.ArrayList;
import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryViewHolder> {
    List<HistoryModel> historyModelsListFilter = new ArrayList();
    LayoutInflater layoutInflater;

    public HistoryAdapter(List<HistoryModel> historyModelsList) {
        this.historyModelsListFilter = historyModelsList;
    }

    public HistoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (this.layoutInflater == null) {
            this.layoutInflater = LayoutInflater.from(parent.getContext());
        }
        return new HistoryViewHolder((HistoryListLayoutBinding) DataBindingUtil.inflate(this.layoutInflater, C0330R.layout.history_list_layout, parent, false));
    }

    public void onBindViewHolder(HistoryViewHolder holder, int position) {
        holder.binding.setMyHistoryModel(this.historyModelsListFilter.get(position));
    }

    public int getItemCount() {
        List<HistoryModel> list = this.historyModelsListFilter;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class HistoryViewHolder extends RecyclerView.ViewHolder {
        public HistoryListLayoutBinding binding;

        public HistoryViewHolder(HistoryListLayoutBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }

    public void resetTheList() {
        this.historyModelsListFilter = new ArrayList();
        notifyDataSetChanged();
    }

    public void setAllData(List<HistoryModel> historyModelsListFilter2) {
        this.historyModelsListFilter.addAll(historyModelsListFilter2);
    }

    public String getLastPositionId() {
        if (this.historyModelsListFilter.size() == 0) {
            return "0";
        }
        List<HistoryModel> list = this.historyModelsListFilter;
        return String.valueOf(list.get(list.size() - 1).getId());
    }
}
