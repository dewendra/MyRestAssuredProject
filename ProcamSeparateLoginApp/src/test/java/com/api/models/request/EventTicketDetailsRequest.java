package com.api.models.request;

public class EventTicketDetailsRequest {

	private String eventId;
	private String raceType;
	private String discountCode;
	
	public EventTicketDetailsRequest(String eventId, String raceType, String discountCode) {
		super();
		this.eventId = eventId;
		this.raceType = raceType;
		this.discountCode = discountCode;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getRaceType() {
		return raceType;
	}

	public void setRaceType(String raceType) {
		this.raceType = raceType;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	@Override
	public String toString() {
		return "EventTicketDetailsRequest [eventId=" + eventId + ", raceType=" + raceType + ", discountCode="
				+ discountCode + "]";
	}
	
	
}
