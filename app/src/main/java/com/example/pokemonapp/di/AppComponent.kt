package com.example.pokemonapp.di

import android.app.Application
import com.example.pokemonapp.AppNavHostFragment
import com.example.pokemonapp.di.module.AppModule
import com.example.pokemonapp.di.module.ControllerModule
import com.example.pokemonapp.di.module.FragmentFactoryModule
import com.example.pokemonapp.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ControllerModule::class, FragmentFactoryModule::class, ViewModelModule::class])
interface AppComponent {

    fun inject(navHostFragment: AppNavHostFragment)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): AppComponent
    }
}