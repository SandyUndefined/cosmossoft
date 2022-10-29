package com.sandy.cosmossoft.data.network.responses;

import com.sandy.cosmossoft.data.p000db.entities.UserProfile;

public class DetailResponse {
    public UserProfile data;
    public String message;
    boolean status;

    public DetailResponse(boolean status2, String message2, UserProfile data2) {
        this.status = status2;
        this.message = message2;
        this.data = data2;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status2) {
        this.status = status2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public UserProfile getData() {
        return this.data;
    }

    public void setData(UserProfile data2) {
        this.data = data2;
    }

    public String toString() {
        return "DetailResponse{status=" + this.status + ", message='" + this.message + '\'' + ", data=" + this.data + '}';
    }
}
