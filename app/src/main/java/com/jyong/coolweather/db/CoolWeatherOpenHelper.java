package com.jyong.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by  on 2015/9/6.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    public static final String CREATE_PROVINCE = "CREATE TABLE Province( " +
            "id integer primary key AUTOINCREMENT," +
            "province_name text," +
            "province_code text) ";

    public static final String CREATE_CITY ="CREATE TABLE City(" +
            "id integer primary key AUTOINCREMENT," +
            "city_name text, " +
            "city_code text," +
            "province_id integer)";

    public static final  String CREATE_COUNTY = "CREATE TABLE County(" +
            "id integer primary key AUTOINCREMENT," +
            "county_name text," +
            "county_code text," +
            "city_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
