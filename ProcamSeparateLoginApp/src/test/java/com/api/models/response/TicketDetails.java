package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketDetails {
	private int ticketId;
    private String categoryName;
    private String ticketName;
    private String raceType;
    private int quantity;
    private double price;
    private double discount;
    private boolean taxIncluded;
    private double taxPercent;
    private double tax;
    private double payableAmount;
    
	public TicketDetails() {
		
	}

	public TicketDetails(int ticketId, String categoryName, String ticketName, String raceType, int quantity,
			double price, double discount, boolean taxIncluded, double taxPercent, double tax, double payableAmount) {
		super();
		this.ticketId = ticketId;
		this.categoryName = categoryName;
		this.ticketName = ticketName;
		this.raceType = raceType;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
		this.taxIncluded = taxIncluded;
		this.taxPercent = taxPercent;
		this.tax = tax;
		this.payableAmount = payableAmount;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getTicketName() {
		return ticketName;
	}

	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}

	public String getRaceType() {
		return raceType;
	}

	public void setRaceType(String raceType) {
		this.raceType = raceType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public boolean isTaxIncluded() {
		return taxIncluded;
	}

	public void setTaxIncluded(boolean taxIncluded) {
		this.taxIncluded = taxIncluded;
	}

	public double getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(double taxPercent) {
		this.taxPercent = taxPercent;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getPayableAmount() {
		return payableAmount;
	}

	public void setPayableAmount(double payableAmount) {
		this.payableAmount = payableAmount;
	}

	@Override
	public String toString() {
		return "TicketDetails [ticketId=" + ticketId + ", categoryName=" + categoryName + ", ticketName=" + ticketName
				+ ", raceType=" + raceType + ", quantity=" + quantity + ", price=" + price + ", discount=" + discount
				+ ", taxIncluded=" + taxIncluded + ", taxPercent=" + taxPercent + ", tax=" + tax + ", payableAmount="
				+ payableAmount + "]";
	}
    
	
    
    
    
}
