package com.caioal.desafio_android_digital_house

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListPlatesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_plates)

        val name = intent.getStringExtra("Name")!!
        val txtName = findViewById<TextView>(R.id.txtRestaurantNamePlate)
        txtName.text = name

        val viewManager = GridLayoutManager(this, 2)
        val recyclerView = findViewById<RecyclerView>(R.id.lstPlates)

        val plate1 = "Salada com molho Gengibre"

        val viewAdapter = ListPlatesAdapter(arrayListOf(plate1, plate1, plate1, plate1, plate1, plate1))

        recyclerView.apply {
            setHasFixedSize(true)

            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}