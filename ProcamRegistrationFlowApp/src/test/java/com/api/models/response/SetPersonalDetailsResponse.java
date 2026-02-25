package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SetPersonalDetailsResponse {
	private boolean status;
	private String msg;
	private int id;
	private String discountCode;
	
	
	public SetPersonalDetailsResponse() {
	
	}

	public SetPersonalDetailsResponse(boolean status, String msg, int id, String discountCode) {
		super();
		this.status = status;
		this.msg = msg;
		this.id = id;
		this.discountCode = discountCode;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	@Override
	public String toString() {
		return "PersonalDetailsResponse [status=" + status + ", msg=" + msg + ", id=" + id + ", discountCode="
				+ discountCode + "]";
	}
	
	
	

}
