package com.annisa.yummyapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnSignUp = findViewById<Button>(R.id.btnSignUp)

        btnLogin.setOnClickListener {
            // Navigate to LoginActivity
            val intent = Intent(this, PageLogin::class.java)
            startActivity(intent)
        }

        btnSignUp.setOnClickListener {
            // Navigate to SignUpActivity
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

    }
}