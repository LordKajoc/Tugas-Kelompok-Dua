package com.lordkajoc.tugaskelompokdua

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.lordkajoc.tugaskelompokdua.databinding.FragmentHomeBinding

class HomeFragment() : Fragment(), AdapterFilm.onItemClickListener {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var filmViewModel : FilmViewModel




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val adapterFilm1 = AdapterFilm(ArrayList(), this)
        val lm = GridLayoutManager(context,2)
        binding.rvFilm.layoutManager = lm
        binding.rvFilm.adapter = adapterFilm1


        filmViewModel = ViewModelProvider(this).get(FilmViewModel::class.java)
        filmViewModel.getFilmList()
        filmViewModel.filmList.observe(viewLifecycleOwner, Observer {
            adapterFilm1.setData(it as ArrayList<DataFilm>)
        })

        val getName = arguments?.getString("Name")


        val imageclick = binding.imageView2
        imageclick.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("Name", getName)
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment,bundle)
        }
    }

    override fun onItemClick(nama: String) {
        val itemclick = HomeFragmentDirections.actionHomeFragmentToDetailFragment(nama)

        findNavController().navigate(itemclick)

    }




}