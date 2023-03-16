package com.example.pokemonapp.di.module

import com.example.presia.controller.SwipeScreenController
import dagger.Module
import dagger.Provides


@Module
class ControllerModule{

    @Provides
    fun provideSwipeController(): SwipeScreenController {
        return SwipeScreenController()
    }

}