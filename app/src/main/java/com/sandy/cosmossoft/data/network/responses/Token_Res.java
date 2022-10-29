package com.sandy.cosmossoft.data.network.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Token_Res {
    @SerializedName("body")
    @Expose
    private Body body;
    @SerializedName("head")
    @Expose
    private Head head;

    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head2) {
        this.head = head2;
    }

    public Body getBody() {
        return this.body;
    }

    public void setBody(Body body2) {
        this.body = body2;
    }

    public class ResultInfo {
        @SerializedName("resultCode")
        @Expose
        private String resultCode;
        @SerializedName("resultMsg")
        @Expose
        private String resultMsg;
        @SerializedName("resultStatus")
        @Expose
        private String resultStatus;

        public ResultInfo() {
        }

        public String getResultStatus() {
            return this.resultStatus;
        }

        public void setResultStatus(String resultStatus2) {
            this.resultStatus = resultStatus2;
        }

        public String getResultCode() {
            return this.resultCode;
        }

        public void setResultCode(String resultCode2) {
            this.resultCode = resultCode2;
        }

        public String getResultMsg() {
            return this.resultMsg;
        }

        public void setResultMsg(String resultMsg2) {
            this.resultMsg = resultMsg2;
        }
    }

    public class Head {
        @SerializedName("responseTimestamp")
        @Expose
        private String responseTimestamp;
        @SerializedName("signature")
        @Expose
        private String signature;
        @SerializedName("version")
        @Expose
        private String version;

        public Head() {
        }

        public String getResponseTimestamp() {
            return this.responseTimestamp;
        }

        public void setResponseTimestamp(String responseTimestamp2) {
            this.responseTimestamp = responseTimestamp2;
        }

        public String getVersion() {
            return this.version;
        }

        public void setVersion(String version2) {
            this.version = version2;
        }

        public String getSignature() {
            return this.signature;
        }

        public void setSignature(String signature2) {
            this.signature = signature2;
        }
    }

    public class Body {
        @SerializedName("authenticated")
        @Expose
        private boolean authenticated;
        @SerializedName("isPromoCodeValid")
        @Expose
        private boolean isPromoCodeValid;
        @SerializedName("resultInfo")
        @Expose
        private ResultInfo resultInfo;
        @SerializedName("txnToken")
        @Expose
        private String txnToken;

        public Body() {
        }

        public ResultInfo getResultInfo() {
            return this.resultInfo;
        }

        public void setResultInfo(ResultInfo resultInfo2) {
            this.resultInfo = resultInfo2;
        }

        public String getTxnToken() {
            return this.txnToken;
        }

        public void setTxnToken(String txnToken2) {
            this.txnToken = txnToken2;
        }

        public boolean isIsPromoCodeValid() {
            return this.isPromoCodeValid;
        }

        public void setIsPromoCodeValid(boolean isPromoCodeValid2) {
            this.isPromoCodeValid = isPromoCodeValid2;
        }

        public boolean isAuthenticated() {
            return this.authenticated;
        }

        public void setAuthenticated(boolean authenticated2) {
            this.authenticated = authenticated2;
        }
    }
}
