package com.example.kk.dididache.model.netModel.request

import com.baidu.mapapi.model.LatLng
import com.example.kk.dididache.toStr
import java.util.*

/**
 * Created by 小吉哥哥 on 2017/8/15.
 */

data class TaxiCountInfo(var x: Double, var y: Double, var timeStart: String, var timeEnd: String, var barCount: Int = 10) {
    constructor(latLng: LatLng, timeStart: Calendar, timeEnd: Calendar) : this(latLng.longitude, latLng.latitude, timeStart.toStr(), timeEnd.toStr())
}