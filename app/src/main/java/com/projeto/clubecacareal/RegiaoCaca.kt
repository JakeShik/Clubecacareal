package com.projeto.clubecacareal

import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns
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


  companion object{
    fun fromCursor(cursor: Cursor) : RegiaoCaca {
      val posId=cursor.getColumnIndex(BaseColumns._ID)
      val posLocalizacao = cursor.getColumnIndex(RegiaoCacaDbTable.FIELD_LOCALIZACAO)
      val posNomeAnimal = cursor.getColumnIndex(RegiaoCacaDbTable.FIELD_NOMEANIMAL)
      val posQuantidadeAnimais = cursor.getColumnIndex(RegiaoCacaDbTable.FIELD_QUANTIDADEANIMAIS)


      val id = cursor.getLong(posId)
      val localizacao = cursor.getLong(posLocalizacao)
      val nomeAnimal = cursor.getString(posNomeAnimal)
      val quantidadeAnimais = cursor.getLong(posQuantidadeAnimais)


      return RegiaoCaca(localizacao, nomeAnimal, quantidadeAnimais, id)
    }
  }
}