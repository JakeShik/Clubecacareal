package com.projeto.clubecacareal

import android.content.ContentValues

data class Cacador(
    var nome: String,
    var cartaoCidadao: Long,
    var id: Long = -1
) {
    fun toContentValues() : ContentValues {
        val values = ContentValues()


        return values
    }
}