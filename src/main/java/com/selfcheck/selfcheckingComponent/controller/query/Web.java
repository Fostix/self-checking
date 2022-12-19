package com.selfcheck.selfcheckingComponent.controller.query;

import com.selfcheck.selfcheckingComponent.models.Request;

public class Web {
    private Request request;
    private long startTimer;
    private long finishTimer;

    public Web() {
        this.startTimer = System.currentTimeMillis();
        this.request = new Request();
    }

    public long resultTime() {
        finishTimer = System.currentTimeMillis();
        return finishTimer - startTimer;
    }

    public Request get(String site, String component) {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().get(site).body()));
        request.setComponent(component);
        request.setRequestTime(resultTime());
        return request;
    }

    public Request post(String site, String component) {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().post(site).body()));
        request.setComponent(component);
        request.setRequestTime(resultTime());
        return request;
    }

    public Request post(String site, String body, String component) {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().post(site, body).body()));
        request.setComponent(component);
        request.setRequestTime(resultTime());
        return request;
    }

    public Request delete(String site, String component) {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().delete(site).body()));
        request.setComponent(component);
        request.setRequestTime(resultTime());
        return request;
    }

    public Request put(String site, String body, String component) {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().put(site, body).body()));
        request.setComponent(component);
        request.setRequestTime(resultTime());
        return request;
    }
}
