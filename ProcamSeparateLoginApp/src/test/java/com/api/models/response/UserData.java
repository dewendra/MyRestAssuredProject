package com.api.models.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserData {

	private int runnerId;
    private String emailId;
    private String mobileCode;
    private String mobileNum;
    private String dateOfBirth;
    private String firstName;
    private String lastName;
    private String middleName;
    private String name;
    private String gender;
    private int nationality;
    private String nationalityName;
    private boolean verified;
    private List<Question> questions;
    private List<Object> extraQuestions;
    private boolean memberofRunclub;
    private Address address;
    
	public UserData() {
		
	}

	public UserData(int runnerId, String emailId, String mobileCode, String mobileNum, String dateOfBirth, String firstName,
			String lastName, String middleName, String name, String gender, int nationality, String nationalityName,
			boolean verified, List<Question> questions, List<Object> extraQuestions, boolean memberofRunclub,
			Address address) {
		super();
		this.runnerId = runnerId;
		this.emailId = emailId;
		this.mobileCode = mobileCode;
		this.mobileNum = mobileNum;
		this.dateOfBirth = dateOfBirth;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.nationalityName = nationalityName;
		this.verified = verified;
		this.questions = questions;
		this.extraQuestions = extraQuestions;
		this.memberofRunclub = memberofRunclub;
		this.address = address;
	}

	public int getRunnerId() {
		return runnerId;
	}

	public void setRunnerId(int runnerId) {
		this.runnerId = runnerId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileCode() {
		return mobileCode;
	}

	public void setMobileCode(String mobileCode) {
		this.mobileCode = mobileCode;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getNationality() {
		return nationality;
	}

	public void setNationality(int nationality) {
		this.nationality = nationality;
	}

	public String getNationalityName() {
		return nationalityName;
	}

	public void setNationalityName(String nationalityName) {
		this.nationalityName = nationalityName;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<Object> getExtraQuestions() {
		return extraQuestions;
	}

	public void setExtraQuestions(List<Object> extraQuestions) {
		this.extraQuestions = extraQuestions;
	}

	public boolean isMemberofRunclub() {
		return memberofRunclub;
	}

	public void setMemberofRunclub(boolean memberofRunclub) {
		this.memberofRunclub = memberofRunclub;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Data [runnerId=" + runnerId + ", emailId=" + emailId + ", mobileCode=" + mobileCode + ", mobileNum="
				+ mobileNum + ", dateOfBirth=" + dateOfBirth + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + ", name=" + name + ", gender=" + gender + ", nationality="
				+ nationality + ", nationalityName=" + nationalityName + ", verified=" + verified + ", questions="
				+ questions + ", extraQuestions=" + extraQuestions + ", memberofRunclub=" + memberofRunclub
				+ ", address=" + address + "]";
	}
	
	

    
}
