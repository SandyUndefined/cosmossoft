package com.sandy.cosmossoft.listeners;

import com.sandy.cosmossoft.data.network.responses.PaymentResponse;

public interface PaymentListener {
    void errorResult(String str);

    void paymentMessage(String str);

    void paymentResult(PaymentResponse paymentResponse);
}
