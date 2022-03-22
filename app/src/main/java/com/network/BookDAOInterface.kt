package com.network

import android.telecom.Call
import com.booksapiapp.response.BooksResponse
import retrofit2.http.GET


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 22.03.2022               │
//└──────────────────────────┘
//DAO:Database Access Object,
// Retrofitin HTTP isteklerini kullanarak nasıl server ile iletişim kuracağını belirleyeceğimiz yer.
//Rest Mimarisin de tek tip Interface vardır (Get,Post,Put,Delete i kullanır.)

//Kitap bilgilerini çekecek fonksiyon Dao içinde yazılır.
interface BookDAOInterface {
    @GET("all_books.php") //Api'ın son kısmı,BASE_URL'in sonuna yapıştırır ve istenilen kaynağa gitmemizi sağlar.
    fun getBook():retrofit2.Call<BooksResponse>
}