package com.demo.advanced.daggerhilt.view.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/demo/advanced/daggerhilt/view/ui/activity/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/demo/advanced/daggerhilt/databinding/ActivityHomeBinding;", "locationManager", "Landroid/location/LocationManager;", "locationPermissionCode", "", "mainViewModel", "Lcom/demo/advanced/daggerhilt/view/viewmodel/MainViewModel;", "getMainViewModel", "()Lcom/demo/advanced/daggerhilt/view/viewmodel/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setLiveDataListeners", "app_stagingDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy mainViewModel$delegate = null;
    private android.location.LocationManager locationManager;
    private final int locationPermissionCode = 2;
    private com.demo.advanced.daggerhilt.databinding.ActivityHomeBinding binding;
    
    public HomeActivity() {
        super();
    }
    
    private final com.demo.advanced.daggerhilt.view.viewmodel.MainViewModel getMainViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setLiveDataListeners() {
    }
}