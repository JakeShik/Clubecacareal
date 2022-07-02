package com.projeto.clubecacareal.dbhandler

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class CacadaDbOpenHelper(context: Context?) : SQLiteOpenHelper(context, NAME,null,VERSION) {
    override fun onCreate(db: SQLiteDatabase?) {
        requireNotNull(db)

        CacadaDbTable(db).create()
        //CacadoresDbTable(db).create()
        RegiaoCacaDbTable(db).create()
        //InscricaoCacaDbTable(db).create()
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    companion object{
        const val NAME = "books.db"
        const val VERSION = 1
    }
}