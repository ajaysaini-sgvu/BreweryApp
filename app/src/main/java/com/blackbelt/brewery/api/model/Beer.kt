package com.blackbelt.brewery.api.model

import com.google.gson.annotations.SerializedName


data class Beer(

	@field:SerializedName("updateDate")
	val updateDate: String? = null,

	@field:SerializedName("glass")
	val glass: Glass? = null,

	@field:SerializedName("srmId")
	val srmId: Int? = null,

	@field:SerializedName("statusDisplay")
	val statusDisplay: String? = null,

	@field:SerializedName("nameDisplay")
	val nameDisplay: String? = null,

	@field:SerializedName("isOrganic")
	val isOrganic: String? = null,

	@field:SerializedName("available")
	val available: Available? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("glasswareId")
	val glasswareId: Int? = null,

	@field:SerializedName("breweries")
	val breweries: List<BreweriesItem?>? = null,

	@field:SerializedName("availableId")
	val availableId: Int? = null,

	@field:SerializedName("labels")
	val labels: Labels? = null,

	@field:SerializedName("srm")
	val srm: Srm? = null,

	@field:SerializedName("abv")
	val abv: String? = null,

	@field:SerializedName("styleId")
	val styleId: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("style")
	val style: Style? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("ibu")
	val ibu: String? = null,

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("createDate")
	val createDate: String? = null
)