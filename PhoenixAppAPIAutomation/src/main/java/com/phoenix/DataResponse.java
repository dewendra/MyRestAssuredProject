package com.phoenix;

public class DataResponse {
	private String token;

	public DataResponse() {

	}

	public DataResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "DataResponse [token=" + token + "]";
	}

}
