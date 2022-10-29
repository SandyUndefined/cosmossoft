package com.sandy.cosmossoft.listeners;

import android.view.View;
import com.sandy.cosmossoft.data.model.ProfileListModel;

public interface ProfileListListener {
    void onListItemSelected(View view, ProfileListModel profileListModel);
}
