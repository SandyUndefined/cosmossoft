package com.sandy.cosmossoft.data.network.bbp_send_response;

import com.sandy.cosmossoft.data.network.responses.FetchBillInfo;

public class BBPSSendResponse {
    String amount;
    String device;

    /* renamed from: id */
    String f0id;

    /* renamed from: info  reason: collision with root package name */
    FetchBillInfo f3448info;
    String ip_address;
    String latitude;
    String longitude;
    String num;

    /* renamed from: op */
    String f1op;
    String usertype_id;

    public BBPSSendResponse(String longitude2, String latitude2, String amount2, FetchBillInfo info2, String op, String num2, String id, String usertype_id2, String ip_address2, String device2) {
        this.longitude = longitude2;
        this.latitude = latitude2;
        this.amount = amount2;
        this.f3448info = info2;
        this.f1op = op;
        this.num = num2;
        this.f0id = id;
        this.usertype_id = usertype_id2;
        this.ip_address = ip_address2;
        this.device = device2;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String longitude2) {
        this.longitude = longitude2;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude2) {
        this.latitude = latitude2;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount2) {
        this.amount = amount2;
    }

    public FetchBillInfo getInfo() {
        return this.f3448info;
    }

    public void setInfo(FetchBillInfo info2) {
        this.f3448info = info2;
    }

    public String getOp() {
        return this.f1op;
    }

    public void setOp(String op) {
        this.f1op = op;
    }

    public String getNum() {
        return this.num;
    }

    public void setNum(String num2) {
        this.num = num2;
    }

    public String getId() {
        return this.f0id;
    }

    public void setId(String id) {
        this.f0id = id;
    }

    public String getUsertype_id() {
        return this.usertype_id;
    }

    public void setUsertype_id(String usertype_id2) {
        this.usertype_id = usertype_id2;
    }

    public String getIp_address() {
        return this.ip_address;
    }

    public void setIp_address(String ip_address2) {
        this.ip_address = ip_address2;
    }

    public String getDevice() {
        return this.device;
    }

    public void setDevice(String device2) {
        this.device = device2;
    }
}
