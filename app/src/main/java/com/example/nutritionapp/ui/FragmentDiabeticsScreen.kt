package com.example.nutritionapp.ui

import com.example.nutritionapp.databinding.FragmentDiabeticsScreenBinding
import com.example.nutritionapp.ui.base.BaseFragment

class FragmentDiabeticsScreen : BaseFragment<FragmentDiabeticsScreenBinding>() {

    override fun bindingInflater(): FragmentDiabeticsScreenBinding = FragmentDiabeticsScreenBinding.inflate(layoutInflater)

    override fun setUp() {
         val _homeFragment: HomeFragment = HomeFragment()
        binding.buttonBack.setOnClickListener{
            backNavigation(_homeFragment)
        }
    }

}