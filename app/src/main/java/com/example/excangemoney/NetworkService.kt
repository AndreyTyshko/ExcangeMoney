package com.example.excangemoney

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkService {
    // private static NetworkService mInstance;
    var BaseUrl = "https://www.cbr-xml-daily.ru/daily_json.js"
    private var mRetrofit: Retrofit? = null
    val retrofitInstance: Retrofit?
        get() {
            if (mRetrofit == null) {
                mRetrofit = Retrofit.Builder()
                    .baseUrl(BaseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return mRetrofit
        }
}