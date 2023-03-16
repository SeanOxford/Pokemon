package com.example.pokemonapp

import android.app.Application
import com.example.pokemonapp.di.AppComponent
import com.example.pokemonapp.di.DaggerAppComponent

class PokemonApp: Application() {

    lateinit var appComponent: AppComponent

    companion object {
        lateinit var sApplication: PokemonApp
    }

    override fun onCreate() {
        sApplication = this
        super.onCreate()
        initAppComponent()
    }

    protected open fun initAppComponent(){
        appComponent = DaggerAppComponent.factory().create(this)
    }
}