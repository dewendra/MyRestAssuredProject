package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketPricing {

	private String currency;
    private double amount;
    private double charity;
    private double tax;
    private double taxPercent;
    private boolean taxIncluded;
    private double discount;
    private double finalAmount;
    
	public TicketPricing() {
		
	}

	public TicketPricing(String currency, double amount, double charity, double tax, double taxPercent,
			boolean taxIncluded, double discount, double finalAmount) {
		super();
		this.currency = currency;
		this.amount = amount;
		this.charity = charity;
		this.tax = tax;
		this.taxPercent = taxPercent;
		this.taxIncluded = taxIncluded;
		this.discount = discount;
		this.finalAmount = finalAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getCharity() {
		return charity;
	}

	public void setCharity(double charity) {
		this.charity = charity;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(double taxPercent) {
		this.taxPercent = taxPercent;
	}

	public boolean isTaxIncluded() {
		return taxIncluded;
	}

	public void setTaxIncluded(boolean taxIncluded) {
		this.taxIncluded = taxIncluded;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}

	@Override
	public String toString() {
		return "TicketPricing [currency=" + currency + ", amount=" + amount + ", charity=" + charity + ", tax=" + tax
				+ ", taxPercent=" + taxPercent + ", taxIncluded=" + taxIncluded + ", discount=" + discount
				+ ", finalAmount=" + finalAmount + "]";
	}
    
    
}
