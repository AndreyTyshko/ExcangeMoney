package com.example.excangemoney

import com.google.gson.annotations.SerializedName


 class MoneyResponse {
     @SerializedName("ID")
     private var iD: String? = null

     @SerializedName("NumCode")
     private var numCode: String? = null

     @SerializedName("CharCode")
     private var charCode: String? = null

     @SerializedName("Nominal")
     private var nominal: Int? = null

     @SerializedName("Name")
     private var name: String? = null

     @SerializedName("Value")
     private var value: Double? = null

     @SerializedName("Previous")
     private var previous: Double? = null


}