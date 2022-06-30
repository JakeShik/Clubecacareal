package com.projeto.clubecacareal.dbhandler

import android.database.sqlite.SQLiteDatabase

abstract class DbTable(val db: SQLiteDatabase, val name: String) {
    abstract fun create()

    fun insert
}