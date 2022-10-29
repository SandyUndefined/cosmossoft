package com.sandy.cosmossoft.data.network.responses;

public class PaymentResponse {
    public String message;
    public String response;
    public Integer responsecode;

    public PaymentResponse(Integer responsecode2, String message2, String response2) {
        this.responsecode = responsecode2;
        this.message = message2;
        this.response = response2;
    }

    public Integer getResponsecode() {
        return this.responsecode;
    }

    public void setResponsecode(Integer responsecode2) {
        this.responsecode = responsecode2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public String getResponse() {
        return this.response;
    }

    public void setResponse(String response2) {
        this.response = response2;
    }
}
