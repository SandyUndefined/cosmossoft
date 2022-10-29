package com.sandy.cosmossoft.data.network.responses;

import java.util.List;

public class CustomerInfoResponse {
    int code;
    String message;
    List<CustomerInfoModel> offers;

    public CustomerInfoResponse(int code2, List<CustomerInfoModel> offers2, String message2) {
        this.code = code2;
        this.offers = offers2;
        this.message = message2;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code2) {
        this.code = code2;
    }

    public List<CustomerInfoModel> getoffers() {
        return this.offers;
    }

    public void setoffers(List<CustomerInfoModel> offers2) {
        this.offers = offers2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public String toString() {
        return "CustomerInfoResponse{code=" + this.code + ", offers=" + this.offers + ", message='" + this.message + '\'' + '}';
    }
}
