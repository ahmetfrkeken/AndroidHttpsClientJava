package com.AndroidHttpsClientJava.model;

import com.google.gson.annotations.SerializedName;

public class ThreedsResultData {

    @SerializedName("Id")
    private int id;
    @SerializedName("CreatedDate")
    private String createdDate;
    @SerializedName("MemberId")
    private int memberId;
    @SerializedName("TransactionId")
    private String transactionId;
    @SerializedName("Success")
    private boolean success;
    @SerializedName("ErrorCode")
    private String errorCode;
    @SerializedName("ErrorMessage")
    private String ErrorMessage;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }
}
