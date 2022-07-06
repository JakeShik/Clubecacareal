package com.projeto.clubecacareal

import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns
import com.projeto.clubecacareal.dbhandler.CacadaDbTable
import com.projeto.clubecacareal.dbhandler.RegiaoCacaDbTable
import java.text.SimpleDateFormat
import java.util.*

data class Cacada(

    var numCacadores: Long,
    var dataCacada: String,
    var regiaoCaca: RegiaoCaca,
    var id: Long = -1
) {
    fun toContentValues() : ContentValues {
        val values = ContentValues()


        values.put(CacadaDbTable.FIELD_NUM_CACADORES, numCacadores)
        values.put(CacadaDbTable.FIELD_DATA, dataCacada)
        values.put(CacadaDbTable.FIELD_REGIAO_LOCALIZACAO, regiaoCaca.localizacao)
        values.put(CacadaDbTable.FIELD_REGIAO_ID, regiaoCaca.id)

        return values
    }

    companion object{
        fun fromCursor(cursor: Cursor): Cacada{
            val posId = cursor.getColumnIndex(BaseColumns._ID)
            val posNumCacadores = cursor.getColumnIndex(CacadaDbTable.FIELD_NUM_CACADORES)
            val posDataCacada = cursor.getColumnIndex(CacadaDbTable.FIELD_DATA)


            val posIdReg = cursor.getColumnIndex(RegiaoCacaDbTable.FIELD_ID)
            val posNomeAnimalReg = cursor.getColumnIndex(RegiaoCacaDbTable.FIELD_NOMEANIMAL)
            val posQtReg = cursor.getColumnIndex(RegiaoCacaDbTable.FIELD_QUANTIDADEANIMAIS)

            val posLocalizacao = cursor.getColumnIndex(RegiaoCacaDbTable.FIELD_LOCALIZACAO)

            val idRegiao = cursor.getLong(posIdReg)
          val nomeAnimalReg = cursor.getString(posNomeAnimalReg)
            val quantidadeAnimalReg = cursor.getLong(posQtReg)

            val localizacao = cursor.getLong(posLocalizacao)
            val regiao = RegiaoCaca(localizacao,nomeAnimalReg, quantidadeAnimalReg, idRegiao)



            val id = cursor.getLong(posId)
            val numCacadores = cursor.getLong(posNumCacadores)
            val dataCacada = cursor.getString(posDataCacada)




            return Cacada(numCacadores, dataCacada,regiao,id)
        }
    }

}