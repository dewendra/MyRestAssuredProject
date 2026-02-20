package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharityDetails {
	private int ngoId;
    private String ngoName;
    private double amount;
    
	public CharityDetails() {
		
	}

	public CharityDetails(int ngoId, String ngoName, double amount) {
		super();
		this.ngoId = ngoId;
		this.ngoName = ngoName;
		this.amount = amount;
	}

	public int getNgoId() {
		return ngoId;
	}

	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
	}

	public String getNgoName() {
		return ngoName;
	}

	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "CharityDetails [ngoId=" + ngoId + ", ngoName=" + ngoName + ", amount=" + amount + "]";
	}
    
	
    
}
