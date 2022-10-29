package com.sandy.cosmossoft.listeners;

import com.sandy.cosmossoft.data.network.responses.DmtUserData;
import java.util.List;

public interface DMTHomeListeners {
    void initiateStart();

    void setErrorInFetch(String str);

    void setWholeRecycler(List<DmtUserData> list);
}
