package com.caioal.desafio_android_digital_house.account

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.caioal.desafio_android_digital_house.ListRestaurantsActivity
import com.caioal.desafio_android_digital_house.R
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val btnRegisterLogin = findViewById<Button>(R.id.btnRegisterLogin)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val email = findViewById<TextInputEditText>(R.id.edtTxtEmailLogin)
        val password = findViewById<TextInputEditText>(R.id.edtTxtPasswordLogin)


        btnLogin.setOnClickListener(){
            checkFields(email, password)
        }

        btnRegisterLogin.setOnClickListener(){
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }


    private fun checkFields(email: TextInputEditText, password: TextInputEditText) {
        when {
            email.text.toString().trim().isBlank() -> {
                email.error = "O e-mail deve estar preenchido"
            }
            password.text.toString().trim().isBlank() -> {
                password.error = "A senha deve estar preenchida"
            }
            else -> {
                val intent = Intent(this, ListRestaurantsActivity::class.java)
                startActivity(intent)
                finish()

            }
        }
    }

}