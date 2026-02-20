package com.api.models.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RaceCategoryData {

	private int raceCategoryId;
	private String raceCategoryName;
	private String startDate;
	private String endDate;
	private int priority;
	private boolean verificationRequired;
	private List<Ticket> ticketList;
	
	public RaceCategoryData() {
		
	}

	public RaceCategoryData(int raceCategoryId, String raceCategoryName, String startDate, String endDate, int priority,
			boolean verificationRequired, List<Ticket> ticketList) {
		super();
		this.raceCategoryId = raceCategoryId;
		this.raceCategoryName = raceCategoryName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
		this.verificationRequired = verificationRequired;
		this.ticketList = ticketList;
	}

	public int getRaceCategoryId() {
		return raceCategoryId;
	}

	public void setRaceCategoryId(int raceCategoryId) {
		this.raceCategoryId = raceCategoryId;
	}

	public String getRaceCategoryName() {
		return raceCategoryName;
	}

	public void setRaceCategoryName(String raceCategoryName) {
		this.raceCategoryName = raceCategoryName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isVerificationRequired() {
		return verificationRequired;
	}

	public void setVerificationRequired(boolean verificationRequired) {
		this.verificationRequired = verificationRequired;
	}

	public List<Ticket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(List<Ticket> ticketList) {
		this.ticketList = ticketList;
	}

	@Override
	public String toString() {
		return "RaceCategoryData [raceCategoryId=" + raceCategoryId + ", raceCategoryName=" + raceCategoryName
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", priority=" + priority
				+ ", verificationRequired=" + verificationRequired + ", ticketList=" + ticketList + "]";
	}
	
	
	
}
