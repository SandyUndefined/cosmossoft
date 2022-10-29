package com.sandy.cosmossoft.data.model;

import com.sandy.cosmossoft.maskedittext.MaskedEditText;

public class PersonUserModel {
    public String email;
    public String first_name;

    /* renamed from: id */
    public String f3438id;
    public String last_name;
    public String mobile;
    public String owner_id;
    public String owner_status;
    public String user_status;

    public PersonUserModel(String id, String first_name2, String last_name2, String mobile2, String email2, String user_status2, String owner_status2, String owner_id2) {
        this.f3438id = id;
        this.first_name = first_name2;
        this.last_name = last_name2;
        this.mobile = mobile2;
        this.email = email2;
        this.user_status = user_status2;
        this.owner_status = owner_status2;
        this.owner_id = owner_id2;
    }

    public String getId() {
        return this.f3438id;
    }

    public void setId(String id) {
        this.f3438id = id;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name2) {
        this.first_name = first_name2;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name2) {
        this.last_name = last_name2;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile2) {
        this.mobile = mobile2;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email2) {
        this.email = email2;
    }

    public String getUser_status() {
        return this.user_status;
    }

    public void setUser_status(String user_status2) {
        this.user_status = user_status2;
    }

    public String getOwner_status() {
        return this.owner_status;
    }

    public void setOwner_status(String owner_status2) {
        this.owner_status = owner_status2;
    }

    public String getOwner_id() {
        return this.owner_id;
    }

    public void setOwner_id(String owner_id2) {
        this.owner_id = owner_id2;
    }

    public String toString() {
        return this.first_name + MaskedEditText.SPACE + this.last_name;
    }
}
