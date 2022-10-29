package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.data.model.CircleModel;
import com.sandy.cosmossoft.databinding.CircleListLayoutBinding;
import com.sandy.cosmossoft.listeners.CircleListener;
import java.util.List;

public class CircleAdapter extends RecyclerView.Adapter<CircleViewHolder> {
    List<CircleModel> list;
    CircleListener listener;

    public CircleAdapter(List<CircleModel> list2, CircleListener listener2) {
        this.list = list2;
        this.listener = listener2;
    }

    public CircleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CircleViewHolder(CircleListLayoutBinding.inflate(LayoutInflater.from(parent.getContext())));
    }

    public void onBindViewHolder(CircleViewHolder holder, final int position) {
        holder.binding.setCircleModel(this.list.get(position));
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CircleAdapter.this.listener.MyCircleListener(v, CircleAdapter.this.list.get(position));
            }
        });
    }

    public int getItemCount() {
        List<CircleModel> list2 = this.list;
        if (list2 == null) {
            return 0;
        }
        return list2.size();
    }

    public static class CircleViewHolder extends RecyclerView.ViewHolder {
        CircleListLayoutBinding binding;

        public CircleViewHolder(CircleListLayoutBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
