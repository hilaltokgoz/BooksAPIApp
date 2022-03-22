package com.booksapiapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.viewbinding.ViewBinding
import com.BooksAdapter
import com.booksapiapp.databinding.FragmentHomePageBinding
import com.booksapiapp.response.BooksResponse
import com.model.Book
import com.network.ApiUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomePageFragment : Fragment() {
  private  lateinit var binding: FragmentHomePageBinding
  var booksList:ArrayList<Book> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomePageBinding.inflate(layoutInflater)
        getBooks()
        return binding.root
    }

     private fun getBooks(){
         ApiUtils.bookDAOInterfaceGet().getBook().enqueue(
             object : Callback<BooksResponse>{
                 override fun onResponse(
                     //Başarılı cevap döndüğünde çalışır.
                     call: Call<BooksResponse>,
                     response: Response<BooksResponse>
                 ) {
                    val tempList=response.body()?.books //response üzerinden succes değil books istenir ve geçici bir listeye atanır.
                     tempList?.let {
                         booksList=it as ArrayList<Book>
                     }
                     //Adapter ile Rv bağlama
                     val booksAdapter=BooksAdapter(booksList)
                     binding.bookRecyclerView.adapter=booksAdapter
                     binding.bookRecyclerView.layoutManager=GridLayoutManager(context,2)
                     binding.bookRecyclerView.setHasFixedSize(true)
                 }

                 override fun onFailure(call: Call<BooksResponse>, t: Throwable) {
                     //1 hata olduğunda burası çalışır
                     //Throwable argümanını kullanarak logcate yazdırılabilir.
                 }

             }
         )
     }

}