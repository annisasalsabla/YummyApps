package com.annisa.yummyapps

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.annisa.yummyapps.model.ModelListOrder

class DetailOrdersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_orders)

        val order = intent.getSerializableExtra("order") as? ModelListOrder
        val orderImage: ImageView = findViewById(R.id.orderImage)
        val orderName: TextView = findViewById(R.id.orderName)

        order?.let {
            orderImage.setImageResource(it.imageResId)
            orderName.text = it.name
            // Tampilkan informasi lainnya sesuai dengan detail yang diperlukan
        }
    }
}
