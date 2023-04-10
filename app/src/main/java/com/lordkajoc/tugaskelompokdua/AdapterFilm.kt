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

    lateinit var binding : CardviewListItemBinding
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
        var view = CardviewListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    override fun onBindViewHolder(holder: AdapterFilm.ViewHolder, position: Int) {
        //menggunakan data binding
        holder.bindFilms(listFilm[position])
//        holder.bindnama(listFilm[position].nama)
//        holder.bindrelease(listFilm[position].release)
//        holder.bindfoto(listFilm[position].foto)
//        holder.bindrating(listFilm[position].rating)
//        holder.bindsinopsis(listFilm[position].sinopsis)
    }



    inner class ViewHolder(val binding : CardviewListItemBinding) : RecyclerView.ViewHolder(binding.root)
       //menggunakan data binding disini
            {
        fun bindFilms(itemFilms: DataFilm){
            binding.film = itemFilms
            binding.cardView.setOnClickListener{
                val bundle = Bundle()
                bundle.putSerializable("BUNDEL", itemFilms)
                Navigation.findNavController(itemView).navigate(R.id.action_homeFragment_to_detailFragment, bundle)

            }
        }
//        private val tvNama: TextView = itemView.findViewById(R.id.tv_namafilm)
//        private val tvRelease:TextView =itemView.findViewById(R.id.tv_releasefilm)
//        private val tvRating:TextView = itemView.findViewById(R.id.tv_ratingfilm)
//        private val tvsinopsis:TextView = itemView.findViewById(R.id.tv_sinopsisfilm)
//        private val ivFilm:ImageView =itemView.findViewById(R.id.iv_filmimage)



//            fun bindnama(nama: String) {
//                tvNama.text = nama
//                itemView.setOnClickListener(this)
//
//
//            }
//            fun bindrelease(rilis:String) {
//                tvRelease.text = rilis
//            }
//            fun bindfoto(foto: Int) {
//                ivFilm.setImageResource(foto)
//            }
//            fun bindrating(rating:String) {
//                tvRating.text = rating
//            }
//            fun bindsinopsis(sinops:String) {
//                tvsinopsis.text = sinops
//            }


//        override fun onClick(v: View?) {
//            val position = absoluteAdapterPosition
//            if (position != RecyclerView.NO_POSITION) {
//                listener.onItemClick(listFilm[position].nama)
//            }
//        }
    }
    fun setData(list: ArrayList<DataFilm>) {
        this.listFilm.addAll(list)
    }

    interface onItemClickListener {
        fun onItemClick(nama : String)
    }
}