package com.sandy.cosmossoft.data.network.responses;

import com.sandy.cosmossoft.data.p000db.entities.RazorpayData;

public class GatewayResponse {
    public String message;
    public RazorpayData razor_pay;
    public boolean status;

    public GatewayResponse(boolean status2, String message2, RazorpayData razor_pay2) {
        this.status = status2;
        this.message = message2;
        this.razor_pay = razor_pay2;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status2) {
        this.status = status2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public RazorpayData getRazor_pay() {
        return this.razor_pay;
    }

    public void setRazor_pay(RazorpayData razor_pay2) {
        this.razor_pay = razor_pay2;
    }
}
