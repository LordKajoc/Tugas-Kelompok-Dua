package com.lordkajoc.tugaskelompokdua

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lordkajoc.tugaskelompokdua.databinding.CardviewListItemBinding

class ListAdapterFilm(
    private val kumpulanFilm: ArrayList<DataFilm>,

) : RecyclerView.Adapter<ListAdapterFilm.ViewHolder>(){
    lateinit var listener: OnItemClickListener
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CardviewListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return kumpulanFilm.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindnama(kumpulanFilm[position].nama)
        holder.bindrelease(kumpulanFilm[position].release)
        holder.bindfoto(kumpulanFilm[position].foto)
        holder.bindrating(kumpulanFilm[position].rating)
        holder.bindsinopsis(kumpulanFilm[position].sinopsis)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        private val tvNama: TextView = itemView.findViewById(R.id.tv_namafilm)
        private val tvRelease:TextView =itemView.findViewById(R.id.tv_releasefilm)
        private val tvRating:TextView = itemView.findViewById(R.id.tv_ratingfilm)
        private val tvsinopsis:TextView = itemView.findViewById(R.id.tv_sinopsisfilm)
        private val ivFilm:ImageView =itemView.findViewById(R.id.iv_filmimage)

        fun bindnama(nama: String) {
            tvNama.text = nama
            itemView.setOnClickListener(this)
        }
        fun bindrelease(rilis:String) {
            tvRelease.text = rilis
        }
        fun bindfoto(foto: Int) {
            ivFilm.setImageResource(foto)
        }
        fun bindrating(rating:String) {
            tvRating.text = rating
        }
        fun bindsinopsis(sinops:String) {
            tvsinopsis.text = sinops
        }

        override fun onClick(v: View?) {
            val position = absoluteAdapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(kumpulanFilm[position].nama)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(nama: String)
        fun onIconClick()
    }
    fun setData(list: ArrayList<DataFilm>){
        this.kumpulanFilm.addAll(list)
    }
}