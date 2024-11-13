package com.demo.advanced.daggerhilt.view.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.demo.advanced.daggerhilt.data.response.weather.AdvertiseResponse
import com.demo.advanced.daggerhilt.enum.ApiStatus
import com.demo.advanced.daggerhilt.repository.MainRepository
import com.demo.advanced.daggerhilt.util.ApiResource
import com.demo.advanced.daggerhilt.util.NetworkHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper,
) : ViewModel() {
    val pokemonsState = MutableStateFlow(
        ApiResource(
            ApiStatus.LOADING, AdvertiseResponse(), ""
        )
    )

    fun fetchPokemons() {
        pokemonsState.value = ApiResource.loading()
        viewModelScope.launch {

            mainRepository.fetchAdvertiseData().catch {
                    pokemonsState.value = ApiResource.error(it.message.toString(), null)
                }.collect {
                    pokemonsState.value = ApiResource.success(it.data)
                }
        }
    }
}