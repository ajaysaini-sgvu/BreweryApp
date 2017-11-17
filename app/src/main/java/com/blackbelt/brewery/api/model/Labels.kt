package com.blackbelt.brewery.api.model

import com.google.gson.annotations.SerializedName


data class Labels(

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("icon")
	val icon: String? = null,

	@field:SerializedName("medium")
	val medium: String? = null
)