package com.booksapiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//books api : http://books.canerture.com/
//Amacımız bu api'den tüm kitapları çekmek(GET isteği ile)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}