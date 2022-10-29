package com.sandy.cosmossoft.listeners;

import com.sandy.cosmossoft.data.model.OperatorModel;
import java.util.List;

public interface ResponseMessageListener {
    void onOperatorFetch(List<OperatorModel> list);
}
