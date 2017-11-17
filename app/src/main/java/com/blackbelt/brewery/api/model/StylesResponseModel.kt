package com.blackbelt.brewery.api.model

import com.google.gson.annotations.SerializedName

data class StylesResponseModel(

        @field:SerializedName("data")
        val data: List<Style>? = null,

        @field:SerializedName("message")
        val message: String? = null,

        @field:SerializedName("status")
        val status: String? = null
)