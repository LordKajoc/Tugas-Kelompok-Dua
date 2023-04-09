package com.lordkajoc.tugaskelompokdua

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmViewModel:ViewModel() {
    private val list = ArrayList<DataFilm>()


    val filmList :MutableLiveData <ArrayList<DataFilm>> = MutableLiveData()

    fun getFilmList() {
        var film = list
        filmList.value = film
    }

}