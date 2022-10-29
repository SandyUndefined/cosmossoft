package com.sandy.cosmossoft.listeners;

import com.sandy.cosmossoft.data.network.responses.CustomerInfoResponse;
import com.sandy.cosmossoft.data.network.responses.MyOfferResponse;

public interface ROfferListener {
    void getMeROffer(MyOfferResponse myOfferResponse);

    void onCausedError(String str);

    void onCustomerInfo(CustomerInfoResponse customerInfoResponse);

    void onStartLooking();
}
