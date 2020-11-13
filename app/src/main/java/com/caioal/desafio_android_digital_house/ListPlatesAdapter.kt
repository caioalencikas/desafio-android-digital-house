package com.caioal.desafio_android_digital_house

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListPlatesAdapter (private val plates: List<String>): RecyclerView.Adapter<ListPlatesAdapter.PlatesViewHolder>() {

    class PlatesViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val plateName by lazy {view.findViewById<TextView>(R.id.txtPlateNameList)}

        fun bind(plate: String) {
            plateName.text = plate
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlatesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_plates, parent, false)

        return PlatesViewHolder(view)
    }

    override fun getItemCount() = plates.size

    override fun onBindViewHolder(holder: PlatesViewHolder, position: Int) {
        holder.bind(plates[position])
    }


}