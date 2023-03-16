package com.example.pokemonapp.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.pres.viewmodel.AppViewModelFactory
import com.example.pres.viewmodel.SwipeFragmentViewModel
import com.sean.oxford.scribdproject.di.module.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kotlinx.coroutines.InternalCoroutinesApi

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: AppViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(SwipeFragmentViewModel::class)
    abstract fun bindSwipeFragmentViewModel(swipeFragmentViewModel: SwipeFragmentViewModel): ViewModel

}