package com.projeto.clubecacareal

import android.content.ContentValues
import java.util.*

data class Cacada(
    var id: Long = -1,
    var numCacadores: String,
    var dataCacada: Date,
    var localizacao: Long,
) {
    fun toContentValues() : ContentValues {
        val values = ContentValues()


        return values
    }
}