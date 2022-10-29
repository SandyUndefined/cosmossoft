package com.sandy.cosmossoft.data.network.responses;

public class FetchBillResponse {
    public String amount;
    public BillFetch bill_fetch;
    public String billdate;
    public String duedate;
    public String message;
    public String name;
    public Integer response_code;
    public boolean status;

    public FetchBillResponse(Integer response_code2, boolean status2, String amount2, String name2, String duedate2, String billdate2, BillFetch bill_fetch2, String message2) {
        this.response_code = response_code2;
        this.status = status2;
        this.amount = amount2;
        this.name = name2;
        this.duedate = duedate2;
        this.billdate = billdate2;
        this.bill_fetch = bill_fetch2;
        this.message = message2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public Integer getResponse_code() {
        return this.response_code;
    }

    public void setResponse_code(Integer response_code2) {
        this.response_code = response_code2;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status2) {
        this.status = status2;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount2) {
        this.amount = amount2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String getDuedate() {
        return this.duedate;
    }

    public void setDuedate(String duedate2) {
        this.duedate = duedate2;
    }

    public String getBilldate() {
        return this.billdate;
    }

    public void setBilldate(String billdate2) {
        this.billdate = billdate2;
    }

    public BillFetch getBill_fetch() {
        return this.bill_fetch;
    }

    public void setBill_fetch(BillFetch bill_fetch2) {
        this.bill_fetch = bill_fetch2;
    }
}
