package com.annisa.yummyapps

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.annisa.yummyapps.model.ModelListOrder

class DetailOrdersActivity : AppCompatActivity() {
    private lateinit var btncancel : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_orders)

        val nama = intent.getStringExtra("namaMakanan")
        val Photo = intent.getIntExtra("photoMakanan", 0)

        val txtnama = findViewById<TextView>(R.id.txtNama)
        val imgphoto = findViewById<ImageView>(R.id.imgPhoto)

        txtnama.text = nama
        imgphoto.setImageResource(Photo)

        btncancel = findViewById(R.id.btncancel)
        btncancel.setOnClickListener() {
            finish()
        }
    }
}
