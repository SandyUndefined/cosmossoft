package com.sandy.cosmossoft.data.model;

public class BankModel {
    public String bankid;
    public String bankname;
    public String column;
    public String ifsccode;
    public String logo;
    public String pennny;

    public BankModel(String bankid2, String bankname2, String ifsccode2, String pennny2, String column2, String logo2) {
        this.bankid = bankid2;
        this.bankname = bankname2;
        this.ifsccode = ifsccode2;
        this.pennny = pennny2;
        this.column = column2;
        this.logo = logo2;
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

    public String getIfsccode() {
        return this.ifsccode;
    }

    public void setIfsccode(String ifsccode2) {
        this.ifsccode = ifsccode2;
    }

    public String getPennny() {
        return this.pennny;
    }

    public void setPennny(String pennny2) {
        this.pennny = pennny2;
    }

    public String getColumn() {
        return this.column;
    }

    public void setColumn(String column2) {
        this.column = column2;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo2) {
        this.logo = logo2;
    }

    public String toString() {
        return this.bankname;
    }
}
