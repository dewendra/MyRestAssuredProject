package com.api.models.request;

public class LoginRequest {

	
	private String otp;
	private String code;
	public LoginRequest(String otp, String code) {
		super();
		this.otp = otp;
		this.code = code;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "LoginRequest [otp=" + otp + ", code=" + code + "]";
	}

	
	

	
}
