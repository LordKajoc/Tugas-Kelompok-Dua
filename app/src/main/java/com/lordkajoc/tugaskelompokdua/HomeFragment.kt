package com.lordkajoc.tugaskelompokdua

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lordkajoc.tugaskelompokdua.AdapterFilm.onItemClick
import com.lordkajoc.tugaskelompokdua.databinding.FragmentHomeBinding

class HomeFragment : Fragment(), ListAdapterFilm.OnItemClickListener, onItemClick {
    private lateinit var binding: FragmentHomeBinding
    private val list = ArrayList<DataFilm>()
    private lateinit var adapterFilm: AdapterFilm
    private lateinit var filmViewModel : FilmViewModel
    private lateinit var rvFilm :RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val filmList = getListFilm()
//        adapterFilm = ListAdapterFilm(filmList,this)
//        binding.rvFilm.layoutManager = GridLayoutManager(context,2)
//        binding.rvFilm.adapter = adapterFilm

        val adapterFilm1 = AdapterFilm(ArrayList(), this)
        val lm = GridLayoutManager(context,2)
        binding.rvFilm.layoutManager = lm
        binding.rvFilm.adapter = adapterFilm1


        filmViewModel = ViewModelProvider(this).get(FilmViewModel::class.java)
        filmViewModel.getFilmList()
        filmViewModel.filmList.observe(viewLifecycleOwner, Observer {
            adapterFilm1.setData(it as ArrayList<DataFilm>)
        })



        val imageclick = binding.imageView2
        imageclick.setOnClickListener {
            onIconClick()
        }
    }

//    private fun getListFilm(): ArrayList<DataFilm> {
//        val dataNama = resources.getStringArray(R.array.data_mobil)
//        val dataPreview = resources.getStringArray(R.array.isi_sementara)
//        val dataFoto = resources.obtainTypedArray(R.array.foto_mobil)
//        val dataDeskripsi = resources.getStringArray(R.array.deskrpsi)
//        val dataSinopsis = resources.getStringArray(R.array.data_sinopsis)
//        val listMobil = ArrayList<DataFilm>()
//        for (i in dataNama.indices) {
//            val mobil = DataFilm(
//                dataNama[i],
//                dataPreview[i],
//                dataFoto.getResourceId(i, -1),
//                dataDeskripsi[i],
//                dataSinopsis[i]
//            )
//            listMobil.add(mobil)
//        }
//        return listMobil
//    }

    override fun onItemClick(nama: String) {
        val itemclick = HomeFragmentDirections.actionHomeFragmentToDetailFragment(nama)

        findNavController().navigate(itemclick)

    }

    override fun onIconClick() {
        findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
    }

}