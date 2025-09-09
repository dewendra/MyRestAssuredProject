package com.api.service;

import java.util.HashMap;

import com.api.base.BaseService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ResetPasswordRequest;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {

	private static final String BASE_PATH = "/api/auth/";

	public Response login(LoginRequest payload) {
		return postRequest(payload, BASE_PATH + "login");
	}

	public Response forgotPassword(String emailAddress) {
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email", emailAddress);
		return postRequest(payload, BASE_PATH + "forgot-password");
	}

	public Response resetPassword(ResetPasswordRequest payload) {
		return postRequest(payload, BASE_PATH + "reset-password");
	}

	public Response signup(SignUpRequest payload) {
		return postRequest(payload, BASE_PATH + "signup");
	}

}
