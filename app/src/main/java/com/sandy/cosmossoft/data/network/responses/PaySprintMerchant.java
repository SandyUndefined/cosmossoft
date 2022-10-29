package com.sandy.cosmossoft.data.network.responses;

public class PaySprintMerchant {
    public String isicicikyc;
    public String merchantcode;
    public String message;
    public String owner;
    public String ownerid;
    public String partnerid;
    public String ref_no;
    public boolean result;
    public String timestamp;
    public String txn_id;

    public PaySprintMerchant(boolean result2, String message2, String ref_no2, String txn_id2, String partnerid2, String merchantcode2, String isicicikyc2, String timestamp2, String owner2, String ownerid2) {
        this.result = result2;
        this.message = message2;
        this.ref_no = ref_no2;
        this.txn_id = txn_id2;
        this.partnerid = partnerid2;
        this.merchantcode = merchantcode2;
        this.isicicikyc = isicicikyc2;
        this.timestamp = timestamp2;
        this.owner = owner2;
        this.ownerid = ownerid2;
    }

    public boolean isResult() {
        return this.result;
    }

    public void setResult(boolean result2) {
        this.result = result2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public String getRef_no() {
        return this.ref_no;
    }

    public void setRef_no(String ref_no2) {
        this.ref_no = ref_no2;
    }

    public String getTxn_id() {
        return this.txn_id;
    }

    public void setTxn_id(String txn_id2) {
        this.txn_id = txn_id2;
    }

    public String getPartnerid() {
        return this.partnerid;
    }

    public void setPartnerid(String partnerid2) {
        this.partnerid = partnerid2;
    }

    public String getMerchantcode() {
        return this.merchantcode;
    }

    public void setMerchantcode(String merchantcode2) {
        this.merchantcode = merchantcode2;
    }

    public String getIsicicikyc() {
        return this.isicicikyc;
    }

    public void setIsicicikyc(String isicicikyc2) {
        this.isicicikyc = isicicikyc2;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp2) {
        this.timestamp = timestamp2;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner2) {
        this.owner = owner2;
    }

    public String getOwnerid() {
        return this.ownerid;
    }

    public void setOwnerid(String ownerid2) {
        this.ownerid = ownerid2;
    }
}
