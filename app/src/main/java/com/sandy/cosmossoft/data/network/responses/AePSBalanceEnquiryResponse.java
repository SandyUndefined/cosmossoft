package com.sandy.cosmossoft.data.network.responses;

public class AePSBalanceEnquiryResponse {
    public Long ackno;
    public Long amount;
    public String balanceamount;
    public String bankiin;
    public String bankrrn;
    public String clientrefno;
    public String errorcode;
    public String last_aadhar;
    public String message;
    public String name;
    public Integer response_code;
    public boolean status;

    public AePSBalanceEnquiryResponse(boolean status2, String message2, Long ackno2, Long amount2, String balanceamount2, String bankrrn2, String bankiin2, Integer response_code2, String errorcode2, String clientrefno2, String last_aadhar2, String name2) {
        this.status = status2;
        this.message = message2;
        this.ackno = ackno2;
        this.amount = amount2;
        this.balanceamount = balanceamount2;
        this.bankrrn = bankrrn2;
        this.bankiin = bankiin2;
        this.response_code = response_code2;
        this.errorcode = errorcode2;
        this.clientrefno = clientrefno2;
        this.last_aadhar = last_aadhar2;
        this.name = name2;
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

    public Long getAckno() {
        return this.ackno;
    }

    public void setAckno(Long ackno2) {
        this.ackno = ackno2;
    }

    public Long getAmount() {
        return this.amount;
    }

    public void setAmount(Long amount2) {
        this.amount = amount2;
    }

    public String getBalanceamount() {
        return this.balanceamount;
    }

    public void setBalanceamount(String balanceamount2) {
        this.balanceamount = balanceamount2;
    }

    public String getBankrrn() {
        return this.bankrrn;
    }

    public void setBankrrn(String bankrrn2) {
        this.bankrrn = bankrrn2;
    }

    public String getBankiin() {
        return this.bankiin;
    }

    public void setBankiin(String bankiin2) {
        this.bankiin = bankiin2;
    }

    public Integer getResponse_code() {
        return this.response_code;
    }

    public void setResponse_code(Integer response_code2) {
        this.response_code = response_code2;
    }

    public String getErrorcode() {
        return this.errorcode;
    }

    public void setErrorcode(String errorcode2) {
        this.errorcode = errorcode2;
    }

    public String getClientrefno() {
        return this.clientrefno;
    }

    public void setClientrefno(String clientrefno2) {
        this.clientrefno = clientrefno2;
    }

    public String getLast_aadhar() {
        return this.last_aadhar;
    }

    public void setLast_aadhar(String last_aadhar2) {
        this.last_aadhar = last_aadhar2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }
}
