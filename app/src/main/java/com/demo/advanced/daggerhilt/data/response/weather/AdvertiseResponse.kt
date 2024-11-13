package com.demo.advanced.daggerhilt.data.response.weather

data class AdvertiseResponse(
    val app_center: List<AppCenter> = listOf(),
    val `data`: List<Data> = listOf(),
    val home: List<Home> = listOf(),
    val message: String="",
    val more_apps: List<MoreApp> = listOf(),
    val native_add: NativeAdd? = null,
    val status: Int? = 0,
    val translator_ads_id: TranslatorAdsId? = null
)