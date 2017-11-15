package com.blackbelt.brewery.api.model

import com.google.gson.annotations.SerializedName


data class Images(

	@field:SerializedName("squareLarge")
	val squareLarge: String? = null,

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("icon")
	val icon: String? = null,

	@field:SerializedName("medium")
	val medium: String? = null,

	@field:SerializedName("squareMedium")
	val squareMedium: String? = null
)