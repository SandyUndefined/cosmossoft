package com.sandy.cosmossoft.data.model;

public class OperatorModel {

    /* renamed from: com  reason: collision with root package name */
    private String f3507com;

    /* renamed from: id */
    private String f3437id;
    private String logo;
    private String name;
    private String operatorcode;
    private String service;

    public OperatorModel(String id, String operatorcode2, String name2, String service2, String com2, String logo2) {
        this.f3437id = id;
        this.operatorcode = operatorcode2;
        this.name = name2;
        this.service = service2;
        this.f3507com = com2;
        this.logo = logo2;
    }

    public String getId() {
        return this.f3437id;
    }

    public void setId(String id) {
        this.f3437id = id;
    }

    public String getOperatorcode() {
        return this.operatorcode;
    }

    public void setOperatorcode(String operatorcode2) {
        this.operatorcode = operatorcode2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String getService() {
        return this.service;
    }

    public void setService(String service2) {
        this.service = service2;
    }

    public String getCom() {
        return this.f3507com;
    }

    public void setCom(String com2) {
        this.f3507com = com2;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo2) {
        this.logo = logo2;
    }
}
