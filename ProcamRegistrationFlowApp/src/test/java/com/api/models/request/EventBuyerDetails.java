package com.api.models.request;

public class EventBuyerDetails {

	private String buyerName;
    private String buyeremail;
    private String buyercountryId;
    private String buyerstateId;
    private String buyercityId;
    private Long buyernationalityId;
    private String buyerphoneNumber;
    private String buyergstNumber;
    private String buyernameOnInvoice;
    private Boolean buyersendWhatsappNotification;
    
	public EventBuyerDetails(String buyerName, String buyeremail, String buyercountryId, String buyerstateId,
			String buyercityId, Long buyernationalityId, String buyerphoneNumber, String buyergstNumber,
			String buyernameOnInvoice, Boolean buyersendWhatsappNotification) {
		super();
		this.buyerName = buyerName;
		this.buyeremail = buyeremail;
		this.buyercountryId = buyercountryId;
		this.buyerstateId = buyerstateId;
		this.buyercityId = buyercityId;
		this.buyernationalityId = buyernationalityId;
		this.buyerphoneNumber = buyerphoneNumber;
		this.buyergstNumber = buyergstNumber;
		this.buyernameOnInvoice = buyernameOnInvoice;
		this.buyersendWhatsappNotification = buyersendWhatsappNotification;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyeremail() {
		return buyeremail;
	}

	public void setBuyeremail(String buyeremail) {
		this.buyeremail = buyeremail;
	}

	public String getBuyercountryId() {
		return buyercountryId;
	}

	public void setBuyercountryId(String buyercountryId) {
		this.buyercountryId = buyercountryId;
	}

	public String getBuyerstateId() {
		return buyerstateId;
	}

	public void setBuyerstateId(String buyerstateId) {
		this.buyerstateId = buyerstateId;
	}

	public String getBuyercityId() {
		return buyercityId;
	}

	public void setBuyercityId(String buyercityId) {
		this.buyercityId = buyercityId;
	}

	public Long getBuyernationalityId() {
		return buyernationalityId;
	}

	public void setBuyernationalityId(Long buyernationalityId) {
		this.buyernationalityId = buyernationalityId;
	}

	public String getBuyerphoneNumber() {
		return buyerphoneNumber;
	}

	public void setBuyerphoneNumber(String buyerphoneNumber) {
		this.buyerphoneNumber = buyerphoneNumber;
	}

	public String getBuyergstNumber() {
		return buyergstNumber;
	}

	public void setBuyergstNumber(String buyergstNumber) {
		this.buyergstNumber = buyergstNumber;
	}

	public String getBuyernameOnInvoice() {
		return buyernameOnInvoice;
	}

	public void setBuyernameOnInvoice(String buyernameOnInvoice) {
		this.buyernameOnInvoice = buyernameOnInvoice;
	}

	public Boolean getBuyersendWhatsappNotification() {
		return buyersendWhatsappNotification;
	}

	public void setBuyersendWhatsappNotification(Boolean buyersendWhatsappNotification) {
		this.buyersendWhatsappNotification = buyersendWhatsappNotification;
	}

	@Override
	public String toString() {
		return "EventBuyerDetails [buyerName=" + buyerName + ", buyeremail=" + buyeremail + ", buyercountryId="
				+ buyercountryId + ", buyerstateId=" + buyerstateId + ", buyercityId=" + buyercityId
				+ ", buyernationalityId=" + buyernationalityId + ", buyerphoneNumber=" + buyerphoneNumber
				+ ", buyergstNumber=" + buyergstNumber + ", buyernameOnInvoice=" + buyernameOnInvoice
				+ ", buyersendWhatsappNotification=" + buyersendWhatsappNotification + "]";
	}
    
    
}
