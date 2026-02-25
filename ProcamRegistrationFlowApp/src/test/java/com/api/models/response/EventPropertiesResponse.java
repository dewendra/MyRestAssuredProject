package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventPropertiesResponse {

	private boolean status;
    private EventConfigurationData data;
    private String discountCode;
    
	public EventPropertiesResponse() {
		
	}

	public EventPropertiesResponse(boolean status, EventConfigurationData data, String discountCode) {
		super();
		this.status = status;
		this.data = data;
		this.discountCode = discountCode;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public EventConfigurationData getData() {
		return data;
	}

	public void setData(EventConfigurationData data) {
		this.data = data;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	@Override
	public String toString() {
		return "EventPropertiesResponse [status=" + status + ", data=" + data + ", discountCode=" + discountCode + "]";
	}
    
	
    
}
