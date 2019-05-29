package com.example.motorcyclepartsv01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datos = getList()

        recycler_list.layoutManager = LinearLayoutManager(this)
        recycler_list.hasFixedSize()
        recycler_list.adapter = DatosAdaptador(datos)

    }

    fun getList():ArrayList<Datos>{
        var lists = ArrayList<Datos>()
        lists.add(Datos("01/02/19","Kit de Arraste","10.000","5.000","120.000","120.000","Zona Llantas"))
        lists.add(Datos("15/03/19","Llantas Crosa R99","10.000","5.000","220.000","220.000","Zona Llantas"))
        lists.add(Datos("12/03/19","Cucuyos Led","10.000","5.000","10.000","10.000","Zona Llantas"))
        lists.add(Datos("07/04/19","Bujías de Iridium","10.000","5.000","90.000","90.000","Zona Llantas"))
        lists.add(Datos("02/05/19","Aceite Iphone","10.000","5.000","40.000","40.000","Zona Llantas"))
        lists.add(Datos("27/05/19","Filtro de aceite","10.000","5.000","10.000","10.000","Zona Llantas"))
        lists.add(Datos("27/05/19","Limpieza  Filto K&N","10.000","5.000","50.000","30.000","Zona Llantas"))

        return lists
    }
}
