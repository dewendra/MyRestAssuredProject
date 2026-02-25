package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TimmedDistance {

	private int rowId;
	private double distance;
	private String name;
	private int priority;
	
	public TimmedDistance() {
		
	}

	public TimmedDistance(int rowId, double distance, String name, int priority) {
		super();
		this.rowId = rowId;
		this.distance = distance;
		this.name = name;
		this.priority = priority;
	}

	public int getRowId() {
		return rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "TimmedDistance [rowId=" + rowId + ", distance=" + distance + ", name=" + name + ", priority=" + priority
				+ "]";
	}
	
	
	
}
