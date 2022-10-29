package com.sandy.cosmossoft.data.model;

public class ContactsModel {
    private String name;
    private String number;

    public ContactsModel(String name2, String number2) {
        this.name = name2;
        this.number = number2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number2) {
        this.number = number2;
    }
}
