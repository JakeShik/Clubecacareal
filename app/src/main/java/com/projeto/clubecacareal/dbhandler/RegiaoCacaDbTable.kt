package com.projeto.clubecacareal.dbhandler

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class RegiaoCacaDbTable(db: SQLiteDatabase) : DbTable(db, NAME) {
    override fun create() {
        db.execSQL("CREATE TABLE $name(${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$FIELD_LOCALIZACAO INTEGER NOT NULL, " +
                "$FIELD_NOMEANIMAL TEXT NOT NULL, " +
                "$FIELD_QUANTIDADEANIMAIS INTEGER NOT NULL)")
    }
    companion object {
        const val NAME = "regiaoCaca"
        const val FIELD_LOCALIZACAO = "localizacao"
        const val FIELD_NOMEANIMAL = "nomeAnimal"
        const val FIELD_QUANTIDADEANIMAIS = "quantidadeAnimais"

        const val FIELD_ID = "$NAME.${BaseColumns._ID}"
        val ALL_FIELDS = arrayOf(BaseColumns._ID, FIELD_LOCALIZACAO, FIELD_NOMEANIMAL, FIELD_QUANTIDADEANIMAIS)
    }
}