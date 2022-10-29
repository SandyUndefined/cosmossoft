package com.sandy.cosmossoft.data.network.responses;

public class PayoutAddResponse {
    String message;
    boolean status;
    int statuscode;

    public PayoutAddResponse(boolean status2, int statuscode2, String message2) {
        this.status = status2;
        this.statuscode = statuscode2;
        this.message = message2;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status2) {
        this.status = status2;
    }

    public int getStatuscode() {
        return this.statuscode;
    }

    public void setStatuscode(int statuscode2) {
        this.statuscode = statuscode2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }
}
