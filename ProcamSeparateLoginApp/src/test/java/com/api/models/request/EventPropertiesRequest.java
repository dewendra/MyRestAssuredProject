package com.api.models.request;

public class EventPropertiesRequest {
	private String eventId;

	public EventPropertiesRequest(String eventId) {
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
		return "EventPropertiesRequest [eventId=" + eventId + "]";
	}
	
	
}
