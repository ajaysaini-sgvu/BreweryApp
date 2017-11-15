package com.blackbelt.brewery.api.model

import com.google.gson.annotations.SerializedName

data class Available(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)