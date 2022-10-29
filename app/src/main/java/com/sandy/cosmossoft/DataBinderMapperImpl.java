package com.sandy.cosmossoft;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.databinding.ActivityAddBeneficiaryBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityAddFundListBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityAddPdmtbeneficiaryBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityAePsresponseScreenSuccessBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityAePssuccessMiniStatementResponseBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityAepsDetailedAnalyticBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityAepsFailureReponseScreenBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityAepsHomeBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityBalanceEnquiryBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityBankDetailsBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityBbpsEnterBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityBbpsRechargeBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityBbpsdetailedAnalyticBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityCashDepositBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityCashWithdrawalBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityCreationBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityCustomerInfoBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityDetailedHistoryScreenBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityDmthomeBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityFundDetailedAnalyticBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityFundExchangeBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityHomeBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityMainBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityMicroAtmDetailedAnalyticBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityMicroAtmHomeBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityMicroAtmResponseBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityMiniStatementAnalyticBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityMiniStatementBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityMobileNumberHomePageBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityMobileRechargeBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityPayBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityPayTmPayoutsBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityPayWithPayTmBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityPayoutAddAccountBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityPayoutDetailedAnalyticBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityPayoutHomeBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityPayoutsBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityPaysprintPayoutBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityProfileBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityProfileDetailsBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityQueueryRemitterBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityRechargeDetailedAnalyticBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityRechargeMyPlanBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityRegisterRemitterBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityRegularHistoryBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityRequestOfflineBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityRofferBindingImpl;
import com.sandy.cosmossoft.databinding.ActivitySelectBankBindingImpl;
import com.sandy.cosmossoft.databinding.ActivitySelectOperatorBindingImpl;
import com.sandy.cosmossoft.databinding.ActivitySelectedBenefeciaryHistoryBindingImpl;
import com.sandy.cosmossoft.databinding.ActivitySendAmountDmtBindingImpl;
import com.sandy.cosmossoft.databinding.ActivitySendMoneyBindingImpl;
import com.sandy.cosmossoft.databinding.ActivitySendPayoutBindingImpl;
import com.sandy.cosmossoft.databinding.ActivitySettingsBindingImpl;
import com.sandy.cosmossoft.databinding.ActivitySocialMediaBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityToAccountBindingImpl;
import com.sandy.cosmossoft.databinding.ActivityVerifyAccountsBindingImpl;
import com.sandy.cosmossoft.databinding.AepsBankListLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.AnalyticDesignLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.BankListLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.BeneficiaryHistoryLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.BeneficiaryListLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.BottomBeneficiaryMoreSheetBindingImpl;
import com.sandy.cosmossoft.databinding.BottomSheetTransactionTypeBindingImpl;
import com.sandy.cosmossoft.databinding.CircleListLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.CircleSheetBackgroundBindingImpl;
import com.sandy.cosmossoft.databinding.ContactListLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.CustomAlertDialogBindingImpl;
import com.sandy.cosmossoft.databinding.CustomToolbarBindingImpl;
import com.sandy.cosmossoft.databinding.DmtHistroyToolbarBindingImpl;
import com.sandy.cosmossoft.databinding.DmtUserLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.FragmentAnalyticBindingImpl;
import com.sandy.cosmossoft.databinding.FragmentChangePasswordBindingImpl;
import com.sandy.cosmossoft.databinding.FragmentForgotPasswordBindingImpl;
import com.sandy.cosmossoft.databinding.FragmentHistoryBindingImpl;
import com.sandy.cosmossoft.databinding.FragmentHomeMenuFragmentsBindingImpl;
import com.sandy.cosmossoft.databinding.FragmentOtpBindingImpl;
import com.sandy.cosmossoft.databinding.FragmentSignInBindingImpl;
import com.sandy.cosmossoft.databinding.FragmentSignUpBindingImpl;
import com.sandy.cosmossoft.databinding.FragmentSliderBindingImpl;
import com.sandy.cosmossoft.databinding.HistoryListLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.ItemContainerSliderImageBindingImpl;
import com.sandy.cosmossoft.databinding.MiniStatementLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.MyRecyclerSpinnerBindingImpl;
import com.sandy.cosmossoft.databinding.OperatorListLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.OperatorSheetBackgroundBindingImpl;
import com.sandy.cosmossoft.databinding.OtpScreenLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.PayoutBeneficiaryCardBindingImpl;
import com.sandy.cosmossoft.databinding.PayoutListLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.ProfileEditLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.ProfileTopToolbarBindingImpl;
import com.sandy.cosmossoft.databinding.ROfferLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.RecyclerviewMenusOptionBindingImpl;
import com.sandy.cosmossoft.databinding.RegularHistoryDesignBindingImpl;
import com.sandy.cosmossoft.databinding.ResultDropDownLayoutBindingImpl;
import com.sandy.cosmossoft.databinding.SendPayoutDesignBindingImpl;
import com.sandy.cosmossoft.databinding.TPinLayoutBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_ACTIVITYADDBENEFICIARY = 1;
    private static final int LAYOUT_ACTIVITYADDFUNDLIST = 2;
    private static final int LAYOUT_ACTIVITYADDPDMTBENEFICIARY = 3;
    private static final int LAYOUT_ACTIVITYAEPSDETAILEDANALYTIC = 6;
    private static final int LAYOUT_ACTIVITYAEPSFAILUREREPONSESCREEN = 7;
    private static final int LAYOUT_ACTIVITYAEPSHOME = 8;
    private static final int LAYOUT_ACTIVITYAEPSRESPONSESCREENSUCCESS = 4;
    private static final int LAYOUT_ACTIVITYAEPSSUCCESSMINISTATEMENTRESPONSE = 5;
    private static final int LAYOUT_ACTIVITYBALANCEENQUIRY = 9;
    private static final int LAYOUT_ACTIVITYBANKDETAILS = 10;
    private static final int LAYOUT_ACTIVITYBBPSDETAILEDANALYTIC = 13;
    private static final int LAYOUT_ACTIVITYBBPSENTER = 11;
    private static final int LAYOUT_ACTIVITYBBPSRECHARGE = 12;
    private static final int LAYOUT_ACTIVITYCASHDEPOSIT = 14;
    private static final int LAYOUT_ACTIVITYCASHWITHDRAWAL = 15;
    private static final int LAYOUT_ACTIVITYCREATION = 16;
    private static final int LAYOUT_ACTIVITYCUSTOMERINFO = 17;
    private static final int LAYOUT_ACTIVITYDETAILEDHISTORYSCREEN = 18;
    private static final int LAYOUT_ACTIVITYDMTDETAITEDANALYTIC = 19;
    private static final int LAYOUT_ACTIVITYDMTHOME = 20;
    private static final int LAYOUT_ACTIVITYFUNDDETAILEDANALYTIC = 21;
    private static final int LAYOUT_ACTIVITYFUNDEXCHANGE = 22;
    private static final int LAYOUT_ACTIVITYHOME = 23;
    private static final int LAYOUT_ACTIVITYMAIN = 24;
    private static final int LAYOUT_ACTIVITYMICROATMDETAILEDANALYTIC = 25;
    private static final int LAYOUT_ACTIVITYMICROATMHOME = 26;
    private static final int LAYOUT_ACTIVITYMICROATMRESPONSE = 27;
    private static final int LAYOUT_ACTIVITYMINISTATEMENT = 28;
    private static final int LAYOUT_ACTIVITYMINISTATEMENTANALYTIC = 29;
    private static final int LAYOUT_ACTIVITYMOBILENUMBERHOMEPAGE = 30;
    private static final int LAYOUT_ACTIVITYMOBILERECHARGE = 31;
    private static final int LAYOUT_ACTIVITYPAY = 32;
    private static final int LAYOUT_ACTIVITYPAYOUTADDACCOUNT = 35;
    private static final int LAYOUT_ACTIVITYPAYOUTDETAILEDANALYTIC = 36;
    private static final int LAYOUT_ACTIVITYPAYOUTHOME = 37;
    private static final int LAYOUT_ACTIVITYPAYOUTS = 38;
    private static final int LAYOUT_ACTIVITYPAYSPRINTPAYOUT = 39;
    private static final int LAYOUT_ACTIVITYPAYTMPAYOUTS = 33;
    private static final int LAYOUT_ACTIVITYPAYWITHPAYTM = 34;
    private static final int LAYOUT_ACTIVITYPROFILE = 40;
    private static final int LAYOUT_ACTIVITYPROFILEDETAILS = 41;
    private static final int LAYOUT_ACTIVITYQUEUERYREMITTER = 42;
    private static final int LAYOUT_ACTIVITYRECHARGEDETAILEDANALYTIC = 43;
    private static final int LAYOUT_ACTIVITYRECHARGEMYPLAN = 44;
    private static final int LAYOUT_ACTIVITYREGISTERREMITTER = 45;
    private static final int LAYOUT_ACTIVITYREGULARHISTORY = 46;
    private static final int LAYOUT_ACTIVITYREQUESTOFFLINE = 47;
    private static final int LAYOUT_ACTIVITYROFFER = 48;
    private static final int LAYOUT_ACTIVITYSELECTBANK = 49;
    private static final int LAYOUT_ACTIVITYSELECTEDBENEFECIARYHISTORY = 51;
    private static final int LAYOUT_ACTIVITYSELECTOPERATOR = 50;
    private static final int LAYOUT_ACTIVITYSENDAMOUNTDMT = 52;
    private static final int LAYOUT_ACTIVITYSENDMONEY = 53;
    private static final int LAYOUT_ACTIVITYSENDPAYOUT = 54;
    private static final int LAYOUT_ACTIVITYSETTINGS = 55;
    private static final int LAYOUT_ACTIVITYSOCIALMEDIA = 56;
    private static final int LAYOUT_ACTIVITYTOACCOUNT = 57;
    private static final int LAYOUT_ACTIVITYVERIFYACCOUNTS = 58;
    private static final int LAYOUT_AEPSBANKLISTLAYOUT = 59;
    private static final int LAYOUT_ANALYTICDESIGNLAYOUT = 60;
    private static final int LAYOUT_BANKLISTLAYOUT = 61;
    private static final int LAYOUT_BENEFICIARYHISTORYLAYOUT = 62;
    private static final int LAYOUT_BENEFICIARYLISTLAYOUT = 63;
    private static final int LAYOUT_BOTTOMBENEFICIARYMORESHEET = 64;
    private static final int LAYOUT_BOTTOMSHEETTRANSACTIONTYPE = 65;
    private static final int LAYOUT_CIRCLELISTLAYOUT = 66;
    private static final int LAYOUT_CIRCLESHEETBACKGROUND = 67;
    private static final int LAYOUT_CONTACTLISTLAYOUT = 68;
    private static final int LAYOUT_CUSTOMALERTDIALOG = 69;
    private static final int LAYOUT_CUSTOMTOOLBAR = 70;
    private static final int LAYOUT_DMTHISTROYTOOLBAR = 71;
    private static final int LAYOUT_DMTUSERLAYOUT = 72;
    private static final int LAYOUT_FRAGMENTANALYTIC = 73;
    private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 74;
    private static final int LAYOUT_FRAGMENTFORGOTPASSWORD = 75;
    private static final int LAYOUT_FRAGMENTHISTORY = 76;
    private static final int LAYOUT_FRAGMENTHOMEMENUFRAGMENTS = 77;
    private static final int LAYOUT_FRAGMENTOTP = 78;
    private static final int LAYOUT_FRAGMENTSIGNIN = 79;
    private static final int LAYOUT_FRAGMENTSIGNUP = 80;
    private static final int LAYOUT_FRAGMENTSLIDER = 81;
    private static final int LAYOUT_HISTORYLISTLAYOUT = 82;
    private static final int LAYOUT_ITEMCONTAINERSLIDERIMAGE = 83;
    private static final int LAYOUT_MINISTATEMENTLAYOUT = 84;
    private static final int LAYOUT_MYRECYCLERSPINNER = 85;
    private static final int LAYOUT_OPERATORLISTLAYOUT = 86;
    private static final int LAYOUT_OPERATORSHEETBACKGROUND = 87;
    private static final int LAYOUT_OTPSCREENLAYOUT = 88;
    private static final int LAYOUT_PAYOUTBENEFICIARYCARD = 89;
    private static final int LAYOUT_PAYOUTLISTLAYOUT = 90;
    private static final int LAYOUT_PROFILEEDITLAYOUT = 91;
    private static final int LAYOUT_PROFILETOPTOOLBAR = 92;
    private static final int LAYOUT_RECYCLERVIEWMENUSOPTION = 94;
    private static final int LAYOUT_REGULARHISTORYDESIGN = 95;
    private static final int LAYOUT_RESULTDROPDOWNLAYOUT = 96;
    private static final int LAYOUT_ROFFERLAYOUT = 93;
    private static final int LAYOUT_SENDPAYOUTDESIGN = 97;
    private static final int LAYOUT_TPINLAYOUT = 98;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(98);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(C0330R.layout.activity_add_beneficiary, 1);
        sparseIntArray.put(C0330R.layout.activity_add_fund_list, 2);
        sparseIntArray.put(C0330R.layout.activity_add_pdmtbeneficiary, 3);
        sparseIntArray.put(C0330R.layout.activity_ae_psresponse_screen_success, 4);
        sparseIntArray.put(C0330R.layout.activity_ae_pssuccess_mini_statement_response, 5);
        sparseIntArray.put(C0330R.layout.activity_aeps_detailed_analytic, 6);
        sparseIntArray.put(C0330R.layout.activity_aeps_failure_reponse_screen, 7);
        sparseIntArray.put(C0330R.layout.activity_aeps_home, 8);
        sparseIntArray.put(C0330R.layout.activity_balance_enquiry, 9);
        sparseIntArray.put(C0330R.layout.activity_bank_details, 10);
        sparseIntArray.put(C0330R.layout.activity_bbps_enter, 11);
        sparseIntArray.put(C0330R.layout.activity_bbps_recharge, 12);
        sparseIntArray.put(C0330R.layout.activity_bbpsdetailed_analytic, 13);
        sparseIntArray.put(C0330R.layout.activity_cash_deposit, 14);
        sparseIntArray.put(C0330R.layout.activity_cash_withdrawal, 15);
        sparseIntArray.put(C0330R.layout.activity_creation, 16);
        sparseIntArray.put(C0330R.layout.activity_customer_info, 17);
        sparseIntArray.put(C0330R.layout.activity_detailed_history_screen, 18);
        sparseIntArray.put(C0330R.layout.activity_dmtdetaited_analytic, 19);
        sparseIntArray.put(C0330R.layout.activity_dmthome, 20);
        sparseIntArray.put(C0330R.layout.activity_fund_detailed_analytic, 21);
        sparseIntArray.put(C0330R.layout.activity_fund_exchange, 22);
        sparseIntArray.put(C0330R.layout.activity_home, 23);
        sparseIntArray.put(C0330R.layout.activity_main, 24);
        sparseIntArray.put(C0330R.layout.activity_micro_atm_detailed_analytic, 25);
        sparseIntArray.put(C0330R.layout.activity_micro_atm_home, 26);
        sparseIntArray.put(C0330R.layout.activity_micro_atm_response, 27);
        sparseIntArray.put(C0330R.layout.activity_mini_statement, 28);
        sparseIntArray.put(C0330R.layout.activity_mini_statement_analytic, 29);
        sparseIntArray.put(C0330R.layout.activity_mobile_number_home_page, 30);
        sparseIntArray.put(C0330R.layout.activity_mobile_recharge, 31);
        sparseIntArray.put(C0330R.layout.activity_pay, 32);
        sparseIntArray.put(C0330R.layout.activity_pay_tm_payouts, 33);
        sparseIntArray.put(C0330R.layout.activity_pay_with_pay_tm, 34);
        sparseIntArray.put(C0330R.layout.activity_payout_add_account, 35);
        sparseIntArray.put(C0330R.layout.activity_payout_detailed_analytic, 36);
        sparseIntArray.put(C0330R.layout.activity_payout_home, 37);
        sparseIntArray.put(C0330R.layout.activity_payouts, 38);
        sparseIntArray.put(C0330R.layout.activity_paysprint_payout, 39);
        sparseIntArray.put(C0330R.layout.activity_profile, 40);
        sparseIntArray.put(C0330R.layout.activity_profile_details, 41);
        sparseIntArray.put(C0330R.layout.activity_queuery_remitter, 42);
        sparseIntArray.put(C0330R.layout.activity_recharge_detailed_analytic, 43);
        sparseIntArray.put(C0330R.layout.activity_recharge_my_plan, 44);
        sparseIntArray.put(C0330R.layout.activity_register_remitter, 45);
        sparseIntArray.put(C0330R.layout.activity_regular_history, 46);
        sparseIntArray.put(C0330R.layout.activity_request_offline, 47);
        sparseIntArray.put(C0330R.layout.activity_roffer, 48);
        sparseIntArray.put(C0330R.layout.activity_select_bank, 49);
        sparseIntArray.put(C0330R.layout.activity_select_operator, 50);
        sparseIntArray.put(C0330R.layout.activity_selected_benefeciary_history, 51);
        sparseIntArray.put(C0330R.layout.activity_send_amount_dmt, 52);
        sparseIntArray.put(C0330R.layout.activity_send_money, 53);
        sparseIntArray.put(C0330R.layout.activity_send_payout, 54);
        sparseIntArray.put(C0330R.layout.activity_settings, 55);
        sparseIntArray.put(C0330R.layout.activity_social_media, 56);
        sparseIntArray.put(C0330R.layout.activity_to_account, 57);
        sparseIntArray.put(C0330R.layout.activity_verify_accounts, 58);
        sparseIntArray.put(C0330R.layout.aeps_bank_list_layout, 59);
        sparseIntArray.put(C0330R.layout.analytic_design_layout, 60);
        sparseIntArray.put(C0330R.layout.bank_list_layout, 61);
        sparseIntArray.put(C0330R.layout.beneficiary_history_layout, 62);
        sparseIntArray.put(C0330R.layout.beneficiary_list_layout, 63);
        sparseIntArray.put(C0330R.layout.bottom_beneficiary_more_sheet, 64);
        sparseIntArray.put(C0330R.layout.bottom_sheet_transaction_type, 65);
        sparseIntArray.put(C0330R.layout.circle_list_layout, 66);
        sparseIntArray.put(C0330R.layout.circle_sheet_background, 67);
        sparseIntArray.put(C0330R.layout.contact_list_layout, 68);
        sparseIntArray.put(C0330R.layout.custom_alert_dialog, 69);
        sparseIntArray.put(C0330R.layout.custom_toolbar, 70);
        sparseIntArray.put(C0330R.layout.dmt_histroy_toolbar, 71);
        sparseIntArray.put(C0330R.layout.dmt_user_layout, 72);
        sparseIntArray.put(C0330R.layout.fragment_analytic, 73);
        sparseIntArray.put(C0330R.layout.fragment_change_password, 74);
        sparseIntArray.put(C0330R.layout.fragment_forgot_password, 75);
        sparseIntArray.put(C0330R.layout.fragment_history, 76);
        sparseIntArray.put(C0330R.layout.fragment_home_menu_fragments, 77);
        sparseIntArray.put(C0330R.layout.fragment_otp, 78);
        sparseIntArray.put(C0330R.layout.fragment_sign_in, 79);
        sparseIntArray.put(C0330R.layout.fragment_sign_up, 80);
        sparseIntArray.put(C0330R.layout.fragment_slider, 81);
        sparseIntArray.put(C0330R.layout.history_list_layout, 82);
        sparseIntArray.put(C0330R.layout.item_container_slider_image, 83);
        sparseIntArray.put(C0330R.layout.mini_statement_layout, 84);
        sparseIntArray.put(C0330R.layout.my_recycler_spinner, 85);
        sparseIntArray.put(C0330R.layout.operator_list_layout, 86);
        sparseIntArray.put(C0330R.layout.operator_sheet_background, 87);
        sparseIntArray.put(C0330R.layout.otp_screen_layout, 88);
        sparseIntArray.put(C0330R.layout.payout_beneficiary_card, 89);
        sparseIntArray.put(C0330R.layout.payout_list_layout, 90);
        sparseIntArray.put(C0330R.layout.profile_edit_layout, 91);
        sparseIntArray.put(C0330R.layout.profile_top_toolbar, 92);
        sparseIntArray.put(C0330R.layout.r_offer_layout, 93);
        sparseIntArray.put(C0330R.layout.recyclerview_menus_option, 94);
        sparseIntArray.put(C0330R.layout.regular_history_design, 95);
        sparseIntArray.put(C0330R.layout.result_drop_down_layout, 96);
        sparseIntArray.put(C0330R.layout.send_payout_design, 97);
        sparseIntArray.put(C0330R.layout.t_pin_layout, 98);
    }

    private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component, View view, int internalId, Object tag) {
        switch (internalId) {
            case 1:
                if ("layout/activity_add_beneficiary_0".equals(tag)) {
                    return new ActivityAddBeneficiaryBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_add_beneficiary is invalid. Received: " + tag);
            case 2:
                if ("layout/activity_add_fund_list_0".equals(tag)) {
                    return new ActivityAddFundListBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_add_fund_list is invalid. Received: " + tag);
            case 3:
                if ("layout/activity_add_pdmtbeneficiary_0".equals(tag)) {
                    return new ActivityAddPdmtbeneficiaryBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_add_pdmtbeneficiary is invalid. Received: " + tag);
            case 4:
                if ("layout/activity_ae_psresponse_screen_success_0".equals(tag)) {
                    return new ActivityAePsresponseScreenSuccessBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_ae_psresponse_screen_success is invalid. Received: " + tag);
            case 5:
                if ("layout/activity_ae_pssuccess_mini_statement_response_0".equals(tag)) {
                    return new ActivityAePssuccessMiniStatementResponseBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_ae_pssuccess_mini_statement_response is invalid. Received: " + tag);
            case 6:
                if ("layout/activity_aeps_detailed_analytic_0".equals(tag)) {
                    return new ActivityAepsDetailedAnalyticBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_aeps_detailed_analytic is invalid. Received: " + tag);
            case 7:
                if ("layout/activity_aeps_failure_reponse_screen_0".equals(tag)) {
                    return new ActivityAepsFailureReponseScreenBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_aeps_failure_reponse_screen is invalid. Received: " + tag);
            case 8:
                if ("layout/activity_aeps_home_0".equals(tag)) {
                    return new ActivityAepsHomeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_aeps_home is invalid. Received: " + tag);
            case 9:
                if ("layout/activity_balance_enquiry_0".equals(tag)) {
                    return new ActivityBalanceEnquiryBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_balance_enquiry is invalid. Received: " + tag);
            case 10:
                if ("layout/activity_bank_details_0".equals(tag)) {
                    return new ActivityBankDetailsBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_bank_details is invalid. Received: " + tag);
            case 11:
                if ("layout/activity_bbps_enter_0".equals(tag)) {
                    return new ActivityBbpsEnterBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_bbps_enter is invalid. Received: " + tag);
            case 12:
                if ("layout/activity_bbps_recharge_0".equals(tag)) {
                    return new ActivityBbpsRechargeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_bbps_recharge is invalid. Received: " + tag);
            case 13:
                if ("layout/activity_bbpsdetailed_analytic_0".equals(tag)) {
                    return new ActivityBbpsdetailedAnalyticBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_bbpsdetailed_analytic is invalid. Received: " + tag);
            case 14:
                if ("layout/activity_cash_deposit_0".equals(tag)) {
                    return new ActivityCashDepositBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_cash_deposit is invalid. Received: " + tag);
            case 15:
                if ("layout/activity_cash_withdrawal_0".equals(tag)) {
                    return new ActivityCashWithdrawalBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_cash_withdrawal is invalid. Received: " + tag);
            case 16:
                if ("layout/activity_creation_0".equals(tag)) {
                    return new ActivityCreationBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_creation is invalid. Received: " + tag);
            case 17:
                if ("layout/activity_customer_info_0".equals(tag)) {
                    return new ActivityCustomerInfoBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_customer_info is invalid. Received: " + tag);
            case 18:
                if ("layout/activity_detailed_history_screen_0".equals(tag)) {
                    return new ActivityDetailedHistoryScreenBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_detailed_history_screen is invalid. Received: " + tag);
            case 19:
                if ("layout/activity_dmtdetaited_analytic_0".equals(tag)) {
                    return new ActivityDmtdetaitedAnalyticBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_dmtdetaited_analytic is invalid. Received: " + tag);
            case 20:
                if ("layout/activity_dmthome_0".equals(tag)) {
                    return new ActivityDmthomeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_dmthome is invalid. Received: " + tag);
            case 21:
                if ("layout/activity_fund_detailed_analytic_0".equals(tag)) {
                    return new ActivityFundDetailedAnalyticBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_fund_detailed_analytic is invalid. Received: " + tag);
            case 22:
                if ("layout/activity_fund_exchange_0".equals(tag)) {
                    return new ActivityFundExchangeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_fund_exchange is invalid. Received: " + tag);
            case 23:
                if ("layout/activity_home_0".equals(tag)) {
                    return new ActivityHomeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
            case 24:
                if ("layout/activity_main_0".equals(tag)) {
                    return new ActivityMainBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
            case 25:
                if ("layout/activity_micro_atm_detailed_analytic_0".equals(tag)) {
                    return new ActivityMicroAtmDetailedAnalyticBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_micro_atm_detailed_analytic is invalid. Received: " + tag);
            case 26:
                if ("layout/activity_micro_atm_home_0".equals(tag)) {
                    return new ActivityMicroAtmHomeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_micro_atm_home is invalid. Received: " + tag);
            case 27:
                if ("layout/activity_micro_atm_response_0".equals(tag)) {
                    return new ActivityMicroAtmResponseBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_micro_atm_response is invalid. Received: " + tag);
            case 28:
                if ("layout/activity_mini_statement_0".equals(tag)) {
                    return new ActivityMiniStatementBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_mini_statement is invalid. Received: " + tag);
            case 29:
                if ("layout/activity_mini_statement_analytic_0".equals(tag)) {
                    return new ActivityMiniStatementAnalyticBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_mini_statement_analytic is invalid. Received: " + tag);
            case 30:
                if ("layout/activity_mobile_number_home_page_0".equals(tag)) {
                    return new ActivityMobileNumberHomePageBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_mobile_number_home_page is invalid. Received: " + tag);
            case 31:
                if ("layout/activity_mobile_recharge_0".equals(tag)) {
                    return new ActivityMobileRechargeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_mobile_recharge is invalid. Received: " + tag);
            case 32:
                if ("layout/activity_pay_0".equals(tag)) {
                    return new ActivityPayBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_pay is invalid. Received: " + tag);
            case 33:
                if ("layout/activity_pay_tm_payouts_0".equals(tag)) {
                    return new ActivityPayTmPayoutsBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_pay_tm_payouts is invalid. Received: " + tag);
            case 34:
                if ("layout/activity_pay_with_pay_tm_0".equals(tag)) {
                    return new ActivityPayWithPayTmBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_pay_with_pay_tm is invalid. Received: " + tag);
            case 35:
                if ("layout/activity_payout_add_account_0".equals(tag)) {
                    return new ActivityPayoutAddAccountBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_payout_add_account is invalid. Received: " + tag);
            case 36:
                if ("layout/activity_payout_detailed_analytic_0".equals(tag)) {
                    return new ActivityPayoutDetailedAnalyticBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_payout_detailed_analytic is invalid. Received: " + tag);
            case 37:
                if ("layout/activity_payout_home_0".equals(tag)) {
                    return new ActivityPayoutHomeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_payout_home is invalid. Received: " + tag);
            case 38:
                if ("layout/activity_payouts_0".equals(tag)) {
                    return new ActivityPayoutsBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_payouts is invalid. Received: " + tag);
            case 39:
                if ("layout/activity_paysprint_payout_0".equals(tag)) {
                    return new ActivityPaysprintPayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_paysprint_payout is invalid. Received: " + tag);
            case 40:
                if ("layout/activity_profile_0".equals(tag)) {
                    return new ActivityProfileBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_profile is invalid. Received: " + tag);
            case 41:
                if ("layout/activity_profile_details_0".equals(tag)) {
                    return new ActivityProfileDetailsBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_profile_details is invalid. Received: " + tag);
            case 42:
                if ("layout/activity_queuery_remitter_0".equals(tag)) {
                    return new ActivityQueueryRemitterBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_queuery_remitter is invalid. Received: " + tag);
            case 43:
                if ("layout/activity_recharge_detailed_analytic_0".equals(tag)) {
                    return new ActivityRechargeDetailedAnalyticBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_recharge_detailed_analytic is invalid. Received: " + tag);
            case 44:
                if ("layout/activity_recharge_my_plan_0".equals(tag)) {
                    return new ActivityRechargeMyPlanBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_recharge_my_plan is invalid. Received: " + tag);
            case 45:
                if ("layout/activity_register_remitter_0".equals(tag)) {
                    return new ActivityRegisterRemitterBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_register_remitter is invalid. Received: " + tag);
            case 46:
                if ("layout/activity_regular_history_0".equals(tag)) {
                    return new ActivityRegularHistoryBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_regular_history is invalid. Received: " + tag);
            case 47:
                if ("layout/activity_request_offline_0".equals(tag)) {
                    return new ActivityRequestOfflineBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_request_offline is invalid. Received: " + tag);
            case 48:
                if ("layout/activity_roffer_0".equals(tag)) {
                    return new ActivityRofferBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_roffer is invalid. Received: " + tag);
            case 49:
                if ("layout/activity_select_bank_0".equals(tag)) {
                    return new ActivitySelectBankBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_select_bank is invalid. Received: " + tag);
            case 50:
                if ("layout/activity_select_operator_0".equals(tag)) {
                    return new ActivitySelectOperatorBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_select_operator is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component, View view, int internalId, Object tag) {
        switch (internalId) {
            case 51:
                if ("layout/activity_selected_benefeciary_history_0".equals(tag)) {
                    return new ActivitySelectedBenefeciaryHistoryBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_selected_benefeciary_history is invalid. Received: " + tag);
            case 52:
                if ("layout/activity_send_amount_dmt_0".equals(tag)) {
                    return new ActivitySendAmountDmtBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_send_amount_dmt is invalid. Received: " + tag);
            case 53:
                if ("layout/activity_send_money_0".equals(tag)) {
                    return new ActivitySendMoneyBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_send_money is invalid. Received: " + tag);
            case 54:
                if ("layout/activity_send_payout_0".equals(tag)) {
                    return new ActivitySendPayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_send_payout is invalid. Received: " + tag);
            case 55:
                if ("layout/activity_settings_0".equals(tag)) {
                    return new ActivitySettingsBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_settings is invalid. Received: " + tag);
            case 56:
                if ("layout/activity_social_media_0".equals(tag)) {
                    return new ActivitySocialMediaBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_social_media is invalid. Received: " + tag);
            case 57:
                if ("layout/activity_to_account_0".equals(tag)) {
                    return new ActivityToAccountBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_to_account is invalid. Received: " + tag);
            case 58:
                if ("layout/activity_verify_accounts_0".equals(tag)) {
                    return new ActivityVerifyAccountsBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_verify_accounts is invalid. Received: " + tag);
            case 59:
                if ("layout/aeps_bank_list_layout_0".equals(tag)) {
                    return new AepsBankListLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for aeps_bank_list_layout is invalid. Received: " + tag);
            case 60:
                if ("layout/analytic_design_layout_0".equals(tag)) {
                    return new AnalyticDesignLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for analytic_design_layout is invalid. Received: " + tag);
            case 61:
                if ("layout/bank_list_layout_0".equals(tag)) {
                    return new BankListLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for bank_list_layout is invalid. Received: " + tag);
            case 62:
                if ("layout/beneficiary_history_layout_0".equals(tag)) {
                    return new BeneficiaryHistoryLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for beneficiary_history_layout is invalid. Received: " + tag);
            case 63:
                if ("layout/beneficiary_list_layout_0".equals(tag)) {
                    return new BeneficiaryListLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for beneficiary_list_layout is invalid. Received: " + tag);
            case 64:
                if ("layout/bottom_beneficiary_more_sheet_0".equals(tag)) {
                    return new BottomBeneficiaryMoreSheetBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for bottom_beneficiary_more_sheet is invalid. Received: " + tag);
            case 65:
                if ("layout/bottom_sheet_transaction_type_0".equals(tag)) {
                    return new BottomSheetTransactionTypeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_transaction_type is invalid. Received: " + tag);
            case 66:
                if ("layout/circle_list_layout_0".equals(tag)) {
                    return new CircleListLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for circle_list_layout is invalid. Received: " + tag);
            case 67:
                if ("layout/circle_sheet_background_0".equals(tag)) {
                    return new CircleSheetBackgroundBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for circle_sheet_background is invalid. Received: " + tag);
            case 68:
                if ("layout/contact_list_layout_0".equals(tag)) {
                    return new ContactListLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for contact_list_layout is invalid. Received: " + tag);
            case 69:
                if ("layout/custom_alert_dialog_0".equals(tag)) {
                    return new CustomAlertDialogBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for custom_alert_dialog is invalid. Received: " + tag);
            case 70:
                if ("layout/custom_toolbar_0".equals(tag)) {
                    return new CustomToolbarBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for custom_toolbar is invalid. Received: " + tag);
            case 71:
                if ("layout/dmt_histroy_toolbar_0".equals(tag)) {
                    return new DmtHistroyToolbarBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dmt_histroy_toolbar is invalid. Received: " + tag);
            case 72:
                if ("layout/dmt_user_layout_0".equals(tag)) {
                    return new DmtUserLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dmt_user_layout is invalid. Received: " + tag);
            case 73:
                if ("layout/fragment_analytic_0".equals(tag)) {
                    return new FragmentAnalyticBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_analytic is invalid. Received: " + tag);
            case 74:
                if ("layout/fragment_change_password_0".equals(tag)) {
                    return new FragmentChangePasswordBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_change_password is invalid. Received: " + tag);
            case 75:
                if ("layout/fragment_forgot_password_0".equals(tag)) {
                    return new FragmentForgotPasswordBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_forgot_password is invalid. Received: " + tag);
            case 76:
                if ("layout/fragment_history_0".equals(tag)) {
                    return new FragmentHistoryBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_history is invalid. Received: " + tag);
            case 77:
                if ("layout/fragment_home_menu_fragments_0".equals(tag)) {
                    return new FragmentHomeMenuFragmentsBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_home_menu_fragments is invalid. Received: " + tag);
            case 78:
                if ("layout/fragment_otp_0".equals(tag)) {
                    return new FragmentOtpBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_otp is invalid. Received: " + tag);
            case 79:
                if ("layout/fragment_sign_in_0".equals(tag)) {
                    return new FragmentSignInBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sign_in is invalid. Received: " + tag);
            case 80:
                if ("layout/fragment_sign_up_0".equals(tag)) {
                    return new FragmentSignUpBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sign_up is invalid. Received: " + tag);
            case 81:
                if ("layout/fragment_slider_0".equals(tag)) {
                    return new FragmentSliderBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_slider is invalid. Received: " + tag);
            case 82:
                if ("layout/history_list_layout_0".equals(tag)) {
                    return new HistoryListLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for history_list_layout is invalid. Received: " + tag);
            case 83:
                if ("layout/item_container_slider_image_0".equals(tag)) {
                    return new ItemContainerSliderImageBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_container_slider_image is invalid. Received: " + tag);
            case 84:
                if ("layout/mini_statement_layout_0".equals(tag)) {
                    return new MiniStatementLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for mini_statement_layout is invalid. Received: " + tag);
            case 85:
                if ("layout/my_recycler_spinner_0".equals(tag)) {
                    return new MyRecyclerSpinnerBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for my_recycler_spinner is invalid. Received: " + tag);
            case 86:
                if ("layout/operator_list_layout_0".equals(tag)) {
                    return new OperatorListLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for operator_list_layout is invalid. Received: " + tag);
            case 87:
                if ("layout/operator_sheet_background_0".equals(tag)) {
                    return new OperatorSheetBackgroundBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for operator_sheet_background is invalid. Received: " + tag);
            case 88:
                if ("layout/otp_screen_layout_0".equals(tag)) {
                    return new OtpScreenLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for otp_screen_layout is invalid. Received: " + tag);
            case 89:
                if ("layout/payout_beneficiary_card_0".equals(tag)) {
                    return new PayoutBeneficiaryCardBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for payout_beneficiary_card is invalid. Received: " + tag);
            case 90:
                if ("layout/payout_list_layout_0".equals(tag)) {
                    return new PayoutListLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for payout_list_layout is invalid. Received: " + tag);
            case 91:
                if ("layout/profile_edit_layout_0".equals(tag)) {
                    return new ProfileEditLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for profile_edit_layout is invalid. Received: " + tag);
            case 92:
                if ("layout/profile_top_toolbar_0".equals(tag)) {
                    return new ProfileTopToolbarBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for profile_top_toolbar is invalid. Received: " + tag);
            case 93:
                if ("layout/r_offer_layout_0".equals(tag)) {
                    return new ROfferLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for r_offer_layout is invalid. Received: " + tag);
            case 94:
                if ("layout/recyclerview_menus_option_0".equals(tag)) {
                    return new RecyclerviewMenusOptionBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for recyclerview_menus_option is invalid. Received: " + tag);
            case 95:
                if ("layout/regular_history_design_0".equals(tag)) {
                    return new RegularHistoryDesignBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for regular_history_design is invalid. Received: " + tag);
            case 96:
                if ("layout/result_drop_down_layout_0".equals(tag)) {
                    return new ResultDropDownLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for result_drop_down_layout is invalid. Received: " + tag);
            case 97:
                if ("layout/send_payout_design_0".equals(tag)) {
                    return new SendPayoutDesignBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for send_payout_design is invalid. Received: " + tag);
            case 98:
                if ("layout/t_pin_layout_0".equals(tag)) {
                    return new TPinLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for t_pin_layout is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
        int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
        if (localizedLayoutId <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch ((localizedLayoutId - 1) / 50) {
                case 0:
                    return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
                case 1:
                    return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
                default:
                    return null;
            }
        } else {
            throw new RuntimeException("view must have a tag");
        }
    }

    public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
        if (views == null || views.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId) <= 0 || views[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int getLayoutId(String tag) {
        Integer tmpVal;
        if (tag == null || (tmpVal = InnerLayoutIdLookup.sKeys.get(tag)) == null) {
            return 0;
        }
        return tmpVal.intValue();
    }

    public String convertBrIdToString(int localId) {
        return InnerBrLookup.sKeys.get(localId);
    }

    public List<DataBinderMapper> collectDependencies() {
        ArrayList<DataBinderMapper> result = new ArrayList<>(2);
        result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        result.add(new paytm.assist.easypay.easypay.appinvoke.DataBinderMapperImpl());
        return result;
    }

    private static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        private InnerBrLookup() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(58);
            sKeys = sparseArray;
            sparseArray.put(1, "MyBankViewModel");
            sparseArray.put(0, "_all");
            sparseArray.put(2, "aeps_home_view_model");
            sparseArray.put(3, "analyticDataModel");
            sparseArray.put(4, "analyticsViewModel");
            sparseArray.put(5, "balanceEnquiryViewModel");
            sparseArray.put(6, "bankDetailsViewModel");
            sparseArray.put(7, "bankListModel");
            sparseArray.put(8, "bankModel");
            sparseArray.put(9, "beneficiaryModel");
            sparseArray.put(10, "beneficiaryViewModel");
            sparseArray.put(11, "cashWithdrawalViewModel");
            sparseArray.put(12, "circleModel");
            sparseArray.put(13, "creationViewModel");
            sparseArray.put(14, "customerInfoModel");
            sparseArray.put(15, "depositViewModel");
            sparseArray.put(16, "directToHomeViewModel");
            sparseArray.put(17, "dmtUserData");
            sparseArray.put(18, "fetchBillResponse");
            sparseArray.put(19, "fundViewModel");
            sparseArray.put(20, "histData");
            sparseArray.put(21, "historyModelResponse");
            sparseArray.put(22, "historyViewModel");
            sparseArray.put(23, "homeViewModel");
            sparseArray.put(24, "microAtmData");
            sparseArray.put(25, "minSatementModel");
            sparseArray.put(26, "miniStatementViewModel");
            sparseArray.put(27, "mobileNumbersViewModel");
            sparseArray.put(28, "models");
            sparseArray.put(29, "myContactList");
            sparseArray.put(30, "myHistoryModel");
            sparseArray.put(31, "myMenus");
            sparseArray.put(32, "myRechargeViewModelForBbps");
            sparseArray.put(33, "myviewmodel");
            sparseArray.put(34, "nameNumber");
            sparseArray.put(35, "operatorModel");
            sparseArray.put(36, "pBemeModel");
            sparseArray.put(37, "paySprintList");
            sparseArray.put(38, "payoutViewModel");
            sparseArray.put(39, "profileDetailsModel");
            sparseArray.put(40, "profileViewModel");
            sparseArray.put(41, "queueryRemitter");
            sparseArray.put(42, "rOfferDataModel");
            sparseArray.put(43, "rOfferViewModel");
            sparseArray.put(44, "rechargeViewModel");
            sparseArray.put(45, "registerRemitter");
            sparseArray.put(46, "regularDetailModel");
            sparseArray.put(47, "selectOperatorViewModel");
            sparseArray.put(48, "selectedBeneficiaryViewModel");
            sparseArray.put(49, "sendAmountViewModel");
            sparseArray.put(50, "sendMoneyViewModel");
            sparseArray.put(51, "sliderItem");
            sparseArray.put(52, "toBankViewModel");
            sparseArray.put(53, "userDataModel");
            sparseArray.put(54, "userModel");
            sparseArray.put(55, "userProfile");
            sparseArray.put(56, "userProfileModel");
            sparseArray.put(57, "wholeInfoModel");
        }
    }

    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        private InnerLayoutIdLookup() {
        }

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(98);
            sKeys = hashMap;
            hashMap.put("layout/activity_add_beneficiary_0", Integer.valueOf(C0330R.layout.activity_add_beneficiary));
            hashMap.put("layout/activity_add_fund_list_0", Integer.valueOf(C0330R.layout.activity_add_fund_list));
            hashMap.put("layout/activity_add_pdmtbeneficiary_0", Integer.valueOf(C0330R.layout.activity_add_pdmtbeneficiary));
            hashMap.put("layout/activity_ae_psresponse_screen_success_0", Integer.valueOf(C0330R.layout.activity_ae_psresponse_screen_success));
            hashMap.put("layout/activity_ae_pssuccess_mini_statement_response_0", Integer.valueOf(C0330R.layout.activity_ae_pssuccess_mini_statement_response));
            hashMap.put("layout/activity_aeps_detailed_analytic_0", Integer.valueOf(C0330R.layout.activity_aeps_detailed_analytic));
            hashMap.put("layout/activity_aeps_failure_reponse_screen_0", Integer.valueOf(C0330R.layout.activity_aeps_failure_reponse_screen));
            hashMap.put("layout/activity_aeps_home_0", Integer.valueOf(C0330R.layout.activity_aeps_home));
            hashMap.put("layout/activity_balance_enquiry_0", Integer.valueOf(C0330R.layout.activity_balance_enquiry));
            hashMap.put("layout/activity_bank_details_0", Integer.valueOf(C0330R.layout.activity_bank_details));
            hashMap.put("layout/activity_bbps_enter_0", Integer.valueOf(C0330R.layout.activity_bbps_enter));
            hashMap.put("layout/activity_bbps_recharge_0", Integer.valueOf(C0330R.layout.activity_bbps_recharge));
            hashMap.put("layout/activity_bbpsdetailed_analytic_0", Integer.valueOf(C0330R.layout.activity_bbpsdetailed_analytic));
            hashMap.put("layout/activity_cash_deposit_0", Integer.valueOf(C0330R.layout.activity_cash_deposit));
            hashMap.put("layout/activity_cash_withdrawal_0", Integer.valueOf(C0330R.layout.activity_cash_withdrawal));
            hashMap.put("layout/activity_creation_0", Integer.valueOf(C0330R.layout.activity_creation));
            hashMap.put("layout/activity_customer_info_0", Integer.valueOf(C0330R.layout.activity_customer_info));
            hashMap.put("layout/activity_detailed_history_screen_0", Integer.valueOf(C0330R.layout.activity_detailed_history_screen));
            hashMap.put("layout/activity_dmtdetaited_analytic_0", Integer.valueOf(C0330R.layout.activity_dmtdetaited_analytic));
            hashMap.put("layout/activity_dmthome_0", Integer.valueOf(C0330R.layout.activity_dmthome));
            hashMap.put("layout/activity_fund_detailed_analytic_0", Integer.valueOf(C0330R.layout.activity_fund_detailed_analytic));
            hashMap.put("layout/activity_fund_exchange_0", Integer.valueOf(C0330R.layout.activity_fund_exchange));
            hashMap.put("layout/activity_home_0", Integer.valueOf(C0330R.layout.activity_home));
            hashMap.put("layout/activity_main_0", Integer.valueOf(C0330R.layout.activity_main));
            hashMap.put("layout/activity_micro_atm_detailed_analytic_0", Integer.valueOf(C0330R.layout.activity_micro_atm_detailed_analytic));
            hashMap.put("layout/activity_micro_atm_home_0", Integer.valueOf(C0330R.layout.activity_micro_atm_home));
            hashMap.put("layout/activity_micro_atm_response_0", Integer.valueOf(C0330R.layout.activity_micro_atm_response));
            hashMap.put("layout/activity_mini_statement_0", Integer.valueOf(C0330R.layout.activity_mini_statement));
            hashMap.put("layout/activity_mini_statement_analytic_0", Integer.valueOf(C0330R.layout.activity_mini_statement_analytic));
            hashMap.put("layout/activity_mobile_number_home_page_0", Integer.valueOf(C0330R.layout.activity_mobile_number_home_page));
            hashMap.put("layout/activity_mobile_recharge_0", Integer.valueOf(C0330R.layout.activity_mobile_recharge));
            hashMap.put("layout/activity_pay_0", Integer.valueOf(C0330R.layout.activity_pay));
            hashMap.put("layout/activity_pay_tm_payouts_0", Integer.valueOf(C0330R.layout.activity_pay_tm_payouts));
            hashMap.put("layout/activity_pay_with_pay_tm_0", Integer.valueOf(C0330R.layout.activity_pay_with_pay_tm));
            hashMap.put("layout/activity_payout_add_account_0", Integer.valueOf(C0330R.layout.activity_payout_add_account));
            hashMap.put("layout/activity_payout_detailed_analytic_0", Integer.valueOf(C0330R.layout.activity_payout_detailed_analytic));
            hashMap.put("layout/activity_payout_home_0", Integer.valueOf(C0330R.layout.activity_payout_home));
            hashMap.put("layout/activity_payouts_0", Integer.valueOf(C0330R.layout.activity_payouts));
            hashMap.put("layout/activity_paysprint_payout_0", Integer.valueOf(C0330R.layout.activity_paysprint_payout));
            hashMap.put("layout/activity_profile_0", Integer.valueOf(C0330R.layout.activity_profile));
            hashMap.put("layout/activity_profile_details_0", Integer.valueOf(C0330R.layout.activity_profile_details));
            hashMap.put("layout/activity_queuery_remitter_0", Integer.valueOf(C0330R.layout.activity_queuery_remitter));
            hashMap.put("layout/activity_recharge_detailed_analytic_0", Integer.valueOf(C0330R.layout.activity_recharge_detailed_analytic));
            hashMap.put("layout/activity_recharge_my_plan_0", Integer.valueOf(C0330R.layout.activity_recharge_my_plan));
            hashMap.put("layout/activity_register_remitter_0", Integer.valueOf(C0330R.layout.activity_register_remitter));
            hashMap.put("layout/activity_regular_history_0", Integer.valueOf(C0330R.layout.activity_regular_history));
            hashMap.put("layout/activity_request_offline_0", Integer.valueOf(C0330R.layout.activity_request_offline));
            hashMap.put("layout/activity_roffer_0", Integer.valueOf(C0330R.layout.activity_roffer));
            hashMap.put("layout/activity_select_bank_0", Integer.valueOf(C0330R.layout.activity_select_bank));
            hashMap.put("layout/activity_select_operator_0", Integer.valueOf(C0330R.layout.activity_select_operator));
            hashMap.put("layout/activity_selected_benefeciary_history_0", Integer.valueOf(C0330R.layout.activity_selected_benefeciary_history));
            hashMap.put("layout/activity_send_amount_dmt_0", Integer.valueOf(C0330R.layout.activity_send_amount_dmt));
            hashMap.put("layout/activity_send_money_0", Integer.valueOf(C0330R.layout.activity_send_money));
            hashMap.put("layout/activity_send_payout_0", Integer.valueOf(C0330R.layout.activity_send_payout));
            hashMap.put("layout/activity_settings_0", Integer.valueOf(C0330R.layout.activity_settings));
            hashMap.put("layout/activity_social_media_0", Integer.valueOf(C0330R.layout.activity_social_media));
            hashMap.put("layout/activity_to_account_0", Integer.valueOf(C0330R.layout.activity_to_account));
            hashMap.put("layout/activity_verify_accounts_0", Integer.valueOf(C0330R.layout.activity_verify_accounts));
            hashMap.put("layout/aeps_bank_list_layout_0", Integer.valueOf(C0330R.layout.aeps_bank_list_layout));
            hashMap.put("layout/analytic_design_layout_0", Integer.valueOf(C0330R.layout.analytic_design_layout));
            hashMap.put("layout/bank_list_layout_0", Integer.valueOf(C0330R.layout.bank_list_layout));
            hashMap.put("layout/beneficiary_history_layout_0", Integer.valueOf(C0330R.layout.beneficiary_history_layout));
            hashMap.put("layout/beneficiary_list_layout_0", Integer.valueOf(C0330R.layout.beneficiary_list_layout));
            hashMap.put("layout/bottom_beneficiary_more_sheet_0", Integer.valueOf(C0330R.layout.bottom_beneficiary_more_sheet));
            hashMap.put("layout/bottom_sheet_transaction_type_0", Integer.valueOf(C0330R.layout.bottom_sheet_transaction_type));
            hashMap.put("layout/circle_list_layout_0", Integer.valueOf(C0330R.layout.circle_list_layout));
            hashMap.put("layout/circle_sheet_background_0", Integer.valueOf(C0330R.layout.circle_sheet_background));
            hashMap.put("layout/contact_list_layout_0", Integer.valueOf(C0330R.layout.contact_list_layout));
            hashMap.put("layout/custom_alert_dialog_0", Integer.valueOf(C0330R.layout.custom_alert_dialog));
            hashMap.put("layout/custom_toolbar_0", Integer.valueOf(C0330R.layout.custom_toolbar));
            hashMap.put("layout/dmt_histroy_toolbar_0", Integer.valueOf(C0330R.layout.dmt_histroy_toolbar));
            hashMap.put("layout/dmt_user_layout_0", Integer.valueOf(C0330R.layout.dmt_user_layout));
            hashMap.put("layout/fragment_analytic_0", Integer.valueOf(C0330R.layout.fragment_analytic));
            hashMap.put("layout/fragment_change_password_0", Integer.valueOf(C0330R.layout.fragment_change_password));
            hashMap.put("layout/fragment_forgot_password_0", Integer.valueOf(C0330R.layout.fragment_forgot_password));
            hashMap.put("layout/fragment_history_0", Integer.valueOf(C0330R.layout.fragment_history));
            hashMap.put("layout/fragment_home_menu_fragments_0", Integer.valueOf(C0330R.layout.fragment_home_menu_fragments));
            hashMap.put("layout/fragment_otp_0", Integer.valueOf(C0330R.layout.fragment_otp));
            hashMap.put("layout/fragment_sign_in_0", Integer.valueOf(C0330R.layout.fragment_sign_in));
            hashMap.put("layout/fragment_sign_up_0", Integer.valueOf(C0330R.layout.fragment_sign_up));
            hashMap.put("layout/fragment_slider_0", Integer.valueOf(C0330R.layout.fragment_slider));
            hashMap.put("layout/history_list_layout_0", Integer.valueOf(C0330R.layout.history_list_layout));
            hashMap.put("layout/item_container_slider_image_0", Integer.valueOf(C0330R.layout.item_container_slider_image));
            hashMap.put("layout/mini_statement_layout_0", Integer.valueOf(C0330R.layout.mini_statement_layout));
            hashMap.put("layout/my_recycler_spinner_0", Integer.valueOf(C0330R.layout.my_recycler_spinner));
            hashMap.put("layout/operator_list_layout_0", Integer.valueOf(C0330R.layout.operator_list_layout));
            hashMap.put("layout/operator_sheet_background_0", Integer.valueOf(C0330R.layout.operator_sheet_background));
            hashMap.put("layout/otp_screen_layout_0", Integer.valueOf(C0330R.layout.otp_screen_layout));
            hashMap.put("layout/payout_beneficiary_card_0", Integer.valueOf(C0330R.layout.payout_beneficiary_card));
            hashMap.put("layout/payout_list_layout_0", Integer.valueOf(C0330R.layout.payout_list_layout));
            hashMap.put("layout/profile_edit_layout_0", Integer.valueOf(C0330R.layout.profile_edit_layout));
            hashMap.put("layout/profile_top_toolbar_0", Integer.valueOf(C0330R.layout.profile_top_toolbar));
            hashMap.put("layout/r_offer_layout_0", Integer.valueOf(C0330R.layout.r_offer_layout));
            hashMap.put("layout/recyclerview_menus_option_0", Integer.valueOf(C0330R.layout.recyclerview_menus_option));
            hashMap.put("layout/regular_history_design_0", Integer.valueOf(C0330R.layout.regular_history_design));
            hashMap.put("layout/result_drop_down_layout_0", Integer.valueOf(C0330R.layout.result_drop_down_layout));
            hashMap.put("layout/send_payout_design_0", Integer.valueOf(C0330R.layout.send_payout_design));
            hashMap.put("layout/t_pin_layout_0", Integer.valueOf(C0330R.layout.t_pin_layout));
        }
    }
}
