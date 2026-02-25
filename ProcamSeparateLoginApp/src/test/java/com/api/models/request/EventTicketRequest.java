package com.api.models.request;

public class EventTicketRequest {

	private int id;
    private int eventCategoryId;
    private String raceType;
	
    public EventTicketRequest(int id, int eventCategoryId, String raceType) {
		super();
		this.id = id;
		this.eventCategoryId = eventCategoryId;
		this.raceType = raceType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEventCategoryId() {
		return eventCategoryId;
	}

	public void setEventCategoryId(int eventCategoryId) {
		this.eventCategoryId = eventCategoryId;
	}

	public String getRaceType() {
		return raceType;
	}

	public void setRaceType(String raceType) {
		this.raceType = raceType;
	}

	@Override
	public String toString() {
		return "EventTicketRequest [id=" + id + ", eventCategoryId=" + eventCategoryId + ", raceType=" + raceType + "]";
	}
    
	
}
