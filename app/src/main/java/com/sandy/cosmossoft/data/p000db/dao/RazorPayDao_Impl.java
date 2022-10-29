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
import com.sandy.cosmossoft.data.p000db.entities.RazorpayData;
import java.util.Collections;
import java.util.List;

/* renamed from: com.sandy.cosmossoft.data.db.dao.RazorPayDao_Impl */
public final class RazorPayDao_Impl implements RazorPayDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<RazorpayData> __insertionAdapterOfRazorpayData;
    private final SharedSQLiteStatement __preparedStmtOfDeleteRazorPayData;

    public RazorPayDao_Impl(RoomDatabase __db2) {
        this.__db = __db2;
        this.__insertionAdapterOfRazorpayData = new EntityInsertionAdapter<RazorpayData>(__db2) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `razorpay_data` (`CURRENT_USER_ID`,`uId`,`api_key`,`name`,`description`,`image`,`currency`,`amount`,`date`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement stmt, RazorpayData value) {
                stmt.bindLong(1, (long) value.CURRENT_USER_ID);
                stmt.bindLong(2, (long) value.uId);
                if (value.api_key == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.api_key);
                }
                if (value.name == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.name);
                }
                if (value.description == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.description);
                }
                if (value.image == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.image);
                }
                if (value.currency == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.currency);
                }
                if (value.amount == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.amount);
                }
                if (value.date == null) {
                    stmt.bindNull(9);
                } else {
                    stmt.bindString(9, value.date);
                }
            }
        };
        this.__preparedStmtOfDeleteRazorPayData = new SharedSQLiteStatement(__db2) {
            public String createQuery() {
                return "DELETE FROM razorpay_data";
            }
        };
    }

    public long insert(RazorpayData razorpayData) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long _result = this.__insertionAdapterOfRazorpayData.insertAndReturnId(razorpayData);
            this.__db.setTransactionSuccessful();
            return _result;
        } finally {
            this.__db.endTransaction();
        }
    }

    public void deleteRazorPayData() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement _stmt = this.__preparedStmtOfDeleteRazorPayData.acquire();
        this.__db.beginTransaction();
        try {
            _stmt.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteRazorPayData.release(_stmt);
        }
    }

    public RazorpayData getRazorPayData() {
        RazorpayData _result;
        String _tmpApi_key;
        String _tmpName;
        String _tmpDescription;
        String _tmpImage;
        String _tmpCurrency;
        String _tmpAmount;
        String _tmpDate;
        RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire("SELECT * FROM razorpay_data WHERE uId = CURRENT_USER_ID", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor _cursor = DBUtil.query(this.__db, _statement, false, (CancellationSignal) null);
        try {
            int _cursorIndexOfCURRENTUSERID = CursorUtil.getColumnIndexOrThrow(_cursor, "CURRENT_USER_ID");
            int _cursorIndexOfUId = CursorUtil.getColumnIndexOrThrow(_cursor, "uId");
            int _cursorIndexOfApiKey = CursorUtil.getColumnIndexOrThrow(_cursor, "api_key");
            int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, DublinCoreProperties.DESCRIPTION);
            int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
            int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
            int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
            int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, DublinCoreProperties.DATE);
            if (_cursor.moveToFirst()) {
                if (_cursor.isNull(_cursorIndexOfApiKey)) {
                    _tmpApi_key = null;
                } else {
                    _tmpApi_key = _cursor.getString(_cursorIndexOfApiKey);
                }
                if (_cursor.isNull(_cursorIndexOfName)) {
                    _tmpName = null;
                } else {
                    _tmpName = _cursor.getString(_cursorIndexOfName);
                }
                if (_cursor.isNull(_cursorIndexOfDescription)) {
                    _tmpDescription = null;
                } else {
                    _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                }
                if (_cursor.isNull(_cursorIndexOfImage)) {
                    _tmpImage = null;
                } else {
                    _tmpImage = _cursor.getString(_cursorIndexOfImage);
                }
                if (_cursor.isNull(_cursorIndexOfCurrency)) {
                    _tmpCurrency = null;
                } else {
                    _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
                }
                if (_cursor.isNull(_cursorIndexOfAmount)) {
                    _tmpAmount = null;
                } else {
                    _tmpAmount = _cursor.getString(_cursorIndexOfAmount);
                }
                if (_cursor.isNull(_cursorIndexOfDate)) {
                    _tmpDate = null;
                } else {
                    _tmpDate = _cursor.getString(_cursorIndexOfDate);
                }
                _result = new RazorpayData(_tmpApi_key, _tmpName, _tmpDescription, _tmpImage, _tmpCurrency, _tmpAmount, _tmpDate);
                _result.CURRENT_USER_ID = _cursor.getInt(_cursorIndexOfCURRENTUSERID);
                _result.uId = _cursor.getInt(_cursorIndexOfUId);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _cursor.close();
            _statement.release();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
