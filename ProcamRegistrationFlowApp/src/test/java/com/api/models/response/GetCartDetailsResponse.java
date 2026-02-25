package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetCartDetailsResponse {
	private boolean status;
	
	@JsonProperty("data")
    private CartData cartData;
    
	private String discountCode;
	
    public GetCartDetailsResponse() {
		
	}

	public GetCartDetailsResponse(boolean status, CartData cartdata, String discountCode) {
		super();
		this.status = status;
		this.cartData = cartdata;
		this.discountCode = discountCode;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public CartData getCartData() {
		return cartData;
	}

	public void setCartData(CartData cartdata) {
		this.cartData = cartdata;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	@Override
	public String toString() {
		return "GetCartDetailsResponse [status=" + status + ", cartdata=" + cartData + ", discountCode=" + discountCode
				+ "]";
	}

	
    
}
