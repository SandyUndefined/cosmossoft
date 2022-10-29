package com.sandy.cosmossoft.data.p000db.entities;

/* renamed from: com.sandy.cosmossoft.data.db.entities.PaySprintApi */
public class PaySprintApi {
    public int CURRENT_USER_ID = 0;
    public String authorisedkey;
    public String date;
    public String firm;

    /* renamed from: id */
    public String f8id;
    public String jwtkey;
    public String key;
    public String keyiv;
    public String merchantcode;
    public String owner;
    public String ownerid;
    public String partnerid;
    public String status;
    public int uId = 0;

    public PaySprintApi(String id, String owner2, String ownerid2, String partnerid2, String merchantcode2, String firm2, String jwtkey2, String authorisedkey2, String status2, String key2, String keyiv2, String date2) {
        this.f8id = id;
        this.owner = owner2;
        this.ownerid = ownerid2;
        this.partnerid = partnerid2;
        this.merchantcode = merchantcode2;
        this.firm = firm2;
        this.jwtkey = jwtkey2;
        this.authorisedkey = authorisedkey2;
        this.status = status2;
        this.key = key2;
        this.keyiv = keyiv2;
        this.date = date2;
    }

    public String getId() {
        return this.f8id;
    }

    public void setId(String id) {
        this.f8id = id;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner2) {
        this.owner = owner2;
    }

    public String getOwnerid() {
        return this.ownerid;
    }

    public void setOwnerid(String ownerid2) {
        this.ownerid = ownerid2;
    }

    public String getPartnerid() {
        return this.partnerid;
    }

    public void setPartnerid(String partnerid2) {
        this.partnerid = partnerid2;
    }

    public String getMerchantcode() {
        return this.merchantcode;
    }

    public void setMerchantcode(String merchantcode2) {
        this.merchantcode = merchantcode2;
    }

    public String getFirm() {
        return this.firm;
    }

    public void setFirm(String firm2) {
        this.firm = firm2;
    }

    public String getJwtkey() {
        return this.jwtkey;
    }

    public void setJwtkey(String jwtkey2) {
        this.jwtkey = jwtkey2;
    }

    public String getAuthorisedkey() {
        return this.authorisedkey;
    }

    public void setAuthorisedkey(String authorisedkey2) {
        this.authorisedkey = authorisedkey2;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status2) {
        this.status = status2;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key2) {
        this.key = key2;
    }

    public String getKeyiv() {
        return this.keyiv;
    }

    public void setKeyiv(String keyiv2) {
        this.keyiv = keyiv2;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date2) {
        this.date = date2;
    }
}
