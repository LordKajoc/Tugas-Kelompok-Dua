package com.lordkajoc.tugaskelompokdua

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.lordkajoc.tugaskelompokdua.databinding.CardviewListItemBinding

class AdapterFilm(var listFilm: ArrayList<DataFilm>, var listener: onItemClickListener) :
    RecyclerView.Adapter<AdapterFilm.ViewHolder>() {






    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = CardviewListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    override fun onBindViewHolder(holder: AdapterFilm.ViewHolder, position: Int) {
        //menggunakan data binding
        holder.bindFilms(listFilm[position])

    }



    inner class ViewHolder(val binding : CardviewListItemBinding) : RecyclerView.ViewHolder(binding.root){
       //menggunakan data binding disini

        fun bindFilms(itemFilms: DataFilm){
            binding.film = itemFilms
            binding.cardView.setOnClickListener{
                val bundle = Bundle()
                bundle.putSerializable("BUNDEL", itemFilms)
                Navigation.findNavController(itemView).navigate(R.id.action_homeFragment_to_detailFragment, bundle)

            }
        }

    }
    fun setData(list: ArrayList<DataFilm>) {
        this.listFilm.addAll(list)
    }

    interface onItemClickListener {
        fun onItemClick(nama : String)
    }
}