package com.api.models.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CartData {

	private String currency;
    private double billingAmount;
    private double registrationAmount;
    private double addonAmount;
    private double charityAmount;
    private double tgbAmount;
    private double discountAmount;
    private double payableAmount;
    private int totalItems;
    private int discountItems;
    private boolean fundraiser;

    private List<TaxDetails> tax;
    private List<TicketDetails> tickets;
    private List<AddonDetails> addons;
    private List<CharityDetailsResponse> charity;

    private Object tgb;

	public CartData() {
		
	}

	public CartData(String currency, double billingAmount, double registrationAmount, double addonAmount,
			double charityAmount, double tgbAmount, double discountAmount, double payableAmount, int totalItems,
			int discountItems, boolean fundraiser, List<TaxDetails> tax, List<TicketDetails> tickets,
			List<AddonDetails> addons, List<CharityDetailsResponse> charity, Object tgb) {
		super();
		this.currency = currency;
		this.billingAmount = billingAmount;
		this.registrationAmount = registrationAmount;
		this.addonAmount = addonAmount;
		this.charityAmount = charityAmount;
		this.tgbAmount = tgbAmount;
		this.discountAmount = discountAmount;
		this.payableAmount = payableAmount;
		this.totalItems = totalItems;
		this.discountItems = discountItems;
		this.fundraiser = fundraiser;
		this.tax = tax;
		this.tickets = tickets;
		this.addons = addons;
		this.charity = charity;
		this.tgb = tgb;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getBillingAmount() {
		return billingAmount;
	}

	public void setBillingAmount(double billingAmount) {
		this.billingAmount = billingAmount;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public double getAddonAmount() {
		return addonAmount;
	}

	public void setAddonAmount(double addonAmount) {
		this.addonAmount = addonAmount;
	}

	public double getCharityAmount() {
		return charityAmount;
	}

	public void setCharityAmount(double charityAmount) {
		this.charityAmount = charityAmount;
	}

	public double getTgbAmount() {
		return tgbAmount;
	}

	public void setTgbAmount(double tgbAmount) {
		this.tgbAmount = tgbAmount;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public double getPayableAmount() {
		return payableAmount;
	}

	public void setPayableAmount(double payableAmount) {
		this.payableAmount = payableAmount;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public int getDiscountItems() {
		return discountItems;
	}

	public void setDiscountItems(int discountItems) {
		this.discountItems = discountItems;
	}

	public boolean isFundraiser() {
		return fundraiser;
	}

	public void setFundraiser(boolean fundraiser) {
		this.fundraiser = fundraiser;
	}

	public List<TaxDetails> getTax() {
		return tax;
	}

	public void setTax(List<TaxDetails> tax) {
		this.tax = tax;
	}

	public List<TicketDetails> getTickets() {
		return tickets;
	}

	public void setTickets(List<TicketDetails> tickets) {
		this.tickets = tickets;
	}

	public List<AddonDetails> getAddons() {
		return addons;
	}

	public void setAddons(List<AddonDetails> addons) {
		this.addons = addons;
	}

	public List<CharityDetailsResponse> getCharity() {
		return charity;
	}

	public void setCharity(List<CharityDetailsResponse> charity) {
		this.charity = charity;
	}

	public Object getTgb() {
		return tgb;
	}

	public void setTgb(Object tgb) {
		this.tgb = tgb;
	}

	@Override
	public String toString() {
		return "CartData [currency=" + currency + ", billingAmount=" + billingAmount + ", registrationAmount="
				+ registrationAmount + ", addonAmount=" + addonAmount + ", charityAmount=" + charityAmount
				+ ", tgbAmount=" + tgbAmount + ", discountAmount=" + discountAmount + ", payableAmount=" + payableAmount
				+ ", totalItems=" + totalItems + ", discountItems=" + discountItems + ", fundraiser=" + fundraiser
				+ ", tax=" + tax + ", tickets=" + tickets + ", addons=" + addons + ", charity=" + charity + ", tgb="
				+ tgb + "]";
	} 
    
    
    
}
