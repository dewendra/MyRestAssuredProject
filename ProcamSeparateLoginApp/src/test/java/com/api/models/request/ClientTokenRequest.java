package com.api.models.request;

public class ClientTokenRequest {
	private String clientId;

	public ClientTokenRequest(String clientId) {
		super();
		this.clientId = clientId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	@Override
	public String toString() {
		return "ClientTokenRequest [clientId=" + clientId + "]";
	}

}
