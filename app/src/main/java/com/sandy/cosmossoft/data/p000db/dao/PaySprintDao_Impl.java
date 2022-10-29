package com.sandy.cosmossoft.data.p000db.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p003db.SupportSQLiteStatement;
import com.itextpdf.text.xml.xmp.DublinCoreProperties;
import com.sandy.cosmossoft.data.p000db.entities.PaySprintApi;
import java.util.Collections;
import java.util.List;

/* renamed from: com.sandy.cosmossoft.data.db.dao.PaySprintDao_Impl */
public final class PaySprintDao_Impl implements PaySprintDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<PaySprintApi> __insertionAdapterOfPaySprintApi;
    private final SharedSQLiteStatement __preparedStmtOfLoggedOut;

    public PaySprintDao_Impl(RoomDatabase __db2) {
        this.__db = __db2;
        this.__insertionAdapterOfPaySprintApi = new EntityInsertionAdapter<PaySprintApi>(__db2) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `paysprint_api` (`CURRENT_USER_ID`,`uId`,`id`,`owner`,`ownerid`,`partnerid`,`merchantcode`,`firm`,`jwtkey`,`authorisedkey`,`status`,`key`,`keyiv`,`date`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement stmt, PaySprintApi value) {
                stmt.bindLong(1, (long) value.CURRENT_USER_ID);
                stmt.bindLong(2, (long) value.uId);
                if (value.f8id == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.f8id);
                }
                if (value.owner == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.owner);
                }
                if (value.ownerid == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.ownerid);
                }
                if (value.partnerid == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.partnerid);
                }
                if (value.merchantcode == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.merchantcode);
                }
                if (value.firm == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.firm);
                }
                if (value.jwtkey == null) {
                    stmt.bindNull(9);
                } else {
                    stmt.bindString(9, value.jwtkey);
                }
                if (value.authorisedkey == null) {
                    stmt.bindNull(10);
                } else {
                    stmt.bindString(10, value.authorisedkey);
                }
                if (value.status == null) {
                    stmt.bindNull(11);
                } else {
                    stmt.bindString(11, value.status);
                }
                if (value.key == null) {
                    stmt.bindNull(12);
                } else {
                    stmt.bindString(12, value.key);
                }
                if (value.keyiv == null) {
                    stmt.bindNull(13);
                } else {
                    stmt.bindString(13, value.keyiv);
                }
                if (value.date == null) {
                    stmt.bindNull(14);
                } else {
                    stmt.bindString(14, value.date);
                }
            }
        };
        this.__preparedStmtOfLoggedOut = new SharedSQLiteStatement(__db2) {
            public String createQuery() {
                return "DELETE FROM paysprint_api";
            }
        };
    }

    public long insert(PaySprintApi paySprintApi) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long _result = this.__insertionAdapterOfPaySprintApi.insertAndReturnId(paySprintApi);
            this.__db.setTransactionSuccessful();
            return _result;
        } finally {
            this.__db.endTransaction();
        }
    }

    public void loggedOut() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement _stmt = this.__preparedStmtOfLoggedOut.acquire();
        this.__db.beginTransaction();
        try {
            _stmt.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfLoggedOut.release(_stmt);
        }
    }

    public PaySprintApi getRegularPaySprint() {
        PaySprintApi _result;
        String _tmpId;
        String _tmpOwner;
        String _tmpOwnerid;
        String _tmpPartnerid;
        String _tmpMerchantcode;
        String _tmpFirm;
        String _tmpJwtkey;
        String _tmpAuthorisedkey;
        String _tmpStatus;
        String _tmpKey;
        String _tmpKeyiv;
        String _tmpDate;
        RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire("SELECT * FROM paysprint_api WHERE uId = CURRENT_USER_ID", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor _cursor = DBUtil.query(this.__db, _statement, false, (CancellationSignal) null);
        try {
            int _cursorIndexOfCURRENTUSERID = CursorUtil.getColumnIndexOrThrow(_cursor, "CURRENT_USER_ID");
            int _cursorIndexOfUId = CursorUtil.getColumnIndexOrThrow(_cursor, "uId");
            int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, Name.MARK);
            int _cursorIndexOfOwner = CursorUtil.getColumnIndexOrThrow(_cursor, "owner");
            int _cursorIndexOfOwnerid = CursorUtil.getColumnIndexOrThrow(_cursor, "ownerid");
            int _cursorIndexOfPartnerid = CursorUtil.getColumnIndexOrThrow(_cursor, "partnerid");
            int _cursorIndexOfMerchantcode = CursorUtil.getColumnIndexOrThrow(_cursor, "merchantcode");
            int _cursorIndexOfFirm = CursorUtil.getColumnIndexOrThrow(_cursor, "firm");
            int _cursorIndexOfJwtkey = CursorUtil.getColumnIndexOrThrow(_cursor, "jwtkey");
            int _cursorIndexOfAuthorisedkey = CursorUtil.getColumnIndexOrThrow(_cursor, "authorisedkey");
            int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
            int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
            int _cursorIndexOfKeyiv = CursorUtil.getColumnIndexOrThrow(_cursor, "keyiv");
            Object obj = "SELECT * FROM paysprint_api WHERE uId = CURRENT_USER_ID";
            try {
                int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, DublinCoreProperties.DATE);
                if (_cursor.moveToFirst()) {
                    if (_cursor.isNull(_cursorIndexOfId)) {
                        _tmpId = null;
                    } else {
                        _tmpId = _cursor.getString(_cursorIndexOfId);
                    }
                    if (_cursor.isNull(_cursorIndexOfOwner)) {
                        _tmpOwner = null;
                    } else {
                        _tmpOwner = _cursor.getString(_cursorIndexOfOwner);
                    }
                    if (_cursor.isNull(_cursorIndexOfOwnerid)) {
                        _tmpOwnerid = null;
                    } else {
                        _tmpOwnerid = _cursor.getString(_cursorIndexOfOwnerid);
                    }
                    if (_cursor.isNull(_cursorIndexOfPartnerid)) {
                        _tmpPartnerid = null;
                    } else {
                        _tmpPartnerid = _cursor.getString(_cursorIndexOfPartnerid);
                    }
                    if (_cursor.isNull(_cursorIndexOfMerchantcode)) {
                        _tmpMerchantcode = null;
                    } else {
                        _tmpMerchantcode = _cursor.getString(_cursorIndexOfMerchantcode);
                    }
                    if (_cursor.isNull(_cursorIndexOfFirm)) {
                        _tmpFirm = null;
                    } else {
                        _tmpFirm = _cursor.getString(_cursorIndexOfFirm);
                    }
                    if (_cursor.isNull(_cursorIndexOfJwtkey)) {
                        _tmpJwtkey = null;
                    } else {
                        _tmpJwtkey = _cursor.getString(_cursorIndexOfJwtkey);
                    }
                    if (_cursor.isNull(_cursorIndexOfAuthorisedkey)) {
                        _tmpAuthorisedkey = null;
                    } else {
                        _tmpAuthorisedkey = _cursor.getString(_cursorIndexOfAuthorisedkey);
                    }
                    if (_cursor.isNull(_cursorIndexOfStatus)) {
                        _tmpStatus = null;
                    } else {
                        _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
                    }
                    if (_cursor.isNull(_cursorIndexOfKey)) {
                        _tmpKey = null;
                    } else {
                        _tmpKey = _cursor.getString(_cursorIndexOfKey);
                    }
                    if (_cursor.isNull(_cursorIndexOfKeyiv)) {
                        _tmpKeyiv = null;
                    } else {
                        _tmpKeyiv = _cursor.getString(_cursorIndexOfKeyiv);
                    }
                    if (_cursor.isNull(_cursorIndexOfDate)) {
                        _tmpDate = null;
                    } else {
                        _tmpDate = _cursor.getString(_cursorIndexOfDate);
                    }
                    int i = _cursorIndexOfKeyiv;
                    int _cursorIndexOfKeyiv2 = _cursor.getInt(_cursorIndexOfCURRENTUSERID);
                    int i2 = _cursorIndexOfCURRENTUSERID;
                    PaySprintApi _result2 = new PaySprintApi(_tmpId, _tmpOwner, _tmpOwnerid, _tmpPartnerid, _tmpMerchantcode, _tmpFirm, _tmpJwtkey, _tmpAuthorisedkey, _tmpStatus, _tmpKey, _tmpKeyiv, _tmpDate);
                    _result2.CURRENT_USER_ID = _cursorIndexOfKeyiv2;
                    _result2.uId = _cursor.getInt(_cursorIndexOfUId);
                    _result = _result2;
                } else {
                    int i3 = _cursorIndexOfKeyiv;
                    _result = null;
                }
                _cursor.close();
                _statement.release();
                return _result;
            } catch (Throwable th) {
                th = th;
                _cursor.close();
                _statement.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Object obj2 = "SELECT * FROM paysprint_api WHERE uId = CURRENT_USER_ID";
            _cursor.close();
            _statement.release();
            throw th;
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
