package com.sandy.cosmossoft;

import com.sandy.cosmossoft.activities.HomeActivity_GeneratedInjector;
import com.sandy.cosmossoft.activities.MainActivity_GeneratedInjector;
import com.sandy.cosmossoft.activities.Payouts.AddPDMTBeneficiary_GeneratedInjector;
import com.sandy.cosmossoft.activities.Payouts.PayoutHome_GeneratedInjector;
import com.sandy.cosmossoft.activities.Payouts.SendAmountPayouts_GeneratedInjector;
import com.sandy.cosmossoft.activities.SplashScreen_GeneratedInjector;
import com.sandy.cosmossoft.activities.addfunds.AddFundList_GeneratedInjector;
import com.sandy.cosmossoft.activities.addfunds.FundExchange_GeneratedInjector;
import com.sandy.cosmossoft.activities.addfunds.PayActivityWithPayTm_GeneratedInjector;
import com.sandy.cosmossoft.activities.addfunds.PayActivity_GeneratedInjector;
import com.sandy.cosmossoft.activities.addfunds.RequestOffline_GeneratedInjector;
import com.sandy.cosmossoft.activities.aeps.AepsHome_GeneratedInjector;
import com.sandy.cosmossoft.activities.aeps.BalanceEnquiry_GeneratedInjector;
import com.sandy.cosmossoft.activities.aeps.CashWithdrawal_GeneratedInjector;
import com.sandy.cosmossoft.activities.aeps.MiniStatement_GeneratedInjector;
import com.sandy.cosmossoft.activities.bbps.BbpsEnter_GeneratedInjector;
import com.sandy.cosmossoft.activities.bbps.BbpsRecharge_GeneratedInjector;
import com.sandy.cosmossoft.activities.cashdeposit.CashDeposit_GeneratedInjector;
import com.sandy.cosmossoft.activities.creation.CreationActivity_GeneratedInjector;
import com.sandy.cosmossoft.activities.microatm.MicroAtmHome_GeneratedInjector;
import com.sandy.cosmossoft.activities.mobilenumber.MobileNumberPay_GeneratedInjector;
import com.sandy.cosmossoft.activities.mobilenumber.SendMoney_GeneratedInjector;
import com.sandy.cosmossoft.activities.payoutpaysprint.PayoutAddAccount_GeneratedInjector;
import com.sandy.cosmossoft.activities.payoutpaysprint.PaysprintHome_GeneratedInjector;
import com.sandy.cosmossoft.activities.payoutpaysprint.PaysprintPayout_GeneratedInjector;
import com.sandy.cosmossoft.activities.payoutpaysprint.SendPayout_GeneratedInjector;
import com.sandy.cosmossoft.activities.payoutpaysprint.VerifyAccounts_GeneratedInjector;
import com.sandy.cosmossoft.activities.paytm.PayTmPayouts_GeneratedInjector;
import com.sandy.cosmossoft.activities.profile.BankDetails_GeneratedInjector;
import com.sandy.cosmossoft.activities.profile.ProfileActivity_GeneratedInjector;
import com.sandy.cosmossoft.activities.profile.ProfileDetails_GeneratedInjector;
import com.sandy.cosmossoft.activities.profile.Settings_GeneratedInjector;
import com.sandy.cosmossoft.activities.profile.SocialMedia_GeneratedInjector;
import com.sandy.cosmossoft.activities.rechargeactivities.MobileRecharge_GeneratedInjector;
import com.sandy.cosmossoft.activities.rechargeactivities.ROffer_GeneratedInjector;
import com.sandy.cosmossoft.activities.rechargeactivities.RechargeMyPlan_GeneratedInjector;
import com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator_GeneratedInjector;
import com.sandy.cosmossoft.activities.sectionhistory.RegularHistory_GeneratedInjector;
import com.sandy.cosmossoft.activities.tobank.AddBeneficiary_GeneratedInjector;
import com.sandy.cosmossoft.activities.tobank.DMTHome_GeneratedInjector;
import com.sandy.cosmossoft.activities.tobank.QueryRemitter_GeneratedInjector;
import com.sandy.cosmossoft.activities.tobank.RegisterRemitter_GeneratedInjector;
import com.sandy.cosmossoft.activities.tobank.SelectBank_GeneratedInjector;
import com.sandy.cosmossoft.activities.tobank.SelectedBeneficiaryHistory_GeneratedInjector;
import com.sandy.cosmossoft.activities.tobank.SendAmountDMT_GeneratedInjector;
import com.sandy.cosmossoft.activities.tobank.ToAccount_GeneratedInjector;
import com.sandy.cosmossoft.fragments.AnalyticFragment_GeneratedInjector;
import com.sandy.cosmossoft.fragments.ChangePasswordFragment_GeneratedInjector;
import com.sandy.cosmossoft.fragments.ForgotPasswordFragment_GeneratedInjector;
import com.sandy.cosmossoft.fragments.HistoryFragment_GeneratedInjector;
import com.sandy.cosmossoft.fragments.OtpFragment_GeneratedInjector;
import com.sandy.cosmossoft.fragments.SignInFragment_GeneratedInjector;
import com.sandy.cosmossoft.fragments.SignUpFragment_GeneratedInjector;
import com.sandy.cosmossoft.fragments.screenmenus.HomeMenuFragments_GeneratedInjector;
import com.sandy.cosmossoft.fragments.sliders.SliderFragment_GeneratedInjector;
import com.sandy.cosmossoft.p001di.AppModule;
import com.sandy.cosmossoft.p001di.RepositoryModule;
import com.sandy.cosmossoft.viewmodel.AepsViewModel_HiltModules;
import com.sandy.cosmossoft.viewmodel.AuthViewModel_HiltModules;
import com.sandy.cosmossoft.viewmodel.CashDepositViewModel_HiltModules;
import com.sandy.cosmossoft.viewmodel.CreationViewModel_HiltModules;
import com.sandy.cosmossoft.viewmodel.FundViewModel_HiltModules;
import com.sandy.cosmossoft.viewmodel.HomeViewModel_HiltModules;
import com.sandy.cosmossoft.viewmodel.MobileNumberPayViewModel_HiltModules;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel_HiltModules;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel_HiltModules;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel_HiltModules;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel_HiltModules;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.C2018xb4b32df6;
import dagger.hilt.android.internal.managers.C2019x7709314e;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import javax.inject.Singleton;

