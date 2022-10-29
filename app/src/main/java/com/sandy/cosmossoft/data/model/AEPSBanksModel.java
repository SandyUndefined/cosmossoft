package com.sandy.cosmossoft.data.model;

public class AEPSBanksModel {
    public String activeflag;
    public String bankname;

    /* renamed from: id */
    public String f3435id;
    public String iinno;

    public AEPSBanksModel(String id, String bankname2, String iinno2, String activeflag2) {
        this.f3435id = id;
        this.bankname = bankname2;
        this.iinno = iinno2;
        this.activeflag = activeflag2;
    }

    public String getId() {
        return this.f3435id;
    }

    public void setId(String id) {
        this.f3435id = id;
    }

    public String getBankname() {
        return this.bankname;
    }

    public void setBankname(String bankname2) {
        this.bankname = bankname2;
    }

    public String getIinno() {
        return this.iinno;
    }

    public void setIinno(String iinno2) {
        this.iinno = iinno2;
    }

    public String getActiveflag() {
        return this.activeflag;
    }

    public void setActiveflag(String activeflag2) {
        this.activeflag = activeflag2;
    }
}
