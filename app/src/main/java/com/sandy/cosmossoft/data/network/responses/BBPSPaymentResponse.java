package com.sandy.cosmossoft.data.network.responses;

public class BBPSPaymentResponse {
    public Long ackno;
    public String message;
    public String operatorid;
    public Integer response_code;
    public boolean status;

    public BBPSPaymentResponse(boolean status2, Integer response_code2, String operatorid2, Long ackno2, String message2) {
        this.status = status2;
        this.response_code = response_code2;
        this.operatorid = operatorid2;
        this.ackno = ackno2;
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

    public String getOperatorid() {
        return this.operatorid;
    }

    public void setOperatorid(String operatorid2) {
        this.operatorid = operatorid2;
    }

    public Long getAckno() {
        return this.ackno;
    }

    public void setAckno(Long ackno2) {
        this.ackno = ackno2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }
}
