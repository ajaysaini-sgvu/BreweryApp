package com.blackbelt.brewery.api.model

import com.google.gson.annotations.SerializedName


data class Style(

	@field:SerializedName("ibuMax")
	val ibuMax: String? = null,

	@field:SerializedName("srmMax")
	val srmMax: String? = null,

	@field:SerializedName("updateDate")
	val updateDate: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("abvMax")
	val abvMax: String? = null,

	@field:SerializedName("fgMax")
	val fgMax: String? = null,

	@field:SerializedName("srmMin")
	val srmMin: String? = null,

	@field:SerializedName("ogMin")
	val ogMin: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("category")
	val category: Category? = null,

	@field:SerializedName("shortName")
	val shortName: String? = null,

	@field:SerializedName("abvMin")
	val abvMin: String? = null,

	@field:SerializedName("fgMin")
	val fgMin: String? = null,

	@field:SerializedName("categoryId")
	val categoryId: Int? = null,

	@field:SerializedName("ibuMin")
	val ibuMin: String? = null,

	@field:SerializedName("createDate")
	val createDate: String? = null
)