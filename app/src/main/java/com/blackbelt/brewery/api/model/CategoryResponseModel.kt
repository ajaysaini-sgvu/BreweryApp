package com.blackbelt.brewery.api.model

import com.google.gson.annotations.SerializedName

data class CategoryResponseModel(

        @field:SerializedName("data")
        val data: List<Category>? = null,

        @field:SerializedName("message")
        val message: String? = null,

        @field:SerializedName("status")
        val status: String? = null
)