package com.asvacode.phummusic.config.di.provider


import com.example.mely.exampleofdagger.mvp.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityProvider{
    @ContributesAndroidInjector
    abstract fun provideMainActivity(): MainActivity



}