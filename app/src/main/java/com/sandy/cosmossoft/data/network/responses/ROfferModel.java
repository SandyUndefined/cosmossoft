package com.sandy.cosmossoft.data.network.responses;

public class ROfferModel {
    String desc;

    /* renamed from: rs */
    String f6rs;

    public ROfferModel(String rs, String desc2) {
        this.f6rs = rs;
        this.desc = desc2;
    }

    public String getRs() {
        return this.f6rs;
    }

    public void setRs(String rs) {
        this.f6rs = rs;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc2) {
        this.desc = desc2;
    }

    public String toString() {
        return "ROfferModel{rs='" + this.f6rs + '\'' + ", desc='" + this.desc + '\'' + '}';
    }
}
