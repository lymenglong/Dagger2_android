package com.example.mely.exampleofdagger.config.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val app: Application) {

    @Provides
    fun provideApplicationContext(): Context = app

    @Provides
    fun provideString() = "Menglong"

}