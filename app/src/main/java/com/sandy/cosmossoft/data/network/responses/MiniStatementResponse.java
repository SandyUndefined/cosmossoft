package com.sandy.cosmossoft.data.network.responses;

import java.util.List;

public class MiniStatementResponse {
    public Long ackno;
    public String balanceamount;
    public String bankiin;
    public String bankrrn;
    public String datetime;
    public String errorcode;
    public String message;
    public List<MiniStatementData> ministatement;
    public boolean status;

    public MiniStatementResponse(boolean status2, Long ackno2, String datetime2, String balanceamount2, String bankrrn2, String bankiin2, String message2, String errorcode2, List<MiniStatementData> ministatement2) {
        this.status = status2;
        this.ackno = ackno2;
        this.datetime = datetime2;
        this.balanceamount = balanceamount2;
        this.bankrrn = bankrrn2;
        this.bankiin = bankiin2;
        this.message = message2;
        this.errorcode = errorcode2;
        this.ministatement = ministatement2;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status2) {
        this.status = status2;
    }

    public String getBalanceamount() {
        return this.balanceamount;
    }

    public void setBalanceamount(String balanceamount2) {
        this.balanceamount = balanceamount2;
    }

    public Long getAckno() {
        return this.ackno;
    }

    public void setAckno(Long ackno2) {
        this.ackno = ackno2;
    }

    public String getDatetime() {
        return this.datetime;
    }

    public void setDatetime(String datetime2) {
        this.datetime = datetime2;
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

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public String getErrorcode() {
        return this.errorcode;
    }

    public void setErrorcode(String errorcode2) {
        this.errorcode = errorcode2;
    }

    public List<MiniStatementData> getMinistatement() {
        return this.ministatement;
    }

    public void setMinistatement(List<MiniStatementData> ministatement2) {
        this.ministatement = ministatement2;
    }
}
