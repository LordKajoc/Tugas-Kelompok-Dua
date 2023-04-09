package com.lordkajoc.tugaskelompokdua

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataFilm(
    val foto: Int,
    val nama: String,
    val release: String,
    val rating: String,
    val sinopsis:String
) : Parcelable