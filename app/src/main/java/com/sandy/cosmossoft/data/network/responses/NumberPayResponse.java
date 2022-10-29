package com.sandy.cosmossoft.data.network.responses;

public class NumberPayResponse {
    public String message;
    public boolean status;

    public NumberPayResponse(boolean status2, String message2) {
        this.status = status2;
        this.message = message2;
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
}
