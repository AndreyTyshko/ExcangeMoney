package com.example.excangemoney.model

import com.google.gson.annotations.SerializedName

data class ArrayJSONModel(

    // Use @SerializedName(" ") for the Gson converter
    // @field:Json(name = " ") for the Moshi converter
    // @SerialName(" ") for the Kotlinx Serialization converter
    // @JsonProperty(" ") for the Jackson converter

    @SerializedName("ID")
    private var iD: String?,

    @SerializedName("NumCode")
    private var numCode: String,

    @SerializedName("CharCode")
    private var charCode: String,

    @SerializedName("Nominal")
    private var nominal: Int,

    @SerializedName("Name")
    private var name: String,

    @SerializedName("Value")
    private var value: Double,

    @SerializedName("Previous")
    private var previous: Double,

    )