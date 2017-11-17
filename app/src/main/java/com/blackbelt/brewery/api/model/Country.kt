package com.blackbelt.brewery.api.model

import com.google.gson.annotations.SerializedName


data class Country(

	@field:SerializedName("isoCode")
	val isoCode: String? = null,

	@field:SerializedName("displayName")
	val displayName: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("isoThree")
	val isoThree: String? = null,

	@field:SerializedName("numberCode")
	val numberCode: Int? = null,

	@field:SerializedName("createDate")
	val createDate: String? = null
)