package com.demo.advanced.daggerhilt.restfullapi

import com.demo.advanced.daggerhilt.data.response.weather.AdvertiseResponse
import retrofit2.http.GET

interface ApiService {
    @GET("AdvertiseNewApplications/17/com.hd.camera.apps.high.quality")
    suspend fun getNewsInfo(
    ): AdvertiseResponse

}