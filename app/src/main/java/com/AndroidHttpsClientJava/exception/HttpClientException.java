package com.AndroidHttpsClientJava.exception;

public class HttpClientException extends RuntimeException {

    public HttpClientException(String message, Throwable cause) {
        super(message, cause);
        System.out.println(message);
    }
}
