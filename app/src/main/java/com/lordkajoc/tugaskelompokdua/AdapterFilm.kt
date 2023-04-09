package com.lordkajoc.tugaskelompokdua

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterFilm (var listFilm : ArrayList<DataFilm>): RecyclerView.Adapter<AdapterFilm.ViewHolder>(){
    class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView) {
         val tvNama: TextView = itemView.findViewById(R.id.tv_namafilm)
         val tvRelease:TextView =itemView.findViewById(R.id.tv_releasefilm)
         val tvRating:TextView = itemView.findViewById(R.id.tv_ratingfilm)
         val tvsinopsis:TextView = itemView.findViewById(R.id.tv_sinopsisfilm)
         val ivFilm: ImageView =itemView.findViewById(R.id.iv_filmimage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterFilm.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_list_item, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterFilm.ViewHolder, position: Int) {
        var data = listFilm[position]
       holder.tvNama.text = data.nama
       holder.tvRelease.text = data.release
       holder.tvRating.text = data.rating
       holder.tvsinopsis.text = data.sinopsis
       holder.ivFilm.setImageResource(data.foto)
    }

    override fun getItemCount(): Int {
      return listFilm.size
    }
    fun setData(list: ArrayList<DataFilm>){
        this.listFilm.addAll(list)
    }
}