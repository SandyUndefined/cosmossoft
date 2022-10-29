package com.sandy.cosmossoft.data.network.responses;

import java.util.List;

public class RegularHistoryResponse {
    List<EveryDayData> data;
    String message;
    int response_code;
    boolean status;

    public RegularHistoryResponse(int response_code2, boolean status2, String message2, List<EveryDayData> data2) {
        this.response_code = response_code2;
        this.status = status2;
        this.message = message2;
        this.data = data2;
    }

    public int getResponse_code() {
        return this.response_code;
    }

    public void setResponse_code(int response_code2) {
        this.response_code = response_code2;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status2) {
        this.status = status2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public List<EveryDayData> getData() {
        return this.data;
    }

    public void setData(List<EveryDayData> data2) {
        this.data = data2;
    }

    public class EveryDayData {
        public String amount;

        /* renamed from: id */
        public String f7id;
        public String number;
        public String reference;
        public String response;
        public String status;

        public EveryDayData(String id, String number2, String amount2, String reference2, String status2, String response2) {
            this.f7id = id;
            this.number = number2;
            this.amount = amount2;
            this.reference = reference2;
            this.status = status2;
            this.response = response2;
        }

        public String getId() {
            return this.f7id;
        }

        public void setId(String id) {
            this.f7id = id;
        }

        public String getNumber() {
            return this.number;
        }

        public void setNumber(String number2) {
            this.number = number2;
        }

        public String getAmount() {
            return this.amount;
        }

        public void setAmount(String amount2) {
            this.amount = amount2;
        }

        public String getReference() {
            return this.reference;
        }

        public void setReference(String reference2) {
            this.reference = reference2;
        }

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String status2) {
            this.status = status2;
        }

        public String getResponse() {
            return this.response;
        }

        public void setResponse(String response2) {
            this.response = response2;
        }
    }
}
