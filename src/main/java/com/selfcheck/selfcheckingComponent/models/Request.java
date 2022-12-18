package com.selfcheck.selfcheckingComponent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;
import java.util.Calendar;

@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Timestamp timestamp;
    private String component;
    private Integer errorCode;

    public Request() {
        Calendar calendar = Calendar.getInstance();
        this.errorCode = errorCode;
        this.timestamp = new Timestamp(calendar.getTimeInMillis());
    }

    public Integer getId() {
        return id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
}
