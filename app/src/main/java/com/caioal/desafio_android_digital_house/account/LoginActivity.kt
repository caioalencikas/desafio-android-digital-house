package com.caioal.desafio_android_digital_house.account

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.caioal.desafio_android_digital_house.MainActivity
import com.caioal.desafio_android_digital_house.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val btnRegisterLogin = findViewById<Button>(R.id.btnRegisterLogin)
        val btnLogin = findViewById<Button>(R.id.btnLogin)


        btnLogin.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnRegisterLogin.setOnClickListener(){
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}