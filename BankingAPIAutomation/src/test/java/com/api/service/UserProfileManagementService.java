package com.api.service;

import com.api.base.BaseService;

import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService {

	private static final String BASE_PATH = "/api/users/";

	public Response getProfile(String token) {
		setAuthToken(token);
		return getRequest(BASE_PATH + "profile");
	}

	public Response updateProfile(Object payload, String token) {
		setAuthToken(token);
		return putRequest(payload, BASE_PATH + "profile");
	}

	public Response partialUpdateProfile(Object payload, String token) {
		setAuthToken(token);
		return putRequest(payload, BASE_PATH + "profile");
	}

	public void deleteUser(String token) {
		setAuthToken(token);
		deleteRequest(BASE_PATH + "profile");
	}

}
