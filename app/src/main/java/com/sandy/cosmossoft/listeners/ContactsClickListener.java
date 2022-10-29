package com.sandy.cosmossoft.listeners;

import android.view.View;
import com.sandy.cosmossoft.data.model.ContactsModel;

public interface ContactsClickListener {
    void onRecyclerViewContactsClickListener(View view, ContactsModel contactsModel);
}
