package com.demo.advanced.daggerhilt.data.response.weather

data class AppCenter(
    val catgeory: String,
    val id: Int,
    val is_active: Int,
    val name: String,
    val position: Int,
    val sub_category: List<SubCategory>
)