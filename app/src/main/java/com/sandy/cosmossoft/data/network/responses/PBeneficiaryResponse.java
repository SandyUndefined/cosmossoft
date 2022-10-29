package com.sandy.cosmossoft.data.network.responses;

import java.util.List;

public class PBeneficiaryResponse {
    List<PBeneficiaryModel> data;
    String message;
    int response_code;
    boolean status;

    public PBeneficiaryResponse(boolean status2, int response_code2, String message2, List<PBeneficiaryModel> data2) {
        this.status = status2;
        this.response_code = response_code2;
        this.message = message2;
        this.data = data2;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status2) {
        this.status = status2;
    }

    public int getResponse_code() {
        return this.response_code;
    }

    public void setResponse_code(int response_code2) {
        this.response_code = response_code2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public List<PBeneficiaryModel> getData() {
        return this.data;
    }

    public void setData(List<PBeneficiaryModel> data2) {
        this.data = data2;
    }
}
