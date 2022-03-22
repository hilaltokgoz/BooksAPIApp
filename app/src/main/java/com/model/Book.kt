

package com.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 22.03.2022               │
//└──────────────────────────┘
//Api'deki veriler de id,isim,yazar,yayınevi,fiyatı,resim url bunlar bulunmaktadır.
data class Book(
    @SerializedName("book_id") @Expose var book_id: Int,
    @SerializedName("book_name") @Expose var book_name: String,
    @SerializedName("book_author") @Expose var book_author: String,
    @SerializedName("book_publisher") @Expose var book_publisher: String,
    @SerializedName("book_price") @Expose var book_price: String,
    @SerializedName("book_image_url") @Expose var book_image_url: String
):Serializable //Verileri bir yerden başka yere taşımak için
