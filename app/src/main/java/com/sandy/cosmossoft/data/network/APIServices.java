package com.sandy.cosmossoft.data.network;

import com.sandy.cosmossoft.data.model.AEPSBanksModel;
import com.sandy.cosmossoft.data.model.BankModel;
import com.sandy.cosmossoft.data.model.HistoryModel;
import com.sandy.cosmossoft.data.model.OperatorModel;
import com.sandy.cosmossoft.data.model.SliderItem;
import com.sandy.cosmossoft.data.network.bbp_send_response.BBPSSendResponse;
import com.sandy.cosmossoft.data.network.responses.AddBeneficiaryResponse;
import com.sandy.cosmossoft.data.network.responses.AePSBalanceEnquiryResponse;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.network.responses.BBPSPaymentResponse;
import com.sandy.cosmossoft.data.network.responses.BeneHistoryUpdateResponse;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryBank;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryDeleteResponse;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryHistoryResponse;
import com.sandy.cosmossoft.data.network.responses.ConfirmationResponse;
import com.sandy.cosmossoft.data.network.responses.CustomerInfoResponse;
import com.sandy.cosmossoft.data.network.responses.DMTSendAmountResponse;
import com.sandy.cosmossoft.data.network.responses.DetailResponse;
import com.sandy.cosmossoft.data.network.responses.DetailedHistoryResponse;
import com.sandy.cosmossoft.data.network.responses.DmtUserData;
import com.sandy.cosmossoft.data.network.responses.FetchBillInfo;
import com.sandy.cosmossoft.data.network.responses.GatewayResponse;
import com.sandy.cosmossoft.data.network.responses.MiniStatementResponse;
import com.sandy.cosmossoft.data.network.responses.MyOfferResponse;
import com.sandy.cosmossoft.data.network.responses.My_Token_Res;
import com.sandy.cosmossoft.data.network.responses.NumberPayResponse;
import com.sandy.cosmossoft.data.network.responses.OnlineFundResponse;
import com.sandy.cosmossoft.data.network.responses.PBeneficiaryResponse;
import com.sandy.cosmossoft.data.network.responses.PaySprintMerchant;
import com.sandy.cosmossoft.data.network.responses.PaymentResponse;
import com.sandy.cosmossoft.data.network.responses.PayoutAddResponse;
import com.sandy.cosmossoft.data.network.responses.PayoutListResponse;
import com.sandy.cosmossoft.data.network.responses.PayoutResponse;
import com.sandy.cosmossoft.data.network.responses.QueryRemitterResponse;
import com.sandy.cosmossoft.data.network.responses.RegisterRemitterResponse;
import com.sandy.cosmossoft.data.network.responses.RegularHistoryResponse;
import com.sandy.cosmossoft.data.network.responses.RegularResponse;
import com.sandy.cosmossoft.data.network.responses.UserTypeResponse;
import com.sandy.cosmossoft.data.p000db.entities.PaySprintApi;
import java.util.ArrayList;
import java.util.List;
import p006io.reactivex.rxjava3.core.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIServices {
    @FormUrlEncoded
    @POST("aeps/request.php")
    Observable<AePSBalanceEnquiryResponse> AEPSResponse(@Field("userTypeId") String str, @Field("id") String str2, @Field("aadhar") String str3, @Field("fingerData") String str4, @Field("mobile") String str5, @Field("transType") String str6, @Field("bankName") String str7, @Field("long") String str8, @Field("lat") String str9, @Field("amount") String str10, @Field("ipaddress") String str11, @Field("device") String str12);

    @FormUrlEncoded
    @POST("t_pin/tpin_check.php")
    Observable<RegularResponse> TpinSecuritySystem(@Field("user_id") String str, @Field("password") String str2, @Field("token") String str3);

    @FormUrlEncoded
    @POST("paytm_as_dmt/add_beneficiary_pdmt.php")
    Observable<RegularResponse> addPDmtBeneficiary(@Field("user_id") String str, @Field("password") String str2, @Field("token") String str3, @Field("acc") String str4, @Field("ifsc") String str5, @Field("holder_name") String str6);

    @FormUrlEncoded
    @POST("creation/user_types.php")
    Observable<UserTypeResponse> bringAllSuitableUserType(@Field("id") String str, @Field("userType") String str2);

    @FormUrlEncoded
    @POST("dmt/fetch_beneficiary.php")
    Observable<List<BeneficiaryBank>> bringBeneficiary(@Field("mobile") String str, @Field("id") String str2, @Field("usertype") String str3);

    @FormUrlEncoded
    @POST("credit_card/main.php")
    Observable<RegularResponse> ccForRefund(@Field("user_id") String str, @Field("token") String str2, @Field("refrence") String str3, @Field("otp") String str4, @Field("refundTxn") String str5);

    @FormUrlEncoded
    @POST("update_details/update_data.php")
    Observable<ConfirmationResponse> changeMyPassword(@Field("id") String str, @Field("user_type_id") String str2, @Field("password") String str3, @Field("token") String str4, @Field("mobile") String str5, @Field("update_my_password") String str6, @Field("new_password") String str7);

    @FormUrlEncoded
    @POST("signpage/change_password.php")
    Observable<RegularResponse> changeMyPasswordStart(@Field("mobile") String str, @Field("otp") String str2, @Field("password") String str3);

    @FormUrlEncoded
    @POST("dmt/register_user.php")
    Observable<BeneficiaryDeleteResponse> deleteBeneficiary(@Field("id") String str, @Field("usertype_id") String str2, @Field("bene_id") String str3, @Field("bene_acc") String str4, @Field("bene_delete") String str5, @Field("dmt_mobile") String str6);

    @FormUrlEncoded
    @POST("dmt/delete_dmt_user.php")
    Observable<Integer> deleteDmtUserAccount(@Field("id") String str);

    @FormUrlEncoded
    @POST("paytm_as_dmt/delete_beneficiary_pdmt.php")
    Observable<RegularResponse> deletePDmtBeneficiary(@Field("user_id") String str, @Field("password") String str2, @Field("token") String str3, @Field("given_id") String str4);

    @FormUrlEncoded
    @POST("add_fund/exchange_fund.php")
    Observable<AuthResponse> exchangeWallet(@Field("mobile") String str, @Field("password") String str2, @Field("token") String str3, @Field("amount") String str4);

    @FormUrlEncoded
    @POST("bbps/fetchDetails.php")
    Observable<FetchBillInfo> fetchMyBillsForBBPS(@Field("serviceType") String str, @Field("op") String str2, @Field("num") String str3);

    @FormUrlEncoded
    @POST("signpage/forgot_password.php")
    Observable<RegularResponse> forgotMyPassword(@Field("mobile") String str);

    @FormUrlEncoded
    @POST("paytm_payment/Paytm.php")
    Observable<My_Token_Res> generateTokenCall(@Field("code") String str, @Field("ORDER_ID") String str2, @Field("AMOUNT") String str3);

    @FormUrlEncoded
    @POST("histories/analytic_hist.php")
    Observable<List<AnalyticsResponseModel>> getAllAnalytics(@Field("user_id") String str, @Field("user_type_id") String str2, @Field("indexing") String str3, @Field("fromDate") String str4, @Field("toDate") String str5, @Field("transType") String str6, @Field("result") String str7, @Field("id") String str8);

    @POST("banklists/banks.php")
    Observable<ArrayList<BankModel>> getAllBanks();

    @FormUrlEncoded
    @POST("dmt/all_history.php")
    Observable<List<BeneficiaryHistoryResponse>> getAllBeneficiaryHistories(@Field("id") String str, @Field("usertype_id") String str2, @Field("dmt_mobile") String str3);

    @FormUrlEncoded
    @POST("dmt/my_created_dmt.php")
    Observable<List<DmtUserData>> getAllDMTUsers(@Field("id") String str, @Field("user_type") String str2);

    @FormUrlEncoded
    @POST("aeps/get_my_banks.php")
    Observable<List<AEPSBanksModel>> getBankList(@Field("id") String str);

    @FormUrlEncoded
    @POST("recharge/roffer.php")
    Observable<CustomerInfoResponse> getDthCustomerInfo(@Field("op") String str, @Field("num") String str2, @Field("user_id") String str3, @Field("password") String str4, @Field("dth_customer_info") String str5);

    @FormUrlEncoded
    @POST("histories/default_history.php")
    Observable<List<HistoryModel>> getHistory(@Field("user_id") String str, @Field("user_type_id") String str2, @Field("indexing") String str3, @Field("fromDate") String str4, @Field("toDate") String str5, @Field("transType") String str6, @Field("result") String str7, @Field("id") String str8);

    @FormUrlEncoded
    @POST("banner/slider_images.php")
    Observable<List<SliderItem>> getMeBanners(@Field("user_type") String str);

    @FormUrlEncoded
    @POST("recharge/roffer.php")
    Observable<MyOfferResponse> getMeDthROffers(@Field("op") String str, @Field("num") String str2, @Field("user_id") String str3, @Field("password") String str4, @Field("dth_browse_plan") String str5);

    @FormUrlEncoded
    @POST("banner/new_alert.php")
    Observable<String> getMeLatestNews(@Field("user_type") String str);

    @FormUrlEncoded
    @POST("recharge/roffer.php")
    Observable<MyOfferResponse> getMeROffers(@Field("op") String str, @Field("num") String str2, @Field("user_id") String str3, @Field("password") String str4, @Field("mobile_r") String str5);

    @FormUrlEncoded
    @POST("histories/complete_hist_detail.php")
    Observable<DetailedHistoryResponse> getMyAnalyticDetailed(@Field("report_id") String str, @Field("user_id") String str2);

    @FormUrlEncoded
    @POST("operators/operatorlist.php")
    Observable<List<OperatorModel>> getOperatorsList(@Field("operator") String str);

    @FormUrlEncoded
    @POST("paytm_as_dmt/get_beneficiary_pdmt.php")
    Observable<PBeneficiaryResponse> getPDmtBeneficiary(@Field("user_id") String str, @Field("password") String str2, @Field("token") String str3);

    @FormUrlEncoded
    @POST("paysprintapp/access.php")
    Observable<PaySprintApi> getPaySprintApi(@Field("check") String str);

    @FormUrlEncoded
    @POST("gateway_data/payment_gateway.php")
    Observable<GatewayResponse> getPaymentCredentials(@Field("gateway") String str);

    @FormUrlEncoded
    @POST("usual_history/get_history.php")
    Observable<RegularHistoryResponse> getRegularHistoryResp(@Field("user_id") String str, @Field("token") String str2, @Field("history") String str3);

    @FormUrlEncoded
    @POST("usual_history/get_history.php")
    Observable<RegularResponse> getRegularHistoryStatus(@Field("user_id") String str, @Field("token") String str2, @Field("historystatus") String str3, @Field("reference") String str4, @Field("device") String str5, @Field("ip") String str6);

    @FormUrlEncoded
    @POST("dmt/selected_history.php")
    Observable<List<BeneficiaryHistoryResponse>> getSelectedBeneficiaryHistory(@Field("id") String str, @Field("usertype_id") String str2, @Field("bene_id") String str3);

    @FormUrlEncoded
    @POST("dmt/test_penny_drop.php")
    Observable<RegularResponse> getThePennyDrop(@Field("dmt_mobile") String str, @Field("acc") String str2, @Field("user_id") String str3);

    @FormUrlEncoded
    @POST("status/update.php")
    Observable<RegularResponse> getUpdatesOnTransaction(@Field("transactionType") String str, @Field("reference_id") String str2);

    @FormUrlEncoded
    @POST("signpage/user_profile.php")
    Observable<DetailResponse> getUserProfileData(@Field("mobile") String str, @Field("password") String str2);

    @FormUrlEncoded
    @POST("signpage/user.php")
    Observable<AuthResponse> getUserSignIn(@Field("mobile") String str, @Field("password") String str2);

    @FormUrlEncoded
    @POST("signpage/user.php")
    Observable<AuthResponse> getuserLoginwithotp(@Field("mobile") String str, @Field("otp") String str2, @Field("password") String str3);

    @FormUrlEncoded
    @POST("micro_atm/atm_services.php")
    Observable<String> insertReportForMicroAtm(@Field("message") String str, @Field("response") String str2, @Field("transAmount") String str3, @Field("balAmount") String str4, @Field("bankRrn") String str5, @Field("txnid") String str6, @Field("transType") String str7, @Field("type") String str8, @Field("cardNumber") String str9, @Field("cardType") String str10, @Field("terminalId") String str11, @Field("bankName") String str12, @Field("user_id") String str13, @Field("user_status") String str14, @Field("reference") String str15, @Field("boolstatus") String str16);

    @FormUrlEncoded
    @POST("dmt/dmt_existence.php")
    Observable<Integer> isThereAnyDMT(@Field("id") String str, @Field("usertype_id") String str2);

    @FormUrlEncoded
    @POST("on_boarding/isValid.php")
    Observable<PaySprintMerchant> isValidAccount(@Field("mobile") String str);

    @FormUrlEncoded
    @POST("recharge/recharge.php")
    Observable<PaymentResponse> makeThePayment(@Field("id") String str, @Field("recharge_mobile") String str2, @Field("usertypeid") String str3, @Field("recharge_amount") String str4, @Field("recharge_operator") String str5, @Field("ipaddress") String str6, @Field("mobile") String str7);

    @FormUrlEncoded
    @POST("mobile_number_pay/is_number_valid.php")
    Observable<AuthResponse> numberAuthenticate(@Field("mobile") String str);

    @FormUrlEncoded
    @POST("mobile_number_pay/pay_onthis.php")
    Observable<NumberPayResponse> numberAuthenticatePay(@Field("to_mobile") String str, @Field("id") String str2, @Field("user_type") String str3, @Field("token") String str4, @Field("password") String str5, @Field("ip") String str6, @Field("device") String str7, @Field("amount") String str8);

    @FormUrlEncoded
    @POST("add_fund/offline_fund.php")
    Observable<RegularResponse> offlineWalletDemand(@Field("mobile") String str, @Field("password") String str2, @Field("token") String str3, @Field("amount") String str4, @Field("payment_mode") String str5, @Field("transaction_id") String str6, @Field("remarks") String str7, @Field("receipt") String str8);

    @FormUrlEncoded
    @POST("on_boarding/my_onbarding.php")
    Observable<String> onSuccessOnBoarding(@Field("mobile") String str, @Field("owner") String str2, @Field("owner_id") String str3, @Field("partner_id") String str4, @Field("merchant_code") String str5, @Field("code") String str6);

    @FormUrlEncoded
    @POST("add_fund/add_fund_online.php")
    Observable<OnlineFundResponse> onlineAddFundProcess(@Field("online_fund") String str, @Field("order_id") String str2, @Field("mobile") String str3, @Field("password") String str4, @Field("amount") String str5, @Field("status") String str6, @Field("device") String str7, @Field("ip_address") String str8);

    @POST("bbps/bill_pay.php")
    Observable<BBPSPaymentResponse> payMyBBPSBill(@Body BBPSSendResponse bBPSSendResponse);

    @FormUrlEncoded
    @POST("paysprintpayout/payout_main.php")
    Observable<PayoutAddResponse> paySprintPayoutAddAccount(@Field("user_id") String str, @Field("token") String str2, @Field("bank_id") String str3, @Field("acc") String str4, @Field("ifsc") String str5, @Field("name") String str6, @Field("bank_name") String str7, @Field("add_acc") String str8);

    @FormUrlEncoded
    @POST("paysprintpayout/payout_main.php")
    Observable<PayoutListResponse> paySprintPayoutList(@Field("user_id") String str, @Field("token") String str2, @Field("list") String str3);

    @FormUrlEncoded
    @POST("paytm/paytm.php")
    Observable<PayoutResponse> payThroughPayouts(@Field("amount") String str, @Field("bank") String str2, @Field("ifsc") String str3, @Field("trans") String str4, @Field("id") String str5, @Field("usertype_id") String str6, @Field("ip_address") String str7, @Field("device") String str8);

    @FormUrlEncoded
    @POST("paytm/paytm_payout.php")
    Observable<PayoutResponse> payThroughPayoutsPayTm(@Field("amount") String str, @Field("bank") String str2, @Field("ifsc") String str3, @Field("trans") String str4, @Field("id") String str5, @Field("usertype_id") String str6, @Field("ip_address") String str7, @Field("device") String str8);

    @FormUrlEncoded
    @POST("dmt/register_user.php")
    Observable<QueryRemitterResponse> queryRemitter(@Field("id") String str, @Field("usertype_id") String str2, @Field("pin_code") String str3, @Field("MOBILE") String str4, @Field("dob") String str5, @Field("send_otp") String str6);

    @FormUrlEncoded
    @POST("signpage/re_authenticate.php")
    Observable<AuthResponse> reAuthenticateUser(@Field("mobile") String str, @Field("password") String str2, @Field("token_id") String str3);

    @FormUrlEncoded
    @POST("dmt/refreshDmtUserAccount.php")
    Observable<QueryRemitterResponse> refreshDmtUserAccount(@Field("id") String str, @Field("mobile") String str2);

    @FormUrlEncoded
    @POST("dmt/send_otp_refund.php")
    Observable<RegularResponse> refundDmtTransaction(@Field("ackno") String str, @Field("refrence") String str2);

    @FormUrlEncoded
    @POST("dmt/register_user.php")
    Observable<AddBeneficiaryResponse> registerBeneficiary(@Field("id") String str, @Field("usertype_id") String str2, @Field("nick_name") String str3, @Field("op_mobile") String str4, @Field("bene_name") String str5, @Field("bene_acc") String str6, @Field("bene_ifsc") String str7, @Field("bene_bank") String str8, @Field("dob") String str9, @Field("address") String str10, @Field("pin") String str11, @Field("dmt_mobile") String str12);

    @FormUrlEncoded
    @POST("dmt/register_user.php")
    Observable<RegisterRemitterResponse> registerRemitter(@Field("id") String str, @Field("usertype_id") String str2, @Field("otp") String str3, @Field("dob") String str4, @Field("str") String str5, @Field("pin_code") String str6, @Field("remitter_first_name") String str7, @Field("remitter_last_name") String str8, @Field("remitter_mobile") String str9, @Field("remitter_address") String str10);

    @FormUrlEncoded
    @POST("credit_card/main.php")
    Observable<RegularResponse> resendOtpForRefund(@Field("user_id") String str, @Field("token") String str2, @Field("refrence") String str3, @Field("resend_otp") String str4);

    @FormUrlEncoded
    @POST("dmt/register_user.php")
    Observable<DMTSendAmountResponse> sendAmountDMT(@Field("id") String str, @Field("usertype_id") String str2, @Field("bene_id") String str3, @Field("send_amount") String str4, @Field("send_am_acc") String str5, @Field("txn_type") String str6, @Field("device") String str7, @Field("ip") String str8, @Field("ifsc") String str9, @Field("dmt_mobile") String str10);

    @FormUrlEncoded
    @POST("paysprintpayout/payout_main.php")
    Observable<RegularResponse> sendMoneyOnPayAmount(@Field("user_id") String str, @Field("token") String str2, @Field("bene_id") String str3, @Field("amount") String str4, @Field("mode") String str5, @Field("ip") String str6, @Field("device") String str7, @Field("do_transaction") String str8);

    @FormUrlEncoded
    @POST("registerpage/send_otp.php")
    Observable<RegularResponse> sendSignupOTP(@Field("mobile") String str, @Field("email") String str2);

    @FormUrlEncoded
    @POST("aeps/request.php")
    Observable<MiniStatementResponse> startAepsResponseMiniStatement(@Field("userTypeId") String str, @Field("id") String str2, @Field("aadhar") String str3, @Field("fingerData") String str4, @Field("mobile") String str5, @Field("transType") String str6, @Field("bankName") String str7, @Field("long") String str8, @Field("lat") String str9, @Field("amount") String str10, @Field("ipaddress") String str11, @Field("device") String str12);

    @FormUrlEncoded
    @POST("dmt/register_user.php")
    Observable<BeneHistoryUpdateResponse> updateDMTTransaction(@Field("ref_id") String str, @Field("check_dmt_status") String str2);

    @FormUrlEncoded
    @POST("update_details/update_data.php")
    Observable<ConfirmationResponse> updateMyInformation(@Field("id") String str, @Field("user_type_id") String str2, @Field("password") String str3, @Field("f_name") String str4, @Field("l_name") String str5, @Field("a_number") String str6, @Field("dob") String str7, @Field("gender") String str8, @Field("country") String str9, @Field("state") String str10, @Field("pin") String str11, @Field("address") String str12, @Field("token") String str13, @Field("mobile") String str14, @Field("update_profile_details") String str15);

    @FormUrlEncoded
    @POST("update_details/update_data.php")
    Observable<ConfirmationResponse> updateMySocialMedia(@Field("id") String str, @Field("user_type_id") String str2, @Field("password") String str3, @Field("token") String str4, @Field("mobile") String str5, @Field("update_social_media") String str6, @Field("facebook_url") String str7, @Field("twitter_url") String str8, @Field("linkedin_url") String str9, @Field("instagram_url") String str10, @Field("dribble_box_url") String str11, @Field("dropbox_url") String str12, @Field("google_plus") String str13, @Field("pintrest") String str14, @Field("skype_url") String str15, @Field("vine_url") String str16);

    @FormUrlEncoded
    @POST("update_details/update_data.php")
    Observable<RegularResponse> updateProfilePicture(@Field("profile_picture") String str, @Field("id") String str2, @Field("password") String str3, @Field("token") String str4);

    @FormUrlEncoded
    @POST("registerpage/register.php")
    Call<String> userSignup(@Field("fname") String str, @Field("lname") String str2, @Field("mobile") String str3, @Field("email") String str4, @Field("password") String str5);

    @FormUrlEncoded
    @POST("dmt/verify_otp_refund.php")
    Observable<RegularResponse> verifyDmtTransaction(@Field("ackno") String str, @Field("refrence") String str2, @Field("otp") String str3);

    @FormUrlEncoded
    @POST("paysprintpayout/payout_main.php")
    Observable<RegularResponse> verifyPayoutAccount(@Field("user_id") String str, @Field("token") String str2, @Field("pan") String str3, @Field("front_aadhaar") String str4, @Field("back_aadhaar") String str5, @Field("passbook") String str6, @Field("doc_type") String str7, @Field("row_id") String str8, @Field("bene_id") String str9, @Field("verification") String str10);
}
