package com.example.pokemonapp.di.module

import androidx.fragment.app.FragmentFactory
import com.example.pres.fragment.AppFragmentFactory
import com.example.pres.viewmodel.AppViewModelFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FragmentFactoryModule {

    @Provides
    @Singleton
    fun provideAppFragmentFactory(viewModelProvider: AppViewModelFactory): FragmentFactory =
        AppFragmentFactory(viewModelProvider)


}