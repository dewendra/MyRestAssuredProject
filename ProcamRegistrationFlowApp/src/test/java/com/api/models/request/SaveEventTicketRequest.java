package com.api.models.request;

import java.util.List;

public class SaveEventTicketRequest {
	private String eventId;
    private String discountCode;
    private List<EventTicketRequest> tickets;
	public SaveEventTicketRequest(String eventId, String discountCode, List<EventTicketRequest> tickets) {
		super();
		this.eventId = eventId;
		this.discountCode = discountCode;
		this.tickets = tickets;
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
	public List<EventTicketRequest> getTickets() {
		return tickets;
	}
	public void setTickets(List<EventTicketRequest> tickets) {
		this.tickets = tickets;
	}
	@Override
	public String toString() {
		return "SaveEventTicketRequest [eventId=" + eventId + ", discountCode=" + discountCode + ", tickets=" + tickets
				+ "]";
	}

    
}
