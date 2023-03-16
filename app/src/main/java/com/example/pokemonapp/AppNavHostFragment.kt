package com.example.pokemonapp

import android.content.Context
import android.os.Bundle
import androidx.annotation.NavigationRes
import androidx.fragment.app.FragmentFactory
import androidx.navigation.fragment.NavHostFragment
import javax.inject.Inject

class AppNavHostFragment : NavHostFragment() {

    @Inject
    lateinit var mainFragmentFactory: FragmentFactory

    override fun onAttach(context: Context) {
        (activity?.application as PokemonApp).appComponent.inject(this)
        childFragmentManager.fragmentFactory = mainFragmentFactory
        super.onAttach(context)
    }

}