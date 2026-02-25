package com.api.models.request;

import java.util.List;

import com.api.models.response.CharityDetailsResponse;

public class CharityDonationRequest {
	
	private String eventId;
	private String discountCode;
	private String registrationId;
	private boolean generateCertificate;
	private boolean fundraiser;
	private int targetAmount;
    private String panCardName;
    private String panCardNo;
    private List<CharityDetailsInRequest> charity;
    
	public CharityDonationRequest(String eventId, String discountCode, String registrationId,
			boolean generateCertificate, boolean fundraiser, int targetAmount, String panCardName, String panCardNo,
			List<CharityDetailsInRequest> charity) {
		super();
		this.eventId = eventId;
		this.discountCode = discountCode;
		this.registrationId = registrationId;
		this.generateCertificate = generateCertificate;
		this.fundraiser = fundraiser;
		this.targetAmount = targetAmount;
		this.panCardName = panCardName;
		this.panCardNo = panCardNo;
		this.charity = charity;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public boolean getGenerateCertificate() {
		return generateCertificate;
	}

	public void setGenerateCertificate(boolean generateCertificate) {
		this.generateCertificate = generateCertificate;
	}

	public boolean getFundraiser() {
		return fundraiser;
	}

	public void setFundraiser(boolean fundraiser) {
		this.fundraiser = fundraiser;
	}

	public int getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(int targetAmount) {
		this.targetAmount = targetAmount;
	}

	public String getPanCardName() {
		return panCardName;
	}

	public void setPanCardName(String panCardName) {
		this.panCardName = panCardName;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}

	public List<CharityDetailsInRequest> getCharity() {
		return charity;
	}

	public void setCharity(List<CharityDetailsInRequest> charity) {
		this.charity = charity;
	}

	@Override
	public String toString() {
		return "CharityDonationRequest [eventId=" + eventId + ", discountCode=" + discountCode + ", registrationId="
				+ registrationId + ", generateCertificate=" + generateCertificate + ", fundraiser=" + fundraiser
				+ ", targetAmount=" + targetAmount + ", panCardName=" + panCardName + ", panCardNo=" + panCardNo
				+ ", charity=" + charity + "]";
	}
    
    

}
