package com.projeto.clubecacareal

import android.database.sqlite.SQLiteDatabase
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.projeto.clubecacareal.dbhandler.CacadaDbOpenHelper
import com.projeto.clubecacareal.dbhandler.CacadaDbTable
import com.projeto.clubecacareal.dbhandler.RegiaoCacaDbTable
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class CacadaDbTest {
    private fun appContext() = InstrumentationRegistry.getInstrumentation().targetContext

    private fun getWritableDatabase(): SQLiteDatabase {
        val openHelper = CacadaDbOpenHelper(appContext())
        return openHelper.writableDatabase
    }

    private fun insertCacada(db: SQLiteDatabase, cacada: Cacada){
        cacada.id = CacadaDbTable(db).insert(cacada.toContentValues())
        assertNotEquals(-1, cacada.id)
    }

    private fun insertRegiaoCaca(db:SQLiteDatabase, regiaoCaca: RegiaoCaca){
        regiaoCaca.id= RegiaoCacaDbTable(db).insert(regiaoCaca.toContentValues())
        assertNotEquals(-1,regiaoCaca.id)
    }



    @Before
    fun deleteDatabase() {
        appContext().deleteDatabase(CacadaDbOpenHelper.NAME)
    }

    @Test
    fun canOpenDatabase(){
        val openHelper = CacadaDbOpenHelper(appContext())
        val db = openHelper.readableDatabase

        assertTrue(db.isOpen)

        db.close()
    }


    @Test
    fun canInsertCacada() {
        val db = getWritableDatabase()

        val regiaoCacada = RegiaoCaca(55598,"Javali",1000)
        insertRegiaoCaca(db, regiaoCacada)


        val cacadaTest = Cacada(20,"25-02-2023",6300669, regiaoCacada.id)
        insertCacada(db, cacadaTest)

        db.close()
    }


    @Test
    fun canInsertRegiaoCaca() {
        val db = getWritableDatabase()

        val regiaoCacada = RegiaoCaca(55598,"Javali",1000)
        insertRegiaoCaca(db, regiaoCacada)

        db.close()
    }
}