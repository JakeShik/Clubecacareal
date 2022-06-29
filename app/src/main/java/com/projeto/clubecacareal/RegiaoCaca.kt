package com.projeto.clubecacareal

import android.content.ContentValues

data class RegiaoCaca(
  var id: Long = -1,
  var localizacao: Long,
  var nomeAnimal: String,
  var quantidadeAnimais: Long
) {
  fun toContentValues() : ContentValues{
    val values = ContentValues()
    return values
  }
}