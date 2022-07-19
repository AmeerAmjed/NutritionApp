package com.example.nutritionapp.ui

import androidx.fragment.app.Fragment
import com.example.nutritionapp.R
import com.example.nutritionapp.ui.base.BaseFragment
import com.example.nutritionapp.databinding.FragmentMealDetailsBinding


class MealDetailsFragment : BaseFragment<FragmentMealDetailsBinding>()  {

    override fun bindingInflater(): FragmentMealDetailsBinding = FragmentMealDetailsBinding.inflate(layoutInflater)
    override var visibilityCustomActionBar: Boolean = false
    override fun getTitle(): String = getString(R.string.action_app_title_Top_5_blood_pressure_meals)
    override fun getBack(): Fragment = HomeFragment()
    override fun initFragment() {

    }

}