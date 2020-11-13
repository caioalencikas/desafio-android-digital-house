package com.caioal.desafio_android_digital_house

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
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

        val plate1 = Plate(
            "Salada com molho Gengibre",
            "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis"
            ,
            R.drawable.img_list_plate
        )
        val listPlates = arrayListOf(plate1, plate1, plate1, plate1, plate1, plate1, plate1, plate1, plate1, plate1, plate1)

        val viewAdapter = ListPlatesAdapter(listPlates) {
            val intent = Intent(this, PlateActivity::class.java)
            intent.putExtra("Name", it.name)
            intent.putExtra("Description", it.description)
            startActivity(intent)
        }

        recyclerView.apply {
            setHasFixedSize(true)

            layoutManager = viewManager
            adapter = viewAdapter
        }


        val backRestaurant = findViewById<ImageView>(R.id.imgBackRestaurant)

        backRestaurant.setOnClickListener() {
            onBackPressed()
        }
    }

}
