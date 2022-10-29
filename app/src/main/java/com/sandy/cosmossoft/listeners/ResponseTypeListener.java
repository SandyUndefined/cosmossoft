package com.sandy.cosmossoft.listeners;

import com.sandy.cosmossoft.data.network.responses.My_Token_Res;

public interface ResponseTypeListener {
    void onError(String str);

    void onResponse(My_Token_Res my_Token_Res);

    void onResponseStart();
}
