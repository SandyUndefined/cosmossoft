package com.sandy.cosmossoft.data.model;

public class MicroAtmModel {
    String BalAmount;
    String BalRrn;
    String BankName;
    String CardNumber;
    String CardType;
    String Response;
    String TerminalId;
    String TransAmount;
    String TransType;
    String TxnId;
    String Type;
    String message;

    public MicroAtmModel(String message2, String response, String transAmount, String balAmount, String balRrn, String txnId, String transType, String type, String cardNumber, String cardType, String terminalId, String bankName) {
        this.message = message2;
        this.Response = response;
        this.TransAmount = transAmount;
        this.BalAmount = balAmount;
        this.BalRrn = balRrn;
        this.TxnId = txnId;
        this.TransType = transType;
        this.Type = type;
        this.CardNumber = cardNumber;
        this.CardType = cardType;
        this.TerminalId = terminalId;
        this.BankName = bankName;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public String getResponse() {
        return this.Response;
    }

    public void setResponse(String response) {
        this.Response = response;
    }

    public String getTransAmount() {
        return this.TransAmount;
    }

    public void setTransAmount(String transAmount) {
        this.TransAmount = transAmount;
    }

    public String getBalAmount() {
        return this.BalAmount;
    }

    public void setBalAmount(String balAmount) {
        this.BalAmount = balAmount;
    }

    public String getBalRrn() {
        return this.BalRrn;
    }

    public void setBalRrn(String balRrn) {
        this.BalRrn = balRrn;
    }

    public String getTxnId() {
        return this.TxnId;
    }

    public void setTxnId(String txnId) {
        this.TxnId = txnId;
    }

    public String getTransType() {
        return this.TransType;
    }

    public void setTransType(String transType) {
        this.TransType = transType;
    }

    public String getType() {
        return this.Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public String getCardNumber() {
        return this.CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.CardNumber = cardNumber;
    }

    public String getCardType() {
        return this.CardType;
    }

    public void setCardType(String cardType) {
        this.CardType = cardType;
    }

    public String getTerminalId() {
        return this.TerminalId;
    }

    public void setTerminalId(String terminalId) {
        this.TerminalId = terminalId;
    }

    public String getBankName() {
        return this.BankName;
    }

    public void setBankName(String bankName) {
        this.BankName = bankName;
    }
}
