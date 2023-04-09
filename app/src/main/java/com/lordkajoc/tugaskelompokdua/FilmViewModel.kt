package com.lordkajoc.tugaskelompokdua

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmViewModel:ViewModel() {
    private val list = arrayListOf(
        DataFilm(R.drawable.estilo,"JohnWick 3", " 20 januari 1998",  "4.7", "tentang anjing yang mati"),
        DataFilm(R.drawable.estilo,"JohnWick 3", " 20 januari 1998",  "4.7", "tentang anjing yang mati"),
        DataFilm(R.drawable.estilo,"JohnWick 3", " 20 januari 1998",  "4.7", "tentang anjing yang mati"),
        DataFilm(R.drawable.estilo,"JohnWick 3", " 20 januari 1998",  "4.7", "tentang anjing yang mati"),
        DataFilm(R.drawable.estilo,"JohnWick 3", " 20 januari 1998",  "4.7", "tentang anjing yang mati"),
    )


    val filmList :MutableLiveData <List<DataFilm>> = MutableLiveData(list)


    fun getFilmList() {
        var film = list
        filmList.value = film
    }

}