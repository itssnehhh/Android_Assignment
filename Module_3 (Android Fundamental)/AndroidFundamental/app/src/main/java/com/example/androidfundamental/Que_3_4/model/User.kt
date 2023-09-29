package com.example.androidfundamental.Que_3_4.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    var name: String,
    var emailId: String,
    var age: Int = 0,
):Parcelable
