package com.example.myapplication.Adapter

import android.nfc.Tag
import android.util.Log

class FoodModel(
    val foodName: String? = null,
//    val foodDescription: String? = null,
    val foodPrice: Int? = null,
    var completed: Boolean,
    val foodImage: String? = null
) {

    val TAG : String = "Test log"

    init {
        Log.d(TAG,"FoodModel - () called")
    }

}