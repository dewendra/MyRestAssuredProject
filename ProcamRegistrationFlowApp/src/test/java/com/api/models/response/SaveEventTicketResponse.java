package com.api.models.response;

public class SaveEventTicketResponse {
	private boolean status;
	private String discountCode;
	
	public SaveEventTicketResponse() {
		
	}

	public SaveEventTicketResponse(boolean status, String discountCode) {
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
		return "SaveEventTicketResponse [status=" + status + ", discountCode=" + discountCode + "]";
	}
	
	
}
