package com.sandy.cosmossoft.data.network.responses;

public class BeneficiaryResponseData {
    public String accno;
    public boolean bank3;
    public String bankid;
    public String bankname;
    public String banktype;
    public String bene_id;
    public String ifsc;
    public String name;
    public Integer status;
    public String verified;

    public BeneficiaryResponseData(String bene_id2, String bankid2, String bankname2, String name2, String accno2, String ifsc2, String verified2, String banktype2, Integer status2, boolean bank32) {
        this.bene_id = bene_id2;
        this.bankid = bankid2;
        this.bankname = bankname2;
        this.name = name2;
        this.accno = accno2;
        this.ifsc = ifsc2;
        this.verified = verified2;
        this.banktype = banktype2;
        this.status = status2;
        this.bank3 = bank32;
    }

    public String getBene_id() {
        return this.bene_id;
    }

    public void setBene_id(String bene_id2) {
        this.bene_id = bene_id2;
    }

    public String getBankid() {
        return this.bankid;
    }

    public void setBankid(String bankid2) {
        this.bankid = bankid2;
    }

    public String getBankname() {
        return this.bankname;
    }

    public void setBankname(String bankname2) {
        this.bankname = bankname2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String getAccno() {
        return this.accno;
    }

    public void setAccno(String accno2) {
        this.accno = accno2;
    }

    public String getIfsc() {
        return this.ifsc;
    }

    public void setIfsc(String ifsc2) {
        this.ifsc = ifsc2;
    }

    public String getVerified() {
        return this.verified;
    }

    public void setVerified(String verified2) {
        this.verified = verified2;
    }

    public String getBanktype() {
        return this.banktype;
    }

    public void setBanktype(String banktype2) {
        this.banktype = banktype2;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status2) {
        this.status = status2;
    }

    public boolean isBank3() {
        return this.bank3;
    }

    public void setBank3(boolean bank32) {
        this.bank3 = bank32;
    }
}
