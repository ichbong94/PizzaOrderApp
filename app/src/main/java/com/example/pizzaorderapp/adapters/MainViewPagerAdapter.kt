package com.example.pizzaorderapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.pizzaorderapp.fragments.ChickenStoreListFragment
import com.example.pizzaorderapp.fragments.PizzaStoreListFragment
import kotlin.math.PI

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {

        return when(position){
            0 -> PizzaStoreListFragment()
            else -> ChickenStoreListFragment()
        }


    }
}