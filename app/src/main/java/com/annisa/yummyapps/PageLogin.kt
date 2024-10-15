package com.annisa.yummyapps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class PageLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)

        // Find views by ID
        val signupLink = findViewById<TextView>(R.id.tvsignup)
        val btnLogin = findViewById<Button>(R.id.btn_login) // Assuming you have a button with this ID

        // Navigate to SignUpActivity when signup link is clicked
        signupLink.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        // Navigate to ListOrderActivity on successful login
        btnLogin.setOnClickListener {
            // Here you might want to add your login validation logic before navigating
            val intent = Intent(this, ListOrderActivity::class.java)
            startActivity(intent)
        }
    }
}
