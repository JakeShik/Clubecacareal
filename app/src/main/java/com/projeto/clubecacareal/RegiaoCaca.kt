package com.projeto.clubecacareal

import android.content.ContentValues
import com.projeto.clubecacareal.dbhandler.RegiaoCacaDbTable

data class RegiaoCaca(
  var localizacao: Long,
  var nomeAnimal: String,
  var quantidadeAnimais: Long,
  var id: Long = -1
) {
  fun toContentValues() : ContentValues{
    val values = ContentValues()

    values.put(RegiaoCacaDbTable.FIELD_LOCALIZACAO, localizacao)
    values.put(RegiaoCacaDbTable.FIELD_NOMEANIMAL, nomeAnimal)
    values.put(RegiaoCacaDbTable.FIELD_QUANTIDADEANIMAIS, quantidadeAnimais)

    return values
  }
}