package com.projeto.clubecacareal.dbhandler

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class CacadaDbTable(db: SQLiteDatabase) : DbTable(db, NAME) {
    override fun create() {
        db.execSQL("CREATE TABLE $name(${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$FIELD_NUM_CACADORES INTEGER NOT NULL, " +
                "$FIELD_DATA TEXT NOT NULL, " +
                "$FIELD_LOCALIZACAO INTEGER NOT NULL)")
    }
    companion object {
        const val NAME = "cacada"


        const val FIELD_NUM_CACADORES = "num_cacadores"
        const val FIELD_DATA = "data"
        const val FIELD_LOCALIZACAO = "localizacao"
        const val FIELD_REGIAO_ID = "regiao_id"

        val ALL_FIELDS = arrayOf(BaseColumns._ID, FIELD_NUM_CACADORES, FIELD_DATA, FIELD_LOCALIZACAO)
    }
}