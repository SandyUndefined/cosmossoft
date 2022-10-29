package com.sandy.cosmossoft;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sandy.cosmossoft.BaseApplication_HiltComponents;
import com.sandy.cosmossoft.activities.HomeActivity;
import com.sandy.cosmossoft.activities.MainActivity;
import com.sandy.cosmossoft.activities.Payouts.AddPDMTBeneficiary;
import com.sandy.cosmossoft.activities.Payouts.PayoutHome;
import com.sandy.cosmossoft.activities.Payouts.SendAmountPayouts;
import com.sandy.cosmossoft.activities.SplashScreen;
import com.sandy.cosmossoft.activities.addfunds.AddFundList;
import com.sandy.cosmossoft.activities.addfunds.FundExchange;
import com.sandy.cosmossoft.activities.addfunds.PayActivity;
import com.sandy.cosmossoft.activities.addfunds.PayActivityWithPayTm;
import com.sandy.cosmossoft.activities.addfunds.RequestOffline;
import com.sandy.cosmossoft.activities.aeps.AepsHome;
import com.sandy.cosmossoft.activities.aeps.BalanceEnquiry;
import com.sandy.cosmossoft.activities.aeps.CashWithdrawal;
import com.sandy.cosmossoft.activities.aeps.MiniStatement;
import com.sandy.cosmossoft.activities.bbps.BbpsEnter;
import com.sandy.cosmossoft.activities.bbps.BbpsRecharge;
import com.sandy.cosmossoft.activities.cashdeposit.CashDeposit;
import com.sandy.cosmossoft.activities.creation.CreationActivity;
import com.sandy.cosmossoft.activities.microatm.MicroAtmHome;
import com.sandy.cosmossoft.activities.microatm.MicroAtmHome_MembersInjector;
import com.sandy.cosmossoft.activities.mobilenumber.MobileNumberPay;
import com.sandy.cosmossoft.activities.mobilenumber.SendMoney;
import com.sandy.cosmossoft.activities.payoutpaysprint.PayoutAddAccount;
import com.sandy.cosmossoft.activities.payoutpaysprint.PaysprintHome;
import com.sandy.cosmossoft.activities.payoutpaysprint.PaysprintPayout;
import com.sandy.cosmossoft.activities.payoutpaysprint.SendPayout;
import com.sandy.cosmossoft.activities.payoutpaysprint.VerifyAccounts;
import com.sandy.cosmossoft.activities.paytm.PayTmPayouts;
import com.sandy.cosmossoft.activities.profile.BankDetails;
import com.sandy.cosmossoft.activities.profile.ProfileActivity;
import com.sandy.cosmossoft.activities.profile.ProfileDetails;
import com.sandy.cosmossoft.activities.profile.Settings;
import com.sandy.cosmossoft.activities.profile.SocialMedia;
import com.sandy.cosmossoft.activities.rechargeactivities.MobileRecharge;
import com.sandy.cosmossoft.activities.rechargeactivities.ROffer;
import com.sandy.cosmossoft.activities.rechargeactivities.RechargeMyPlan;
import com.sandy.cosmossoft.activities.rechargeactivities.SelectOperator;
import com.sandy.cosmossoft.activities.sectionhistory.RegularHistory;
import com.sandy.cosmossoft.activities.tobank.AddBeneficiary;
import com.sandy.cosmossoft.activities.tobank.DMTHome;
import com.sandy.cosmossoft.activities.tobank.QueryRemitter;
import com.sandy.cosmossoft.activities.tobank.RegisterRemitter;
import com.sandy.cosmossoft.activities.tobank.SelectBank;
import com.sandy.cosmossoft.activities.tobank.SelectedBeneficiaryHistory;
import com.sandy.cosmossoft.activities.tobank.SendAmountDMT;
import com.sandy.cosmossoft.activities.tobank.ToAccount;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.network.NetworkConnectionInterceptor;
import com.sandy.cosmossoft.data.repositories.AepsRepository;
import com.sandy.cosmossoft.data.repositories.CashDepositRepository;
import com.sandy.cosmossoft.data.repositories.CreationRepository;
import com.sandy.cosmossoft.data.repositories.FundRepository;
import com.sandy.cosmossoft.data.repositories.HomeRepository;
import com.sandy.cosmossoft.data.repositories.MobileNumberPayRepository;
import com.sandy.cosmossoft.data.repositories.MobileRechargesRepository;
import com.sandy.cosmossoft.data.repositories.PayoutRepository;
import com.sandy.cosmossoft.data.repositories.ProfileRepository;
import com.sandy.cosmossoft.data.repositories.ToBankRepository;
import com.sandy.cosmossoft.data.repositories.UserRepository;
import com.sandy.cosmossoft.fragments.AnalyticFragment;
import com.sandy.cosmossoft.fragments.ChangePasswordFragment;
import com.sandy.cosmossoft.fragments.ForgotPasswordFragment;
import com.sandy.cosmossoft.fragments.HistoryFragment;
import com.sandy.cosmossoft.fragments.OtpFragment;
import com.sandy.cosmossoft.fragments.SignInFragment;
import com.sandy.cosmossoft.fragments.SignUpFragment;
import com.sandy.cosmossoft.fragments.SignUpFragment_MembersInjector;
import com.sandy.cosmossoft.fragments.screenmenus.HomeMenuFragments;
import com.sandy.cosmossoft.fragments.sliders.SliderFragment;
import com.sandy.cosmossoft.fragments.sliders.SliderFragment_MembersInjector;
import com.sandy.cosmossoft.p001di.AppModule;
import com.sandy.cosmossoft.p001di.AppModule_GetApiServicesFactory;
import com.sandy.cosmossoft.p001di.AppModule_GetHttpLoggingInterceptorFactory;
import com.sandy.cosmossoft.p001di.AppModule_GetNetworkInterceptorFactory;
import com.sandy.cosmossoft.p001di.AppModule_GetOkHttpClientFactory;
import com.sandy.cosmossoft.p001di.RepositoryModule;
import com.sandy.cosmossoft.viewmodel.AepsViewModel;
import com.sandy.cosmossoft.viewmodel.AepsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.sandy.cosmossoft.viewmodel.AuthViewModel;
import com.sandy.cosmossoft.viewmodel.AuthViewModel_HiltModules_KeyModule_ProvideFactory;
import com.sandy.cosmossoft.viewmodel.CashDepositViewModel;
import com.sandy.cosmossoft.viewmodel.CashDepositViewModel_HiltModules_KeyModule_ProvideFactory;
import com.sandy.cosmossoft.viewmodel.CreationViewModel;
import com.sandy.cosmossoft.viewmodel.CreationViewModel_HiltModules_KeyModule_ProvideFactory;
import com.sandy.cosmossoft.viewmodel.FundViewModel;
import com.sandy.cosmossoft.viewmodel.FundViewModel_HiltModules_KeyModule_ProvideFactory;
import com.sandy.cosmossoft.viewmodel.HomeViewModel;
import com.sandy.cosmossoft.viewmodel.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.sandy.cosmossoft.viewmodel.MobileNumberPayViewModel;
import com.sandy.cosmossoft.viewmodel.MobileNumberPayViewModel_HiltModules_KeyModule_ProvideFactory;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel_HiltModules_KeyModule_ProvideFactory;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel_HiltModules_KeyModule_ProvideFactory;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public final class DaggerBaseApplication_HiltComponents_SingletonC extends BaseApplication_HiltComponents.SingletonC {
    /* access modifiers changed from: private */
    public final AppModule appModule;
    /* access modifiers changed from: private */
    public final ApplicationContextModule applicationContextModule;
    /* access modifiers changed from: private */
    public Provider<APIServices> getApiServicesProvider;
    private Provider<HttpLoggingInterceptor> getHttpLoggingInterceptorProvider;
    /* access modifiers changed from: private */
    public Provider<NetworkConnectionInterceptor> getNetworkInterceptorProvider;
    private Provider<OkHttpClient> getOkHttpClientProvider;
    private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;

    private DaggerBaseApplication_HiltComponents_SingletonC(AppModule appModuleParam, ApplicationContextModule applicationContextModuleParam) {
        this.singletonC = this;
        this.appModule = appModuleParam;
        this.applicationContextModule = applicationContextModuleParam;
        initialize(appModuleParam, applicationContextModuleParam);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* access modifiers changed from: private */
    public NetworkConnectionInterceptor networkConnectionInterceptor() {
        return AppModule_GetNetworkInterceptorFactory.getNetworkInterceptor(this.appModule, ApplicationContextModule_ProvideContextFactory.provideContext(this.applicationContextModule));
    }

    /* access modifiers changed from: private */
    public OkHttpClient okHttpClient() {
        return AppModule_GetOkHttpClientFactory.getOkHttpClient(this.appModule, ApplicationContextModule_ProvideContextFactory.provideContext(this.applicationContextModule), this.getHttpLoggingInterceptorProvider.get(), this.getNetworkInterceptorProvider.get());
    }

    /* access modifiers changed from: private */
    public APIServices aPIServices() {
        return AppModule_GetApiServicesFactory.getApiServices(this.appModule, this.getOkHttpClientProvider.get());
    }

    private void initialize(AppModule appModuleParam, ApplicationContextModule applicationContextModuleParam) {
        this.getHttpLoggingInterceptorProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonC, 2));
        this.getNetworkInterceptorProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonC, 3));
        this.getOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonC, 1));
        this.getApiServicesProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonC, 0));
    }

    public void injectBaseApplication(BaseApplication baseApplication) {
    }

    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
        return new ActivityRetainedCBuilder();
    }

    public ServiceComponentBuilder serviceComponentBuilder() {
        return new ServiceCBuilder();
    }

    public static final class Builder {
        private AppModule appModule;
        private ApplicationContextModule applicationContextModule;

        private Builder() {
        }

        public Builder appModule(AppModule appModule2) {
            this.appModule = (AppModule) Preconditions.checkNotNull(appModule2);
            return this;
        }

        public Builder applicationContextModule(ApplicationContextModule applicationContextModule2) {
            this.applicationContextModule = (ApplicationContextModule) Preconditions.checkNotNull(applicationContextModule2);
            return this;
        }

        @Deprecated
        public Builder repositoryModule(RepositoryModule repositoryModule) {
            Preconditions.checkNotNull(repositoryModule);
            return this;
        }

        public BaseApplication_HiltComponents.SingletonC build() {
            if (this.appModule == null) {
                this.appModule = new AppModule();
            }
            Preconditions.checkBuilderRequirement(this.applicationContextModule, ApplicationContextModule.class);
            return new DaggerBaseApplication_HiltComponents_SingletonC(this.appModule, this.applicationContextModule);
        }
    }

    private static final class ActivityRetainedCBuilder implements BaseApplication_HiltComponents.ActivityRetainedC.Builder {
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;

        private ActivityRetainedCBuilder(DaggerBaseApplication_HiltComponents_SingletonC singletonC2) {
            this.singletonC = singletonC2;
        }

        public BaseApplication_HiltComponents.ActivityRetainedC build() {
            return new ActivityRetainedCImpl();
        }
    }

    private static final class ActivityCBuilder implements BaseApplication_HiltComponents.ActivityC.Builder {
        private Activity activity;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;

        private ActivityCBuilder(DaggerBaseApplication_HiltComponents_SingletonC singletonC2, ActivityRetainedCImpl activityRetainedCImpl2) {
            this.singletonC = singletonC2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
        }

        public ActivityCBuilder activity(Activity activity2) {
            this.activity = (Activity) Preconditions.checkNotNull(activity2);
            return this;
        }

        public BaseApplication_HiltComponents.ActivityC build() {
            Preconditions.checkBuilderRequirement(this.activity, Activity.class);
            return new ActivityCImpl(this.activityRetainedCImpl, this.activity);
        }
    }

    private static final class FragmentCBuilder implements BaseApplication_HiltComponents.FragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private Fragment fragment;
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;

        private FragmentCBuilder(DaggerBaseApplication_HiltComponents_SingletonC singletonC2, ActivityRetainedCImpl activityRetainedCImpl2, ActivityCImpl activityCImpl2) {
            this.singletonC = singletonC2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
            this.activityCImpl = activityCImpl2;
        }

        public FragmentCBuilder fragment(Fragment fragment2) {
            this.fragment = (Fragment) Preconditions.checkNotNull(fragment2);
            return this;
        }

        public BaseApplication_HiltComponents.FragmentC build() {
            Preconditions.checkBuilderRequirement(this.fragment, Fragment.class);
            return new FragmentCImpl(this.activityRetainedCImpl, this.activityCImpl, this.fragment);
        }
    }

    private static final class ViewWithFragmentCBuilder implements BaseApplication_HiltComponents.ViewWithFragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;
        private View view;

        private ViewWithFragmentCBuilder(DaggerBaseApplication_HiltComponents_SingletonC singletonC2, ActivityRetainedCImpl activityRetainedCImpl2, ActivityCImpl activityCImpl2, FragmentCImpl fragmentCImpl2) {
            this.singletonC = singletonC2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
            this.activityCImpl = activityCImpl2;
            this.fragmentCImpl = fragmentCImpl2;
        }

        public ViewWithFragmentCBuilder view(View view2) {
            this.view = (View) Preconditions.checkNotNull(view2);
            return this;
        }

        public BaseApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewWithFragmentCImpl(this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl, this.view);
        }
    }

    private static final class ViewCBuilder implements BaseApplication_HiltComponents.ViewC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;
        private View view;

        private ViewCBuilder(DaggerBaseApplication_HiltComponents_SingletonC singletonC2, ActivityRetainedCImpl activityRetainedCImpl2, ActivityCImpl activityCImpl2) {
            this.singletonC = singletonC2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
            this.activityCImpl = activityCImpl2;
        }

        public ViewCBuilder view(View view2) {
            this.view = (View) Preconditions.checkNotNull(view2);
            return this;
        }

        public BaseApplication_HiltComponents.ViewC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewCImpl(this.activityRetainedCImpl, this.activityCImpl, this.view);
        }
    }

    private static final class ViewModelCBuilder implements BaseApplication_HiltComponents.ViewModelC.Builder {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private SavedStateHandle savedStateHandle;
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;

        private ViewModelCBuilder(DaggerBaseApplication_HiltComponents_SingletonC singletonC2, ActivityRetainedCImpl activityRetainedCImpl2) {
            this.singletonC = singletonC2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
        }

        public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(handle);
            return this;
        }

        public BaseApplication_HiltComponents.ViewModelC build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            return new ViewModelCImpl(this.activityRetainedCImpl, this.savedStateHandle);
        }
    }

    private static final class ServiceCBuilder implements BaseApplication_HiltComponents.ServiceC.Builder {
        private Service service;
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;

        private ServiceCBuilder(DaggerBaseApplication_HiltComponents_SingletonC singletonC2) {
            this.singletonC = singletonC2;
        }

        public ServiceCBuilder service(Service service2) {
            this.service = (Service) Preconditions.checkNotNull(service2);
            return this;
        }

        public BaseApplication_HiltComponents.ServiceC build() {
            Preconditions.checkBuilderRequirement(this.service, Service.class);
            return new ServiceCImpl(this.service);
        }
    }

    private static final class ViewWithFragmentCImpl extends BaseApplication_HiltComponents.ViewWithFragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;
        private final ViewWithFragmentCImpl viewWithFragmentCImpl;

        private ViewWithFragmentCImpl(DaggerBaseApplication_HiltComponents_SingletonC singletonC2, ActivityRetainedCImpl activityRetainedCImpl2, ActivityCImpl activityCImpl2, FragmentCImpl fragmentCImpl2, View viewParam) {
            this.viewWithFragmentCImpl = this;
            this.singletonC = singletonC2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
            this.activityCImpl = activityCImpl2;
            this.fragmentCImpl = fragmentCImpl2;
        }
    }

    private static final class FragmentCImpl extends BaseApplication_HiltComponents.FragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;

        private FragmentCImpl(DaggerBaseApplication_HiltComponents_SingletonC singletonC2, ActivityRetainedCImpl activityRetainedCImpl2, ActivityCImpl activityCImpl2, Fragment fragmentParam) {
            this.fragmentCImpl = this;
            this.singletonC = singletonC2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
            this.activityCImpl = activityCImpl2;
        }

        public void injectAnalyticFragment(AnalyticFragment analyticFragment) {
        }

        public void injectChangePasswordFragment(ChangePasswordFragment changePasswordFragment) {
        }

        public void injectForgotPasswordFragment(ForgotPasswordFragment forgotPasswordFragment) {
        }

        public void injectHistoryFragment(HistoryFragment historyFragment) {
        }

        public void injectOtpFragment(OtpFragment otpFragment) {
        }

        public void injectSignInFragment(SignInFragment signInFragment) {
        }

        public void injectSignUpFragment(SignUpFragment signUpFragment) {
            injectSignUpFragment2(signUpFragment);
        }

        public void injectHomeMenuFragments(HomeMenuFragments homeMenuFragments) {
        }

        public void injectSliderFragment(SliderFragment sliderFragment) {
            injectSliderFragment2(sliderFragment);
        }

        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return this.activityCImpl.getHiltInternalFactoryFactory();
        }

        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
            return new ViewWithFragmentCBuilder(this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl);
        }

        private SignUpFragment injectSignUpFragment2(SignUpFragment instance) {
            SignUpFragment_MembersInjector.injectNetworkConnectionInterceptor(instance, (NetworkConnectionInterceptor) this.singletonC.getNetworkInterceptorProvider.get());
            return instance;
        }

        private SliderFragment injectSliderFragment2(SliderFragment instance) {
            SliderFragment_MembersInjector.injectApiServices(instance, (APIServices) this.singletonC.getApiServicesProvider.get());
            return instance;
        }
    }

    private static final class ViewCImpl extends BaseApplication_HiltComponents.ViewC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;
        private final ViewCImpl viewCImpl;

        private ViewCImpl(DaggerBaseApplication_HiltComponents_SingletonC singletonC2, ActivityRetainedCImpl activityRetainedCImpl2, ActivityCImpl activityCImpl2, View viewParam) {
            this.viewCImpl = this;
            this.singletonC = singletonC2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
            this.activityCImpl = activityCImpl2;
        }
    }

    private static final class ActivityCImpl extends BaseApplication_HiltComponents.ActivityC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;

        private ActivityCImpl(DaggerBaseApplication_HiltComponents_SingletonC singletonC2, ActivityRetainedCImpl activityRetainedCImpl2, Activity activityParam) {
            this.activityCImpl = this;
            this.singletonC = singletonC2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
        }

        public void injectHomeActivity(HomeActivity homeActivity) {
        }

        public void injectMainActivity(MainActivity mainActivity) {
        }

        public void injectAddPDMTBeneficiary(AddPDMTBeneficiary addPDMTBeneficiary) {
        }

        public void injectPayoutHome(PayoutHome payoutHome) {
        }

        public void injectSendAmountPayouts(SendAmountPayouts sendAmountPayouts) {
        }

        public void injectSplashScreen(SplashScreen splashScreen) {
        }

        public void injectAddFundList(AddFundList addFundList) {
        }

        public void injectFundExchange(FundExchange fundExchange) {
        }

        public void injectPayActivityWithPayTm(PayActivityWithPayTm payActivityWithPayTm) {
        }

        public void injectPayActivity(PayActivity payActivity) {
        }

        public void injectRequestOffline(RequestOffline requestOffline) {
        }

        public void injectAepsHome(AepsHome aepsHome) {
        }

        public void injectBalanceEnquiry(BalanceEnquiry balanceEnquiry) {
        }

        public void injectCashWithdrawal(CashWithdrawal cashWithdrawal) {
        }

        public void injectMiniStatement(MiniStatement miniStatement) {
        }

        public void injectBbpsEnter(BbpsEnter bbpsEnter) {
        }

        public void injectBbpsRecharge(BbpsRecharge bbpsRecharge) {
        }

        public void injectCashDeposit(CashDeposit cashDeposit) {
        }

        public void injectCreationActivity(CreationActivity creationActivity) {
        }

        public void injectMicroAtmHome(MicroAtmHome microAtmHome) {
            injectMicroAtmHome2(microAtmHome);
        }

        public void injectMobileNumberPay(MobileNumberPay mobileNumberPay) {
        }

        public void injectSendMoney(SendMoney sendMoney) {
        }

        public void injectPayoutAddAccount(PayoutAddAccount payoutAddAccount) {
        }

        public void injectPaysprintHome(PaysprintHome paysprintHome) {
        }

        public void injectPaysprintPayout(PaysprintPayout paysprintPayout) {
        }

        public void injectSendPayout(SendPayout sendPayout) {
        }

        public void injectVerifyAccounts(VerifyAccounts verifyAccounts) {
        }

        public void injectPayTmPayouts(PayTmPayouts payTmPayouts) {
        }

        public void injectBankDetails(BankDetails bankDetails) {
        }

        public void injectProfileActivity(ProfileActivity profileActivity) {
        }

        public void injectProfileDetails(ProfileDetails profileDetails) {
        }

        public void injectSettings(Settings settings) {
        }

        public void injectSocialMedia(SocialMedia socialMedia) {
        }

        public void injectMobileRecharge(MobileRecharge mobileRecharge) {
        }

        public void injectROffer(ROffer rOffer) {
        }

        public void injectRechargeMyPlan(RechargeMyPlan rechargeMyPlan) {
        }

        public void injectSelectOperator(SelectOperator selectOperator) {
        }

        public void injectRegularHistory(RegularHistory regularHistory) {
        }

        public void injectAddBeneficiary(AddBeneficiary addBeneficiary) {
        }

        public void injectDMTHome(DMTHome dMTHome) {
        }

        public void injectQueryRemitter(QueryRemitter queryRemitter) {
        }

        public void injectRegisterRemitter(RegisterRemitter registerRemitter) {
        }

        public void injectSelectBank(SelectBank selectBank) {
        }

        public void injectSelectedBeneficiaryHistory(SelectedBeneficiaryHistory selectedBeneficiaryHistory) {
        }

        public void injectSendAmountDMT(SendAmountDMT sendAmountDMT) {
        }

        public void injectToAccount(ToAccount toAccount) {
        }

        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(this.activityRetainedCImpl));
        }

        public Set<String> getViewModelKeys() {
            return SetBuilder.newSetBuilder(11).add(AepsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(AuthViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(CashDepositViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(CreationViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(FundViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MobileNumberPayViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MobileRechargeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(PayoutViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ProfileViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ToBankViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
        }

        public ViewModelComponentBuilder getViewModelComponentBuilder() {
            return new ViewModelCBuilder(this.activityRetainedCImpl);
        }

        public FragmentComponentBuilder fragmentComponentBuilder() {
            return new FragmentCBuilder(this.activityRetainedCImpl, this.activityCImpl);
        }

        public ViewComponentBuilder viewComponentBuilder() {
            return new ViewCBuilder(this.activityRetainedCImpl, this.activityCImpl);
        }

        private MicroAtmHome injectMicroAtmHome2(MicroAtmHome instance) {
            MicroAtmHome_MembersInjector.injectApiServices(instance, (APIServices) this.singletonC.getApiServicesProvider.get());
            return instance;
        }
    }

    private static final class ViewModelCImpl extends BaseApplication_HiltComponents.ViewModelC {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private Provider<AepsViewModel> aepsViewModelProvider;
        private Provider<AuthViewModel> authViewModelProvider;
        private Provider<CashDepositViewModel> cashDepositViewModelProvider;
        private Provider<CreationViewModel> creationViewModelProvider;
        private Provider<FundViewModel> fundViewModelProvider;
        private Provider<HomeViewModel> homeViewModelProvider;
        private Provider<MobileNumberPayViewModel> mobileNumberPayViewModelProvider;
        private Provider<MobileRechargeViewModel> mobileRechargeViewModelProvider;
        private Provider<PayoutViewModel> payoutViewModelProvider;
        private Provider<ProfileViewModel> profileViewModelProvider;
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;
        private Provider<ToBankViewModel> toBankViewModelProvider;
        private final ViewModelCImpl viewModelCImpl;

        private ViewModelCImpl(DaggerBaseApplication_HiltComponents_SingletonC singletonC2, ActivityRetainedCImpl activityRetainedCImpl2, SavedStateHandle savedStateHandleParam) {
            this.viewModelCImpl = this;
            this.singletonC = singletonC2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
            initialize(savedStateHandleParam);
        }

        private AepsRepository aepsRepository() {
            return new AepsRepository(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonC.applicationContextModule), (APIServices) this.singletonC.getApiServicesProvider.get());
        }

        /* access modifiers changed from: private */
        public AepsViewModel aepsViewModel() {
            return new AepsViewModel(aepsRepository());
        }

        private UserRepository userRepository() {
            return new UserRepository(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonC.applicationContextModule), (APIServices) this.singletonC.getApiServicesProvider.get());
        }

        /* access modifiers changed from: private */
        public AuthViewModel authViewModel() {
            return new AuthViewModel(userRepository());
        }

        private CashDepositRepository cashDepositRepository() {
            return new CashDepositRepository(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonC.applicationContextModule), (APIServices) this.singletonC.getApiServicesProvider.get());
        }

        /* access modifiers changed from: private */
        public CashDepositViewModel cashDepositViewModel() {
            return new CashDepositViewModel(cashDepositRepository());
        }

        private CreationRepository creationRepository() {
            return new CreationRepository(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonC.applicationContextModule), (APIServices) this.singletonC.getApiServicesProvider.get());
        }

        /* access modifiers changed from: private */
        public CreationViewModel creationViewModel() {
            return new CreationViewModel(creationRepository());
        }

        private FundRepository fundRepository() {
            return new FundRepository(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonC.applicationContextModule), (APIServices) this.singletonC.getApiServicesProvider.get());
        }

        /* access modifiers changed from: private */
        public FundViewModel fundViewModel() {
            return new FundViewModel(fundRepository());
        }

        private HomeRepository homeRepository() {
            return new HomeRepository(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonC.applicationContextModule), (APIServices) this.singletonC.getApiServicesProvider.get());
        }

        /* access modifiers changed from: private */
        public HomeViewModel homeViewModel() {
            return new HomeViewModel(homeRepository());
        }

        private MobileNumberPayRepository mobileNumberPayRepository() {
            return new MobileNumberPayRepository(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonC.applicationContextModule), (APIServices) this.singletonC.getApiServicesProvider.get());
        }

        /* access modifiers changed from: private */
        public MobileNumberPayViewModel mobileNumberPayViewModel() {
            return new MobileNumberPayViewModel(mobileNumberPayRepository());
        }

        private MobileRechargesRepository mobileRechargesRepository() {
            return new MobileRechargesRepository(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonC.applicationContextModule), (APIServices) this.singletonC.getApiServicesProvider.get());
        }

        /* access modifiers changed from: private */
        public MobileRechargeViewModel mobileRechargeViewModel() {
            return new MobileRechargeViewModel(mobileRechargesRepository());
        }

        private PayoutRepository payoutRepository() {
            return new PayoutRepository(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonC.applicationContextModule), (APIServices) this.singletonC.getApiServicesProvider.get());
        }

        /* access modifiers changed from: private */
        public PayoutViewModel payoutViewModel() {
            return new PayoutViewModel(payoutRepository());
        }

        private ProfileRepository profileRepository() {
            return new ProfileRepository(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonC.applicationContextModule), (APIServices) this.singletonC.getApiServicesProvider.get());
        }

        /* access modifiers changed from: private */
        public ProfileViewModel profileViewModel() {
            return new ProfileViewModel(profileRepository());
        }

        private ToBankRepository toBankRepository() {
            return new ToBankRepository(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonC.applicationContextModule), (APIServices) this.singletonC.getApiServicesProvider.get());
        }

        /* access modifiers changed from: private */
        public ToBankViewModel toBankViewModel() {
            return new ToBankViewModel(toBankRepository());
        }

        private void initialize(SavedStateHandle savedStateHandleParam) {
            this.aepsViewModelProvider = new SwitchingProvider(this.singletonC, this.activityRetainedCImpl, this.viewModelCImpl, 0);
            this.authViewModelProvider = new SwitchingProvider(this.singletonC, this.activityRetainedCImpl, this.viewModelCImpl, 1);
            this.cashDepositViewModelProvider = new SwitchingProvider(this.singletonC, this.activityRetainedCImpl, this.viewModelCImpl, 2);
            this.creationViewModelProvider = new SwitchingProvider(this.singletonC, this.activityRetainedCImpl, this.viewModelCImpl, 3);
            this.fundViewModelProvider = new SwitchingProvider(this.singletonC, this.activityRetainedCImpl, this.viewModelCImpl, 4);
            this.homeViewModelProvider = new SwitchingProvider(this.singletonC, this.activityRetainedCImpl, this.viewModelCImpl, 5);
            this.mobileNumberPayViewModelProvider = new SwitchingProvider(this.singletonC, this.activityRetainedCImpl, this.viewModelCImpl, 6);
            this.mobileRechargeViewModelProvider = new SwitchingProvider(this.singletonC, this.activityRetainedCImpl, this.viewModelCImpl, 7);
            this.payoutViewModelProvider = new SwitchingProvider(this.singletonC, this.activityRetainedCImpl, this.viewModelCImpl, 8);
            this.profileViewModelProvider = new SwitchingProvider(this.singletonC, this.activityRetainedCImpl, this.viewModelCImpl, 9);
            this.toBankViewModelProvider = new SwitchingProvider(this.singletonC, this.activityRetainedCImpl, this.viewModelCImpl, 10);
        }

        public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
            return MapBuilder.newMapBuilder(11).put("com.sandy.cosmossoft.viewmodel.AepsViewModel", this.aepsViewModelProvider).put("com.sandy.cosmossoft.viewmodel.AuthViewModel", this.authViewModelProvider).put("com.sandy.cosmossoft.viewmodel.CashDepositViewModel", this.cashDepositViewModelProvider).put("com.sandy.cosmossoft.viewmodel.CreationViewModel", this.creationViewModelProvider).put("com.sandy.cosmossoft.viewmodel.FundViewModel", this.fundViewModelProvider).put("com.sandy.cosmossoft.viewmodel.HomeViewModel", this.homeViewModelProvider).put("com.sandy.cosmossoft.viewmodel.MobileNumberPayViewModel", this.mobileNumberPayViewModelProvider).put("com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel", this.mobileRechargeViewModelProvider).put("com.sandy.cosmossoft.viewmodel.PayoutViewModel", this.payoutViewModelProvider).put("com.sandy.cosmossoft.viewmodel.ProfileViewModel", this.profileViewModelProvider).put("com.sandy.cosmossoft.viewmodel.ToBankViewModel", this.toBankViewModelProvider).build();
        }

        private static final class SwitchingProvider<T> implements Provider<T> {
            private final ActivityRetainedCImpl activityRetainedCImpl;

            /* renamed from: id */
            private final int f3442id;
            private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;
            private final ViewModelCImpl viewModelCImpl;

            SwitchingProvider(DaggerBaseApplication_HiltComponents_SingletonC singletonC2, ActivityRetainedCImpl activityRetainedCImpl2, ViewModelCImpl viewModelCImpl2, int id) {
                this.singletonC = singletonC2;
                this.activityRetainedCImpl = activityRetainedCImpl2;
                this.viewModelCImpl = viewModelCImpl2;
                this.f3442id = id;
            }

            public T get() {
                switch (this.f3442id) {
                    case 0:
                        return this.viewModelCImpl.aepsViewModel();
                    case 1:
                        return this.viewModelCImpl.authViewModel();
                    case 2:
                        return this.viewModelCImpl.cashDepositViewModel();
                    case 3:
                        return this.viewModelCImpl.creationViewModel();
                    case 4:
                        return this.viewModelCImpl.fundViewModel();
                    case 5:
                        return this.viewModelCImpl.homeViewModel();
                    case 6:
                        return this.viewModelCImpl.mobileNumberPayViewModel();
                    case 7:
                        return this.viewModelCImpl.mobileRechargeViewModel();
                    case 8:
                        return this.viewModelCImpl.payoutViewModel();
                    case 9:
                        return this.viewModelCImpl.profileViewModel();
                    case 10:
                        return this.viewModelCImpl.toBankViewModel();
                    default:
                        throw new AssertionError(this.f3442id);
                }
            }
        }
    }

    private static final class ActivityRetainedCImpl extends BaseApplication_HiltComponents.ActivityRetainedC {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private Provider lifecycleProvider;
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;

        private ActivityRetainedCImpl(DaggerBaseApplication_HiltComponents_SingletonC singletonC2) {
            this.activityRetainedCImpl = this;
            this.singletonC = singletonC2;
            initialize();
        }

        private void initialize() {
            this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonC, this.activityRetainedCImpl, 0));
        }

        public ActivityComponentBuilder activityComponentBuilder() {
            return new ActivityCBuilder(this.activityRetainedCImpl);
        }

        public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
            return (ActivityRetainedLifecycle) this.lifecycleProvider.get();
        }

        private static final class SwitchingProvider<T> implements Provider<T> {
            private final ActivityRetainedCImpl activityRetainedCImpl;

            /* renamed from: id */
            private final int f3440id;
            private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;

            SwitchingProvider(DaggerBaseApplication_HiltComponents_SingletonC singletonC2, ActivityRetainedCImpl activityRetainedCImpl2, int id) {
                this.singletonC = singletonC2;
                this.activityRetainedCImpl = activityRetainedCImpl2;
                this.f3440id = id;
            }

            public T get() {
                switch (this.f3440id) {
                    case 0:
                        return ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
                    default:
                        throw new AssertionError(this.f3440id);
                }
            }
        }
    }

    private static final class ServiceCImpl extends BaseApplication_HiltComponents.ServiceC {
        private final ServiceCImpl serviceCImpl;
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;

        private ServiceCImpl(DaggerBaseApplication_HiltComponents_SingletonC singletonC2, Service serviceParam) {
            this.serviceCImpl = this;
            this.singletonC = singletonC2;
        }
    }

    private static final class SwitchingProvider<T> implements Provider<T> {

        /* renamed from: id */
        private final int f3441id;
        private final DaggerBaseApplication_HiltComponents_SingletonC singletonC;

        SwitchingProvider(DaggerBaseApplication_HiltComponents_SingletonC singletonC2, int id) {
            this.singletonC = singletonC2;
            this.f3441id = id;
        }

        public T get() {
            switch (this.f3441id) {
                case 0:
                    return this.singletonC.aPIServices();
                case 1:
                    return this.singletonC.okHttpClient();
                case 2:
                    return AppModule_GetHttpLoggingInterceptorFactory.getHttpLoggingInterceptor(this.singletonC.appModule);
                case 3:
                    return this.singletonC.networkConnectionInterceptor();
                default:
                    throw new AssertionError(this.f3441id);
            }
        }
    }
}
