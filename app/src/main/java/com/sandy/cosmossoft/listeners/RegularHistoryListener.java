package com.sandy.cosmossoft.listeners;

import com.sandy.cosmossoft.data.network.responses.RegularHistoryResponse;
import com.sandy.cosmossoft.databinding.RegularHistoryDesignBinding;
import java.util.List;

public interface RegularHistoryListener {
    void bringTheHistory(List<RegularHistoryResponse.EveryDayData> list);

    void bringTheHistoryAgain();

    void disableListener(RegularHistoryDesignBinding regularHistoryDesignBinding, RegularHistoryResponse.EveryDayData everyDayData);

    void onCheckStatusData(RegularHistoryResponse.EveryDayData everyDayData);

    void onClickedData(RegularHistoryResponse.EveryDayData everyDayData);

    void onRefundClick(RegularHistoryResponse.EveryDayData everyDayData);

    void thereWasNoData();
}
