package com.AndroidHttpsClientJava.request;


public class Request {
    private String transactionId;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Request{" +
                "transactionId='" + transactionId + '\'' +
                '}';
    }
}
