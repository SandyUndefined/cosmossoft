package com.sandy.cosmossoft.data.p000db.entities;

/* renamed from: com.sandy.cosmossoft.data.db.entities.UserProfile */
public class UserProfile {
    public String AADHAR_CARD_NO;
    public String AC_HOLDER_NAME;
    public String AC_NUM;
    public String ALTERNATE_PHONE_NO;
    public String BANK;
    public String B_NAME;
    public String COUNTRY;
    public int CURRENT_USER_ID = 0;
    public String DATE;
    public String DOB;
    public String DRIBBLE_BOX_URL;
    public String DROPBOX_URL;
    public String FACEBOOK_URL;
    public String GENDER;
    public String GOOGLE_PLUS_URL;
    public String IFSC_CODE;
    public String INSTAGRAM_URL;
    public String LINKEDIN_URL;
    public String MAIN_OWNER;
    public String MAIN_OWNER_ID;
    public String OWNER_ID;
    public String PAN_CARD_NO;
    public String PASSBOOK;
    public String PINTEREST_URL;
    public String PROFILE_IMG;
    public String SKYPE_URL;
    public String STATE;
    public String TWITTER_URL;
    public String USER_ID;
    public String VINE_URL;
    public int uId = 0;

    public UserProfile(String PROFILE_IMG2, String MAIN_OWNER2, String MAIN_OWNER_ID2, String OWNER_ID2, String USER_ID2, String ALTERNATE_PHONE_NO2, String DOB2, String GENDER2, String COUNTRY2, String STATE2, String FACEBOOK_URL2, String TWITTER_URL2, String LINKEDIN_URL2, String INSTAGRAM_URL2, String DRIBBLE_BOX_URL2, String DROPBOX_URL2, String GOOGLE_PLUS_URL2, String PINTEREST_URL2, String SKYPE_URL2, String VINE_URL2, String AADHAR_CARD_NO2, String PAN_CARD_NO2, String BANK2, String B_NAME2, String AC_HOLDER_NAME2, String AC_NUM2, String IFSC_CODE2, String PASSBOOK2, String DATE2) {
        this.PROFILE_IMG = PROFILE_IMG2;
        this.MAIN_OWNER = MAIN_OWNER2;
        this.MAIN_OWNER_ID = MAIN_OWNER_ID2;
        this.OWNER_ID = OWNER_ID2;
        this.USER_ID = USER_ID2;
        this.ALTERNATE_PHONE_NO = ALTERNATE_PHONE_NO2;
        this.DOB = DOB2;
        this.GENDER = GENDER2;
        this.COUNTRY = COUNTRY2;
        this.STATE = STATE2;
        this.FACEBOOK_URL = FACEBOOK_URL2;
        this.TWITTER_URL = TWITTER_URL2;
        this.LINKEDIN_URL = LINKEDIN_URL2;
        this.INSTAGRAM_URL = INSTAGRAM_URL2;
        this.DRIBBLE_BOX_URL = DRIBBLE_BOX_URL2;
        this.DROPBOX_URL = DROPBOX_URL2;
        this.GOOGLE_PLUS_URL = GOOGLE_PLUS_URL2;
        this.PINTEREST_URL = PINTEREST_URL2;
        this.SKYPE_URL = SKYPE_URL2;
        this.VINE_URL = VINE_URL2;
        this.AADHAR_CARD_NO = AADHAR_CARD_NO2;
        this.PAN_CARD_NO = PAN_CARD_NO2;
        this.BANK = BANK2;
        this.B_NAME = B_NAME2;
        this.AC_HOLDER_NAME = AC_HOLDER_NAME2;
        this.AC_NUM = AC_NUM2;
        this.IFSC_CODE = IFSC_CODE2;
        this.PASSBOOK = PASSBOOK2;
        this.DATE = DATE2;
    }

    public int getCURRENT_USER_ID() {
        return this.CURRENT_USER_ID;
    }

    public void setCURRENT_USER_ID(int CURRENT_USER_ID2) {
        this.CURRENT_USER_ID = CURRENT_USER_ID2;
    }

    public int getuId() {
        return this.uId;
    }

    public void setuId(int uId2) {
        this.uId = uId2;
    }

    public String getPROFILE_IMG() {
        return this.PROFILE_IMG;
    }

    public void setPROFILE_IMG(String PROFILE_IMG2) {
        this.PROFILE_IMG = PROFILE_IMG2;
    }

    public String getMAIN_OWNER() {
        return this.MAIN_OWNER;
    }

    public void setMAIN_OWNER(String MAIN_OWNER2) {
        this.MAIN_OWNER = MAIN_OWNER2;
    }

    public String getMAIN_OWNER_ID() {
        return this.MAIN_OWNER_ID;
    }

    public void setMAIN_OWNER_ID(String MAIN_OWNER_ID2) {
        this.MAIN_OWNER_ID = MAIN_OWNER_ID2;
    }

    public String getOWNER_ID() {
        return this.OWNER_ID;
    }

    public void setOWNER_ID(String OWNER_ID2) {
        this.OWNER_ID = OWNER_ID2;
    }

    public String getUSER_ID() {
        return this.USER_ID;
    }

