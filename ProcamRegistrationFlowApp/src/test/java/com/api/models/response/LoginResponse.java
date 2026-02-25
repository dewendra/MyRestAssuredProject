package com.api.models.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginResponse {

	private String status;
	private String accessToken;
	private int expiresIn;
	private String validFor;
	private int id;
	private String clientId;
	private List<Object> roles;
	private List<String> separate_login_roles;
	private String discountCode;
	
	public LoginResponse() {
		
	}

	public LoginResponse(String status, String accessToken, int expiresIn, String validFor, int id, String clientId,
			List<Object> roles, List<String> separate_login_roles, String discountCode) {
		super();
		this.status = status;
		this.accessToken = accessToken;
		this.expiresIn = expiresIn;
		this.validFor = validFor;
		this.id = id;
		this.clientId = clientId;
		this.roles = roles;
		this.separate_login_roles = separate_login_roles;
		this.discountCode = discountCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public List<Object> getRoles() {
		return roles;
	}

	public void setRoles(List<Object> roles) {
		this.roles = roles;
	}

	public List<String> getSeparate_login_roles() {
		return separate_login_roles;
	}

	public void setSeparate_login_roles(List<String> separate_login_roles) {
		this.separate_login_roles = separate_login_roles;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	@Override
	public String toString() {
		return "LoginResponse [status=" + status + ", accessToken=" + accessToken + ", expiresIn=" + expiresIn
				+ ", validFor=" + validFor + ", id=" + id + ", clientId=" + clientId + ", roles=" + roles
				+ ", separate_login_roles=" + separate_login_roles + ", discountCode=" + discountCode + "]";
	}

	
}
