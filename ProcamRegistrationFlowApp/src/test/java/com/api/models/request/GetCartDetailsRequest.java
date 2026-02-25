package com.api.models.request;

public class GetCartDetailsRequest {
	private String eventId;

	public GetCartDetailsRequest(String eventId) {
		super();
		this.eventId = eventId;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	@Override
	public String toString() {
		return "GetCartDetailsRequest [eventId=" + eventId + "]";
	}

	
}
