package com.blackbelt.brewery.api.model

import com.google.gson.annotations.SerializedName


data class Brewery(

	@field:SerializedName("established")
	val established: String? = null,

	@field:SerializedName("website")
	val website: String? = null,

	@field:SerializedName("images")
	val images: Images? = null,

	@field:SerializedName("updateDate")
	val updateDate: String? = null,

	@field:SerializedName("statusDisplay")
	val statusDisplay: String? = null,

	@field:SerializedName("isOrganic")
	val isOrganic: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("isMassOwned")
	val isMassOwned: String? = null,

	@field:SerializedName("brandClassification")
	val brandClassification: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("nameShortDisplay")
	val nameShortDisplay: String? = null,

	@field:SerializedName("locations")
	val locations: List<LocationsItem?>? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("createDate")
	val createDate: String? = null
)