package com.annisa.yummyapps

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)
        val loginLink = findViewById<TextView>(R.id.login_link)

        loginLink.setOnClickListener {
            // Navigate to LoginActivity
            val intent = Intent(this, PageLogin::class.java)
            startActivity(intent)

        }
    }
}