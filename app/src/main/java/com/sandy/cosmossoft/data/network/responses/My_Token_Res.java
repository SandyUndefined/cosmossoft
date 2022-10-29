package com.sandy.cosmossoft.data.network.responses;

public class My_Token_Res {
    public String merchant_id;
    public Token_Res token_res;

    public My_Token_Res(Token_Res token_res2, String merchant_id2) {
        this.token_res = token_res2;
        this.merchant_id = merchant_id2;
    }

    public Token_Res getToken_res() {
        return this.token_res;
    }

    public void setToken_res(Token_Res token_res2) {
        this.token_res = token_res2;
    }

    public String getMerchant_id() {
        return this.merchant_id;
    }

    public void setMerchant_id(String merchant_id2) {
        this.merchant_id = merchant_id2;
    }
}
