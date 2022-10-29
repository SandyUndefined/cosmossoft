package com.sandy.cosmossoft.data.p000db.dao;

import androidx.lifecycle.LiveData;
import com.sandy.cosmossoft.data.p000db.entities.User;

/* renamed from: com.sandy.cosmossoft.data.db.dao.UserDao */
public interface UserDao {
    User getRegularUser();

    LiveData<User> getUser();

    long insert(User user);

    void loggedOutUser();
}
