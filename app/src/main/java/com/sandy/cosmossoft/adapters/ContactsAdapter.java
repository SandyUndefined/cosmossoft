package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.data.model.ContactsModel;
import com.sandy.cosmossoft.databinding.ContactListLayoutBinding;
import com.sandy.cosmossoft.listeners.ContactsClickListener;
import java.util.ArrayList;
import java.util.Iterator;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsViewHolder> implements Filterable {
    ArrayList<ContactsModel> arrayList = new ArrayList<>();
    ArrayList<ContactsModel> arrayListFilter;
    LayoutInflater inflater;
    private ContactsClickListener listener;

    public ContactsAdapter(ArrayList<ContactsModel> arrayList2, ContactsClickListener listener2) {
        this.arrayList = arrayList2;
        this.listener = listener2;
        this.arrayListFilter = new ArrayList<>();
        this.arrayListFilter = arrayList2;
    }

    public ContactsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (this.inflater == null) {
            this.inflater = LayoutInflater.from(parent.getContext());
        }
        return new ContactsViewHolder(ContactListLayoutBinding.inflate(this.inflater));
    }

    public void onBindViewHolder(ContactsViewHolder holder, int position) {
        holder.binding.setMyContactList(this.arrayListFilter.get(position));
        holder.binding.getRoot().setOnClickListener(new ContactsAdapter$$ExternalSyntheticLambda0(this, position));
    }

    /* renamed from: lambda$onBindViewHolder$0$com-sandy-cosmossoft-adapters-ContactsAdapter */
    public /* synthetic */ void mo698x6dce3366(int position, View v) {
        this.listener.onRecyclerViewContactsClickListener(v, this.arrayListFilter.get(position));
    }

    public int getItemCount() {
        ArrayList<ContactsModel> arrayList2 = this.arrayListFilter;
        if (arrayList2 == null) {
            return 0;
        }
        return arrayList2.size();
    }

    public Filter getFilter() {
        return new Filter() {
            /* access modifiers changed from: protected */
            public FilterResults performFiltering(CharSequence constraint) {
                String character = constraint.toString();
                if (character.isEmpty()) {
                    ContactsAdapter contactsAdapter = ContactsAdapter.this;
                    contactsAdapter.arrayListFilter = contactsAdapter.arrayList;
                } else {
                    ArrayList<ContactsModel> filterList = new ArrayList<>();
                    Iterator<ContactsModel> it = ContactsAdapter.this.arrayList.iterator();
                    while (it.hasNext()) {
                        ContactsModel p = it.next();
                        if (p.getNumber().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        } else if (p.getName().toLowerCase().contains(character.toLowerCase())) {
                            filterList.add(p);
                        }
                    }
                    ContactsAdapter.this.arrayListFilter = filterList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = ContactsAdapter.this.arrayListFilter;
                return filterResults;
            }

            /* access modifiers changed from: protected */
            public void publishResults(CharSequence constraint, FilterResults results) {
                ContactsAdapter.this.arrayListFilter = (ArrayList) results.values;
                ContactsAdapter.this.notifyDataSetChanged();
            }
        };
    }

    public static class ContactsViewHolder extends RecyclerView.ViewHolder {
        ContactListLayoutBinding binding;

        public ContactsViewHolder(ContactListLayoutBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
