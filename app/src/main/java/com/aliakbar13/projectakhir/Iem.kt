package com.aliakbar13.projectakhir

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Iem(var name: String = "",
               var price: String = "",
               var shortReview: String = "",
               var detail: String = "",
               var photo: Int = 0) : Parcelable