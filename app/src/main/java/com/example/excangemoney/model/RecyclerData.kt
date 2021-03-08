package com.example.excangemoney.model

class RecyclerData
{
    var iD: String? = null
    var numCode: String? = null
    var charCode: String? = null
    var nominal: Int? = null
    var name: String? = null
    var value: Double? = null
    var previous: Double? = null

    constructor(iD: String?,
        numCode: String?,
        charCode: String?,
        nominal: Int?,
        name: String?,
        value: Double?,
        previous: Double?
    ) {
        this.iD = iD
        this.numCode = numCode
        this.charCode = charCode
        this.nominal = nominal
        this.name = name
        this.value = value
        this.previous = previous
    }
}



