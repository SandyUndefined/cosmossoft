package com.sandy.cosmossoft.listeners;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;

public interface AnalyticOperationListener {
    void checkMyDetailsOf(View view, AnalyticsResponseModel analyticsResponseModel);

    void observerData(MaterialButton materialButton, AnalyticsResponseModel analyticsResponseModel);

    void resetAllData();

    void updateMyDetailsOf(View view, AnalyticsResponseModel analyticsResponseModel);
}
