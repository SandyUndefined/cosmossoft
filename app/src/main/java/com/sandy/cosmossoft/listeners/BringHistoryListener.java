package com.sandy.cosmossoft.listeners;

import com.sandy.cosmossoft.data.model.HistoryModel;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import java.util.List;

public interface BringHistoryListener {
    void onAnalyticsBrought(List<AnalyticsResponseModel> list);

    void onComplete(String str);

    void onFailure(String str);

    void onHistoryBrought(List<HistoryModel> list);

    void onStart(String str);
}
