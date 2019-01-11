package com.example.mustafa.sqlproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseManager extends SQLiteOpenHelper {

    private static final String DatabaseName = "myInfo.db";
    private static final int Version = 1;

    public DatabaseManager(Context cnt) {
        super(cnt, DatabaseName, null, Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
