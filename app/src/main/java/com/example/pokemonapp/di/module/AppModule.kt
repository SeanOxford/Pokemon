package com.example.pokemonapp.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule{

    @Singleton
    @Provides
    fun provideSwipeController(): String {
        return "LOL"
    }

}