package com.sandy.cosmossoft.data.network.responses;

public class MiniStatementData {
    public String amount;
    public String date;
    public String narration;
    public String txnType;

    public MiniStatementData(String date2, String txnType2, String amount2, String narration2) {
        this.date = date2;
        this.txnType = txnType2;
        this.amount = amount2;
        this.narration = narration2;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date2) {
        this.date = date2;
    }

    public String getTxnType() {
        return this.txnType;
    }

    public void setTxnType(String txnType2) {
        this.txnType = txnType2;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount2) {
        this.amount = amount2;
    }

    public String getNarration() {
        return this.narration;
    }

    public void setNarration(String narration2) {
        this.narration = narration2;
    }
}
