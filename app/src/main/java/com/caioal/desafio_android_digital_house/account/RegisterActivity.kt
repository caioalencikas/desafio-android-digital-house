package com.caioal.desafio_android_digital_house.account

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.caioal.desafio_android_digital_house.ListRestaurantsActivity
import com.caioal.desafio_android_digital_house.R
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)



        val btnRegisterRegister = findViewById<Button>(R.id.btnRegisterRegister)
        val name = findViewById<TextInputEditText>(R.id.edtTxtNameRegister)
        val email = findViewById<TextInputEditText>(R.id.edtTxtEmailRegister)
        val password = findViewById<TextInputEditText>(R.id.edtTxtPasswordRegister)
        val repeatePassword = findViewById<TextInputEditText>(R.id.edtTxtRepeatePasswordRegister)


        btnRegisterRegister.setOnClickListener(){
            checkFields(name, email, password, repeatePassword)
        }

    }


    private fun checkFields(name: TextInputEditText,email: TextInputEditText, password: TextInputEditText, repeatePassword: TextInputEditText) {
        when {
            email.text.toString().trim().isBlank() -> {
                email.error = "O e-mail deve estar preenchido"
            }
            password.text.toString().trim().isBlank() -> {
                password.error = "A senha deve estar preenchida"
            }
            name.text.toString().trim().isBlank() -> {
                password.error = "A senha deve estar preenchida"
            }
            password.text.toString().trim().length < 6 -> {
                password.error = "A senha digitada deve ter pelo menos 6 caracteres"
            }
            password.text.toString().trim() != repeatePassword.text.toString().trim() -> {
                repeatePassword.error = "As senhas devem ser iguais"
            }
            else -> {
                val intent = Intent(this, ListRestaurantsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}