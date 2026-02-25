package com.api.models.request;

public class UserOtpRequest {
	private String email;
	private int eventId;
	private String consent;
	public UserOtpRequest(String email, int eventId, String consent) {
		super();
		this.email = email;
		this.eventId = eventId;
		this.consent = consent;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getConsent() {
		return consent;
	}
	public void setConsent(String consent) {
		this.consent = consent;
	}
	@Override
	public String toString() {
		return "UserOtpRequest [email=" + email + ", eventId=" + eventId + ", consent=" + consent + "]";
	}
	

	
}
