package com.AndroidHttpsClientJava.model;


import com.AndroidHttpsClientJava.request.CreditCardResultRequest;
import com.AndroidHttpsClientJava.service.HttpsClient;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class ThreedsResult {

    @SerializedName("Message")
    private String message;
    @SerializedName("Status")
    private boolean status;
    @SerializedName("Data")
    private ThreedsResultData data;

    public static ThreedsResult create(Map<String, String> headers, CreditCardResultRequest request) {
        ThreedsResult response = HttpsClient.create().get(prepareCreditCardResultRequest(request),
                headers,
                request,
                ThreedsResult.class);
        if (response != null) {
            response.setMessage(response.getMessage());
            response.setStatus(response.getStatus());
            response.setData(response.getData());
        }
        return response;
    }

    private static String prepareCreditCardResultRequest(CreditCardResultRequest request) {
        StringBuilder sb = new StringBuilder();
        sb.append("");//add base api adress
        sb.append("api/CreditCardResult?").append("TransactionId=").append(request.getTransactionId());

        return sb.toString();
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

    public ThreedsResultData getData() {
        return data;
    }

    public void setData(ThreedsResultData data) {
        this.data = data;
    }

}
