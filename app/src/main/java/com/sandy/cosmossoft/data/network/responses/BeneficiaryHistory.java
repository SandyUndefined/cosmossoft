package com.sandy.cosmossoft.data.network.responses;

public class BeneficiaryHistory {
    public String NPCI_response_code;
    public String account_number;
    public String ackno;
    public Double balance;
    public String bc_share;
    public String benename;
    public String customercharge;
    public String gst;
    public String message;
    public String netcommission;
    public String remarks;
    public String remitter;
    public Integer response_code;
    public boolean status;
    public String tds;
    public String txn_amount;
    public String txn_status;
    public String utr;

    public BeneficiaryHistory(boolean status2, Integer response_code2, String ackno2, String utr2, String txn_status2, String benename2, String remarks2, String message2, String remitter2, String account_number2, String bc_share2, String txn_amount2, String NPCI_response_code2, Double balance2, String customercharge2, String gst2, String tds2, String netcommission2) {
        this.status = status2;
        this.response_code = response_code2;
        this.ackno = ackno2;
        this.utr = utr2;
        this.txn_status = txn_status2;
        this.benename = benename2;
        this.remarks = remarks2;
        this.message = message2;
        this.remitter = remitter2;
        this.account_number = account_number2;
        this.bc_share = bc_share2;
        this.txn_amount = txn_amount2;
        this.NPCI_response_code = NPCI_response_code2;
        this.balance = balance2;
        this.customercharge = customercharge2;
        this.gst = gst2;
        this.tds = tds2;
        this.netcommission = netcommission2;
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

    public String getAckno() {
        return this.ackno;
    }

    public void setAckno(String ackno2) {
        this.ackno = ackno2;
    }

    public String getUtr() {
        return this.utr;
    }

    public void setUtr(String utr2) {
        this.utr = utr2;
    }

    public String getTxn_status() {
        return this.txn_status;
    }

    public void setTxn_status(String txn_status2) {
        this.txn_status = txn_status2;
    }

    public String getBenename() {
        return this.benename;
    }

    public void setBenename(String benename2) {
        this.benename = benename2;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks2) {
        this.remarks = remarks2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public String getRemitter() {
        return this.remitter;
    }

    public void setRemitter(String remitter2) {
        this.remitter = remitter2;
    }

    public String getAccount_number() {
        return this.account_number;
    }

    public void setAccount_number(String account_number2) {
        this.account_number = account_number2;
    }

    public String getBc_share() {
        return this.bc_share;
    }

    public void setBc_share(String bc_share2) {
        this.bc_share = bc_share2;
    }

    public String getTxn_amount() {
        return this.txn_amount;
    }

    public void setTxn_amount(String txn_amount2) {
        this.txn_amount = txn_amount2;
    }

    public String getNPCI_response_code() {
        return this.NPCI_response_code;
    }

    public void setNPCI_response_code(String NPCI_response_code2) {
        this.NPCI_response_code = NPCI_response_code2;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance2) {
        this.balance = balance2;
    }

    public String getCustomercharge() {
        return this.customercharge;
    }

    public void setCustomercharge(String customercharge2) {
        this.customercharge = customercharge2;
    }

    public String getGst() {
        return this.gst;
    }

    public void setGst(String gst2) {
        this.gst = gst2;
    }

    public String getTds() {
        return this.tds;
    }

    public void setTds(String tds2) {
        this.tds = tds2;
    }

    public String getNetcommission() {
        return this.netcommission;
    }

    public void setNetcommission(String netcommission2) {
        this.netcommission = netcommission2;
    }
}
