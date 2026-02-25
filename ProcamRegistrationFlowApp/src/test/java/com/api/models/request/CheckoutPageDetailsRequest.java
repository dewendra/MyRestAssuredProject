package com.api.models.request;

public class CheckoutPageDetailsRequest {

	private String eventId;
	private String registrationId;
	private boolean  buddyRequired;
	private String discountCode;
	public CheckoutPageDetailsRequest(String eventId, String registrationId, boolean buddyRequired,
			String discountCode) {
		super();
		this.eventId = eventId;
		this.registrationId = registrationId;
		this.buddyRequired = buddyRequired;
		this.discountCode = discountCode;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public boolean isBuddyRequired() {
		return buddyRequired;
	}
	public void setBuddyRequired(boolean buddyRequired) {
		this.buddyRequired = buddyRequired;
	}
	public String getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	@Override
	public String toString() {
		return "CheckoutPageDetailsRequest [eventId=" + eventId + ", registrationId=" + registrationId
				+ ", buddyRequired=" + buddyRequired + ", discountCode=" + discountCode + "]";
	}
	 
	
}
