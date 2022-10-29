package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.data.model.ProfileListModel;
import com.sandy.cosmossoft.databinding.ProfileEditLayoutBinding;
import com.sandy.cosmossoft.listeners.ProfileListListener;
import java.util.List;

public class ProfileListAdapter extends RecyclerView.Adapter<ListViewHolder> {
    LayoutInflater inflater;
    List<ProfileListModel> list;
    ProfileListListener listener;

    public ProfileListAdapter(List<ProfileListModel> list2, ProfileListListener listener2) {
        this.list = list2;
        this.listener = listener2;
    }

    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (this.inflater == null) {
            this.inflater = LayoutInflater.from(parent.getContext());
        }
        return new ListViewHolder(ProfileEditLayoutBinding.inflate(this.inflater, parent, false));
    }

    public void onBindViewHolder(ListViewHolder holder, int position) {
        holder.binding.setModels(this.list.get(position));
        holder.binding.getRoot().setOnClickListener(new ProfileListAdapter$$ExternalSyntheticLambda0(this, position));
    }

    /* renamed from: lambda$onBindViewHolder$0$com-sandy-cosmossoft-adapters-ProfileListAdapter */
    public /* synthetic */ void mo745x22799b3e(int position, View view) {
        this.listener.onListItemSelected(view, this.list.get(position));
    }

    public int getItemCount() {
        List<ProfileListModel> list2 = this.list;
        if (list2 == null) {
            return 0;
        }
        return list2.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        ProfileEditLayoutBinding binding;

        public ListViewHolder(ProfileEditLayoutBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
