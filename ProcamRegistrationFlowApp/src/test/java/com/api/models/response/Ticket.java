package com.api.models.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticket {

	private int id;
    private String name;
    private String description;
    private boolean expired;
    private boolean active;
    private boolean soldOut;
    private boolean officialQualifiers;
    private String disabilityType;
    private int eventId;
    private int eventCategoryId;
    private int priority;
    private String timmmingType;
    private String disabilityBuddy;

    @JsonProperty("buddy_count")
    private int buddyCount;

    private List<TicketPricing> pricing;
    private List<TicketQuestion> questions;
    private List<TimmedDistance> timmedDistances;
    private boolean disabilityCertificateRequired;
	
    public Ticket() {
		
	}

	public Ticket(int id, String name, String description, boolean expired, boolean active, boolean soldOut,
			boolean officialQualifiers, String disabilityType, int eventId, int eventCategoryId, int priority,
			String timmmingType, String disabilityBuddy, int buddyCount, List<TicketPricing> pricing,
			List<TicketQuestion> questions, List<TimmedDistance> timmedDistances,
			boolean disabilityCertificateRequired) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.expired = expired;
		this.active = active;
		this.soldOut = soldOut;
		this.officialQualifiers = officialQualifiers;
		this.disabilityType = disabilityType;
		this.eventId = eventId;
		this.eventCategoryId = eventCategoryId;
		this.priority = priority;
		this.timmmingType = timmmingType;
		this.disabilityBuddy = disabilityBuddy;
		this.buddyCount = buddyCount;
		this.pricing = pricing;
		this.questions = questions;
		this.timmedDistances = timmedDistances;
		this.disabilityCertificateRequired = disabilityCertificateRequired;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isSoldOut() {
		return soldOut;
	}

	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}

	public boolean isOfficialQualifiers() {
		return officialQualifiers;
	}

	public void setOfficialQualifiers(boolean officialQualifiers) {
		this.officialQualifiers = officialQualifiers;
	}

	public String getDisabilityType() {
		return disabilityType;
	}

	public void setDisabilityType(String disabilityType) {
		this.disabilityType = disabilityType;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public int getEventCategoryId() {
		return eventCategoryId;
	}

	public void setEventCategoryId(int eventCategoryId) {
		this.eventCategoryId = eventCategoryId;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getTimmmingType() {
		return timmmingType;
	}

	public void setTimmmingType(String timmmingType) {
		this.timmmingType = timmmingType;
	}

	public String getDisabilityBuddy() {
		return disabilityBuddy;
	}

	public void setDisabilityBuddy(String disabilityBuddy) {
		this.disabilityBuddy = disabilityBuddy;
	}

	public int getBuddyCount() {
		return buddyCount;
	}

	public void setBuddyCount(int buddyCount) {
		this.buddyCount = buddyCount;
	}

	public List<TicketPricing> getPricing() {
		return pricing;
	}

	public void setPricing(List<TicketPricing> pricing) {
		this.pricing = pricing;
	}

	public List<TicketQuestion> getQuestions() {
		return questions;
	}

	public void setQuestions(List<TicketQuestion> questions) {
		this.questions = questions;
	}

	public List<TimmedDistance> getTimmedDistances() {
		return timmedDistances;
	}

	public void setTimmedDistances(List<TimmedDistance> timmedDistances) {
		this.timmedDistances = timmedDistances;
	}

	public boolean isDisabilityCertificateRequired() {
		return disabilityCertificateRequired;
	}

	public void setDisabilityCertificateRequired(boolean disabilityCertificateRequired) {
		this.disabilityCertificateRequired = disabilityCertificateRequired;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", name=" + name + ", description=" + description + ", expired=" + expired
				+ ", active=" + active + ", soldOut=" + soldOut + ", officialQualifiers=" + officialQualifiers
				+ ", disabilityType=" + disabilityType + ", eventId=" + eventId + ", eventCategoryId=" + eventCategoryId
				+ ", priority=" + priority + ", timmmingType=" + timmmingType + ", disabilityBuddy=" + disabilityBuddy
				+ ", buddyCount=" + buddyCount + ", pricing=" + pricing + ", questions=" + questions
				+ ", timmedDistances=" + timmedDistances + ", disabilityCertificateRequired="
				+ disabilityCertificateRequired + "]";
	}
    
    
    
    
}
