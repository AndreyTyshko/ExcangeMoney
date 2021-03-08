package com.example.excangemoney

import android.util.Log
import com.example.excangemoney.model.ArrayJSONModel
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import kotlin.coroutines.CoroutineContext

interface APIService {

    @GET("daily_json.js")
    suspend fun getMoney(): Response<List<ArrayJSONModel>>


}

fun parseJSON() {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://www.cbr-xml-daily.ru/")

        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .addConverterFactory(GsonConverterFactory.create())

        .build()
    val service = retrofit.create(APIService::class.java)
    CoroutineScope(Dispatchers.IO).launch {
        val response = service.getMoney()
        withContext(Dispatchers.Main) {
            if (response.isSuccessful) {
                val items = response.body()
                if (items != null) {
                    for (i in 0 until items.count()) {
                        val id = items[i].iD ?: "n/a"
                        Log.d("ID", id)
                    }
                }
            } else {
                Log.e("Retrofit error", response.code().toString())
            }
        }

    }
}