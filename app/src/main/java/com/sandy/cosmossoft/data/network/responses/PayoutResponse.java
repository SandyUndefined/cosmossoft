package com.sandy.cosmossoft.data.network.responses;

public class PayoutResponse {
    public String status;
    public String statusCode;
    public String statusMessage;

    public PayoutResponse(String status2, String statusCode2, String statusMessage2) {
        this.status = status2;
        this.statusCode = statusCode2;
        this.statusMessage = statusMessage2;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status2) {
        this.status = status2;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(String statusCode2) {
        this.statusCode = statusCode2;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public void setStatusMessage(String statusMessage2) {
        this.statusMessage = statusMessage2;
    }
}
