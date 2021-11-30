package com.AndroidHttpsClientJava.enums;


public enum HttpMethod {
    GET,
    POST,
    DELETE,
    PUT;

    public static boolean isValidRequestFor(HttpMethod httpMethod) {
        return POST.equals(httpMethod) || GET.equals(httpMethod);
    }
}
