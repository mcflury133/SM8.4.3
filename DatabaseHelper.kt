package com.example.simpleapp.utils

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase?) {
        // Create tables
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        // Handle database upgrade
    }

    companion object {
        private const val DATABASE_NAME = "simpleapp.db"
        private const val DATABASE_VERSION = 1
    }
}