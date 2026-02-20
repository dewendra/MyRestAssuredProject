package com.api.models.response;

public class AddressDetailsResponse {
	private String name;
	private String email;
	private String mobileNumber;
	private String address1;
	private String address2;
	private String address3;
	private String country;
	private String state;
	private String city;
	private String pincode;
	private String landmark;

	public AddressDetailsResponse() {

	}

	public AddressDetailsResponse(String name, String email, String mobileNumber, String address1, String address2,
			String address3, String country, String state, String city, String pincode, String landmark) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.landmark = landmark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	@Override
	public String toString() {
		return "AddressDetailsRequest [name=" + name + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", address1=" + address1 + ", address2=" + address2 + ", address3=" + address3 + ", country="
				+ country + ", state=" + state + ", city=" + city + ", pincode=" + pincode + ", landmark=" + landmark
				+ "]";
	}

}
