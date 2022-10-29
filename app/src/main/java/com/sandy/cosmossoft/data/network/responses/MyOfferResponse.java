package com.sandy.cosmossoft.data.network.responses;

import java.util.List;

public class MyOfferResponse {
    int code;
    String message;
    List<ROfferModel> offers;

    public MyOfferResponse(int code2, List<ROfferModel> offers2, String message2) {
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

    public List<ROfferModel> getOffers() {
        return this.offers;
    }

    public void setOffers(List<ROfferModel> offers2) {
        this.offers = offers2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public String toString() {
        return "MyOfferResponse{code=" + this.code + ", offers=" + this.offers + ", message='" + this.message + '\'' + '}';
    }
}
