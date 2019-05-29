package com.example.motorcyclepartsv01

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*

class DatosAdaptador (val motoList: ArrayList<Datos>):RecyclerView.Adapter<DatosAdaptador.ViewHolderDatos>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolderDatos {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.list_item,p0,false)
        return ViewHolderDatos(v)
    }

    override fun getItemCount(): Int {
        return motoList.size
    }

    override fun onBindViewHolder(p0: ViewHolderDatos, p1: Int) {
        p0.bindItem(motoList[p1])
    }


    class ViewHolderDatos(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItem(datos:Datos){
            itemView.id_fecha.text = datos.fecha
            itemView.id_repuesto_cambio.text = datos.item
            itemView.id_kilometraje_actual.text = datos.kmactual
            itemView.id_duracion_kilometraje.text = datos.kmduracion
            itemView.id_kilometraje_proximo_cambio.text = datos.kmcambio
            itemView.id_precio.text = datos.precio
            itemView.id_empresa.text = datos.local
        }
    }


}