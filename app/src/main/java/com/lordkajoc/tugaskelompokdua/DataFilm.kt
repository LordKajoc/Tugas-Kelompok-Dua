package com.lordkajoc.tugaskelompokdua



import java.io.Serializable


data class DataFilm(
    val foto: Int,
    val nama: String,
    val release: String,
    val rating: String,
    val sinopsis:String
): Serializable