package com.example.excangemoney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.example.excangemoney.viewModel.CategoryViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {

   // private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       /* recyclerView = findViewById<RecyclerView>(R.id.recycler)
        var categoryViewModel:CategoryViewModel = ViewModelProviders.of(this).get(CategoryViewModel::class.java)
        categoryViewModel.getArrayList().observe(this, Observer {

        })
*/


        parseJSON()


    }
}

