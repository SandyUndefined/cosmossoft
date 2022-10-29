package com.sandy.cosmossoft.data.network.responses;

import java.io.Serializable;

public class AnalyticsResponseModel implements Serializable {
    String amount;
    String amount_earlier;
    String amount_in_word;
    String amount_left;
    String cause;
    String commission_amount;
    String date;
    String gst;

    /* renamed from: id */
    String f2id;
    String json_response;
    String logo;
    String onMobile;
    String op_id;
    String operator_name;
    String payment_type;
    String status;
    String tds;
    String transactionType;
    String txn_id;
    String user_mobile;

    public AnalyticsResponseModel(String amount_in_word2, String transactionType2, String cause2, String id, String status2, String amount_earlier2, String amount_left2, String logo2, String onMobile2, String txn_id2, String operator_name2, String op_id2, String user_mobile2, String commission_amount2, String date2, String payment_type2, String json_response2, String amount2, String tds2, String gst2) {
        this.amount_in_word = amount_in_word2;
        this.transactionType = transactionType2;
        this.cause = cause2;
        this.f2id = id;
        this.status = status2;
        this.amount_earlier = amount_earlier2;
        this.amount_left = amount_left2;
        this.logo = logo2;
        this.onMobile = onMobile2;
        this.txn_id = txn_id2;
        this.operator_name = operator_name2;
        this.op_id = op_id2;
        this.user_mobile = user_mobile2;
        this.commission_amount = commission_amount2;
        this.date = date2;
        this.payment_type = payment_type2;
        this.json_response = json_response2;
        this.amount = amount2;
        this.tds = tds2;
        this.gst = gst2;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public void setTransactionType(String transactionType2) {
        this.transactionType = transactionType2;
    }

    public String getAmount_in_word() {
        return this.amount_in_word;
    }

    public void setAmount_in_word(String amount_in_word2) {
        this.amount_in_word = amount_in_word2;
    }

    public String getCause() {
        return this.cause;
    }

    public void setCause(String cause2) {
        this.cause = cause2;
    }

    public String getTds() {
        return this.tds;
    }

    public void setTds(String tds2) {
        this.tds = tds2;
    }

    public String getGst() {
        return this.gst;
    }

    public void setGst(String gst2) {
        this.gst = gst2;
    }

    public String getId() {
        return this.f2id;
    }

    public void setId(String id) {
        this.f2id = id;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status2) {
        this.status = status2;
    }

    public String getAmount_earlier() {
        return this.amount_earlier;
    }

    public void setAmount_earlier(String amount_earlier2) {
        this.amount_earlier = amount_earlier2;
    }

    public String getAmount_left() {
        return this.amount_left;
    }

    public void setAmount_left(String amount_left2) {
        this.amount_left = amount_left2;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo2) {
        this.logo = logo2;
    }

    public String getOnMobile() {
        return this.onMobile;
    }

    public void setOnMobile(String onMobile2) {
        this.onMobile = onMobile2;
    }

    public String getTxn_id() {
        return this.txn_id;
    }

    public void setTxn_id(String txn_id2) {
        this.txn_id = txn_id2;
    }

    public String getOperator_name() {
        return this.operator_name;
    }

    public void setOperator_name(String operator_name2) {
        this.operator_name = operator_name2;
    }

    public String getOp_id() {
        return this.op_id;
    }

    public void setOp_id(String op_id2) {
        this.op_id = op_id2;
    }

    public String getUser_mobile() {
        return this.user_mobile;
    }

    public void setUser_mobile(String user_mobile2) {
        this.user_mobile = user_mobile2;
    }

    public String getCommission_amount() {
        return this.commission_amount;
    }

    public void setCommission_amount(String commission_amount2) {
        this.commission_amount = commission_amount2;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date2) {
        this.date = date2;
    }

    public String getPayment_type() {
        return this.payment_type;
    }

    public void setPayment_type(String payment_type2) {
        this.payment_type = payment_type2;
    }

    public String getJson_response() {
        String str = this.json_response;
        if (str == null) {
            return "";
        }
        return str;
    }

    public void setJson_response(String json_response2) {
        this.json_response = json_response2;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount2) {
        this.amount = amount2;
    }

    public String toString() {
        return "AnalyticsResponseModel{amount_in_word='" + this.amount_in_word + '\'' + ", cause='" + this.cause + '\'' + ", id='" + this.f2id + '\'' + ", status='" + this.status + '\'' + ", amount_earlier='" + this.amount_earlier + '\'' + ", amount_left='" + this.amount_left + '\'' + ", logo='" + this.logo + '\'' + ", onMobile='" + this.onMobile + '\'' + ", txn_id='" + this.txn_id + '\'' + ", operator_name='" + this.operator_name + '\'' + ", op_id='" + this.op_id + '\'' + ", user_mobile='" + this.user_mobile + '\'' + ", commission_amount='" + this.commission_amount + '\'' + ", date='" + this.date + '\'' + ", payment_type='" + this.payment_type + '\'' + ", json_response='" + this.json_response + '\'' + ", amount='" + this.amount + '\'' + ", tds='" + this.tds + '\'' + ", gst='" + this.gst + '\'' + '}';
    }
}
