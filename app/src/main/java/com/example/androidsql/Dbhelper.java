package com.example.androidsql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Dbhelper extends SQLiteOpenHelper {

    public Dbhelper(@Nullable Context context) {
        super(context, "stud.db", null,  1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("create table student(id text, name text," +
                "mark text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,
                          int oldVersion, int newVersion)
    {
        db.execSQL("drop table if exists student");
        onCreate(db);
    }
}
