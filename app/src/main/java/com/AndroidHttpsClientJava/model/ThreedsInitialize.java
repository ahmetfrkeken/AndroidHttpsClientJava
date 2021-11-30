package com.AndroidHttpsClientJava.model;

import com.AndroidHttpsClientJava.request.DebtPaymentRequest;
import com.AndroidHttpsClientJava.service.HttpsClient;
import com.google.gson.annotations.SerializedName;

import java.util.Map;


public class ThreedsInitialize {

	@SerializedName("Message")
	private String message;
	@SerializedName("Status")
	private boolean status;
	@SerializedName("Data")
	private String data;

	public static ThreedsInitialize create(DebtPaymentRequest request, Map<String, String> headers) {
		ThreedsInitialize response = HttpsClient.create().post(
				"",//add api url
				headers,
				request,
				ThreedsInitialize.class);
		if (response != null) {
			response.setMessage(response.getMessage());
			response.setStatus(response.getStatus());
			response.setData(response.getData());
		}
		return response;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
