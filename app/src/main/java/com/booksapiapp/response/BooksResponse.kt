package com.booksapiapp.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.model.Book

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 22.03.2022               │
//└──────────────────────────┘

//Server'dan cevap olarak ne isteniliyor.
//Kitap listesi(Api'daki [] içi ) ve başarılı lup olmadığına dair mesaj dönmesini istiyoruz.
//Value 'a tablo ismi yazılır(listenin yanındaki isim)

data class BooksResponse(
@SerializedName("books") @Expose var books:List<Book>,//Book ,Model name
@SerializedName("success") @Expose var success:Int
)















