package com.caioal.desafio_android_digital_house

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListRestaurantsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_restaurants)


        val viewManager = GridLayoutManager(this, 1)
        val recyclerView = findViewById<RecyclerView>(R.id.lstRestaurant)

        val restaurant1 = Restaurant("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", R.drawable.img_list_restaurant)
        val restaurantList = arrayListOf(restaurant1, restaurant1, restaurant1, restaurant1)

        val viewAdapter = ListRestaurantsAdapter(restaurantList) {
            val intent = Intent(this, ListPlatesActivity::class.java)
            intent.putExtra("Name", it.name)
            startActivity(intent)
        }

        recyclerView.apply {
            setHasFixedSize(true)

            layoutManager = viewManager
            adapter = viewAdapter
        }




    }
}