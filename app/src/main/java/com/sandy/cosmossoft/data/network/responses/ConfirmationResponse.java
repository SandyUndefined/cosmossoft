package com.sandy.cosmossoft.data.network.responses;

public class ConfirmationResponse {
    public int code;
    public String message;
    public boolean status;

    public ConfirmationResponse(boolean status2, String message2, int code2) {
        this.status = status2;
        this.message = message2;
        this.code = code2;
    }

    public boolean isstatus() {
        return this.status;
    }

    public void setstatus(boolean status2) {
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