    public void setUSER_ID(String USER_ID2) {
        this.USER_ID = USER_ID2;
    }

    public String getALTERNATE_PHONE_NO() {
        return this.ALTERNATE_PHONE_NO;
    }

    public void setALTERNATE_PHONE_NO(String ALTERNATE_PHONE_NO2) {
        this.ALTERNATE_PHONE_NO = ALTERNATE_PHONE_NO2;
    }

    public String getDOB() {
        return this.DOB;
    }

    public void setDOB(String DOB2) {
        this.DOB = DOB2;
    }

    public String getGENDER() {
        return this.GENDER;
    }

    public void setGENDER(String GENDER2) {
        this.GENDER = GENDER2;
    }

    public String getCOUNTRY() {
        return this.COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY2) {
        this.COUNTRY = COUNTRY2;
    }

    public String getSTATE() {
        return this.STATE;
    }

    public void setSTATE(String STATE2) {
        this.STATE = STATE2;
    }

    public String getFACEBOOK_URL() {
        return this.FACEBOOK_URL;
    }

    public void setFACEBOOK_URL(String FACEBOOK_URL2) {
        this.FACEBOOK_URL = FACEBOOK_URL2;
    }

    public String getTWITTER_URL() {
        return this.TWITTER_URL;
    }

    public void setTWITTER_URL(String TWITTER_URL2) {
        this.TWITTER_URL = TWITTER_URL2;
    }

    public String getLINKEDIN_URL() {
        return this.LINKEDIN_URL;
    }

    public void setLINKEDIN_URL(String LINKEDIN_URL2) {
        this.LINKEDIN_URL = LINKEDIN_URL2;
    }

    public String getINSTAGRAM_URL() {
        return this.INSTAGRAM_URL;
    }

    public void setINSTAGRAM_URL(String INSTAGRAM_URL2) {
        this.INSTAGRAM_URL = INSTAGRAM_URL2;
    }

    public String getDRIBBLE_BOX_URL() {
        return this.DRIBBLE_BOX_URL;
    }

    public void setDRIBBLE_BOX_URL(String DRIBBLE_BOX_URL2) {
        this.DRIBBLE_BOX_URL = DRIBBLE_BOX_URL2;
    }

    public String getDROPBOX_URL() {
        return this.DROPBOX_URL;
    }

    public void setDROPBOX_URL(String DROPBOX_URL2) {
        this.DROPBOX_URL = DROPBOX_URL2;
    }

    public String getGOOGLE_PLUS_URL() {
        return this.GOOGLE_PLUS_URL;
    }

    public void setGOOGLE_PLUS_URL(String GOOGLE_PLUS_URL2) {
        this.GOOGLE_PLUS_URL = GOOGLE_PLUS_URL2;
    }

    public String getPINTEREST_URL() {
        return this.PINTEREST_URL;
    }

    public void setPINTEREST_URL(String PINTEREST_URL2) {
        this.PINTEREST_URL = PINTEREST_URL2;
    }

    public String getSKYPE_URL() {
        return this.SKYPE_URL;
    }

    public void setSKYPE_URL(String SKYPE_URL2) {
        this.SKYPE_URL = SKYPE_URL2;
    }

    public String getVINE_URL() {
        return this.VINE_URL;
    }

    public void setVINE_URL(String VINE_URL2) {
        this.VINE_URL = VINE_URL2;
    }

    public String getAADHAR_CARD_NO() {
        return this.AADHAR_CARD_NO;
    }

    public void setAADHAR_CARD_NO(String AADHAR_CARD_NO2) {
        this.AADHAR_CARD_NO = AADHAR_CARD_NO2;
    }

    public String getPAN_CARD_NO() {
        return this.PAN_CARD_NO;
    }

    public void setPAN_CARD_NO(String PAN_CARD_NO2) {
        this.PAN_CARD_NO = PAN_CARD_NO2;
    }

    public String getBANK() {
        return this.BANK;
    }

    public void setBANK(String BANK2) {
        this.BANK = BANK2;
    }

    public String getB_NAME() {
        return this.B_NAME;
    }

    public void setB_NAME(String b_NAME) {
        this.B_NAME = b_NAME;
    }

    public String getAC_HOLDER_NAME() {
        return this.AC_HOLDER_NAME;
    }

    public void setAC_HOLDER_NAME(String AC_HOLDER_NAME2) {
        this.AC_HOLDER_NAME = AC_HOLDER_NAME2;
    }

    public String getAC_NUM() {
        return this.AC_NUM;
    }

    public void setAC_NUM(String AC_NUM2) {
        this.AC_NUM = AC_NUM2;
    }

    public String getIFSC_CODE() {
        return this.IFSC_CODE;
    }

    public void setIFSC_CODE(String IFSC_CODE2) {
        this.IFSC_CODE = IFSC_CODE2;
    }

    public String getPASSBOOK() {
        return this.PASSBOOK;
    }

    public void setPASSBOOK(String PASSBOOK2) {
        this.PASSBOOK = PASSBOOK2;
    }

    public String getDATE() {
        return this.DATE;
    }

    public void setDATE(String DATE2) {
        this.DATE = DATE2;
    }
}
