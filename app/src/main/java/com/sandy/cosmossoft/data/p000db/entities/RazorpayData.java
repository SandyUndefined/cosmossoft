package com.sandy.cosmossoft.data.p000db.entities;

/* renamed from: com.sandy.cosmossoft.data.db.entities.RazorpayData */
public class RazorpayData {
    public int CURRENT_USER_ID = 0;
    public String amount;
    public String api_key;
    public String currency;
    public String date;
    public String description;
    public String image;
    public String name;
    public int uId = 0;

    public RazorpayData(String api_key2, String name2, String description2, String image2, String currency2, String amount2, String date2) {
        this.api_key = api_key2;
        this.name = name2;
        this.description = description2;
        this.image = image2;
        this.currency = currency2;
        this.amount = amount2;
        this.date = date2;
    }

    public int getCURRENT_USER_ID() {
        return this.CURRENT_USER_ID;
    }

    public void setCURRENT_USER_ID(int CURRENT_USER_ID2) {
        this.CURRENT_USER_ID = CURRENT_USER_ID2;
    }

    public int getuId() {
        return this.uId;
    }

    public void setuId(int uId2) {
        this.uId = uId2;
    }

    public String getApi_key() {
        return this.api_key;
    }

    public void setApi_key(String api_key2) {
        this.api_key = api_key2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description2) {
        this.description = description2;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image2) {
        this.image = image2;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency2) {
        this.currency = currency2;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount2) {
        this.amount = amount2;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date2) {
        this.date = date2;
    }
}
