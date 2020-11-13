package com.caioal.desafio_android_digital_house

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListRestaurantsAdapter (private val restaurants: List<Restaurant>, private val listener: (Restaurant) -> Unit): RecyclerView.Adapter<ListRestaurantsAdapter.RestaurantViewHolder>() {

    class RestaurantViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val restaurantImg by lazy { view.findViewById<ImageView>(R.id.imgRestaurant) }
        private val restaurantName by lazy { view.findViewById<TextView>(R.id.txtRestaurantName) }
        private val restaurantAddress by lazy { view.findViewById<TextView>(R.id.txtRestaurantAddress) }
        private val restaurantTime by lazy { view.findViewById<TextView>(R.id.txtRestaurantTime) }

        fun bind(restaurant: Restaurant) {
            restaurantImg.setImageResource(restaurant.img)
            restaurantName.text = restaurant.name
            restaurantAddress.text = restaurant.address
            restaurantTime.text = restaurant.time
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_restaurants, parent, false)

        return RestaurantViewHolder(view)
    }

    override fun getItemCount() = restaurants.size

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val item = restaurants[position]
        holder.bind(item)
        holder.itemView.setOnClickListener {
            listener(item)
        }
    }
}