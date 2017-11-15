package com.blackbelt.brewery.api.model

import com.google.gson.annotations.SerializedName

data class FeaturedResponseModel(

        @field:SerializedName("data")
        val data: Featured? = null,

        @field:SerializedName("message")
        val message: String? = null,

        @field:SerializedName("status")
        val status: String? = null
)