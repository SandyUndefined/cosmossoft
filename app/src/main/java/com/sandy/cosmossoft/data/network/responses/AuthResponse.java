package com.sandy.cosmossoft.data.network.responses;

import com.sandy.cosmossoft.data.p000db.entities.User;

public class AuthResponse {
    public String message;
    public Integer response_code;
    boolean status;
    public User user;

    public AuthResponse(boolean status2, Integer response_code2, String message2, User user2) {
        this.status = status2;
        this.message = message2;
        this.response_code = response_code2;
        this.user = user2;
    }

    public Integer response_code() {
        return this.response_code;
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

    public User getUser() {
        return this.user;
    }

    public void setUser(User user2) {
        this.user = user2;
    }

    public String toString() {
        return "AuthResponse{status=" + this.status + ", message='" + this.message + '\'' + ", user=" + this.user + '}';
    }
}
