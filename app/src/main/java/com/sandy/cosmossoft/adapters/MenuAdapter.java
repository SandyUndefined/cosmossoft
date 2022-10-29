package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.MenuModel;
import com.sandy.cosmossoft.databinding.RecyclerviewMenusOptionBinding;
import com.sandy.cosmossoft.listeners.RecyclerViewClickListener;
import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuViewHolder> {
    public RecyclerViewClickListener listener;
    public List<MenuModel> menuList;

    public MenuAdapter(List<MenuModel> menuList2, RecyclerViewClickListener listener2) {
        this.menuList = menuList2;
        this.listener = listener2;
    }

    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MenuViewHolder((RecyclerviewMenusOptionBinding) DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), C0330R.layout.recyclerview_menus_option, parent, false));
    }

    public void onBindViewHolder(MenuViewHolder holder, final int position) {
        holder.binding.setMyMenus(this.menuList.get(position));
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MenuAdapter.this.listener.onRecyclerViewClickItem(v, MenuAdapter.this.menuList.get(position));
            }
        });
    }

    public int getItemCount() {
        List<MenuModel> list = this.menuList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder {
        RecyclerviewMenusOptionBinding binding;

        public MenuViewHolder(RecyclerviewMenusOptionBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
