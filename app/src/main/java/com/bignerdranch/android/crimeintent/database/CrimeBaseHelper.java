package com.bignerdranch.android.crimeintent.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bignerdranch.android.crimeintent.database.CrimeDbSchema.CrimeTable;
/**
 * Created by princess123 on 21/09/2016.
 */
public  class CrimeBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "crimeBase.db";

    public CrimeBaseHelper(Context context){
        super (context, DATABASE_NAME, null,VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table " + CrimeDbSchema.CrimeTable.NAME + "("+
                "_id integer primary key autoincrement,"+
                CrimeTable.Cols.UUID + ", " +
                CrimeTable.Cols.TITLE + ", " +
                CrimeTable.Cols.DATE + ", " +
                CrimeTable.Cols.SOLVED + ", " +
                CrimeTable.Cols.SUSPECT +
                ")"
        );



    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
