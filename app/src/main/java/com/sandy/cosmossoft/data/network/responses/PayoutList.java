package com.sandy.cosmossoft.data.network.responses;

public class PayoutList {
    String account;
    String account_type;
    String bankname;
    String beneid;

    /* renamed from: id */
    String f5id;
    String ifsc;
    String merchantcode;
    String name;
    String status;
    String verified;

    public PayoutList(String id, String beneid2, String merchantcode2, String bankname2, String account2, String ifsc2, String name2, String account_type2, String verified2, String status2) {
        this.f5id = id;
        this.beneid = beneid2;
        this.merchantcode = merchantcode2;
        this.bankname = bankname2;
        this.account = account2;
        this.ifsc = ifsc2;
        this.name = name2;
        this.account_type = account_type2;
        this.verified = verified2;
        this.status = status2;
    }

    public String getId() {
        return this.f5id;
    }

    public void setId(String id) {
        this.f5id = id;
    }

    public String getBeneid() {
        return this.beneid;
    }

    public void setBeneid(String beneid2) {
        this.beneid = beneid2;
    }

    public String getMerchantcode() {
        return this.merchantcode;
    }

    public void setMerchantcode(String merchantcode2) {
        this.merchantcode = merchantcode2;
    }

    public String getBankname() {
        return this.bankname;
    }

    public void setBankname(String bankname2) {
        this.bankname = bankname2;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account2) {
        this.account = account2;
    }

    public String getIfsc() {
        return this.ifsc;
    }

    public void setIfsc(String ifsc2) {
        this.ifsc = ifsc2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String getAccount_type() {
        return this.account_type;
    }

    public void setAccount_type(String account_type2) {
        this.account_type = account_type2;
    }

    public String getVerified() {
        return this.verified;
    }

    public void setVerified(String verified2) {
        this.verified = verified2;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status2) {
        this.status = status2;
    }
}
