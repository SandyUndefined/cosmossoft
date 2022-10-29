package com.sandy.cosmossoft.data.model;

public class BalanceCardModel {
    public String balance;
    public String name;
    public String rNumber;

    public BalanceCardModel(String name2, String rNumber2, String balance2) {
        this.name = name2;
        this.rNumber = rNumber2;
        this.balance = balance2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String getrNumber() {
        return this.rNumber;
    }

    public void setrNumber(String rNumber2) {
        this.rNumber = rNumber2;
    }

    public String getBalance() {
        return this.balance;
    }

    public void setBalance(String balance2) {
        this.balance = balance2;
    }
}
