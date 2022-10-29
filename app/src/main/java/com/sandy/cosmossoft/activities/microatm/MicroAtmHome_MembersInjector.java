package com.sandy.cosmossoft.activities.microatm;

import com.sandy.cosmossoft.data.network.APIServices;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class MicroAtmHome_MembersInjector implements MembersInjector<MicroAtmHome> {
    private final Provider<APIServices> apiServicesProvider;

    public MicroAtmHome_MembersInjector(Provider<APIServices> apiServicesProvider2) {
        this.apiServicesProvider = apiServicesProvider2;
    }

    public static MembersInjector<MicroAtmHome> create(Provider<APIServices> apiServicesProvider2) {
        return new MicroAtmHome_MembersInjector(apiServicesProvider2);
    }

    public void injectMembers(MicroAtmHome instance) {
        injectApiServices(instance, this.apiServicesProvider.get());
    }

    public static void injectApiServices(MicroAtmHome instance, APIServices apiServices) {
        instance.apiServices = apiServices;
    }
}
