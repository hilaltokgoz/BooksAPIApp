package com

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.booksapiapp.databinding.CardBooksBinding
import com.model.Book
import com.squareup.picasso.Picasso

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 22.03.2022               │
//└──────────────────────────┘

//RecyclerView kullanmak için adapter oluşturduk.
class BooksAdapter(private var booksList:ArrayList<Book>)
    :RecyclerView.Adapter<BooksAdapter.BookCardDesign>(){

    class BookCardDesign(val bookCardBinding: CardBooksBinding)
        :RecyclerView.ViewHolder(bookCardBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookCardDesign {
    //Binding işlemi
        val layaoutInflater= LayoutInflater.from(parent.context)
        val bookCardBinding=CardBooksBinding.inflate(layaoutInflater,parent,false)
     return BookCardDesign(bookCardBinding)
    }

    override fun onBindViewHolder(holder: BookCardDesign, position: Int) {
    //adapter üzerinden recyclerview card a erişim sağlanacak.
    val book=booksList[position]
        holder.bookCardBinding.apply {
            bookNameTextView.text=book.book_name
            Picasso.get().load(book.book_image_url).into(bookImageView) //Picasso kullanımı
        }

    }

    override fun getItemCount(): Int {
        return booksList.size
    }
}