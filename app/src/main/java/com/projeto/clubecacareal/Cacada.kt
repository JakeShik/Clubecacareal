package com.projeto.clubecacareal

import android.content.ContentValues
import com.projeto.clubecacareal.dbhandler.CacadaDbTable
import java.util.*
import android.database.Cursor
import android.provider.BaseColumns
import java.text.SimpleDateFormat

data class Cacada(
    var id: Long = -1,
    var numCacadores: String,
    var dataCacada: Date,
    var localizacao: Long,
) {
    fun toContentValues() : ContentValues {
        val values = ContentValues()


        values.put(CacadaDbTable.FIELD_NUM_CACADORES, numCacadores)
        values.put(CacadaDbTable.FIELD_DATA, dataCacada.toString())
        values.put(CacadaDbTable.FIELD_LOCALIZACAO, localizacao)

        return values
    }

}