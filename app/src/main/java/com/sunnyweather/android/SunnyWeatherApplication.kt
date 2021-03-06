package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 *
 *Create by JDT on 2020-07-11.
 *
 */
class SunnyWeatherApplication : Application() {
    companion object {

        // 郭霖的可以用  BNBRvBveaD2VfHVI
        //我申请的TOKEN m9cltXOPQnoYuDHs
        const val TOKEN = "m9cltXOPQnoYuDHs"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}