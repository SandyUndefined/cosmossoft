package com.sandy.cosmossoft.data.p000db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.p003db.SupportSQLiteDatabase;
import androidx.sqlite.p003db.SupportSQLiteOpenHelper;
import com.itextpdf.text.xml.xmp.DublinCoreProperties;
import com.sandy.cosmossoft.data.p000db.dao.PaySprintDao;
import com.sandy.cosmossoft.data.p000db.dao.PaySprintDao_Impl;
import com.sandy.cosmossoft.data.p000db.dao.ProfileDao;
import com.sandy.cosmossoft.data.p000db.dao.ProfileDao_Impl;
import com.sandy.cosmossoft.data.p000db.dao.RazorPayDao;
import com.sandy.cosmossoft.data.p000db.dao.RazorPayDao_Impl;
import com.sandy.cosmossoft.data.p000db.dao.UserDao;
import com.sandy.cosmossoft.data.p000db.dao.UserDao_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.sandy.cosmossoft.data.db.AppDatabase_Impl */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile PaySprintDao _paySprintDao;
    private volatile ProfileDao _profileDao;
    private volatile RazorPayDao _razorPayDao;
    private volatile UserDao _userDao;

    /* access modifiers changed from: protected */
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(7) {
            public void createAllTables(SupportSQLiteDatabase _db) {
                _db.execSQL("CREATE TABLE IF NOT EXISTS `user` (`CURRENT_USER_ID` INTEGER NOT NULL, `uId` INTEGER NOT NULL, `email` TEXT, `mobile` TEXT, `password` TEXT, `name` TEXT, `lastname` TEXT, `ownerid` TEXT, `ownerstatus` TEXT, `userstatus` TEXT, `token` TEXT, `id` TEXT, `mainbalance` TEXT, `aepsbalance` TEXT, `userstatusname` TEXT, `pin` TEXT, `address` TEXT, PRIMARY KEY(`uId`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `paysprint_api` (`CURRENT_USER_ID` INTEGER NOT NULL, `uId` INTEGER NOT NULL, `id` TEXT, `owner` TEXT, `ownerid` TEXT, `partnerid` TEXT, `merchantcode` TEXT, `firm` TEXT, `jwtkey` TEXT, `authorisedkey` TEXT, `status` TEXT, `key` TEXT, `keyiv` TEXT, `date` TEXT, PRIMARY KEY(`uId`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `user_profile` (`CURRENT_USER_ID` INTEGER NOT NULL, `uId` INTEGER NOT NULL, `PROFILE_IMG` TEXT, `MAIN_OWNER` TEXT, `MAIN_OWNER_ID` TEXT, `OWNER_ID` TEXT, `USER_ID` TEXT, `ALTERNATE_PHONE_NO` TEXT, `DOB` TEXT, `GENDER` TEXT, `COUNTRY` TEXT, `STATE` TEXT, `FACEBOOK_URL` TEXT, `TWITTER_URL` TEXT, `LINKEDIN_URL` TEXT, `INSTAGRAM_URL` TEXT, `DRIBBLE_BOX_URL` TEXT, `DROPBOX_URL` TEXT, `GOOGLE_PLUS_URL` TEXT, `PINTEREST_URL` TEXT, `SKYPE_URL` TEXT, `VINE_URL` TEXT, `AADHAR_CARD_NO` TEXT, `PAN_CARD_NO` TEXT, `BANK` TEXT, `B_NAME` TEXT, `AC_HOLDER_NAME` TEXT, `AC_NUM` TEXT, `IFSC_CODE` TEXT, `PASSBOOK` TEXT, `DATE` TEXT, PRIMARY KEY(`uId`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `razorpay_data` (`CURRENT_USER_ID` INTEGER NOT NULL, `uId` INTEGER NOT NULL, `api_key` TEXT, `name` TEXT, `description` TEXT, `image` TEXT, `currency` TEXT, `amount` TEXT, `date` TEXT, PRIMARY KEY(`uId`))");
                _db.execSQL(RoomMasterTable.CREATE_QUERY);
                _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0e2099145f957ed1f8d6b61cbba37678')");
            }

            public void dropAllTables(SupportSQLiteDatabase _db) {
                _db.execSQL("DROP TABLE IF EXISTS `user`");
                _db.execSQL("DROP TABLE IF EXISTS `paysprint_api`");
                _db.execSQL("DROP TABLE IF EXISTS `user_profile`");
                _db.execSQL("DROP TABLE IF EXISTS `razorpay_data`");
                if (AppDatabase_Impl.this.mCallbacks != null) {
                    int _size = AppDatabase_Impl.this.mCallbacks.size();
                    for (int _i = 0; _i < _size; _i++) {
                        ((RoomDatabase.Callback) AppDatabase_Impl.this.mCallbacks.get(_i)).onDestructiveMigration(_db);
                    }
                }
            }

            /* access modifiers changed from: protected */
            public void onCreate(SupportSQLiteDatabase _db) {
                if (AppDatabase_Impl.this.mCallbacks != null) {
                    int _size = AppDatabase_Impl.this.mCallbacks.size();
                    for (int _i = 0; _i < _size; _i++) {
                        ((RoomDatabase.Callback) AppDatabase_Impl.this.mCallbacks.get(_i)).onCreate(_db);
                    }
                }
            }

            public void onOpen(SupportSQLiteDatabase _db) {
                SupportSQLiteDatabase unused = AppDatabase_Impl.this.mDatabase = _db;
                AppDatabase_Impl.this.internalInitInvalidationTracker(_db);
                if (AppDatabase_Impl.this.mCallbacks != null) {
                    int _size = AppDatabase_Impl.this.mCallbacks.size();
                    for (int _i = 0; _i < _size; _i++) {
                        ((RoomDatabase.Callback) AppDatabase_Impl.this.mCallbacks.get(_i)).onOpen(_db);
                    }
                }
            }

            public void onPreMigrate(SupportSQLiteDatabase _db) {
                DBUtil.dropFtsSyncTriggers(_db);
            }

            public void onPostMigrate(SupportSQLiteDatabase _db) {
            }

            /* access modifiers changed from: protected */
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
                SupportSQLiteDatabase supportSQLiteDatabase = _db;
                HashMap<String, TableInfo.Column> _columnsUser = new HashMap<>(17);
                _columnsUser.put("CURRENT_USER_ID", new TableInfo.Column("CURRENT_USER_ID", "INTEGER", true, 0, (String) null, 1));
                _columnsUser.put("uId", new TableInfo.Column("uId", "INTEGER", true, 1, (String) null, 1));
                _columnsUser.put("email", new TableInfo.Column("email", "TEXT", false, 0, (String) null, 1));
                _columnsUser.put("mobile", new TableInfo.Column("mobile", "TEXT", false, 0, (String) null, 1));
                _columnsUser.put("password", new TableInfo.Column("password", "TEXT", false, 0, (String) null, 1));
                _columnsUser.put("name", new TableInfo.Column("name", "TEXT", false, 0, (String) null, 1));
                _columnsUser.put("lastname", new TableInfo.Column("lastname", "TEXT", false, 0, (String) null, 1));
                _columnsUser.put("ownerid", new TableInfo.Column("ownerid", "TEXT", false, 0, (String) null, 1));
                _columnsUser.put("ownerstatus", new TableInfo.Column("ownerstatus", "TEXT", false, 0, (String) null, 1));
                _columnsUser.put("userstatus", new TableInfo.Column("userstatus", "TEXT", false, 0, (String) null, 1));
                _columnsUser.put("token", new TableInfo.Column("token", "TEXT", false, 0, (String) null, 1));
                _columnsUser.put(Name.MARK, new TableInfo.Column(Name.MARK, "TEXT", false, 0, (String) null, 1));
                _columnsUser.put("mainbalance", new TableInfo.Column("mainbalance", "TEXT", false, 0, (String) null, 1));
                _columnsUser.put("aepsbalance", new TableInfo.Column("aepsbalance", "TEXT", false, 0, (String) null, 1));
                _columnsUser.put("userstatusname", new TableInfo.Column("userstatusname", "TEXT", false, 0, (String) null, 1));
                _columnsUser.put("pin", new TableInfo.Column("pin", "TEXT", false, 0, (String) null, 1));
                _columnsUser.put("address", new TableInfo.Column("address", "TEXT", false, 0, (String) null, 1));
                HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<>(0);
                HashSet<TableInfo.Index> _indicesUser = new HashSet<>(0);
                TableInfo _infoUser = new TableInfo("user", _columnsUser, _foreignKeysUser, _indicesUser);
                TableInfo _existingUser = TableInfo.read(supportSQLiteDatabase, "user");
                if (!_infoUser.equals(_existingUser)) {
                    return new RoomOpenHelper.ValidationResult(false, "user(com.sandy.cosmossoft.data.db.entities.User).\n Expected:\n" + _infoUser + "\n Found:\n" + _existingUser);
                }
                HashMap<String, TableInfo.Column> _columnsPaysprintApi = new HashMap<>(14);
                TableInfo.Column column = r14;
                TableInfo.Column column2 = new TableInfo.Column("CURRENT_USER_ID", "INTEGER", true, 0, (String) null, 1);
                _columnsPaysprintApi.put("CURRENT_USER_ID", column);
                _columnsPaysprintApi.put("uId", new TableInfo.Column("uId", "INTEGER", true, 1, (String) null, 1));
                _columnsPaysprintApi.put(Name.MARK, new TableInfo.Column(Name.MARK, "TEXT", false, 0, (String) null, 1));
                _columnsPaysprintApi.put("owner", new TableInfo.Column("owner", "TEXT", false, 0, (String) null, 1));
                _columnsPaysprintApi.put("ownerid", new TableInfo.Column("ownerid", "TEXT", false, 0, (String) null, 1));
                _columnsPaysprintApi.put("partnerid", new TableInfo.Column("partnerid", "TEXT", false, 0, (String) null, 1));
                _columnsPaysprintApi.put("merchantcode", new TableInfo.Column("merchantcode", "TEXT", false, 0, (String) null, 1));
                _columnsPaysprintApi.put("firm", new TableInfo.Column("firm", "TEXT", false, 0, (String) null, 1));
                _columnsPaysprintApi.put("jwtkey", new TableInfo.Column("jwtkey", "TEXT", false, 0, (String) null, 1));
                _columnsPaysprintApi.put("authorisedkey", new TableInfo.Column("authorisedkey", "TEXT", false, 0, (String) null, 1));
                _columnsPaysprintApi.put("status", new TableInfo.Column("status", "TEXT", false, 0, (String) null, 1));
                _columnsPaysprintApi.put("key", new TableInfo.Column("key", "TEXT", false, 0, (String) null, 1));
                _columnsPaysprintApi.put("keyiv", new TableInfo.Column("keyiv", "TEXT", false, 0, (String) null, 1));
                _columnsPaysprintApi.put(DublinCoreProperties.DATE, new TableInfo.Column(DublinCoreProperties.DATE, "TEXT", false, 0, (String) null, 1));
                HashSet<TableInfo.ForeignKey> _foreignKeysPaysprintApi = new HashSet<>(0);
                HashSet<TableInfo.Index> _indicesPaysprintApi = new HashSet<>(0);
                TableInfo _infoPaysprintApi = new TableInfo("paysprint_api", _columnsPaysprintApi, _foreignKeysPaysprintApi, _indicesPaysprintApi);
                TableInfo _existingPaysprintApi = TableInfo.read(supportSQLiteDatabase, "paysprint_api");
                if (!_infoPaysprintApi.equals(_existingPaysprintApi)) {
                    return new RoomOpenHelper.ValidationResult(false, "paysprint_api(com.sandy.cosmossoft.data.db.entities.PaySprintApi).\n Expected:\n" + _infoPaysprintApi + "\n Found:\n" + _existingPaysprintApi);
                }
                HashMap<String, TableInfo.Column> hashMap = _columnsUser;
                HashSet<TableInfo.ForeignKey> hashSet = _foreignKeysUser;
                HashMap<String, TableInfo.Column> _columnsUserProfile = new HashMap<>(31);
                _columnsUserProfile.put("CURRENT_USER_ID", new TableInfo.Column("CURRENT_USER_ID", "INTEGER", true, 0, (String) null, 1));
                _columnsUserProfile.put("uId", new TableInfo.Column("uId", "INTEGER", true, 1, (String) null, 1));
                HashSet<TableInfo.ForeignKey> hashSet2 = _foreignKeysPaysprintApi;
                _columnsUserProfile.put("PROFILE_IMG", new TableInfo.Column("PROFILE_IMG", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("MAIN_OWNER", new TableInfo.Column("MAIN_OWNER", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("MAIN_OWNER_ID", new TableInfo.Column("MAIN_OWNER_ID", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("OWNER_ID", new TableInfo.Column("OWNER_ID", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("USER_ID", new TableInfo.Column("USER_ID", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("ALTERNATE_PHONE_NO", new TableInfo.Column("ALTERNATE_PHONE_NO", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("DOB", new TableInfo.Column("DOB", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("GENDER", new TableInfo.Column("GENDER", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("COUNTRY", new TableInfo.Column("COUNTRY", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("STATE", new TableInfo.Column("STATE", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("FACEBOOK_URL", new TableInfo.Column("FACEBOOK_URL", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("TWITTER_URL", new TableInfo.Column("TWITTER_URL", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("LINKEDIN_URL", new TableInfo.Column("LINKEDIN_URL", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("INSTAGRAM_URL", new TableInfo.Column("INSTAGRAM_URL", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("DRIBBLE_BOX_URL", new TableInfo.Column("DRIBBLE_BOX_URL", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("DROPBOX_URL", new TableInfo.Column("DROPBOX_URL", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("GOOGLE_PLUS_URL", new TableInfo.Column("GOOGLE_PLUS_URL", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("PINTEREST_URL", new TableInfo.Column("PINTEREST_URL", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("SKYPE_URL", new TableInfo.Column("SKYPE_URL", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("VINE_URL", new TableInfo.Column("VINE_URL", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("AADHAR_CARD_NO", new TableInfo.Column("AADHAR_CARD_NO", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("PAN_CARD_NO", new TableInfo.Column("PAN_CARD_NO", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("BANK", new TableInfo.Column("BANK", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("B_NAME", new TableInfo.Column("B_NAME", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("AC_HOLDER_NAME", new TableInfo.Column("AC_HOLDER_NAME", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("AC_NUM", new TableInfo.Column("AC_NUM", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("IFSC_CODE", new TableInfo.Column("IFSC_CODE", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("PASSBOOK", new TableInfo.Column("PASSBOOK", "TEXT", false, 0, (String) null, 1));
                _columnsUserProfile.put("DATE", new TableInfo.Column("DATE", "TEXT", false, 0, (String) null, 1));
                HashSet<TableInfo.ForeignKey> _foreignKeysUserProfile = new HashSet<>(0);
                HashSet<TableInfo.Index> hashSet3 = _indicesPaysprintApi;
                HashSet<TableInfo.Index> hashSet4 = _indicesUser;
                TableInfo _infoUserProfile = new TableInfo("user_profile", _columnsUserProfile, _foreignKeysUserProfile, new HashSet<>(0));
                TableInfo _existingUserProfile = TableInfo.read(supportSQLiteDatabase, "user_profile");
                if (!_infoUserProfile.equals(_existingUserProfile)) {
                    return new RoomOpenHelper.ValidationResult(false, "user_profile(com.sandy.cosmossoft.data.db.entities.UserProfile).\n Expected:\n" + _infoUserProfile + "\n Found:\n" + _existingUserProfile);
                }
                HashMap<String, TableInfo.Column> hashMap2 = _columnsUserProfile;
                HashSet<TableInfo.ForeignKey> hashSet5 = _foreignKeysUserProfile;
                HashMap<String, TableInfo.Column> _columnsRazorpayData = new HashMap<>(9);
                _columnsRazorpayData.put("CURRENT_USER_ID", new TableInfo.Column("CURRENT_USER_ID", "INTEGER", true, 0, (String) null, 1));
                _columnsRazorpayData.put("uId", new TableInfo.Column("uId", "INTEGER", true, 1, (String) null, 1));
                _columnsRazorpayData.put("api_key", new TableInfo.Column("api_key", "TEXT", false, 0, (String) null, 1));
                _columnsRazorpayData.put("name", new TableInfo.Column("name", "TEXT", false, 0, (String) null, 1));
                _columnsRazorpayData.put(DublinCoreProperties.DESCRIPTION, new TableInfo.Column(DublinCoreProperties.DESCRIPTION, "TEXT", false, 0, (String) null, 1));
                _columnsRazorpayData.put("image", new TableInfo.Column("image", "TEXT", false, 0, (String) null, 1));
                _columnsRazorpayData.put("currency", new TableInfo.Column("currency", "TEXT", false, 0, (String) null, 1));
                _columnsRazorpayData.put("amount", new TableInfo.Column("amount", "TEXT", false, 0, (String) null, 1));
                _columnsRazorpayData.put(DublinCoreProperties.DATE, new TableInfo.Column(DublinCoreProperties.DATE, "TEXT", false, 0, (String) null, 1));
                TableInfo _infoRazorpayData = new TableInfo("razorpay_data", _columnsRazorpayData, new HashSet<>(0), new HashSet<>(0));
                TableInfo _existingRazorpayData = TableInfo.read(supportSQLiteDatabase, "razorpay_data");
                if (!_infoRazorpayData.equals(_existingRazorpayData)) {
                    StringBuilder sb = new StringBuilder();
                    HashMap<String, TableInfo.Column> hashMap3 = _columnsRazorpayData;
                    sb.append("razorpay_data(com.sandy.cosmossoft.data.db.entities.RazorpayData).\n Expected:\n");
                    sb.append(_infoRazorpayData);
                    sb.append("\n Found:\n");
                    sb.append(_existingRazorpayData);
                    return new RoomOpenHelper.ValidationResult(false, sb.toString());
                }
                return new RoomOpenHelper.ValidationResult(true, (String) null);
            }
        }, "0e2099145f957ed1f8d6b61cbba37678", "4f9e5469cb9ee6dcb2b56b1de6f42e25")).build());
    }

    /* access modifiers changed from: protected */
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap<>(0), new HashMap<>(0), "user", "paysprint_api", "user_profile", "razorpay_data");
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            _db.execSQL("DELETE FROM `user`");
            _db.execSQL("DELETE FROM `paysprint_api`");
            _db.execSQL("DELETE FROM `user_profile`");
            _db.execSQL("DELETE FROM `razorpay_data`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            _db.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!_db.inTransaction()) {
                _db.execSQL("VACUUM");
            }
        }
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<>();
        _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
        _typeConvertersMap.put(PaySprintDao.class, PaySprintDao_Impl.getRequiredConverters());
        _typeConvertersMap.put(ProfileDao.class, ProfileDao_Impl.getRequiredConverters());
        _typeConvertersMap.put(RazorPayDao.class, RazorPayDao_Impl.getRequiredConverters());
        return _typeConvertersMap;
    }

    public UserDao getUserDao() {
        UserDao userDao;
        if (this._userDao != null) {
            return this._userDao;
        }
        synchronized (this) {
            if (this._userDao == null) {
                this._userDao = new UserDao_Impl(this);
            }
            userDao = this._userDao;
        }
        return userDao;
    }

    public PaySprintDao getPaySprint() {
        PaySprintDao paySprintDao;
        if (this._paySprintDao != null) {
            return this._paySprintDao;
        }
        synchronized (this) {
            if (this._paySprintDao == null) {
                this._paySprintDao = new PaySprintDao_Impl(this);
            }
            paySprintDao = this._paySprintDao;
        }
        return paySprintDao;
    }

    public ProfileDao getUserProfileDao() {
        ProfileDao profileDao;
        if (this._profileDao != null) {
            return this._profileDao;
        }
        synchronized (this) {
            if (this._profileDao == null) {
                this._profileDao = new ProfileDao_Impl(this);
            }
            profileDao = this._profileDao;
        }
        return profileDao;
    }

    public RazorPayDao getRazorPayDao() {
        RazorPayDao razorPayDao;
        if (this._razorPayDao != null) {
            return this._razorPayDao;
        }
        synchronized (this) {
            if (this._razorPayDao == null) {
                this._razorPayDao = new RazorPayDao_Impl(this);
            }
            razorPayDao = this._razorPayDao;
        }
        return razorPayDao;
    }
}
