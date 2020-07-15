package com.sunnyweather.android.logic.model

/**
 *
 *Create by JDT on 2020-07-13.
 *
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)