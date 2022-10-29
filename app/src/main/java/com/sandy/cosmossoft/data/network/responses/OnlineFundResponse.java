package com.sandy.cosmossoft.data.network.responses;

public class OnlineFundResponse {
    public int code;
    public String message;
    public boolean status;

    public OnlineFundResponse(boolean status2, String message2, int code2) {
        this.status = status2;
        this.message = message2;
        this.code = code2;
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

    public int getCode() {
        return this.code;
    }

    public void setCode(int code2) {
        this.code = code2;
    }
}
