package com.caioal.desafio_android_digital_house

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PlateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plate)

        val name = intent.getStringExtra("Name")!!
        val description = intent.getStringExtra("Description")!!

        val txtName = findViewById<TextView>(R.id.txtPlateName)
        val txtDescription = findViewById<TextView>(R.id.txtPlateDescription)

        txtName.text = name
        txtDescription.text = description

    }
}