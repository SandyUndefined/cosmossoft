package com.sandy.cosmossoft.data.p000db.dao;

import com.sandy.cosmossoft.data.p000db.entities.PaySprintApi;

/* renamed from: com.sandy.cosmossoft.data.db.dao.PaySprintDao */
public interface PaySprintDao {
    PaySprintApi getRegularPaySprint();

    long insert(PaySprintApi paySprintApi);

    void loggedOut();
}
