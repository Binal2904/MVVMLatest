package com.demo.advanced.daggerhilt.data.response.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0013J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\nH\u00c6\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J|\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0010H\u00d6\u0001J\t\u00100\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u00061"}, d2 = {"Lcom/demo/advanced/daggerhilt/data/response/weather/AdvertiseResponse;", "", "app_center", "", "Lcom/demo/advanced/daggerhilt/data/response/weather/AppCenter;", "data", "Lcom/demo/advanced/daggerhilt/data/response/weather/Data;", "home", "Lcom/demo/advanced/daggerhilt/data/response/weather/Home;", "message", "", "more_apps", "Lcom/demo/advanced/daggerhilt/data/response/weather/MoreApp;", "native_add", "Lcom/demo/advanced/daggerhilt/data/response/weather/NativeAdd;", "status", "", "translator_ads_id", "Lcom/demo/advanced/daggerhilt/data/response/weather/TranslatorAdsId;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/demo/advanced/daggerhilt/data/response/weather/NativeAdd;Ljava/lang/Integer;Lcom/demo/advanced/daggerhilt/data/response/weather/TranslatorAdsId;)V", "getApp_center", "()Ljava/util/List;", "getData", "getHome", "getMessage", "()Ljava/lang/String;", "getMore_apps", "getNative_add", "()Lcom/demo/advanced/daggerhilt/data/response/weather/NativeAdd;", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTranslator_ads_id", "()Lcom/demo/advanced/daggerhilt/data/response/weather/TranslatorAdsId;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/demo/advanced/daggerhilt/data/response/weather/NativeAdd;Ljava/lang/Integer;Lcom/demo/advanced/daggerhilt/data/response/weather/TranslatorAdsId;)Lcom/demo/advanced/daggerhilt/data/response/weather/AdvertiseResponse;", "equals", "", "other", "hashCode", "toString", "app_stagingDebug"})
public final class AdvertiseResponse {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.AppCenter> app_center = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.Data> data = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.Home> home = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.MoreApp> more_apps = null;
    @org.jetbrains.annotations.Nullable
    private final com.demo.advanced.daggerhilt.data.response.weather.NativeAdd native_add = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer status = null;
    @org.jetbrains.annotations.Nullable
    private final com.demo.advanced.daggerhilt.data.response.weather.TranslatorAdsId translator_ads_id = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.demo.advanced.daggerhilt.data.response.weather.AdvertiseResponse copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.AppCenter> app_center, @org.jetbrains.annotations.NotNull
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.Data> data, @org.jetbrains.annotations.NotNull
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.Home> home, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.MoreApp> more_apps, @org.jetbrains.annotations.Nullable
    com.demo.advanced.daggerhilt.data.response.weather.NativeAdd native_add, @org.jetbrains.annotations.Nullable
    java.lang.Integer status, @org.jetbrains.annotations.Nullable
    com.demo.advanced.daggerhilt.data.response.weather.TranslatorAdsId translator_ads_id) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public AdvertiseResponse() {
        super();
    }
    
    public AdvertiseResponse(@org.jetbrains.annotations.NotNull
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.AppCenter> app_center, @org.jetbrains.annotations.NotNull
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.Data> data, @org.jetbrains.annotations.NotNull
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.Home> home, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.MoreApp> more_apps, @org.jetbrains.annotations.Nullable
    com.demo.advanced.daggerhilt.data.response.weather.NativeAdd native_add, @org.jetbrains.annotations.Nullable
    java.lang.Integer status, @org.jetbrains.annotations.Nullable
    com.demo.advanced.daggerhilt.data.response.weather.TranslatorAdsId translator_ads_id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.AppCenter> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.AppCenter> getApp_center() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.Data> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.Data> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.Home> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.Home> getHome() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.MoreApp> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.MoreApp> getMore_apps() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.demo.advanced.daggerhilt.data.response.weather.NativeAdd component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.demo.advanced.daggerhilt.data.response.weather.NativeAdd getNative_add() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.demo.advanced.daggerhilt.data.response.weather.TranslatorAdsId component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.demo.advanced.daggerhilt.data.response.weather.TranslatorAdsId getTranslator_ads_id() {
        return null;
    }
}