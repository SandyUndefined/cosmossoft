package com.sandy.cosmossoft.data.network.responses;

public class BeneficiaryDeleteResponse {
    public String message;
    public Integer response_code;
    public boolean status;

    public BeneficiaryDeleteResponse(boolean status2, Integer response_code2, String message2) {
        this.status = status2;
        this.response_code = response_code2;
        this.message = message2;
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
}
