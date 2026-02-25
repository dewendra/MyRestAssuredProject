package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharityDonationResponse {

	private boolean status;
	private String discountCode;
	
	
	
	public CharityDonationResponse() {
		super();
	}

	public CharityDonationResponse(boolean status, String discountCode) {
		super();
		this.status = status;
		this.discountCode = discountCode;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	@Override
	public String toString() {
		return "CharityDonationResponse [status=" + status + ", discountCode=" + discountCode + "]";
	}
	
	
}
