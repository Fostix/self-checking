package com.selfcheck.selfcheckingComponent.controller.query;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Queries {
    public HttpClient client;
    public Queries() {
        this.client = HttpClient.newHttpClient();
    }

    public HttpResponse<String> send(HttpRequest httpRequest) {
        HttpResponse<String> response;
        try {
            response = this.client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response;
    }

    public HttpResponse<String> post(String site) {
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(
                        URI.create(site)).
                POST(HttpRequest.BodyPublishers.noBody()).build();
        return send(httpRequest);
    }

    public HttpResponse<String> post(String site, String requestBody) {
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(
                        URI.create(site)).
                POST(HttpRequest.BodyPublishers.ofString(requestBody)).build();
        return send(httpRequest);
    }

    public HttpResponse<String> get(String site) {
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(
                        URI.create(site)).build();
        return send(httpRequest);
    }

    public HttpResponse<String> delete(String site) {
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(
                URI.create(site)).DELETE().build();
        return send(httpRequest);
    }

    public HttpResponse<String> put(String site, String requestBody) {
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(
                URI.create(site)).PUT(HttpRequest.BodyPublishers.ofString(requestBody)).build();
        return send(httpRequest);
    }
}
