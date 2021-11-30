package com.AndroidHttpsClientJava.service;

import static com.AndroidHttpsClientJava.enums.HttpMethod.GET;
import static com.AndroidHttpsClientJava.enums.HttpMethod.POST;

import com.AndroidHttpsClientJava.enums.HttpMethod;
import com.AndroidHttpsClientJava.exception.HttpClientException;
import com.google.gson.Gson;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;



public class HttpsClient {

    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final String APPLICATION_JSON = "application/json";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String ACCEPT = "Accept";
    private static final int TIMEOUT = 140000;
    private static final SSLSocketFactory socketFactory = SSLSocketFactory.getInstance();

    private HttpsClient() {
    }

    public static HttpsClient create() {
        return new HttpsClient();
    }

    public <T> T post(String url, Map<String, String> headers, Object request, Class<T> responseType) {
        return exchange(url, POST, headers, request, responseType);
    }

    public <T> T get(String url, Map<String, String> headers, Object request, Class<T> responseType) {
        return exchange(url, GET, headers, null, responseType);
    }

    private <T> T exchange(String url, HttpMethod httpMethod, Map<String, String> headers, Object request, Class<T> responseType) {
        Gson gson = new Gson();
        String body = gson.toJson(request);
        try {
            InputStream content = request == null ? null : new ByteArrayInputStream(body.getBytes(DEFAULT_CHARSET));
            String response = send(url, httpMethod, content, headers);
            return gson.fromJson(response, responseType);
        } catch (UnsupportedEncodingException e) {
            throw new HttpClientException(e.getMessage(), e);
        }
    }

    private String send(String url, HttpMethod httpMethod, InputStream content, Map<String, String> headers) {
        URLConnection raw;
        HttpsURLConnection conn = null;
        try {
            raw = new URL(url).openConnection();
            conn = (HttpsURLConnection) raw;

            conn.setSSLSocketFactory(socketFactory);
            conn.setRequestMethod(httpMethod.name());

            conn.setConnectTimeout(TIMEOUT);
            conn.setReadTimeout(TIMEOUT);
            conn.setUseCaches(false);
            conn.setInstanceFollowRedirects(false);

            prepareHeaders(headers, conn);
            if (content != null) {
                prepareRequestBody(httpMethod, content, conn);
            }
            return new String(body(conn), StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new HttpClientException(e.getMessage(), e);
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }


    private void prepareHeaders(Map<String, String> headers, HttpURLConnection conn) {
        for (Map.Entry<String, String> header : headers.entrySet()) {
            conn.addRequestProperty(header.getKey(), header.getValue());
        }
    }

    private void prepareRequestBody(HttpMethod httpMethod, InputStream content, HttpURLConnection conn) throws IOException {
        if (HttpMethod.isValidRequestFor(httpMethod)) {
            conn.setDoOutput(true);
            final OutputStream output = conn.getOutputStream();

            try {
                prepareOutputStream(content, output);
            } finally {
                output.close();
                content.close();
            }
        }
    }

    private void prepareOutputStream(InputStream content, OutputStream output) throws IOException {
        final byte[] buffer = new byte[8192];
        for (int bytes = content.read(buffer); bytes != -1; bytes = content.read(buffer)) {
            output.write(buffer, 0, bytes);
        }

    }

    private byte[] body(HttpURLConnection conn) throws IOException {
        final InputStream input;
        if (conn.getResponseCode() >= HttpURLConnection.HTTP_BAD_REQUEST) {
            input = conn.getErrorStream();
        } else {
            input = conn.getInputStream();
        }
        final byte[] body;
        if (input == null) {
            body = new byte[0];
        } else {
            try {
                final byte[] buffer = new byte[8192];
                final ByteArrayOutputStream output = new ByteArrayOutputStream();
                for (int bytes = input.read(buffer); bytes != -1;
                     bytes = input.read(buffer)) {
                    output.write(buffer, 0, bytes);
                }
                body = output.toByteArray();
            } finally {
                input.close();
            }
        }
        return body;
    }
}

