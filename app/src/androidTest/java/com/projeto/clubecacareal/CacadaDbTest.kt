package com.projeto.clubecacareal

import android.database.sqlite.SQLiteDatabase
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.projeto.clubecacareal.dbhandler.CacadaDbOpenHelper
import com.projeto.clubecacareal.dbhandler.CacadaDbTable
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CacadaDbTest {
    private fun appContext() = InstrumentationRegistry.getInstrumentation().targetContext

    private fun getWritableDatabase(): SQLiteDatabase {
        val openHelper = CacadaDbOpenHelper(appContext())
        return openHelper.writableDatabase
    }

    private fun instertCacada(db: SQLiteDatabase, cacada: Cacada){
        cacada.id = CacadaDbTable(db).insert()
    }
}