package com.sandy.cosmossoft.data.p000db.entities;

/* renamed from: com.sandy.cosmossoft.data.db.entities.User */
public class User {
    public int CURRENT_USER_ID = 0;
    public String address;
    public String aepsbalance;
    public String email;

    /* renamed from: id */
    public String f9id;
    public String lastname;
    public String mainbalance;
    public String mobile;
    public String name;
    public String ownerid;
    public String ownerstatus;
    public String password;
    public String pin;
    public String token;
    public int uId = 0;
    public String userstatus;
    public String userstatusname;

    public User(String email2, String mobile2, String password2, String name2, String lastname2, String ownerid2, String ownerstatus2, String userstatus2, String token2, String id, String mainbalance2, String aepsbalance2, String userstatusname2, String pin2, String address2) {
        this.email = email2;
        this.mobile = mobile2;
        this.password = password2;
        this.name = name2;
        this.lastname = lastname2;
        this.ownerid = ownerid2;
        this.ownerstatus = ownerstatus2;
        this.userstatus = userstatus2;
        this.token = token2;
        this.f9id = id;
        this.mainbalance = mainbalance2;
        this.aepsbalance = aepsbalance2;
        this.userstatusname = userstatusname2;
        this.pin = pin2;
        this.address = address2;
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email2) {
        this.email = email2;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile2) {
        this.mobile = mobile2;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password2) {
        this.password = password2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname2) {
        this.lastname = lastname2;
    }

    public String getOwnerid() {
        return this.ownerid;
    }

    public void setOwnerid(String ownerid2) {
        this.ownerid = ownerid2;
    }

    public String getOwnerstatus() {
        return this.ownerstatus;
    }

    public void setOwnerstatus(String ownerstatus2) {
        this.ownerstatus = ownerstatus2;
    }

    public String getUserstatus() {
        return this.userstatus;
    }

    public void setUserstatus(String userstatus2) {
        this.userstatus = userstatus2;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token2) {
        this.token = token2;
    }

    public String getId() {
        return this.f9id;
    }

    public void setId(String id) {
        this.f9id = id;
    }

    public String getMainbalance() {
        return this.mainbalance;
    }

    public void setMainbalance(String mainbalance2) {
        this.mainbalance = mainbalance2;
    }

    public String getAepsbalance() {
        return this.aepsbalance;
    }

    public void setAepsbalance(String aepsbalance2) {
        this.aepsbalance = aepsbalance2;
    }

    public String getUserstatusname() {
        return this.userstatusname;
    }

    public void setUserstatusname(String userstatusname2) {
        this.userstatusname = userstatusname2;
    }

    public String getPin() {
        return this.pin;
    }

    public void setPin(String pin2) {
        this.pin = pin2;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address2) {
        this.address = address2;
    }
}
