package com.example.mely.exampleofdagger.config

import android.app.Activity
import android.app.Application
import com.example.mely.exampleofdagger.config.di.component.DaggerAppComponent
import com.example.mely.exampleofdagger.config.di.module.AppModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class App : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        val appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()

        appComponent.inject(this)
        //this.initAppComponent()
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

}