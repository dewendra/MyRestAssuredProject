package com.api.models.request;

import java.util.List;

public class SetPersonalDetailsRequest {
	private List<QuestionsDetailsRequest> questions;
    private int eventId;
    private String discountCode;
    private int orderId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String gender;
    private String mobileNum;
    private int nationality;
    private boolean memberofRunclub;
    private String nationalityName;
    private String dateOfBirth;
    private AddressDetailsRequest address;
    
	public SetPersonalDetailsRequest(List<QuestionsDetailsRequest> questions, int eventId, String discountCode, int orderId,
			String firstName, String lastName, String emailId, String gender, String mobileNum, int nationality,
			boolean memberofRunclub, String nationalityName, String dateOfBirth, AddressDetailsRequest address) {
		super();
		this.questions = questions;
		this.eventId = eventId;
		this.discountCode = discountCode;
		this.orderId = orderId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.gender = gender;
		this.mobileNum = mobileNum;
		this.nationality = nationality;
		this.memberofRunclub = memberofRunclub;
		this.nationalityName = nationalityName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
	public List<QuestionsDetailsRequest> getQuestions() {
		return questions;
	}
	public void setQuestions(List<QuestionsDetailsRequest> questions) {
		this.questions = questions;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public int getNationality() {
		return nationality;
	}
	public void setNationality(int nationality) {
		this.nationality = nationality;
	}
	public boolean isMemberofRunclub() {
		return memberofRunclub;
	}
	public void setMemberofRunclub(boolean memberofRunclub) {
		this.memberofRunclub = memberofRunclub;
	}
	public String getNationalityName() {
		return nationalityName;
	}
	public void setNationalityName(String nationalityName) {
		this.nationalityName = nationalityName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public AddressDetailsRequest getAddress() {
		return address;
	}
	public void setAddress(AddressDetailsRequest address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "SetPersonalDetailsRequest [eventId=" + eventId + ", discountCode=" + discountCode + ", orderId="
				+ orderId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", gender="
				+ gender + ", mobileNum=" + mobileNum + ", nationality=" + nationality + ", memberofRunclub="
				+ memberofRunclub + ", nationalityName=" + nationalityName + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
	
	

}
