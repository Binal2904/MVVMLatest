package com.demo.advanced.daggerhilt.repository

import com.demo.advanced.daggerhilt.data.response.weather.AdvertiseResponse
import com.demo.advanced.daggerhilt.restfullapi.ApiService
import com.demo.advanced.daggerhilt.util.ApiResource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Response

class MainRepository(private val apiHelper: ApiService) {
    suspend fun fetchAdvertiseData(): Flow<ApiResource<AdvertiseResponse>> {
        return flow {
            val comment = apiHelper.getNewsInfo()
            emit(ApiResource.success(comment))
        }.flowOn(Dispatchers.IO)
    }
}