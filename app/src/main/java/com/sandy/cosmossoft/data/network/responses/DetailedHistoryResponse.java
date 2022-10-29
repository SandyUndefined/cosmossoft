package com.sandy.cosmossoft.data.network.responses;

import java.io.Serializable;

public class DetailedHistoryResponse implements Serializable {
    String additional_info;
    String data_check_response;
    String data_response;
    String message;
    Integer response_code;
    boolean status;
    String trans_type;
    String type_response;

    public DetailedHistoryResponse(boolean status2, String message2, Integer response_code2, String type_response2, String trans_type2, String data_response2, String data_check_response2, String additional_info2) {
        this.status = status2;
        this.message = message2;
        this.response_code = response_code2;
        this.type_response = type_response2;
        this.trans_type = trans_type2;
        this.data_response = data_response2;
        this.data_check_response = data_check_response2;
        this.additional_info = additional_info2;
    }

    public String getAdditional_info() {
        return this.additional_info;
    }

    public void setAdditional_info(String additional_info2) {
        this.additional_info = additional_info2;
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

    public Integer getResponse_code() {
        return this.response_code;
    }

    public void setResponse_code(Integer response_code2) {
        this.response_code = response_code2;
    }

    public String getType_response() {
        return this.type_response;
    }

    public void setType_response(String type_response2) {
        this.type_response = type_response2;
    }

    public String getTrans_type() {
        return this.trans_type;
    }

    public void setTrans_type(String trans_type2) {
        this.trans_type = trans_type2;
    }

    public String getData_response() {
        return this.data_response;
    }

    public void setData_response(String data_response2) {
        this.data_response = data_response2;
    }

    public String getData_check_response() {
        return this.data_check_response;
    }

    public void setData_check_response(String data_check_response2) {
        this.data_check_response = data_check_response2;
    }

    public String toString() {
        return "DetailedHistoryResponse{status=" + this.status + ", message='" + this.message + '\'' + ", response_code=" + this.response_code + ", type_response='" + this.type_response + '\'' + ", trans_type='" + this.trans_type + '\'' + ", data_response='" + this.data_response + '\'' + ", data_check_response='" + this.data_check_response + '\'' + '}';
    }
}
