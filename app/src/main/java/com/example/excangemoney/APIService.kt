package com.example.excangemoney

import com.example.excangemoney.model.ArrayJSONModel
import com.example.excangemoney.model.RecyclerData
import retrofit2.http.GET

interface APIService {

    @GET("/daily_json.js")
    suspend fun getMoney(): Response<List<ArrayJSONModel>>

}