package com.sandy.cosmossoft.data.network.responses;

import java.io.Serializable;

public class BillFetch implements Serializable {
    public boolean acceptPartPay;
    public boolean acceptPayment;
    public String billAmount;
    public String billdate;
    public String billnetamount;
    public String cellNumber;
    public String dueDate;
    public String userName;

    public BillFetch(String billAmount2, String billnetamount2, String billdate2, String dueDate2, boolean acceptPayment2, boolean acceptPartPay2, String cellNumber2, String userName2) {
        this.billAmount = billAmount2;
        this.billnetamount = billnetamount2;
        this.billdate = billdate2;
        this.dueDate = dueDate2;
        this.acceptPayment = acceptPayment2;
        this.acceptPartPay = acceptPartPay2;
        this.cellNumber = cellNumber2;
        this.userName = userName2;
    }

    public String getCellNumber() {
        return this.cellNumber;
    }

    public void setCellNumber(String cellNumber2) {
        this.cellNumber = cellNumber2;
    }

    public String getBillAmount() {
        return this.billAmount;
    }

    public void setBillAmount(String billAmount2) {
        this.billAmount = billAmount2;
    }

    public String getBillnetamount() {
        return this.billnetamount;
    }

    public void setBillnetamount(String billnetamount2) {
        this.billnetamount = billnetamount2;
    }

    public String getBilldate() {
        return this.billdate;
    }

    public void setBilldate(String billdate2) {
        this.billdate = billdate2;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(String dueDate2) {
        this.dueDate = dueDate2;
    }

    public boolean isAcceptPayment() {
        return this.acceptPayment;
    }

    public void setAcceptPayment(boolean acceptPayment2) {
        this.acceptPayment = acceptPayment2;
    }

    public boolean isAcceptPartPay() {
        return this.acceptPartPay;
    }

    public void setAcceptPartPay(boolean acceptPartPay2) {
        this.acceptPartPay = acceptPartPay2;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName2) {
        this.userName = userName2;
    }
}
