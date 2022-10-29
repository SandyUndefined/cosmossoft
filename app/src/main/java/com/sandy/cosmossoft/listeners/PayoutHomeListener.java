package com.sandy.cosmossoft.listeners;

import android.view.View;
import com.sandy.cosmossoft.data.network.responses.PayoutList;
import java.util.List;

public interface PayoutHomeListener {
    void deleteBeneficiary(View view, PayoutList payoutList);

    void initiateStart();

    void openBeneficiary(View view, PayoutList payoutList);

    void setErrorInFetch(String str);

    void setWholeRecycler(List<PayoutList> list);

    void verifyPayoutBeneficiary(View view, PayoutList payoutList);
}
