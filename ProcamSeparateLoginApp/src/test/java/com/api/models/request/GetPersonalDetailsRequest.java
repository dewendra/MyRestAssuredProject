package com.api.models.request;

public class GetPersonalDetailsRequest {

	private String eventId;
	private String discountCode;
	public GetPersonalDetailsRequest(String eventId, String discountCode) {
		super();
		this.eventId = eventId;
		this.discountCode = discountCode;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	@Override
	public String toString() {
		return "GetPersonalDetailsRequest [eventId=" + eventId + ", discountCode=" + discountCode + "]";
	}

	
	
}
