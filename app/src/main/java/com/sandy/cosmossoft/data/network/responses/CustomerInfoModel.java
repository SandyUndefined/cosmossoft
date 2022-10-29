package com.sandy.cosmossoft.data.network.responses;

import java.io.Serializable;

public class CustomerInfoModel implements Serializable {
    String Balance;
    String MonthlyRecharge;
    String NextRechargeDate;
    String customerName;
    String lastrechargeamount;
    String lastrechargedate;
    String planname;
    String status;

    public CustomerInfoModel(String monthlyRecharge, String balance, String customerName2, String status2, String nextRechargeDate, String lastrechargeamount2, String lastrechargedate2, String planname2) {
        this.MonthlyRecharge = monthlyRecharge;
        this.Balance = balance;
        this.customerName = customerName2;
        this.status = status2;
        this.NextRechargeDate = nextRechargeDate;
        this.lastrechargeamount = lastrechargeamount2;
        this.lastrechargedate = lastrechargedate2;
        this.planname = planname2;
    }

    public String getMonthlyRecharge() {
        return this.MonthlyRecharge;
    }

    public void setMonthlyRecharge(String monthlyRecharge) {
        this.MonthlyRecharge = monthlyRecharge;
    }

    public String getBalance() {
        return this.Balance;
    }

    public void setBalance(String balance) {
        this.Balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName2) {
        this.customerName = customerName2;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status2) {
        this.status = status2;
    }

    public String getNextRechargeDate() {
        return this.NextRechargeDate;
    }

    public void setNextRechargeDate(String nextRechargeDate) {
        this.NextRechargeDate = nextRechargeDate;
    }

    public String getLastrechargeamount() {
        return this.lastrechargeamount;
    }

    public void setLastrechargeamount(String lastrechargeamount2) {
        this.lastrechargeamount = lastrechargeamount2;
    }

    public String getLastrechargedate() {
        return this.lastrechargedate;
    }

    public void setLastrechargedate(String lastrechargedate2) {
        this.lastrechargedate = lastrechargedate2;
    }

    public String getPlanname() {
        return this.planname;
    }

    public void setPlanname(String planname2) {
        this.planname = planname2;
    }

    public String toString() {
        return "CustomerInfoModel{MonthlyRecharge='" + this.MonthlyRecharge + '\'' + ", Balance='" + this.Balance + '\'' + ", customerName='" + this.customerName + '\'' + ", status='" + this.status + '\'' + ", NextRechargeDate='" + this.NextRechargeDate + '\'' + ", lastrechargeamount='" + this.lastrechargeamount + '\'' + ", lastrechargedate='" + this.lastrechargedate + '\'' + ", planname='" + this.planname + '\'' + '}';
    }
}
