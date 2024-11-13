package com.demo.advanced.daggerhilt.view.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/demo/advanced/daggerhilt/view/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/demo/advanced/daggerhilt/repository/MainRepository;", "networkHelper", "Lcom/demo/advanced/daggerhilt/util/NetworkHelper;", "(Lcom/demo/advanced/daggerhilt/repository/MainRepository;Lcom/demo/advanced/daggerhilt/util/NetworkHelper;)V", "pokemonsState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/demo/advanced/daggerhilt/util/ApiResource;", "Lcom/demo/advanced/daggerhilt/data/response/weather/AdvertiseResponse;", "getPokemonsState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "fetchPokemons", "", "app_stagingDebug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.demo.advanced.daggerhilt.repository.MainRepository mainRepository = null;
    private final com.demo.advanced.daggerhilt.util.NetworkHelper networkHelper = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.demo.advanced.daggerhilt.util.ApiResource<com.demo.advanced.daggerhilt.data.response.weather.AdvertiseResponse>> pokemonsState = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.repository.MainRepository mainRepository, @org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.util.NetworkHelper networkHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.demo.advanced.daggerhilt.util.ApiResource<com.demo.advanced.daggerhilt.data.response.weather.AdvertiseResponse>> getPokemonsState() {
        return null;
    }
    
    public final void fetchPokemons() {
    }
}