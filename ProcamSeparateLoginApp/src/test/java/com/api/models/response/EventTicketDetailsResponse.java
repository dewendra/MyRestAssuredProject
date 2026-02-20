package com.api.models.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventTicketDetailsResponse {
	private boolean status;
    private List<RaceCategoryData> data;
    private String discountCode;
    private boolean indian;
    
	public EventTicketDetailsResponse() {
		
	}

	public EventTicketDetailsResponse(boolean status, List<RaceCategoryData> data, String discountCode,
			boolean indian) {
		super();
		this.status = status;
		this.data = data;
		this.discountCode = discountCode;
		this.indian = indian;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<RaceCategoryData> getData() {
		return data;
	}

	public void setData(List<RaceCategoryData> data) {
		this.data = data;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public boolean isIndian() {
		return indian;
	}

	public void setIndian(boolean indian) {
		this.indian = indian;
	}

	@Override
	public String toString() {
		return "EventTicketDetailsResponse [status=" + status + ", data=" + data + ", discountCode=" + discountCode
				+ ", indian=" + indian + "]";
	}
    
    
}
