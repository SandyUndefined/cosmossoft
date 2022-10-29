package com.sandy.cosmossoft.data.model;

public class HistoryModel {
    public String amount;
    public String date;
    public String debited_from_credit_to;
    public String history_logo;

    /* renamed from: id */
    public String f3436id;
    public String paid_to_receive_from;
    public String to_person;
    public String trans_type;

    public HistoryModel(String history_logo2, String paid_to_receive_from2, String to_person2, String date2, String amount2, String debited_from_credit_to2, String trans_type2, String id) {
        this.history_logo = history_logo2;
        this.paid_to_receive_from = paid_to_receive_from2;
        this.to_person = to_person2;
        this.date = date2;
        this.amount = amount2;
        this.debited_from_credit_to = debited_from_credit_to2;
        this.trans_type = trans_type2;
        this.f3436id = id;
    }

    public String getId() {
        return this.f3436id;
    }

    public void setId(String id) {
        this.f3436id = id;
    }

    public String getHistory_logo() {
        return this.history_logo;
    }

    public void setHistory_logo(String history_logo2) {
        this.history_logo = history_logo2;
    }

    public String getPaid_to_receive_from() {
        return this.paid_to_receive_from;
    }

    public void setPaid_to_receive_from(String paid_to_receive_from2) {
        this.paid_to_receive_from = paid_to_receive_from2;
    }

    public String getTo_person() {
        return this.to_person;
    }

    public void setTo_person(String to_person2) {
        this.to_person = to_person2;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date2) {
        this.date = date2;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount2) {
        this.amount = amount2;
    }

    public String getDebited_from_credit_to() {
        return this.debited_from_credit_to;
    }

    public void setDebited_from_credit_to(String debited_from_credit_to2) {
        this.debited_from_credit_to = debited_from_credit_to2;
    }

    public String getTrans_type() {
        return this.trans_type;
    }

    public void setTrans_type(String trans_type2) {
        this.trans_type = trans_type2;
    }
}
