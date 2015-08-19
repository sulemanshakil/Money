package com.example.sulemanshakil.Money.Data;

import android.content.Context;


import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


/**
 * Created by Suleman Shakil on 07.08.2015.
 */
public class CategoriesDBHelper extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "category.db";
    private static final int DATABASE_VERSION = 1;
    public CategoriesDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}