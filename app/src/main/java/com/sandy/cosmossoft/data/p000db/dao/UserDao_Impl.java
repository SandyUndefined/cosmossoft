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
import com.sandy.cosmossoft.data.p000db.entities.User;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.sandy.cosmossoft.data.db.dao.UserDao_Impl */
public final class UserDao_Impl implements UserDao {
    /* access modifiers changed from: private */
    public final RoomDatabase __db;
    private final EntityInsertionAdapter<User> __insertionAdapterOfUser;
    private final SharedSQLiteStatement __preparedStmtOfLoggedOutUser;

    public UserDao_Impl(RoomDatabase __db2) {
        this.__db = __db2;
        this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db2) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `user` (`CURRENT_USER_ID`,`uId`,`email`,`mobile`,`password`,`name`,`lastname`,`ownerid`,`ownerstatus`,`userstatus`,`token`,`id`,`mainbalance`,`aepsbalance`,`userstatusname`,`pin`,`address`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement stmt, User value) {
                stmt.bindLong(1, (long) value.CURRENT_USER_ID);
                stmt.bindLong(2, (long) value.uId);
                if (value.email == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.email);
                }
                if (value.mobile == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.mobile);
                }
                if (value.password == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.password);
                }
                if (value.name == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.name);
                }
                if (value.lastname == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.lastname);
                }
                if (value.ownerid == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.ownerid);
                }
                if (value.ownerstatus == null) {
                    stmt.bindNull(9);
                } else {
                    stmt.bindString(9, value.ownerstatus);
                }
                if (value.userstatus == null) {
                    stmt.bindNull(10);
                } else {
                    stmt.bindString(10, value.userstatus);
                }
                if (value.token == null) {
                    stmt.bindNull(11);
                } else {
                    stmt.bindString(11, value.token);
                }
                if (value.f9id == null) {
                    stmt.bindNull(12);
                } else {
                    stmt.bindString(12, value.f9id);
                }
                if (value.mainbalance == null) {
                    stmt.bindNull(13);
                } else {
                    stmt.bindString(13, value.mainbalance);
                }
                if (value.aepsbalance == null) {
                    stmt.bindNull(14);
                } else {
                    stmt.bindString(14, value.aepsbalance);
                }
                if (value.userstatusname == null) {
                    stmt.bindNull(15);
                } else {
                    stmt.bindString(15, value.userstatusname);
                }
                if (value.pin == null) {
                    stmt.bindNull(16);
                } else {
                    stmt.bindString(16, value.pin);
                }
                if (value.address == null) {
                    stmt.bindNull(17);
                } else {
                    stmt.bindString(17, value.address);
                }
            }
        };
        this.__preparedStmtOfLoggedOutUser = new SharedSQLiteStatement(__db2) {
            public String createQuery() {
                return "DELETE FROM user";
            }
        };
    }

    public long insert(User user) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long _result = this.__insertionAdapterOfUser.insertAndReturnId(user);
            this.__db.setTransactionSuccessful();
            return _result;
        } finally {
            this.__db.endTransaction();
        }
    }

    public void loggedOutUser() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement _stmt = this.__preparedStmtOfLoggedOutUser.acquire();
        this.__db.beginTransaction();
        try {
            _stmt.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfLoggedOutUser.release(_stmt);
        }
    }

    public LiveData<User> getUser() {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire("SELECT * FROM user WHERE uId = CURRENT_USER_ID", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"user"}, false, new Callable<User>() {
            public User call() throws Exception {
                User _result;
                String _tmpEmail;
                String _tmpMobile;
                String _tmpPassword;
                String _tmpName;
                String _tmpLastname;
                String _tmpOwnerid;
                String _tmpOwnerstatus;
                String _tmpUserstatus;
                String _tmpToken;
                String _tmpId;
                String _tmpMainbalance;
                String _tmpAepsbalance;
                String _tmpUserstatusname;
                String _tmpPin;
                String _tmpAddress;
                Cursor _cursor = DBUtil.query(UserDao_Impl.this.__db, _statement, false, (CancellationSignal) null);
                try {
                    int _cursorIndexOfCURRENTUSERID = CursorUtil.getColumnIndexOrThrow(_cursor, "CURRENT_USER_ID");
                    int _cursorIndexOfUId = CursorUtil.getColumnIndexOrThrow(_cursor, "uId");
                    int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
                    int _cursorIndexOfMobile = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile");
                    int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
                    int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
                    int _cursorIndexOfLastname = CursorUtil.getColumnIndexOrThrow(_cursor, "lastname");
                    int _cursorIndexOfOwnerid = CursorUtil.getColumnIndexOrThrow(_cursor, "ownerid");
                    int _cursorIndexOfOwnerstatus = CursorUtil.getColumnIndexOrThrow(_cursor, "ownerstatus");
                    int _cursorIndexOfUserstatus = CursorUtil.getColumnIndexOrThrow(_cursor, "userstatus");
                    int _cursorIndexOfToken = CursorUtil.getColumnIndexOrThrow(_cursor, "token");
                    int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, Name.MARK);
                    int _cursorIndexOfMainbalance = CursorUtil.getColumnIndexOrThrow(_cursor, "mainbalance");
                    int _cursorIndexOfAepsbalance = CursorUtil.getColumnIndexOrThrow(_cursor, "aepsbalance");
                    int _cursorIndexOfUserstatusname = CursorUtil.getColumnIndexOrThrow(_cursor, "userstatusname");
                    int _cursorIndexOfUId2 = _cursorIndexOfUId;
                    int _cursorIndexOfPin = CursorUtil.getColumnIndexOrThrow(_cursor, "pin");
                    int _cursorIndexOfCURRENTUSERID2 = _cursorIndexOfCURRENTUSERID;
                    int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
                    if (_cursor.moveToFirst()) {
                        if (_cursor.isNull(_cursorIndexOfEmail)) {
                            _tmpEmail = null;
                        } else {
                            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
                        }
                        if (_cursor.isNull(_cursorIndexOfMobile)) {
                            _tmpMobile = null;
                        } else {
                            _tmpMobile = _cursor.getString(_cursorIndexOfMobile);
                        }
                        if (_cursor.isNull(_cursorIndexOfPassword)) {
                            _tmpPassword = null;
                        } else {
                            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
                        }
                        if (_cursor.isNull(_cursorIndexOfName)) {
                            _tmpName = null;
                        } else {
                            _tmpName = _cursor.getString(_cursorIndexOfName);
                        }
                        if (_cursor.isNull(_cursorIndexOfLastname)) {
                            _tmpLastname = null;
                        } else {
                            _tmpLastname = _cursor.getString(_cursorIndexOfLastname);
                        }
                        if (_cursor.isNull(_cursorIndexOfOwnerid)) {
                            _tmpOwnerid = null;
                        } else {
                            _tmpOwnerid = _cursor.getString(_cursorIndexOfOwnerid);
                        }
                        if (_cursor.isNull(_cursorIndexOfOwnerstatus)) {
                            _tmpOwnerstatus = null;
                        } else {
                            _tmpOwnerstatus = _cursor.getString(_cursorIndexOfOwnerstatus);
                        }
                        if (_cursor.isNull(_cursorIndexOfUserstatus)) {
                            _tmpUserstatus = null;
                        } else {
                            _tmpUserstatus = _cursor.getString(_cursorIndexOfUserstatus);
                        }
                        if (_cursor.isNull(_cursorIndexOfToken)) {
                            _tmpToken = null;
                        } else {
                            _tmpToken = _cursor.getString(_cursorIndexOfToken);
                        }
                        if (_cursor.isNull(_cursorIndexOfId)) {
                            _tmpId = null;
                        } else {
                            _tmpId = _cursor.getString(_cursorIndexOfId);
                        }
                        if (_cursor.isNull(_cursorIndexOfMainbalance)) {
                            _tmpMainbalance = null;
                        } else {
                            _tmpMainbalance = _cursor.getString(_cursorIndexOfMainbalance);
                        }
                        if (_cursor.isNull(_cursorIndexOfAepsbalance)) {
                            _tmpAepsbalance = null;
                        } else {
                            _tmpAepsbalance = _cursor.getString(_cursorIndexOfAepsbalance);
                        }
                        if (_cursor.isNull(_cursorIndexOfUserstatusname)) {
                            _tmpUserstatusname = null;
                        } else {
                            _tmpUserstatusname = _cursor.getString(_cursorIndexOfUserstatusname);
                        }
                        if (_cursor.isNull(_cursorIndexOfPin)) {
                            _tmpPin = null;
                        } else {
                            _tmpPin = _cursor.getString(_cursorIndexOfPin);
                        }
                        if (_cursor.isNull(_cursorIndexOfAddress)) {
                            _tmpAddress = null;
                        } else {
                            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
                        }
                        int i = _cursorIndexOfAddress;
                        int _cursorIndexOfCURRENTUSERID3 = _cursorIndexOfCURRENTUSERID2;
                        int _cursorIndexOfCURRENTUSERID4 = _cursorIndexOfUserstatusname;
                        int _cursorIndexOfUserstatusname2 = _cursor.getInt(_cursorIndexOfCURRENTUSERID3);
                        int i2 = _cursorIndexOfCURRENTUSERID3;
                        User _result2 = new User(_tmpEmail, _tmpMobile, _tmpPassword, _tmpName, _tmpLastname, _tmpOwnerid, _tmpOwnerstatus, _tmpUserstatus, _tmpToken, _tmpId, _tmpMainbalance, _tmpAepsbalance, _tmpUserstatusname, _tmpPin, _tmpAddress);
                        _result2.CURRENT_USER_ID = _cursorIndexOfUserstatusname2;
                        int _cursorIndexOfUId3 = _cursorIndexOfUId2;
                        int _cursorIndexOfUId4 = _cursorIndexOfPin;
                        _result2.uId = _cursor.getInt(_cursorIndexOfUId3);
                        _result = _result2;
                    } else {
                        int i3 = _cursorIndexOfCURRENTUSERID2;
                        int _cursorIndexOfCURRENTUSERID5 = _cursorIndexOfUserstatusname;
                        int _cursorIndexOfUserstatusname3 = _cursorIndexOfUId2;
                        int _cursorIndexOfUId5 = _cursorIndexOfPin;
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

    public User getRegularUser() {
        RoomSQLiteQuery _statement;
        User _result;
        String _tmpEmail;
        String _tmpMobile;
        String _tmpPassword;
        String _tmpName;
        String _tmpLastname;
        String _tmpOwnerid;
        String _tmpOwnerstatus;
        String _tmpUserstatus;
        String _tmpToken;
        String _tmpId;
        String _tmpMainbalance;
        String _tmpAepsbalance;
        String _tmpUserstatusname;
        String _tmpPin;
        String _tmpAddress;
        RoomSQLiteQuery _statement2 = RoomSQLiteQuery.acquire("SELECT * FROM user WHERE uId = CURRENT_USER_ID", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor _cursor = DBUtil.query(this.__db, _statement2, false, (CancellationSignal) null);
        try {
            int _cursorIndexOfCURRENTUSERID = CursorUtil.getColumnIndexOrThrow(_cursor, "CURRENT_USER_ID");
            int _cursorIndexOfUId = CursorUtil.getColumnIndexOrThrow(_cursor, "uId");
            int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
            int _cursorIndexOfMobile = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile");
            int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
            int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            int _cursorIndexOfLastname = CursorUtil.getColumnIndexOrThrow(_cursor, "lastname");
            int _cursorIndexOfOwnerid = CursorUtil.getColumnIndexOrThrow(_cursor, "ownerid");
            int _cursorIndexOfOwnerstatus = CursorUtil.getColumnIndexOrThrow(_cursor, "ownerstatus");
            int _cursorIndexOfUserstatus = CursorUtil.getColumnIndexOrThrow(_cursor, "userstatus");
            int _cursorIndexOfToken = CursorUtil.getColumnIndexOrThrow(_cursor, "token");
            int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, Name.MARK);
            int _cursorIndexOfMainbalance = CursorUtil.getColumnIndexOrThrow(_cursor, "mainbalance");
            Object obj = "SELECT * FROM user WHERE uId = CURRENT_USER_ID";
            try {
                int _cursorIndexOfAepsbalance = CursorUtil.getColumnIndexOrThrow(_cursor, "aepsbalance");
                _statement = _statement2;
                try {
                    int _cursorIndexOfUserstatusname = CursorUtil.getColumnIndexOrThrow(_cursor, "userstatusname");
                    int _cursorIndexOfUId2 = _cursorIndexOfUId;
                    int _cursorIndexOfPin = CursorUtil.getColumnIndexOrThrow(_cursor, "pin");
                    int _cursorIndexOfCURRENTUSERID2 = _cursorIndexOfCURRENTUSERID;
                    int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
                    if (_cursor.moveToFirst()) {
                        if (_cursor.isNull(_cursorIndexOfEmail)) {
                            _tmpEmail = null;
                        } else {
                            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
                        }
                        if (_cursor.isNull(_cursorIndexOfMobile)) {
                            _tmpMobile = null;
                        } else {
                            _tmpMobile = _cursor.getString(_cursorIndexOfMobile);
                        }
                        if (_cursor.isNull(_cursorIndexOfPassword)) {
                            _tmpPassword = null;
                        } else {
                            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
                        }
                        if (_cursor.isNull(_cursorIndexOfName)) {
                            _tmpName = null;
                        } else {
                            _tmpName = _cursor.getString(_cursorIndexOfName);
                        }
                        if (_cursor.isNull(_cursorIndexOfLastname)) {
                            _tmpLastname = null;
                        } else {
                            _tmpLastname = _cursor.getString(_cursorIndexOfLastname);
                        }
                        if (_cursor.isNull(_cursorIndexOfOwnerid)) {
                            _tmpOwnerid = null;
                        } else {
                            _tmpOwnerid = _cursor.getString(_cursorIndexOfOwnerid);
                        }
                        if (_cursor.isNull(_cursorIndexOfOwnerstatus)) {
                            _tmpOwnerstatus = null;
                        } else {
                            _tmpOwnerstatus = _cursor.getString(_cursorIndexOfOwnerstatus);
                        }
                        if (_cursor.isNull(_cursorIndexOfUserstatus)) {
                            _tmpUserstatus = null;
                        } else {
                            _tmpUserstatus = _cursor.getString(_cursorIndexOfUserstatus);
                        }
                        if (_cursor.isNull(_cursorIndexOfToken)) {
                            _tmpToken = null;
                        } else {
                            _tmpToken = _cursor.getString(_cursorIndexOfToken);
                        }
                        if (_cursor.isNull(_cursorIndexOfId)) {
                            _tmpId = null;
                        } else {
                            _tmpId = _cursor.getString(_cursorIndexOfId);
                        }
                        if (_cursor.isNull(_cursorIndexOfMainbalance)) {
                            _tmpMainbalance = null;
                        } else {
                            _tmpMainbalance = _cursor.getString(_cursorIndexOfMainbalance);
                        }
                        if (_cursor.isNull(_cursorIndexOfAepsbalance)) {
                            _tmpAepsbalance = null;
                        } else {
                            _tmpAepsbalance = _cursor.getString(_cursorIndexOfAepsbalance);
                        }
                        if (_cursor.isNull(_cursorIndexOfUserstatusname)) {
                            _tmpUserstatusname = null;
                        } else {
                            _tmpUserstatusname = _cursor.getString(_cursorIndexOfUserstatusname);
                        }
                        if (_cursor.isNull(_cursorIndexOfPin)) {
                            _tmpPin = null;
                        } else {
                            _tmpPin = _cursor.getString(_cursorIndexOfPin);
                        }
                        if (_cursor.isNull(_cursorIndexOfAddress)) {
                            _tmpAddress = null;
                        } else {
                            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
                        }
                        int i = _cursorIndexOfAddress;
                        int _cursorIndexOfCURRENTUSERID3 = _cursorIndexOfCURRENTUSERID2;
                        int _cursorIndexOfCURRENTUSERID4 = _cursorIndexOfMainbalance;
                        int _cursorIndexOfMainbalance2 = _cursor.getInt(_cursorIndexOfCURRENTUSERID3);
                        int i2 = _cursorIndexOfCURRENTUSERID3;
                        User _result2 = new User(_tmpEmail, _tmpMobile, _tmpPassword, _tmpName, _tmpLastname, _tmpOwnerid, _tmpOwnerstatus, _tmpUserstatus, _tmpToken, _tmpId, _tmpMainbalance, _tmpAepsbalance, _tmpUserstatusname, _tmpPin, _tmpAddress);
                        _result2.CURRENT_USER_ID = _cursorIndexOfMainbalance2;
                        int _cursorIndexOfUId3 = _cursorIndexOfUId2;
                        int _cursorIndexOfUId4 = _cursorIndexOfAepsbalance;
                        _result2.uId = _cursor.getInt(_cursorIndexOfUId3);
                        _result = _result2;
                    } else {
                        int i3 = _cursorIndexOfCURRENTUSERID2;
                        int _cursorIndexOfCURRENTUSERID5 = _cursorIndexOfMainbalance;
                        int _cursorIndexOfMainbalance3 = _cursorIndexOfUId2;
                        int _cursorIndexOfUId5 = _cursorIndexOfAepsbalance;
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
                _statement = _statement2;
                _cursor.close();
                _statement.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            Object obj2 = "SELECT * FROM user WHERE uId = CURRENT_USER_ID";
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
