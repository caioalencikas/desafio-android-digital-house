package com.caioal.desafio_android_digital_house.account

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.caioal.desafio_android_digital_house.ListRestaurantsActivity
import com.caioal.desafio_android_digital_house.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)



        val btnRegisterRegister = findViewById<Button>(R.id.btnRegisterRegister)


        btnRegisterRegister.setOnClickListener(){
            val intent = Intent(this, ListRestaurantsActivity::class.java)
            startActivity(intent)
        }

    }
}