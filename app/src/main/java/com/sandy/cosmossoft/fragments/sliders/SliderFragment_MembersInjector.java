package com.sandy.cosmossoft.fragments.sliders;

import com.sandy.cosmossoft.data.network.APIServices;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class SliderFragment_MembersInjector implements MembersInjector<SliderFragment> {
    private final Provider<APIServices> apiServicesProvider;

    public SliderFragment_MembersInjector(Provider<APIServices> apiServicesProvider2) {
        this.apiServicesProvider = apiServicesProvider2;
    }

    public static MembersInjector<SliderFragment> create(Provider<APIServices> apiServicesProvider2) {
        return new SliderFragment_MembersInjector(apiServicesProvider2);
    }

    public void injectMembers(SliderFragment instance) {
        injectApiServices(instance, this.apiServicesProvider.get());
    }

    public static void injectApiServices(SliderFragment instance, APIServices apiServices) {
        instance.apiServices = apiServices;
    }
}
