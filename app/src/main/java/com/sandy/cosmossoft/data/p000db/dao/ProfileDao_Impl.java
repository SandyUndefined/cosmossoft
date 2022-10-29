package com.sandy.cosmossoft.data.p000db.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p003db.SupportSQLiteStatement;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.sandy.cosmossoft.data.db.dao.ProfileDao_Impl */
public final class ProfileDao_Impl implements ProfileDao {
    /* access modifiers changed from: private */
    public final RoomDatabase __db;
    private final EntityInsertionAdapter<UserProfile> __insertionAdapterOfUserProfile;
    private final SharedSQLiteStatement __preparedStmtOfDeleteUserProfile;

    public ProfileDao_Impl(RoomDatabase __db2) {
        this.__db = __db2;
        this.__insertionAdapterOfUserProfile = new EntityInsertionAdapter<UserProfile>(__db2) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `user_profile` (`CURRENT_USER_ID`,`uId`,`PROFILE_IMG`,`MAIN_OWNER`,`MAIN_OWNER_ID`,`OWNER_ID`,`USER_ID`,`ALTERNATE_PHONE_NO`,`DOB`,`GENDER`,`COUNTRY`,`STATE`,`FACEBOOK_URL`,`TWITTER_URL`,`LINKEDIN_URL`,`INSTAGRAM_URL`,`DRIBBLE_BOX_URL`,`DROPBOX_URL`,`GOOGLE_PLUS_URL`,`PINTEREST_URL`,`SKYPE_URL`,`VINE_URL`,`AADHAR_CARD_NO`,`PAN_CARD_NO`,`BANK`,`B_NAME`,`AC_HOLDER_NAME`,`AC_NUM`,`IFSC_CODE`,`PASSBOOK`,`DATE`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement stmt, UserProfile value) {
                stmt.bindLong(1, (long) value.CURRENT_USER_ID);
                stmt.bindLong(2, (long) value.uId);
                if (value.PROFILE_IMG == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.PROFILE_IMG);
                }
                if (value.MAIN_OWNER == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.MAIN_OWNER);
                }
                if (value.MAIN_OWNER_ID == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.MAIN_OWNER_ID);
                }
                if (value.OWNER_ID == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.OWNER_ID);
                }
                if (value.USER_ID == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.USER_ID);
                }
                if (value.ALTERNATE_PHONE_NO == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.ALTERNATE_PHONE_NO);
                }
                if (value.DOB == null) {
                    stmt.bindNull(9);
                } else {
                    stmt.bindString(9, value.DOB);
                }
                if (value.GENDER == null) {
                    stmt.bindNull(10);
                } else {
                    stmt.bindString(10, value.GENDER);
                }
                if (value.COUNTRY == null) {
                    stmt.bindNull(11);
                } else {
                    stmt.bindString(11, value.COUNTRY);
                }
                if (value.STATE == null) {
                    stmt.bindNull(12);
                } else {
                    stmt.bindString(12, value.STATE);
                }
                if (value.FACEBOOK_URL == null) {
                    stmt.bindNull(13);
                } else {
                    stmt.bindString(13, value.FACEBOOK_URL);
                }
                if (value.TWITTER_URL == null) {
                    stmt.bindNull(14);
                } else {
                    stmt.bindString(14, value.TWITTER_URL);
                }
                if (value.LINKEDIN_URL == null) {
                    stmt.bindNull(15);
                } else {
                    stmt.bindString(15, value.LINKEDIN_URL);
                }
                if (value.INSTAGRAM_URL == null) {
                    stmt.bindNull(16);
                } else {
                    stmt.bindString(16, value.INSTAGRAM_URL);
                }
                if (value.DRIBBLE_BOX_URL == null) {
                    stmt.bindNull(17);
                } else {
                    stmt.bindString(17, value.DRIBBLE_BOX_URL);
                }
                if (value.DROPBOX_URL == null) {
                    stmt.bindNull(18);
                } else {
                    stmt.bindString(18, value.DROPBOX_URL);
                }
                if (value.GOOGLE_PLUS_URL == null) {
                    stmt.bindNull(19);
                } else {
                    stmt.bindString(19, value.GOOGLE_PLUS_URL);
                }
                if (value.PINTEREST_URL == null) {
                    stmt.bindNull(20);
                } else {
                    stmt.bindString(20, value.PINTEREST_URL);
                }
                if (value.SKYPE_URL == null) {
                    stmt.bindNull(21);
                } else {
                    stmt.bindString(21, value.SKYPE_URL);
                }
                if (value.VINE_URL == null) {
                    stmt.bindNull(22);
                } else {
                    stmt.bindString(22, value.VINE_URL);
                }
                if (value.AADHAR_CARD_NO == null) {
                    stmt.bindNull(23);
                } else {
                    stmt.bindString(23, value.AADHAR_CARD_NO);
                }
                if (value.PAN_CARD_NO == null) {
                    stmt.bindNull(24);
                } else {
                    stmt.bindString(24, value.PAN_CARD_NO);
                }
                if (value.BANK == null) {
                    stmt.bindNull(25);
                } else {
                    stmt.bindString(25, value.BANK);
                }
                if (value.B_NAME == null) {
                    stmt.bindNull(26);
                } else {
                    stmt.bindString(26, value.B_NAME);
                }
                if (value.AC_HOLDER_NAME == null) {
                    stmt.bindNull(27);
                } else {
                    stmt.bindString(27, value.AC_HOLDER_NAME);
                }
                if (value.AC_NUM == null) {
                    stmt.bindNull(28);
                } else {
                    stmt.bindString(28, value.AC_NUM);
                }
                if (value.IFSC_CODE == null) {
                    stmt.bindNull(29);
                } else {
                    stmt.bindString(29, value.IFSC_CODE);
                }
                if (value.PASSBOOK == null) {
                    stmt.bindNull(30);
                } else {
                    stmt.bindString(30, value.PASSBOOK);
                }
                if (value.DATE == null) {
                    stmt.bindNull(31);
                } else {
                    stmt.bindString(31, value.DATE);
                }
            }
        };
        this.__preparedStmtOfDeleteUserProfile = new SharedSQLiteStatement(__db2) {
            public String createQuery() {
                return "DELETE FROM user_profile";
            }
        };
    }

    public long insertUserProfile(UserProfile userProfile) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long _result = this.__insertionAdapterOfUserProfile.insertAndReturnId(userProfile);
            this.__db.setTransactionSuccessful();
            return _result;
        } finally {
            this.__db.endTransaction();
        }
    }

    public void deleteUserProfile() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement _stmt = this.__preparedStmtOfDeleteUserProfile.acquire();
        this.__db.beginTransaction();
        try {
            _stmt.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteUserProfile.release(_stmt);
        }
    }

    public LiveData<UserProfile> getUserProfile() {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire("SELECT * FROM user_profile WHERE uId = CURRENT_USER_ID", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"user_profile"}, false, new Callable<UserProfile>() {
            public UserProfile call() throws Exception {
                UserProfile _result;
                String _tmpPROFILE_IMG;
                String _tmpMAIN_OWNER;
                String _tmpMAIN_OWNER_ID;
                String _tmpOWNER_ID;
                String _tmpUSER_ID;
                String _tmpALTERNATE_PHONE_NO;
                String _tmpDOB;
                String _tmpGENDER;
                String _tmpCOUNTRY;
                String _tmpSTATE;
                String _tmpFACEBOOK_URL;
                String _tmpTWITTER_URL;
                String _tmpLINKEDIN_URL;
                String _tmpINSTAGRAM_URL;
                String _tmpDRIBBLE_BOX_URL;
                String _tmpDROPBOX_URL;
                String _tmpGOOGLE_PLUS_URL;
                String _tmpPINTEREST_URL;
                String _tmpSKYPE_URL;
                String _tmpVINE_URL;
                String _tmpAADHAR_CARD_NO;
                String _tmpPAN_CARD_NO;
                String _tmpBANK;
                String _tmpB_NAME;
                String _tmpAC_HOLDER_NAME;
                String _tmpAC_NUM;
                String _tmpIFSC_CODE;
                String _tmpPASSBOOK;
                String _tmpDATE;
                Cursor _cursor = DBUtil.query(ProfileDao_Impl.this.__db, _statement, false, (CancellationSignal) null);
                try {
                    int _cursorIndexOfCURRENTUSERID = CursorUtil.getColumnIndexOrThrow(_cursor, "CURRENT_USER_ID");
                    int _cursorIndexOfUId = CursorUtil.getColumnIndexOrThrow(_cursor, "uId");
                    int _cursorIndexOfPROFILEIMG = CursorUtil.getColumnIndexOrThrow(_cursor, "PROFILE_IMG");
                    int _cursorIndexOfMAINOWNER = CursorUtil.getColumnIndexOrThrow(_cursor, "MAIN_OWNER");
                    int _cursorIndexOfMAINOWNERID = CursorUtil.getColumnIndexOrThrow(_cursor, "MAIN_OWNER_ID");
                    int _cursorIndexOfOWNERID = CursorUtil.getColumnIndexOrThrow(_cursor, "OWNER_ID");
                    int _cursorIndexOfUSERID = CursorUtil.getColumnIndexOrThrow(_cursor, "USER_ID");
                    int _cursorIndexOfALTERNATEPHONENO = CursorUtil.getColumnIndexOrThrow(_cursor, "ALTERNATE_PHONE_NO");
                    int _cursorIndexOfDOB = CursorUtil.getColumnIndexOrThrow(_cursor, "DOB");
                    int _cursorIndexOfGENDER = CursorUtil.getColumnIndexOrThrow(_cursor, "GENDER");
                    int _cursorIndexOfCOUNTRY = CursorUtil.getColumnIndexOrThrow(_cursor, "COUNTRY");
                    int _cursorIndexOfSTATE = CursorUtil.getColumnIndexOrThrow(_cursor, "STATE");
                    int _cursorIndexOfFACEBOOKURL = CursorUtil.getColumnIndexOrThrow(_cursor, "FACEBOOK_URL");
                    int _cursorIndexOfTWITTERURL = CursorUtil.getColumnIndexOrThrow(_cursor, "TWITTER_URL");
                    int _cursorIndexOfLINKEDINURL = CursorUtil.getColumnIndexOrThrow(_cursor, "LINKEDIN_URL");
                    int _cursorIndexOfUId2 = _cursorIndexOfUId;
                    int _cursorIndexOfINSTAGRAMURL = CursorUtil.getColumnIndexOrThrow(_cursor, "INSTAGRAM_URL");
                    int _cursorIndexOfCURRENTUSERID2 = _cursorIndexOfCURRENTUSERID;
                    int _cursorIndexOfDRIBBLEBOXURL = CursorUtil.getColumnIndexOrThrow(_cursor, "DRIBBLE_BOX_URL");
                    int _cursorIndexOfDROPBOXURL = CursorUtil.getColumnIndexOrThrow(_cursor, "DROPBOX_URL");
                    int _cursorIndexOfGOOGLEPLUSURL = CursorUtil.getColumnIndexOrThrow(_cursor, "GOOGLE_PLUS_URL");
                    int _cursorIndexOfPINTERESTURL = CursorUtil.getColumnIndexOrThrow(_cursor, "PINTEREST_URL");
                    int _cursorIndexOfSKYPEURL = CursorUtil.getColumnIndexOrThrow(_cursor, "SKYPE_URL");
                    int _cursorIndexOfVINEURL = CursorUtil.getColumnIndexOrThrow(_cursor, "VINE_URL");
                    int _cursorIndexOfAADHARCARDNO = CursorUtil.getColumnIndexOrThrow(_cursor, "AADHAR_CARD_NO");
                    int _cursorIndexOfPANCARDNO = CursorUtil.getColumnIndexOrThrow(_cursor, "PAN_CARD_NO");
                    int _cursorIndexOfBANK = CursorUtil.getColumnIndexOrThrow(_cursor, "BANK");
                    int _cursorIndexOfBNAME = CursorUtil.getColumnIndexOrThrow(_cursor, "B_NAME");
                    int _cursorIndexOfACHOLDERNAME = CursorUtil.getColumnIndexOrThrow(_cursor, "AC_HOLDER_NAME");
                    int _cursorIndexOfACNUM = CursorUtil.getColumnIndexOrThrow(_cursor, "AC_NUM");
                    int _cursorIndexOfIFSCCODE = CursorUtil.getColumnIndexOrThrow(_cursor, "IFSC_CODE");
                    int _cursorIndexOfPASSBOOK = CursorUtil.getColumnIndexOrThrow(_cursor, "PASSBOOK");
                    int _cursorIndexOfDATE = CursorUtil.getColumnIndexOrThrow(_cursor, "DATE");
                    if (_cursor.moveToFirst()) {
                        if (_cursor.isNull(_cursorIndexOfPROFILEIMG)) {
                            _tmpPROFILE_IMG = null;
                        } else {
                            _tmpPROFILE_IMG = _cursor.getString(_cursorIndexOfPROFILEIMG);
                        }
                        if (_cursor.isNull(_cursorIndexOfMAINOWNER)) {
                            _tmpMAIN_OWNER = null;
                        } else {
                            _tmpMAIN_OWNER = _cursor.getString(_cursorIndexOfMAINOWNER);
                        }
                        if (_cursor.isNull(_cursorIndexOfMAINOWNERID)) {
                            _tmpMAIN_OWNER_ID = null;
                        } else {
                            _tmpMAIN_OWNER_ID = _cursor.getString(_cursorIndexOfMAINOWNERID);
                        }
                        if (_cursor.isNull(_cursorIndexOfOWNERID)) {
                            _tmpOWNER_ID = null;
                        } else {
                            _tmpOWNER_ID = _cursor.getString(_cursorIndexOfOWNERID);
                        }
                        if (_cursor.isNull(_cursorIndexOfUSERID)) {
                            _tmpUSER_ID = null;
                        } else {
                            _tmpUSER_ID = _cursor.getString(_cursorIndexOfUSERID);
                        }
                        if (_cursor.isNull(_cursorIndexOfALTERNATEPHONENO)) {
                            _tmpALTERNATE_PHONE_NO = null;
                        } else {
                            _tmpALTERNATE_PHONE_NO = _cursor.getString(_cursorIndexOfALTERNATEPHONENO);
                        }
                        if (_cursor.isNull(_cursorIndexOfDOB)) {
                            _tmpDOB = null;
                        } else {
                            _tmpDOB = _cursor.getString(_cursorIndexOfDOB);
                        }
                        if (_cursor.isNull(_cursorIndexOfGENDER)) {
                            _tmpGENDER = null;
                        } else {
                            _tmpGENDER = _cursor.getString(_cursorIndexOfGENDER);
                        }
                        if (_cursor.isNull(_cursorIndexOfCOUNTRY)) {
                            _tmpCOUNTRY = null;
                        } else {
                            _tmpCOUNTRY = _cursor.getString(_cursorIndexOfCOUNTRY);
                        }
                        if (_cursor.isNull(_cursorIndexOfSTATE)) {
                            _tmpSTATE = null;
                        } else {
                            _tmpSTATE = _cursor.getString(_cursorIndexOfSTATE);
                        }
                        if (_cursor.isNull(_cursorIndexOfFACEBOOKURL)) {
                            _tmpFACEBOOK_URL = null;
                        } else {
                            _tmpFACEBOOK_URL = _cursor.getString(_cursorIndexOfFACEBOOKURL);
                        }
                        if (_cursor.isNull(_cursorIndexOfTWITTERURL)) {
                            _tmpTWITTER_URL = null;
                        } else {
                            _tmpTWITTER_URL = _cursor.getString(_cursorIndexOfTWITTERURL);
                        }
                        if (_cursor.isNull(_cursorIndexOfLINKEDINURL)) {
                            _tmpLINKEDIN_URL = null;
                        } else {
                            _tmpLINKEDIN_URL = _cursor.getString(_cursorIndexOfLINKEDINURL);
                        }
                        if (_cursor.isNull(_cursorIndexOfINSTAGRAMURL)) {
                            _tmpINSTAGRAM_URL = null;
                        } else {
                            _tmpINSTAGRAM_URL = _cursor.getString(_cursorIndexOfINSTAGRAMURL);
                        }
                        int i = _cursorIndexOfLINKEDINURL;
                        int _cursorIndexOfLINKEDINURL2 = _cursorIndexOfDRIBBLEBOXURL;
                        if (_cursor.isNull(_cursorIndexOfLINKEDINURL2) != 0) {
                            _tmpDRIBBLE_BOX_URL = null;
                        } else {
                            _tmpDRIBBLE_BOX_URL = _cursor.getString(_cursorIndexOfLINKEDINURL2);
                        }
                        int i2 = _cursorIndexOfLINKEDINURL2;
                        int _cursorIndexOfDROPBOXURL2 = _cursorIndexOfDROPBOXURL;
                        if (_cursor.isNull(_cursorIndexOfDROPBOXURL2) != 0) {
                            _tmpDROPBOX_URL = null;
                        } else {
                            _tmpDROPBOX_URL = _cursor.getString(_cursorIndexOfDROPBOXURL2);
                        }
                        int i3 = _cursorIndexOfDROPBOXURL2;
                        int _cursorIndexOfGOOGLEPLUSURL2 = _cursorIndexOfGOOGLEPLUSURL;
                        if (_cursor.isNull(_cursorIndexOfGOOGLEPLUSURL2) != 0) {
                            _tmpGOOGLE_PLUS_URL = null;
                        } else {
                            _tmpGOOGLE_PLUS_URL = _cursor.getString(_cursorIndexOfGOOGLEPLUSURL2);
                        }
                        int i4 = _cursorIndexOfGOOGLEPLUSURL2;
                        int _cursorIndexOfPINTERESTURL2 = _cursorIndexOfPINTERESTURL;
                        if (_cursor.isNull(_cursorIndexOfPINTERESTURL2) != 0) {
                            _tmpPINTEREST_URL = null;
                        } else {
                            _tmpPINTEREST_URL = _cursor.getString(_cursorIndexOfPINTERESTURL2);
                        }
                        int i5 = _cursorIndexOfPINTERESTURL2;
                        int _cursorIndexOfPINTERESTURL3 = _cursorIndexOfSKYPEURL;
                        if (_cursor.isNull(_cursorIndexOfPINTERESTURL3) != 0) {
                            _tmpSKYPE_URL = null;
                        } else {
                            _tmpSKYPE_URL = _cursor.getString(_cursorIndexOfPINTERESTURL3);
                        }
                        int i6 = _cursorIndexOfPINTERESTURL3;
                        int _cursorIndexOfSKYPEURL2 = _cursorIndexOfVINEURL;
                        if (_cursor.isNull(_cursorIndexOfSKYPEURL2) != 0) {
                            _tmpVINE_URL = null;
                        } else {
                            _tmpVINE_URL = _cursor.getString(_cursorIndexOfSKYPEURL2);
                        }
                        int i7 = _cursorIndexOfSKYPEURL2;
                        int _cursorIndexOfVINEURL2 = _cursorIndexOfAADHARCARDNO;
                        if (_cursor.isNull(_cursorIndexOfVINEURL2) != 0) {
                            _tmpAADHAR_CARD_NO = null;
                        } else {
                            _tmpAADHAR_CARD_NO = _cursor.getString(_cursorIndexOfVINEURL2);
                        }
                        int i8 = _cursorIndexOfVINEURL2;
                        int _cursorIndexOfPANCARDNO2 = _cursorIndexOfPANCARDNO;
                        if (_cursor.isNull(_cursorIndexOfPANCARDNO2) != 0) {
                            _tmpPAN_CARD_NO = null;
                        } else {
                            _tmpPAN_CARD_NO = _cursor.getString(_cursorIndexOfPANCARDNO2);
                        }
                        int i9 = _cursorIndexOfPANCARDNO2;
                        int _cursorIndexOfBANK2 = _cursorIndexOfBANK;
                        if (_cursor.isNull(_cursorIndexOfBANK2) != 0) {
                            _tmpBANK = null;
                        } else {
                            _tmpBANK = _cursor.getString(_cursorIndexOfBANK2);
                        }
                        int i10 = _cursorIndexOfBANK2;
                        int _cursorIndexOfBANK3 = _cursorIndexOfBNAME;
                        if (_cursor.isNull(_cursorIndexOfBANK3) != 0) {
                            _tmpB_NAME = null;
                        } else {
                            _tmpB_NAME = _cursor.getString(_cursorIndexOfBANK3);
                        }
                        int i11 = _cursorIndexOfBANK3;
                        int _cursorIndexOfACHOLDERNAME2 = _cursorIndexOfACHOLDERNAME;
                        if (_cursor.isNull(_cursorIndexOfACHOLDERNAME2) != 0) {
                            _tmpAC_HOLDER_NAME = null;
                        } else {
                            _tmpAC_HOLDER_NAME = _cursor.getString(_cursorIndexOfACHOLDERNAME2);
                        }
                        int i12 = _cursorIndexOfACHOLDERNAME2;
                        int _cursorIndexOfACHOLDERNAME3 = _cursorIndexOfACNUM;
                        if (_cursor.isNull(_cursorIndexOfACHOLDERNAME3) != 0) {
                            _tmpAC_NUM = null;
                        } else {
                            _tmpAC_NUM = _cursor.getString(_cursorIndexOfACHOLDERNAME3);
                        }
                        int i13 = _cursorIndexOfACHOLDERNAME3;
                        int _cursorIndexOfIFSCCODE2 = _cursorIndexOfIFSCCODE;
                        if (_cursor.isNull(_cursorIndexOfIFSCCODE2) != 0) {
                            _tmpIFSC_CODE = null;
                        } else {
                            _tmpIFSC_CODE = _cursor.getString(_cursorIndexOfIFSCCODE2);
                        }
                        int i14 = _cursorIndexOfIFSCCODE2;
                        int _cursorIndexOfPASSBOOK2 = _cursorIndexOfPASSBOOK;
                        if (_cursor.isNull(_cursorIndexOfPASSBOOK2) != 0) {
                            _tmpPASSBOOK = null;
                        } else {
                            _tmpPASSBOOK = _cursor.getString(_cursorIndexOfPASSBOOK2);
                        }
                        if (_cursor.isNull(_cursorIndexOfDATE)) {
                            _tmpDATE = null;
                        } else {
                            _tmpDATE = _cursor.getString(_cursorIndexOfDATE);
                        }
                        int i15 = _cursorIndexOfDATE;
                        int _cursorIndexOfCURRENTUSERID3 = _cursorIndexOfCURRENTUSERID2;
                        int _cursorIndexOfCURRENTUSERID4 = _cursorIndexOfPASSBOOK2;
                        int _cursorIndexOfPASSBOOK3 = _cursor.getInt(_cursorIndexOfCURRENTUSERID3);
                        int i16 = _cursorIndexOfCURRENTUSERID3;
                        UserProfile _result2 = new UserProfile(_tmpPROFILE_IMG, _tmpMAIN_OWNER, _tmpMAIN_OWNER_ID, _tmpOWNER_ID, _tmpUSER_ID, _tmpALTERNATE_PHONE_NO, _tmpDOB, _tmpGENDER, _tmpCOUNTRY, _tmpSTATE, _tmpFACEBOOK_URL, _tmpTWITTER_URL, _tmpLINKEDIN_URL, _tmpINSTAGRAM_URL, _tmpDRIBBLE_BOX_URL, _tmpDROPBOX_URL, _tmpGOOGLE_PLUS_URL, _tmpPINTEREST_URL, _tmpSKYPE_URL, _tmpVINE_URL, _tmpAADHAR_CARD_NO, _tmpPAN_CARD_NO, _tmpBANK, _tmpB_NAME, _tmpAC_HOLDER_NAME, _tmpAC_NUM, _tmpIFSC_CODE, _tmpPASSBOOK, _tmpDATE);
                        _result2.CURRENT_USER_ID = _cursorIndexOfPASSBOOK3;
                        int _cursorIndexOfUId3 = _cursorIndexOfUId2;
                        int _cursorIndexOfUId4 = _cursorIndexOfINSTAGRAMURL;
                        _result2.uId = _cursor.getInt(_cursorIndexOfUId3);
                        _result = _result2;
                    } else {
                        int i17 = _cursorIndexOfLINKEDINURL;
                        int _cursorIndexOfLINKEDINURL3 = _cursorIndexOfUId2;
                        int i18 = _cursorIndexOfCURRENTUSERID2;
                        int i19 = _cursorIndexOfDRIBBLEBOXURL;
                        int i20 = _cursorIndexOfDROPBOXURL;
                        int i21 = _cursorIndexOfGOOGLEPLUSURL;
                        int i22 = _cursorIndexOfPINTERESTURL;
                        int i23 = _cursorIndexOfSKYPEURL;
                        int i24 = _cursorIndexOfVINEURL;
                        int i25 = _cursorIndexOfAADHARCARDNO;
                        int i26 = _cursorIndexOfPANCARDNO;
                        int i27 = _cursorIndexOfBANK;
                        int i28 = _cursorIndexOfBNAME;
                        int i29 = _cursorIndexOfACHOLDERNAME;
                        int i30 = _cursorIndexOfACNUM;
                        int i31 = _cursorIndexOfIFSCCODE;
                        int _cursorIndexOfCURRENTUSERID5 = _cursorIndexOfPASSBOOK;
                        int _cursorIndexOfUId5 = _cursorIndexOfINSTAGRAMURL;
                        _result = null;
                    }
                    return _result;
                } finally {
                    _cursor.close();
                }
            }

            /* access modifiers changed from: protected */
            public void finalize() {
                _statement.release();
            }
        });
    }

    public UserProfile getRegularUserProfile() {
        RoomSQLiteQuery _statement;
        int _cursorIndexOfTWITTERURL;
        UserProfile _result;
        String _tmpPROFILE_IMG;
        String _tmpMAIN_OWNER;
        String _tmpMAIN_OWNER_ID;
        String _tmpOWNER_ID;
        String _tmpUSER_ID;
        String _tmpALTERNATE_PHONE_NO;
        String _tmpDOB;
        String _tmpGENDER;
        String _tmpCOUNTRY;
        String _tmpSTATE;
        String _tmpFACEBOOK_URL;
        String _tmpTWITTER_URL;
        String _tmpLINKEDIN_URL;
        String _tmpINSTAGRAM_URL;
        String _tmpDRIBBLE_BOX_URL;
        String _tmpDROPBOX_URL;
        String _tmpGOOGLE_PLUS_URL;
        String _tmpPINTEREST_URL;
        String _tmpSKYPE_URL;
        String _tmpVINE_URL;
        String _tmpAADHAR_CARD_NO;
        String _tmpPAN_CARD_NO;
        String _tmpBANK;
        String _tmpB_NAME;
        String _tmpAC_HOLDER_NAME;
        String _tmpAC_NUM;
        String _tmpIFSC_CODE;
        String _tmpPASSBOOK;
        String _tmpDATE;
        RoomSQLiteQuery _statement2 = RoomSQLiteQuery.acquire("SELECT * FROM user_profile WHERE uId = CURRENT_USER_ID", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor _cursor = DBUtil.query(this.__db, _statement2, false, (CancellationSignal) null);
        try {
            int _cursorIndexOfCURRENTUSERID = CursorUtil.getColumnIndexOrThrow(_cursor, "CURRENT_USER_ID");
            int _cursorIndexOfUId = CursorUtil.getColumnIndexOrThrow(_cursor, "uId");
            int _cursorIndexOfPROFILEIMG = CursorUtil.getColumnIndexOrThrow(_cursor, "PROFILE_IMG");
            int _cursorIndexOfMAINOWNER = CursorUtil.getColumnIndexOrThrow(_cursor, "MAIN_OWNER");
            int _cursorIndexOfMAINOWNERID = CursorUtil.getColumnIndexOrThrow(_cursor, "MAIN_OWNER_ID");
            int _cursorIndexOfOWNERID = CursorUtil.getColumnIndexOrThrow(_cursor, "OWNER_ID");
            int _cursorIndexOfUSERID = CursorUtil.getColumnIndexOrThrow(_cursor, "USER_ID");
            int _cursorIndexOfALTERNATEPHONENO = CursorUtil.getColumnIndexOrThrow(_cursor, "ALTERNATE_PHONE_NO");
            int _cursorIndexOfDOB = CursorUtil.getColumnIndexOrThrow(_cursor, "DOB");
            int _cursorIndexOfGENDER = CursorUtil.getColumnIndexOrThrow(_cursor, "GENDER");
            int _cursorIndexOfCOUNTRY = CursorUtil.getColumnIndexOrThrow(_cursor, "COUNTRY");
            int _cursorIndexOfSTATE = CursorUtil.getColumnIndexOrThrow(_cursor, "STATE");
            int _cursorIndexOfFACEBOOKURL = CursorUtil.getColumnIndexOrThrow(_cursor, "FACEBOOK_URL");
            Object obj = "SELECT * FROM user_profile WHERE uId = CURRENT_USER_ID";
            try {
                _cursorIndexOfTWITTERURL = CursorUtil.getColumnIndexOrThrow(_cursor, "TWITTER_URL");
                _statement = _statement2;
            } catch (Throwable th) {
                th = th;
                _statement = _statement2;
                _cursor.close();
                _statement.release();
                throw th;
            }
            try {
                int _cursorIndexOfLINKEDINURL = CursorUtil.getColumnIndexOrThrow(_cursor, "LINKEDIN_URL");
                int _cursorIndexOfUId2 = _cursorIndexOfUId;
                int _cursorIndexOfINSTAGRAMURL = CursorUtil.getColumnIndexOrThrow(_cursor, "INSTAGRAM_URL");
                int _cursorIndexOfCURRENTUSERID2 = _cursorIndexOfCURRENTUSERID;
                int _cursorIndexOfDRIBBLEBOXURL = CursorUtil.getColumnIndexOrThrow(_cursor, "DRIBBLE_BOX_URL");
                int _cursorIndexOfDROPBOXURL = CursorUtil.getColumnIndexOrThrow(_cursor, "DROPBOX_URL");
                int _cursorIndexOfGOOGLEPLUSURL = CursorUtil.getColumnIndexOrThrow(_cursor, "GOOGLE_PLUS_URL");
                int _cursorIndexOfPINTERESTURL = CursorUtil.getColumnIndexOrThrow(_cursor, "PINTEREST_URL");
                int _cursorIndexOfSKYPEURL = CursorUtil.getColumnIndexOrThrow(_cursor, "SKYPE_URL");
                int _cursorIndexOfVINEURL = CursorUtil.getColumnIndexOrThrow(_cursor, "VINE_URL");
                int _cursorIndexOfAADHARCARDNO = CursorUtil.getColumnIndexOrThrow(_cursor, "AADHAR_CARD_NO");
                int _cursorIndexOfPANCARDNO = CursorUtil.getColumnIndexOrThrow(_cursor, "PAN_CARD_NO");
                int _cursorIndexOfBANK = CursorUtil.getColumnIndexOrThrow(_cursor, "BANK");
                int _cursorIndexOfBNAME = CursorUtil.getColumnIndexOrThrow(_cursor, "B_NAME");
                int _cursorIndexOfACHOLDERNAME = CursorUtil.getColumnIndexOrThrow(_cursor, "AC_HOLDER_NAME");
                int _cursorIndexOfACNUM = CursorUtil.getColumnIndexOrThrow(_cursor, "AC_NUM");
                int _cursorIndexOfIFSCCODE = CursorUtil.getColumnIndexOrThrow(_cursor, "IFSC_CODE");
                int _cursorIndexOfPASSBOOK = CursorUtil.getColumnIndexOrThrow(_cursor, "PASSBOOK");
                int _cursorIndexOfDATE = CursorUtil.getColumnIndexOrThrow(_cursor, "DATE");
                if (_cursor.moveToFirst()) {
                    if (_cursor.isNull(_cursorIndexOfPROFILEIMG)) {
                        _tmpPROFILE_IMG = null;
                    } else {
                        _tmpPROFILE_IMG = _cursor.getString(_cursorIndexOfPROFILEIMG);
                    }
                    if (_cursor.isNull(_cursorIndexOfMAINOWNER)) {
                        _tmpMAIN_OWNER = null;
                    } else {
                        _tmpMAIN_OWNER = _cursor.getString(_cursorIndexOfMAINOWNER);
                    }
                    if (_cursor.isNull(_cursorIndexOfMAINOWNERID)) {
                        _tmpMAIN_OWNER_ID = null;
                    } else {
                        _tmpMAIN_OWNER_ID = _cursor.getString(_cursorIndexOfMAINOWNERID);
                    }
                    if (_cursor.isNull(_cursorIndexOfOWNERID)) {
                        _tmpOWNER_ID = null;
                    } else {
                        _tmpOWNER_ID = _cursor.getString(_cursorIndexOfOWNERID);
                    }
                    if (_cursor.isNull(_cursorIndexOfUSERID)) {
                        _tmpUSER_ID = null;
                    } else {
                        _tmpUSER_ID = _cursor.getString(_cursorIndexOfUSERID);
                    }
                    if (_cursor.isNull(_cursorIndexOfALTERNATEPHONENO)) {
                        _tmpALTERNATE_PHONE_NO = null;
                    } else {
                        _tmpALTERNATE_PHONE_NO = _cursor.getString(_cursorIndexOfALTERNATEPHONENO);
                    }
                    if (_cursor.isNull(_cursorIndexOfDOB)) {
                        _tmpDOB = null;
                    } else {
                        _tmpDOB = _cursor.getString(_cursorIndexOfDOB);
                    }
                    if (_cursor.isNull(_cursorIndexOfGENDER)) {
                        _tmpGENDER = null;
                    } else {
                        _tmpGENDER = _cursor.getString(_cursorIndexOfGENDER);
                    }
                    if (_cursor.isNull(_cursorIndexOfCOUNTRY)) {
                        _tmpCOUNTRY = null;
                    } else {
                        _tmpCOUNTRY = _cursor.getString(_cursorIndexOfCOUNTRY);
                    }
                    if (_cursor.isNull(_cursorIndexOfSTATE)) {
                        _tmpSTATE = null;
                    } else {
                        _tmpSTATE = _cursor.getString(_cursorIndexOfSTATE);
                    }
                    if (_cursor.isNull(_cursorIndexOfFACEBOOKURL)) {
                        _tmpFACEBOOK_URL = null;
                    } else {
                        _tmpFACEBOOK_URL = _cursor.getString(_cursorIndexOfFACEBOOKURL);
                    }
                    if (_cursor.isNull(_cursorIndexOfTWITTERURL)) {
                        _tmpTWITTER_URL = null;
                    } else {
                        _tmpTWITTER_URL = _cursor.getString(_cursorIndexOfTWITTERURL);
                    }
                    if (_cursor.isNull(_cursorIndexOfLINKEDINURL)) {
                        _tmpLINKEDIN_URL = null;
                    } else {
                        _tmpLINKEDIN_URL = _cursor.getString(_cursorIndexOfLINKEDINURL);
                    }
                    if (_cursor.isNull(_cursorIndexOfINSTAGRAMURL)) {
                        _tmpINSTAGRAM_URL = null;
                    } else {
                        _tmpINSTAGRAM_URL = _cursor.getString(_cursorIndexOfINSTAGRAMURL);
                    }
                    int i = _cursorIndexOfFACEBOOKURL;
                    int _cursorIndexOfFACEBOOKURL2 = _cursorIndexOfDRIBBLEBOXURL;
                    if (_cursor.isNull(_cursorIndexOfFACEBOOKURL2) != 0) {
                        _tmpDRIBBLE_BOX_URL = null;
                    } else {
                        _tmpDRIBBLE_BOX_URL = _cursor.getString(_cursorIndexOfFACEBOOKURL2);
                    }
                    int i2 = _cursorIndexOfFACEBOOKURL2;
                    int _cursorIndexOfDROPBOXURL2 = _cursorIndexOfDROPBOXURL;
                    if (_cursor.isNull(_cursorIndexOfDROPBOXURL2) != 0) {
                        _tmpDROPBOX_URL = null;
                    } else {
                        _tmpDROPBOX_URL = _cursor.getString(_cursorIndexOfDROPBOXURL2);
                    }
                    int i3 = _cursorIndexOfDROPBOXURL2;
                    int _cursorIndexOfGOOGLEPLUSURL2 = _cursorIndexOfGOOGLEPLUSURL;
                    if (_cursor.isNull(_cursorIndexOfGOOGLEPLUSURL2) != 0) {
                        _tmpGOOGLE_PLUS_URL = null;
                    } else {
                        _tmpGOOGLE_PLUS_URL = _cursor.getString(_cursorIndexOfGOOGLEPLUSURL2);
                    }
                    int i4 = _cursorIndexOfGOOGLEPLUSURL2;
                    int _cursorIndexOfPINTERESTURL2 = _cursorIndexOfPINTERESTURL;
                    if (_cursor.isNull(_cursorIndexOfPINTERESTURL2) != 0) {
                        _tmpPINTEREST_URL = null;
                    } else {
                        _tmpPINTEREST_URL = _cursor.getString(_cursorIndexOfPINTERESTURL2);
                    }
                    int i5 = _cursorIndexOfPINTERESTURL2;
                    int _cursorIndexOfPINTERESTURL3 = _cursorIndexOfSKYPEURL;
                    if (_cursor.isNull(_cursorIndexOfPINTERESTURL3) != 0) {
                        _tmpSKYPE_URL = null;
                    } else {
                        _tmpSKYPE_URL = _cursor.getString(_cursorIndexOfPINTERESTURL3);
                    }
                    int i6 = _cursorIndexOfPINTERESTURL3;
                    int _cursorIndexOfSKYPEURL2 = _cursorIndexOfVINEURL;
                    if (_cursor.isNull(_cursorIndexOfSKYPEURL2) != 0) {
                        _tmpVINE_URL = null;
                    } else {
                        _tmpVINE_URL = _cursor.getString(_cursorIndexOfSKYPEURL2);
                    }
                    int i7 = _cursorIndexOfSKYPEURL2;
                    int _cursorIndexOfVINEURL2 = _cursorIndexOfAADHARCARDNO;
                    if (_cursor.isNull(_cursorIndexOfVINEURL2) != 0) {
                        _tmpAADHAR_CARD_NO = null;
                    } else {
                        _tmpAADHAR_CARD_NO = _cursor.getString(_cursorIndexOfVINEURL2);
                    }
                    int i8 = _cursorIndexOfVINEURL2;
                    int _cursorIndexOfPANCARDNO2 = _cursorIndexOfPANCARDNO;
                    if (_cursor.isNull(_cursorIndexOfPANCARDNO2) != 0) {
                        _tmpPAN_CARD_NO = null;
                    } else {
                        _tmpPAN_CARD_NO = _cursor.getString(_cursorIndexOfPANCARDNO2);
                    }
                    int i9 = _cursorIndexOfPANCARDNO2;
                    int _cursorIndexOfBANK2 = _cursorIndexOfBANK;
                    if (_cursor.isNull(_cursorIndexOfBANK2) != 0) {
                        _tmpBANK = null;
                    } else {
                        _tmpBANK = _cursor.getString(_cursorIndexOfBANK2);
                    }
                    int i10 = _cursorIndexOfBANK2;
                    int _cursorIndexOfBANK3 = _cursorIndexOfBNAME;
                    if (_cursor.isNull(_cursorIndexOfBANK3) != 0) {
                        _tmpB_NAME = null;
                    } else {
                        _tmpB_NAME = _cursor.getString(_cursorIndexOfBANK3);
                    }
                    int i11 = _cursorIndexOfBANK3;
                    int _cursorIndexOfACHOLDERNAME2 = _cursorIndexOfACHOLDERNAME;
                    if (_cursor.isNull(_cursorIndexOfACHOLDERNAME2) != 0) {
                        _tmpAC_HOLDER_NAME = null;
                    } else {
                        _tmpAC_HOLDER_NAME = _cursor.getString(_cursorIndexOfACHOLDERNAME2);
                    }
                    int i12 = _cursorIndexOfACHOLDERNAME2;
                    int _cursorIndexOfACHOLDERNAME3 = _cursorIndexOfACNUM;
                    if (_cursor.isNull(_cursorIndexOfACHOLDERNAME3) != 0) {
                        _tmpAC_NUM = null;
                    } else {
                        _tmpAC_NUM = _cursor.getString(_cursorIndexOfACHOLDERNAME3);
                    }
                    int i13 = _cursorIndexOfACHOLDERNAME3;
                    int _cursorIndexOfIFSCCODE2 = _cursorIndexOfIFSCCODE;
                    if (_cursor.isNull(_cursorIndexOfIFSCCODE2) != 0) {
                        _tmpIFSC_CODE = null;
                    } else {
                        _tmpIFSC_CODE = _cursor.getString(_cursorIndexOfIFSCCODE2);
                    }
                    int i14 = _cursorIndexOfIFSCCODE2;
                    int _cursorIndexOfPASSBOOK2 = _cursorIndexOfPASSBOOK;
                    if (_cursor.isNull(_cursorIndexOfPASSBOOK2) != 0) {
                        _tmpPASSBOOK = null;
                    } else {
                        _tmpPASSBOOK = _cursor.getString(_cursorIndexOfPASSBOOK2);
                    }
                    if (_cursor.isNull(_cursorIndexOfDATE)) {
                        _tmpDATE = null;
                    } else {
                        _tmpDATE = _cursor.getString(_cursorIndexOfDATE);
                    }
                    int i15 = _cursorIndexOfDATE;
                    int _cursorIndexOfCURRENTUSERID3 = _cursorIndexOfCURRENTUSERID2;
                    int _cursorIndexOfCURRENTUSERID4 = _cursorIndexOfPASSBOOK2;
                    int _cursorIndexOfPASSBOOK3 = _cursor.getInt(_cursorIndexOfCURRENTUSERID3);
                    int i16 = _cursorIndexOfCURRENTUSERID3;
                    UserProfile _result2 = new UserProfile(_tmpPROFILE_IMG, _tmpMAIN_OWNER, _tmpMAIN_OWNER_ID, _tmpOWNER_ID, _tmpUSER_ID, _tmpALTERNATE_PHONE_NO, _tmpDOB, _tmpGENDER, _tmpCOUNTRY, _tmpSTATE, _tmpFACEBOOK_URL, _tmpTWITTER_URL, _tmpLINKEDIN_URL, _tmpINSTAGRAM_URL, _tmpDRIBBLE_BOX_URL, _tmpDROPBOX_URL, _tmpGOOGLE_PLUS_URL, _tmpPINTEREST_URL, _tmpSKYPE_URL, _tmpVINE_URL, _tmpAADHAR_CARD_NO, _tmpPAN_CARD_NO, _tmpBANK, _tmpB_NAME, _tmpAC_HOLDER_NAME, _tmpAC_NUM, _tmpIFSC_CODE, _tmpPASSBOOK, _tmpDATE);
                    _result2.CURRENT_USER_ID = _cursorIndexOfPASSBOOK3;
                    int _cursorIndexOfUId3 = _cursorIndexOfUId2;
                    int _cursorIndexOfUId4 = _cursorIndexOfTWITTERURL;
                    _result2.uId = _cursor.getInt(_cursorIndexOfUId3);
                    _result = _result2;
                } else {
                    int i17 = _cursorIndexOfFACEBOOKURL;
                    int _cursorIndexOfFACEBOOKURL3 = _cursorIndexOfUId2;
                    int i18 = _cursorIndexOfCURRENTUSERID2;
                    int i19 = _cursorIndexOfDRIBBLEBOXURL;
                    int i20 = _cursorIndexOfDROPBOXURL;
                    int i21 = _cursorIndexOfGOOGLEPLUSURL;
                    int i22 = _cursorIndexOfPINTERESTURL;
                    int i23 = _cursorIndexOfSKYPEURL;
                    int i24 = _cursorIndexOfVINEURL;
                    int i25 = _cursorIndexOfAADHARCARDNO;
                    int i26 = _cursorIndexOfPANCARDNO;
                    int i27 = _cursorIndexOfBANK;
                    int i28 = _cursorIndexOfBNAME;
                    int i29 = _cursorIndexOfACHOLDERNAME;
                    int i30 = _cursorIndexOfACNUM;
                    int i31 = _cursorIndexOfIFSCCODE;
                    int _cursorIndexOfCURRENTUSERID5 = _cursorIndexOfPASSBOOK;
                    int _cursorIndexOfUId5 = _cursorIndexOfTWITTERURL;
                    _result = null;
                }
                _cursor.close();
                _statement.release();
                return _result;
            } catch (Throwable th2) {
                th = th2;
                _cursor.close();
                _statement.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            Object obj2 = "SELECT * FROM user_profile WHERE uId = CURRENT_USER_ID";
            _statement = _statement2;
            _cursor.close();
            _statement.release();
            throw th;
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
