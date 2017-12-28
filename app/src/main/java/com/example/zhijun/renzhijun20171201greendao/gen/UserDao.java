package com.example.zhijun.renzhijun20171201greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.zhijun.renzhijun20171201greendao.User;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER".
*/
public class UserDao extends AbstractDao<User, Long> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property UId = new Property(0, Long.class, "uId", true, "_id");
        public final static Property UName = new Property(1, String.class, "uName", false, "U_NAME");
        public final static Property UAge = new Property(2, Integer.class, "uAge", false, "U_AGE");
        public final static Property USex = new Property(3, Integer.class, "uSex", false, "U_SEX");
        public final static Property UTel = new Property(4, String.class, "uTel", false, "U_TEL");
    }


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: uId
                "\"U_NAME\" TEXT," + // 1: uName
                "\"U_AGE\" INTEGER," + // 2: uAge
                "\"U_SEX\" INTEGER," + // 3: uSex
                "\"U_TEL\" TEXT);"); // 4: uTel
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long uId = entity.getUId();
        if (uId != null) {
            stmt.bindLong(1, uId);
        }
 
        String uName = entity.getUName();
        if (uName != null) {
            stmt.bindString(2, uName);
        }
 
        Integer uAge = entity.getUAge();
        if (uAge != null) {
            stmt.bindLong(3, uAge);
        }
 
        Integer uSex = entity.getUSex();
        if (uSex != null) {
            stmt.bindLong(4, uSex);
        }
 
        String uTel = entity.getUTel();
        if (uTel != null) {
            stmt.bindString(5, uTel);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long uId = entity.getUId();
        if (uId != null) {
            stmt.bindLong(1, uId);
        }
 
        String uName = entity.getUName();
        if (uName != null) {
            stmt.bindString(2, uName);
        }
 
        Integer uAge = entity.getUAge();
        if (uAge != null) {
            stmt.bindLong(3, uAge);
        }
 
        Integer uSex = entity.getUSex();
        if (uSex != null) {
            stmt.bindLong(4, uSex);
        }
 
        String uTel = entity.getUTel();
        if (uTel != null) {
            stmt.bindString(5, uTel);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // uId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // uName
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // uAge
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // uSex
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // uTel
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setUId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUAge(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setUSex(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setUTel(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(User entity, long rowId) {
        entity.setUId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(User entity) {
        if(entity != null) {
            return entity.getUId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(User entity) {
        return entity.getUId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}