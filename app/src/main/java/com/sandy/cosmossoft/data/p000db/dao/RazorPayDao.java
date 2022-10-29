package com.sandy.cosmossoft.data.p000db.dao;

import com.sandy.cosmossoft.data.p000db.entities.RazorpayData;

/* renamed from: com.sandy.cosmossoft.data.db.dao.RazorPayDao */
public interface RazorPayDao {
    void deleteRazorPayData();

    RazorpayData getRazorPayData();

    long insert(RazorpayData razorpayData);
}
