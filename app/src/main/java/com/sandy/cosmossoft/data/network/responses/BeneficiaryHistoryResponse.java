package com.sandy.cosmossoft.data.network.responses;

public class BeneficiaryHistoryResponse {
    public String amount;
    public BeneficiaryHistory data;
    public String reference_id;
    public boolean refundable;
    public String status;
    public String time;
    public String trans_type;

    public BeneficiaryHistoryResponse(String time2, String amount2, String trans_type2, BeneficiaryHistory data2, String status2, String reference_id2, boolean refundable2) {
        this.time = time2;
        this.amount = amount2;
        this.trans_type = trans_type2;
        this.data = data2;
        this.status = status2;
        this.reference_id = reference_id2;
        this.refundable = refundable2;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time2) {
        this.time = time2;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount2) {
        this.amount = amount2;
    }

    public String getTrans_type() {
        return this.trans_type;
    }

    public void setTrans_type(String trans_type2) {
        this.trans_type = trans_type2;
    }

    public BeneficiaryHistory getData() {
        return this.data;
    }

    public void setData(BeneficiaryHistory data2) {
        this.data = data2;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status2) {
        this.status = status2;
    }

    public String getReference_id() {
        return this.reference_id;
    }

    public void setReference_id(String reference_id2) {
        this.reference_id = reference_id2;
    }

    public boolean isRefundable() {
        return this.refundable;
    }

    public void setRefundable(boolean refundable2) {
        this.refundable = refundable2;
    }
}
