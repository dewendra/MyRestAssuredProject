package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientTokenResponse {

	private boolean status;
	private String accessToken;
	private int expiresIn;
	private String validFor;
	private String clientId;
	private String discountCode;
	
	public ClientTokenResponse() {
		
	}

	public ClientTokenResponse(boolean status, String accessToken, int expiresIn, String validFor, String clientId,
			String discountCode) {
		super();
		this.status = status;
		this.accessToken = accessToken;
		this.expiresIn = expiresIn;
		this.validFor = validFor;
		this.clientId = clientId;
		this.discountCode = discountCode;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getValidFor() {
		return validFor;
	}

	public void setValidFor(String validFor) {
		this.validFor = validFor;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	@Override
	public String toString() {
		return "ClientTokenResponse [status=" + status + ", accessToken=" + accessToken + ", expiresIn=" + expiresIn
				+ ", validFor=" + validFor + ", clientId=" + clientId + ", discountCode=" + discountCode + "]";
	}
	
	
	
	
}
