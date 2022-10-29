package com.sandy.cosmossoft.data.network.responses;

public class DmtUserData {
    public String bank1_limit;
    public String bank2_limit;
    public String bank3_limit;
    public String fname;

    /* renamed from: id */
    public String f3id;
    public String lname;
    public String message;
    public String mobile;
    public String my_status;
    public long response_code;
    public boolean status;

    public DmtUserData(boolean status2, long response_code2, String message2, String fname2, String lname2, String mobile2, String my_status2, String bank3_limit2, String bank2_limit2, String bank1_limit2, String id) {
        this.status = status2;
        this.response_code = response_code2;
        this.message = message2;
        this.fname = fname2;
        this.lname = lname2;
        this.mobile = mobile2;
        this.my_status = my_status2;
        this.bank3_limit = bank3_limit2;
        this.bank2_limit = bank2_limit2;
        this.bank1_limit = bank1_limit2;
        this.f3id = id;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname2) {
        this.fname = fname2;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname2) {
        this.lname = lname2;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile2) {
        this.mobile = mobile2;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status2) {
        this.status = status2;
    }

    public long getResponse_code() {
        return this.response_code;
    }

    public void setResponse_code(long response_code2) {
        this.response_code = response_code2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public String getMy_status() {
        return this.my_status;
    }

    public void setMy_status(String my_status2) {
        this.my_status = my_status2;
    }

    public String getBank3_limit() {
        return this.bank3_limit;
    }

    public void setBank3_limit(String bank3_limit2) {
        this.bank3_limit = bank3_limit2;
    }

    public String getBank2_limit() {
        return this.bank2_limit;
    }

    public void setBank2_limit(String bank2_limit2) {
        this.bank2_limit = bank2_limit2;
    }

    public String getBank1_limit() {
        return this.bank1_limit;
    }

    public void setBank1_limit(String bank1_limit2) {
        this.bank1_limit = bank1_limit2;
    }

    public String getId() {
        return this.f3id;
    }

    public void setId(String id) {
        this.f3id = id;
    }
}
