package com.annisa.yummyapps

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Find the TextView after setContentView
        val yummyTextView: TextView = findViewById(R.id.yummyText)

        // Create the text "YumQuick" with different colors
        val text = "YumQuick"
        val spannableString = SpannableString(text)

        // Set the color for "Yum" (orange)
        val orangeColor = ForegroundColorSpan(Color.parseColor("#FFA500")) // Orange color
        spannableString.setSpan(orangeColor, 0, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Set the color for "Quick" (white)
        val whiteColor = ForegroundColorSpan(Color.parseColor("#FFFFFF")) // White color
        spannableString.setSpan(whiteColor, 3, text.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Apply the spannable text to the TextView
        yummyTextView.text = spannableString

        // Splash screen delay 3 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3 seconds delay
    }
}

