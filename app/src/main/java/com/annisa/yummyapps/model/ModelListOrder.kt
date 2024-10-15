package com.annisa.yummyapps.model

import java.io.Serializable

// Order model, implements Serializable to pass via Intent
data class ModelListOrder(
    val imageResId: Int,
    val name: String,
    val price: String,
    val date: String,
    val items: Int
) : Serializable
