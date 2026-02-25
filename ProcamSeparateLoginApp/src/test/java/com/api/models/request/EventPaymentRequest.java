package com.api.models.request;

import java.math.BigDecimal;

public class EventPaymentRequest {
	
	private String eventId;
    private Long registrationId;
    private String discountCode;
    private BigDecimal amount;
    private String currency;
    private Boolean buddyRequired;
    private EventBuyerDetails buyerDetails;
	public EventPaymentRequest(String eventId, Long registrationId, String discountCode, BigDecimal amount,
			String currency, Boolean buddyRequired, EventBuyerDetails buyerDetails) {
		super();
		this.eventId = eventId;
		this.registrationId = registrationId;
		this.discountCode = discountCode;
		this.amount = amount;
		this.currency = currency;
		this.buddyRequired = buddyRequired;
		this.buyerDetails = buyerDetails;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public Long getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(Long registrationId) {
		this.registrationId = registrationId;
	}
	public String getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Boolean getBuddyRequired() {
		return buddyRequired;
	}
	public void setBuddyRequired(Boolean buddyRequired) {
		this.buddyRequired = buddyRequired;
	}
	public EventBuyerDetails getBuyerDetails() {
		return buyerDetails;
	}
	public void setBuyerDetails(EventBuyerDetails buyerDetails) {
		this.buyerDetails = buyerDetails;
	}
	@Override
	public String toString() {
		return "EventPaymentRequest [eventId=" + eventId + ", registrationId=" + registrationId + ", discountCode="
				+ discountCode + ", amount=" + amount + ", currency=" + currency + ", buddyRequired=" + buddyRequired
				+ ", buyerDetails=" + buyerDetails + "]";
	}
    
    
}
