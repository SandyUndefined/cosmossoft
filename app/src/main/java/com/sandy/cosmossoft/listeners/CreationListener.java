package com.sandy.cosmossoft.listeners;

import com.sandy.cosmossoft.data.model.PackageType;
import com.sandy.cosmossoft.data.model.PersonUserModel;
import com.sandy.cosmossoft.data.model.UserTypeModel;
import java.util.List;

public interface CreationListener {
    void achievePackageType(List<PackageType> list);

    void achievePersonUser(List<PersonUserModel> list);

    void achieveUserType(List<UserTypeModel> list);
}
