package com.example.excangemoney.model

import com.google.gson.annotations.SerializedName

data class ArrayJSONModel(

    // Use @SerializedName(" ") for the Gson converter
    // @field:Json(name = " ") for the Moshi converter
    // @SerialName(" ") for the Kotlinx Serialization converter
    // @JsonProperty(" ") for the Jackson converter

    @SerializedName("ID")
    var iD: String?,

    @SerializedName("NumCode")
    var numCode: String,

    @SerializedName("CharCode")
    var charCode: String,

    @SerializedName("Nominal")
    var nominal: Int,

    @SerializedName("Name")
    var name: String,

    @SerializedName("Value")
    var value: Double,

    @SerializedName("Previous")
    var previous: Double,

    )