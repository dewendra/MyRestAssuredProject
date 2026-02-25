package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserOtpResponse {

	private boolean status;
	private String code;
	private String discountCode;
	public UserOtpResponse() {
		
	}
	public UserOtpResponse(boolean status, String code, String discountCode) {
		super();
		this.status = status;
		this.code = code;
		this.discountCode = discountCode;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	@Override
	public String toString() {
		return "UserOtpResponse [status=" + status + ", code=" + code + ", discountCode=" + discountCode + "]";
	}
	
	
}