public final class BaseApplication_HiltComponents {

    @Subcomponent(modules = {FragmentCBuilderModule.class, ViewCBuilderModule.class, HiltWrapper_ActivityModule.class, HiltWrapper_DefaultViewModelFactories_ActivityModule.class})
    public static abstract class ActivityC implements HomeActivity_GeneratedInjector, MainActivity_GeneratedInjector, AddPDMTBeneficiary_GeneratedInjector, PayoutHome_GeneratedInjector, SendAmountPayouts_GeneratedInjector, SplashScreen_GeneratedInjector, AddFundList_GeneratedInjector, FundExchange_GeneratedInjector, PayActivityWithPayTm_GeneratedInjector, PayActivity_GeneratedInjector, RequestOffline_GeneratedInjector, AepsHome_GeneratedInjector, BalanceEnquiry_GeneratedInjector, CashWithdrawal_GeneratedInjector, MiniStatement_GeneratedInjector, BbpsEnter_GeneratedInjector, BbpsRecharge_GeneratedInjector, CashDeposit_GeneratedInjector, CreationActivity_GeneratedInjector, MicroAtmHome_GeneratedInjector, MobileNumberPay_GeneratedInjector, SendMoney_GeneratedInjector, PayoutAddAccount_GeneratedInjector, PaysprintHome_GeneratedInjector, PaysprintPayout_GeneratedInjector, SendPayout_GeneratedInjector, VerifyAccounts_GeneratedInjector, PayTmPayouts_GeneratedInjector, BankDetails_GeneratedInjector, ProfileActivity_GeneratedInjector, ProfileDetails_GeneratedInjector, Settings_GeneratedInjector, SocialMedia_GeneratedInjector, MobileRecharge_GeneratedInjector, ROffer_GeneratedInjector, RechargeMyPlan_GeneratedInjector, SelectOperator_GeneratedInjector, RegularHistory_GeneratedInjector, AddBeneficiary_GeneratedInjector, DMTHome_GeneratedInjector, QueryRemitter_GeneratedInjector, RegisterRemitter_GeneratedInjector, SelectBank_GeneratedInjector, SelectedBeneficiaryHistory_GeneratedInjector, SendAmountDMT_GeneratedInjector, ToAccount_GeneratedInjector, ActivityComponent, DefaultViewModelFactories.ActivityEntryPoint, HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint, FragmentComponentManager.FragmentComponentBuilderEntryPoint, ViewComponentManager.ViewComponentBuilderEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ActivityComponentBuilder {
        }
    }

    @Module(subcomponents = {ActivityC.class})
    interface ActivityCBuilderModule {
        @Binds
        ActivityComponentBuilder bind(ActivityC.Builder builder);
    }

    @Subcomponent(modules = {AepsViewModel_HiltModules.KeyModule.class, AuthViewModel_HiltModules.KeyModule.class, ActivityCBuilderModule.class, ViewModelCBuilderModule.class, CashDepositViewModel_HiltModules.KeyModule.class, CreationViewModel_HiltModules.KeyModule.class, FundViewModel_HiltModules.KeyModule.class, HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class, HomeViewModel_HiltModules.KeyModule.class, MobileNumberPayViewModel_HiltModules.KeyModule.class, MobileRechargeViewModel_HiltModules.KeyModule.class, PayoutViewModel_HiltModules.KeyModule.class, ProfileViewModel_HiltModules.KeyModule.class, ToBankViewModel_HiltModules.KeyModule.class})
    public static abstract class ActivityRetainedC implements ActivityRetainedComponent, ActivityComponentManager.ActivityComponentBuilderEntryPoint, C2019x7709314e, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ActivityRetainedComponentBuilder {
        }
    }

    @Module(subcomponents = {ActivityRetainedC.class})
    interface ActivityRetainedCBuilderModule {
        @Binds
        ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
    }

    @Subcomponent(modules = {ViewWithFragmentCBuilderModule.class})
    public static abstract class FragmentC implements AnalyticFragment_GeneratedInjector, ChangePasswordFragment_GeneratedInjector, ForgotPasswordFragment_GeneratedInjector, HistoryFragment_GeneratedInjector, OtpFragment_GeneratedInjector, SignInFragment_GeneratedInjector, SignUpFragment_GeneratedInjector, HomeMenuFragments_GeneratedInjector, SliderFragment_GeneratedInjector, FragmentComponent, DefaultViewModelFactories.FragmentEntryPoint, ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends FragmentComponentBuilder {
        }
    }

    @Module(subcomponents = {FragmentC.class})
    interface FragmentCBuilderModule {
        @Binds
        FragmentComponentBuilder bind(FragmentC.Builder builder);
    }

    @Subcomponent
    public static abstract class ServiceC implements ServiceComponent, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ServiceComponentBuilder {
        }
    }

    @Module(subcomponents = {ServiceC.class})
    interface ServiceCBuilderModule {
        @Binds
        ServiceComponentBuilder bind(ServiceC.Builder builder);
    }

    @Component(modules = {AppModule.class, ApplicationContextModule.class, ActivityRetainedCBuilderModule.class, ServiceCBuilderModule.class, RepositoryModule.class})
    @Singleton
    public static abstract class SingletonC implements BaseApplication_GeneratedInjector, C2018xb4b32df6, ServiceComponentManager.ServiceComponentBuilderEntryPoint, SingletonComponent, GeneratedComponent {
    }

    @Subcomponent
    public static abstract class ViewC implements ViewComponent, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ViewComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewC.class})
    interface ViewCBuilderModule {
        @Binds
        ViewComponentBuilder bind(ViewC.Builder builder);
    }

    @Subcomponent(modules = {AepsViewModel_HiltModules.BindsModule.class, AuthViewModel_HiltModules.BindsModule.class, CashDepositViewModel_HiltModules.BindsModule.class, CreationViewModel_HiltModules.BindsModule.class, FundViewModel_HiltModules.BindsModule.class, HiltWrapper_HiltViewModelFactory_ViewModelModule.class, HomeViewModel_HiltModules.BindsModule.class, MobileNumberPayViewModel_HiltModules.BindsModule.class, MobileRechargeViewModel_HiltModules.BindsModule.class, PayoutViewModel_HiltModules.BindsModule.class, ProfileViewModel_HiltModules.BindsModule.class, ToBankViewModel_HiltModules.BindsModule.class})
    public static abstract class ViewModelC implements ViewModelComponent, HiltViewModelFactory.ViewModelFactoriesEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ViewModelComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewModelC.class})
    interface ViewModelCBuilderModule {
        @Binds
        ViewModelComponentBuilder bind(ViewModelC.Builder builder);
    }

    @Subcomponent
    public static abstract class ViewWithFragmentC implements ViewWithFragmentComponent, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ViewWithFragmentComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewWithFragmentC.class})
    interface ViewWithFragmentCBuilderModule {
        @Binds
        ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
    }

    private BaseApplication_HiltComponents() {
    }
}
