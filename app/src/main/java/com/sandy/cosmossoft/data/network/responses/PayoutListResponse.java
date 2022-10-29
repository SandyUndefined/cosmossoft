package com.sandy.cosmossoft.data.network.responses;

import java.util.List;

public class PayoutListResponse {
    List<PayoutList> data;
    String message;
    int response_code;
    boolean status;

    public int getResponse_code() {
        return this.response_code;
    }

    public void setResponse_code(int response_code2) {
        this.response_code = response_code2;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status2) {
        this.status = status2;
    }

    public List<PayoutList> getData() {
        return this.data;
    }

    public void setData(List<PayoutList> data2) {
        this.data = data2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }
}
