package com.sandy.cosmossoft.data.network.responses;

public class PBeneficiaryModel {
    String acc_num;

    /* renamed from: id */
    String f4id;
    String ifsc;
    String name;

    public PBeneficiaryModel(String id, String acc_num2, String ifsc2, String name2) {
        this.f4id = id;
        this.acc_num = acc_num2;
        this.ifsc = ifsc2;
        this.name = name2;
    }

    public String getId() {
        return this.f4id;
    }

    public void setId(String id) {
        this.f4id = id;
    }

    public String getAcc_num() {
        return this.acc_num;
    }

    public void setAcc_num(String acc_num2) {
        this.acc_num = acc_num2;
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
}
