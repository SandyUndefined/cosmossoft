package com.sandy.cosmossoft.data.network.responses;

import com.sandy.cosmossoft.data.model.UserTypeModel;
import java.util.List;

public class UserTypeResponse {
    public List<UserTypeModel> data;
    public String message;
    public boolean status;

    public UserTypeResponse(boolean status2, String message2, List<UserTypeModel> data2) {
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

    public List<UserTypeModel> getData() {
        return this.data;
    }

    public void setData(List<UserTypeModel> data2) {
        this.data = data2;
    }
}
