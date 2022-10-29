package com.sandy.cosmossoft.data.p000db.dao;

import androidx.lifecycle.LiveData;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;

/* renamed from: com.sandy.cosmossoft.data.db.dao.ProfileDao */
public interface ProfileDao {
    void deleteUserProfile();

    UserProfile getRegularUserProfile();

    LiveData<UserProfile> getUserProfile();

    long insertUserProfile(UserProfile userProfile);
}
