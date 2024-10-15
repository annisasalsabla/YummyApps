package com.annisa.yummyapps.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.annisa.yummyapps.R
import com.annisa.yummyapps.model.ModelListOrder

class OrderAdapter(private val orders: List<ModelListOrder>, private val listener: (ModelListOrder) -> Unit) :
    RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {

    class OrderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.orderImage)
        val nameView: TextView = itemView.findViewById(R.id.orderName)
        val priceView: TextView = itemView.findViewById(R.id.orderPrice)
        val dateView: TextView = itemView.findViewById(R.id.orderDate)
        val itemCountView: TextView = itemView.findViewById(R.id.itemCount)

        fun bind(order: ModelListOrder, listener: (ModelListOrder) -> Unit) {
            imageView.setImageResource(order.imageResId)
            nameView.text = order.name
            priceView.text = order.price
            dateView.text = order.date
            itemCountView.text = "${order.items} items"

            itemView.setOnClickListener { listener(order) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_order, parent, false)
        return OrderViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        holder.bind(orders[position], listener)
    }

    override fun getItemCount() = orders.size
}
