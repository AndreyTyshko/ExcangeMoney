package com.example.excangemoney.viewModel

import android.icu.util.ULocale
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.excangemoney.model.RecyclerData

class CategoryViewModel:ViewModel {

    var iD: String? = null
    var numCode: String? = null
    var charCode: String? = null
    var nominal: Int? = null
    var name: String? = null
    var value: Double? = null
    var previous: Double? = null

    constructor():super()

    constructor(category: RecyclerData) : super() {
        this.iD = category.iD
        this.numCode = category.numCode
        this.charCode = category.charCode
        this.nominal = category.nominal
        this.name = category.name
        this.value = category.value
        this.previous = category.previous
    }

    var arrayListMutableLiveData = MutableLiveData<ArrayList<CategoryViewModel>>()
    var arrayList = ArrayList<CategoryViewModel>()


    fun getArrayList():MutableLiveData<ArrayList<CategoryViewModel>>{

        //val category1 = ULocale.Category
        return arrayListMutableLiveData
    }

}