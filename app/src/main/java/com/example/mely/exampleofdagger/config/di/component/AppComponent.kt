package com.example.mely.exampleofdagger.config.di.component

import com.asvacode.phummusic.config.di.provider.ActivityProvider
import com.example.mely.exampleofdagger.config.App
import com.example.mely.exampleofdagger.config.di.module.AppModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton



@Singleton
@Component(modules = [
    AndroidSupportInjectionModule :: class,
    AppModule :: class,
    ActivityProvider :: class

])
interface AppComponent {

    fun inject (application : App)

}

