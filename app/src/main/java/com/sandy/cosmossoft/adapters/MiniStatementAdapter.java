package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.internal.view.SupportMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.data.network.responses.MiniStatementData;
import com.sandy.cosmossoft.databinding.MiniStatementLayoutBinding;
import java.util.List;

public class MiniStatementAdapter extends RecyclerView.Adapter<StatementViewHolder> {
    List<MiniStatementData> dataList;
    LayoutInflater inflater;

    public MiniStatementAdapter(List<MiniStatementData> dataList2) {
        this.dataList = dataList2;
    }

    public StatementViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (this.inflater == null) {
            this.inflater = LayoutInflater.from(parent.getContext());
        }
        return new StatementViewHolder(MiniStatementLayoutBinding.inflate(this.inflater));
    }

    public void onBindViewHolder(StatementViewHolder holder, int position) {
        holder.binding.setMinSatementModel(this.dataList.get(position));
        if (this.dataList.get(position).getTxnType().equals("Cr")) {
            holder.binding.givenCrDr.setTextColor(-16711936);
        } else {
            holder.binding.givenCrDr.setTextColor(SupportMenu.CATEGORY_MASK);
        }
    }

    public int getItemCount() {
        List<MiniStatementData> list = this.dataList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class StatementViewHolder extends RecyclerView.ViewHolder {
        MiniStatementLayoutBinding binding;

        public StatementViewHolder(MiniStatementLayoutBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
