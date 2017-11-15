package com.blackbelt.brewery.api.model

import com.google.gson.annotations.SerializedName


data class Srm(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("hex")
	val hex: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)