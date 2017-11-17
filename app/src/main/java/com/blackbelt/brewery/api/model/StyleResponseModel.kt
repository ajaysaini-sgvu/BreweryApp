package com.blackbelt.brewery.api.model

import com.google.gson.annotations.SerializedName

data class StyleResponseModel(

        @field:SerializedName("data")
        val data: Style? = null,

        @field:SerializedName("message")
        val message: String? = null,

        @field:SerializedName("status")
        val status: String? = null
)