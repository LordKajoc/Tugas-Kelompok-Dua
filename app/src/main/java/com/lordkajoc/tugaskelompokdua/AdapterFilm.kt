package com.lordkajoc.tugaskelompokdua

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class AdapterFilm(var listFilm: ArrayList<DataFilm>, var listener: onItemClick) :
    RecyclerView.Adapter<AdapterFilm.ViewHolder>() {


    var onClick: ((DataFilm) -> Unit)? = null

//    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val tvNama: TextView = itemView.findViewById(R.id.tv_namafilm)
//        val tvRelease: TextView = itemView.findViewById(R.id.tv_releasefilm)
//        val tvRating: TextView = itemView.findViewById(R.id.tv_ratingfilm)
//        val tvsinopsis: TextView = itemView.findViewById(R.id.tv_sinopsisfilm)
//        val ivFilm: ImageView = itemView.findViewById(R.id.iv_filmimage)
//        val card : CardView = itemView.findViewById(R.id.card_view)
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.cardview_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        var data = listFilm[position]
//        holder.tvNama.text = data.nama
//        holder.tvRelease.text = data.release
//        holder.tvRating.text = data.rating
//        holder.tvsinopsis.text = data.sinopsis
//        holder.ivFilm.setImageResource(data.foto)
//        holder.card.setOnClickListener{
//            var move =
        holder.bind(listFilm[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        private val namaFilm: TextView = itemView.findViewById(R.id.tv_namafilm)
        private val tvNama: TextView = itemView.findViewById(R.id.tv_namafilm)
        private val tvRelease:TextView =itemView.findViewById(R.id.tv_releasefilm)
        private val tvRating:TextView = itemView.findViewById(R.id.tv_ratingfilm)
        private val tvsinopsis:TextView = itemView.findViewById(R.id.tv_sinopsisfilm)
        private val ivFilm:ImageView =itemView.findViewById(R.id.iv_filmimage)

        fun bind(film: DataFilm) {
            namaFilm.text = film.nama
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = absoluteAdapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(listFilm[position].nama)
            }
        }
    }
    fun setData(list: ArrayList<DataFilm>) {
        this.listFilm.addAll(list)
    }
    interface onItemClick {
        fun onItemClick(nama: String)
    }
}