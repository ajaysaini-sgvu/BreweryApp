package com.blackbelt.brewery.api.model

import com.google.gson.annotations.SerializedName


data class Featured(

	@field:SerializedName("beerId")
	val beerId: String? = null,

	@field:SerializedName("week")
	val week: Int? = null,

	@field:SerializedName("year")
	val year: Int? = null,

	@field:SerializedName("breweryId")
	val breweryId: String? = null,

	@field:SerializedName("brewery")
	val brewery: Brewery? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("beer")
	val beer: Beer? = null,

	@field:SerializedName("createDate")
	val createDate: String? = null
)