package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddonDetails {
	private int addonId;
	private String addonName;
	private double price;
	
	public AddonDetails() {
		
	}

	public AddonDetails(int addonId, String addonName, double price) {
		super();
		this.addonId = addonId;
		this.addonName = addonName;
		this.price = price;
	}

	public int getAddonId() {
		return addonId;
	}

	public void setAddonId(int addonId) {
		this.addonId = addonId;
	}

	public String getAddonName() {
		return addonName;
	}

	public void setAddonName(String addonName) {
		this.addonName = addonName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "AddonDetails [addonId=" + addonId + ", addonName=" + addonName + ", price=" + price + "]";
	}

	
}
