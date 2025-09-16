package com.phoenix;

public class LoginResponse {

	private String message;
	private DataResponse data;

	public LoginResponse() {

	}

	public LoginResponse(String message, DataResponse data) {
		super();
		this.message = message;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public DataResponse getData() {
		return data;
	}

	public void setData(DataResponse data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "LoginResponse [message=" + message + ", data=" + data + "]";
	}

}
