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
        nama = DetailFragmentArgs.fromBundle(requireArguments()).nama

//        val getfilm = arguments?.getSerializable("data_news") as DataFilm
        binding.tvNamafilmdetail.text = nama
    }
}