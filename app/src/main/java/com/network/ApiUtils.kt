package com.network


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 22.03.2022               │
//└──────────────────────────┘

class ApiUtils {
    companion object{
        private const val  BASE_URL="http://books.canerture.com/" //Api linki

        fun bookDAOInterfaceGet():BookDAOInterface{ //Dao daki istekleri çekip retrofite gönderecek.
           return RetrofitClient.getClient(BASE_URL).create(BookDAOInterface::class.java)

        }
    }

}