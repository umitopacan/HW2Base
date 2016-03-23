package com.mis49m.hw2.hw2base;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DatabaseHandler extends SQLiteOpenHelper {

    //-- Database Version
    private static final int DATABASE_VERSION = 1;

    //-- Database Name
    private static final String DATABASE_NAME = "dbHW2";

    //-- Table name
    private static final String TABLE_CONTENT = "tblContent";

    //-- Columns names
    private static final String COL_KEY_ID = "id";
    private static final String COL_USERNAME = "username";
    private static final String COL_CONTENT = "content";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CONTENT + "("
                + COL_KEY_ID + " INTEGER PRIMARY KEY," + COL_USERNAME + " TEXT,"
                + COL_CONTENT + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTENT);
        onCreate(db);
    }


}
