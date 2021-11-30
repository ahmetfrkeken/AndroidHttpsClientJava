package com.AndroidHttpsClientJava.model;

import com.AndroidHttpsClientJava.request.CreateNewSiteRequest;
import com.AndroidHttpsClientJava.service.HttpsClient;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class CreateNewSite {
    @SerializedName("Message")
    private String message;
    @SerializedName("Status")
    private boolean status;
    @SerializedName("Data")
    private CreateNewSiteData data;

    public static CreateNewSite create(CreateNewSiteRequest request, Map<String, String> headers) {
        CreateNewSite response = HttpsClient.create().post(
                "",//add api url
                headers,
                request,
                CreateNewSite.class);
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

    public CreateNewSiteData getData() {
        return data;
    }

    public void setData(CreateNewSiteData data) {
        this.data = data;
    }
}