package com.blackbelt.brewery.api.model

import com.google.gson.annotations.SerializedName


data class LocationsItem(

	@field:SerializedName("openToPublic")
	val openToPublic: String? = null,

	@field:SerializedName("country")
	val country: Country? = null,

	@field:SerializedName("website")
	val website: String? = null,

	@field:SerializedName("updateDate")
	val updateDate: String? = null,

	@field:SerializedName("countryIsoCode")
	val countryIsoCode: String? = null,

	@field:SerializedName("statusDisplay")
	val statusDisplay: String? = null,

	@field:SerializedName("postalCode")
	val postalCode: String? = null,

	@field:SerializedName("latitude")
	val latitude: Double? = null,

	@field:SerializedName("locality")
	val locality: String? = null,

	@field:SerializedName("locationType")
	val locationType: String? = null,

	@field:SerializedName("hoursOfOperation")
	val hoursOfOperation: String? = null,

	@field:SerializedName("inPlanning")
	val inPlanning: String? = null,

	@field:SerializedName("yearOpened")
	val yearOpened: String? = null,

	@field:SerializedName("isClosed")
	val isClosed: String? = null,

	@field:SerializedName("locationTypeDisplay")
	val locationTypeDisplay: String? = null,

	@field:SerializedName("streetAddress")
	val streetAddress: String? = null,

	@field:SerializedName("phone")
	val phone: String? = null,

	@field:SerializedName("isPrimary")
	val isPrimary: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("region")
	val region: String? = null,

	@field:SerializedName("longitude")
	val longitude: Double? = null,

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("createDate")
	val createDate: String? = null
)