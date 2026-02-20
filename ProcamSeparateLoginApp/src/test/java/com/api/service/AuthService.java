package com.api.service;

import java.util.HashMap;
import java.util.Map;

import com.api.base.BaseSerivce;
import com.api.models.request.ClientTokenRequest;
import com.api.models.request.EventPropertiesRequest;
import com.api.models.request.EventTicketDetailsRequest;
import com.api.models.request.GetCartDetailsRequest;
import com.api.models.request.GetPersonalDetailsRequest;
import com.api.models.request.LoginRequest;
import com.api.models.request.SetPersonalDetailsRequest;
import com.api.models.request.UserOtpRequest;

import io.restassured.response.Response;

public class AuthService extends BaseSerivce {

	private static final String BASE_PATH = "/ticketing";/// ticketing/otp/login

	public void setBearerToken(String token) {
		setAuthToken(token);
	}

	public Response clientToken(ClientTokenRequest payload) {
		String endPoint = BASE_PATH + "/client/token";
		System.out.println("Full API URL: https://apitest.procam.in" + endPoint);
		Map<String, String> formParams = new HashMap<String, String>();
		formParams.put("clientId", payload.getClientId());
		return postFormRequest(endPoint, formParams);
	}

	public Response UserOtp(UserOtpRequest payload) {
		String endPoint = BASE_PATH + "/onboard/otp";
		System.out.println("Full API URL: https://apitest.procam.in" + endPoint);
		return postRequest(payload, endPoint);
	}

	public Response login(LoginRequest payload) {
		String endPoint = BASE_PATH + "/otp/login";
		System.out.println("Full API URL: https://apitest.procam.in" + endPoint);
		Map<String, String> formParams = new HashMap<String, String>();
		formParams.put("otp", payload.getOtp());
		formParams.put("verifier", payload.getCode());
		return postFormRequest(endPoint, formParams);
	}

	public Response getEventProperties(EventPropertiesRequest payload) {
		String endPoint = BASE_PATH + "/registration/event/properties";
		System.out.println("Full API URL: https://apitest.procam.in" + endPoint);
		Map<String, String> formParams = new HashMap<>();
		formParams.put("eventId", payload.getEventId());
		return getFormRequest(endPoint, formParams);

	}

	public Response getPersonalDetails(GetPersonalDetailsRequest payload) {
		String endPoint = BASE_PATH + "/registration/primary/details";
		System.out.println("Full API URL: https://apitest.procam.in" + endPoint);
		Map<String, Object> queryParams = new HashMap<>();
		queryParams.put("eventId", payload.getEventId());
		queryParams.put("discountCode", payload.getDiscountCode());
		/*
		 * if (payload.getDiscountCode() != null) { queryParams.put("discountCode",
		 * payload.getDiscountCode()); }
		 */
		return getQueryRequest(endPoint, queryParams);
	}

	public Response setPersonalDetails(SetPersonalDetailsRequest payload) {
		String endPoint = BASE_PATH + "/registration/primary/details/save";
		System.out.println("Full API URL: https://apitest.procam.in" + endPoint);
		return postRequest(payload, endPoint);
	}

	public Response getCartDetails(GetCartDetailsRequest payload) {
		String endPoint = BASE_PATH + "/registration/v2/cart";
		System.out.println("Full API URL: https://apitest.procam.in" + endPoint);
		Map<String, String> formParams = new HashMap<>();
		formParams.put("eventId", payload.getEventId());
		return getFormRequest(endPoint, formParams);
	}

	public Response getEventTicketDetails(EventTicketDetailsRequest payload) {
		String endPoint = BASE_PATH + "/registration/tickets";
		System.out.println("Full API URL: https://apitest.procam.in" + endPoint);
		return postRequest(payload, endPoint);
	}
}
