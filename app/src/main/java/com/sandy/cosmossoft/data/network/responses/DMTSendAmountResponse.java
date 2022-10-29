package com.sandy.cosmossoft.data.network.responses;

public class DMTSendAmountResponse {
    public String message;
    public String remarks;
    public Integer response_code;
    public boolean status;

    public DMTSendAmountResponse(boolean status2, Integer response_code2, String message2, String remarks2) {
        this.status = status2;
        this.response_code = response_code2;
        this.message = message2;
        this.remarks = remarks2;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status2) {
        this.status = status2;
    }

    public Integer getResponse_code() {
        return this.response_code;
    }

    public void setResponse_code(Integer response_code2) {
        this.response_code = response_code2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks2) {
        this.remarks = remarks2;
    }
}
