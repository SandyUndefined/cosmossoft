package com.sandy.cosmossoft.data.network.responses;

public class RegularResponse {
    public String message;
    public Integer response_code;
    public boolean status;
    public Integer txnstatus;

    public RegularResponse(boolean status2, Integer response_code2, String message2, Integer txnstatus2) {
        this.status = status2;
        this.response_code = response_code2;
        this.message = message2;
        this.txnstatus = txnstatus2;
    }

    public Integer getTxnstatus() {
        return this.txnstatus;
    }

    public void setTxnstatus(Integer txnstatus2) {
        this.txnstatus = txnstatus2;
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
