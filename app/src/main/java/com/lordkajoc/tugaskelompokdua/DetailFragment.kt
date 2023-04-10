package com.lordkajoc.tugaskelompokdua

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lordkajoc.tugaskelompokdua.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private lateinit var binding:FragmentDetailBinding
    private lateinit var nama :String
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


         val getfilm = arguments?.getSerializable("BUNDEL") as DataFilm
        binding.ivFilmimagedetail.setImageResource(getfilm.foto)
        binding.tvNamafilmdetail.text = getfilm.nama
        binding.tvReleasefilmdetail.text = "Release : ${getfilm.release}"
        binding.tvRatingfilmdetail.text = "Rating : ${getfilm.rating}"
        binding.tvSinopsisfilmdetail.text = """Sinopsis :
           ${getfilm.sinopsis} 
        """.trimIndent()

    }
}