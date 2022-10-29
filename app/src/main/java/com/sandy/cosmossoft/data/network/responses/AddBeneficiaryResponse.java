package com.sandy.cosmossoft.data.network.responses;

public class AddBeneficiaryResponse {
    public BeneficiaryResponseData data;
    public String message;
    public Integer response_code;
    public boolean status;

    public AddBeneficiaryResponse(boolean status2, Integer response_code2, BeneficiaryResponseData data2, String message2) {
        this.status = status2;
        this.response_code = response_code2;
        this.data = data2;
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

    public BeneficiaryResponseData getData() {
        return this.data;
    }

    public void setData(BeneficiaryResponseData data2) {
        this.data = data2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }
}
