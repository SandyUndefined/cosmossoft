package com.sandy.cosmossoft.listeners;

import android.view.View;
import com.sandy.cosmossoft.data.network.responses.DmtUserData;

public interface DMTAccountListener {
    void onAccountClick(View view, DmtUserData dmtUserData);

    void onDeleteClick(View view, DmtUserData dmtUserData);

    void onRefreshClick(View view, DmtUserData dmtUserData);
}
