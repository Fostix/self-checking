package com.selfcheck.selfcheckingComponent.exception;

public class WrongSetRequestTimeException extends RuntimeException{
    public WrongSetRequestTimeException() {
        super("Request Time cannot be negative number");
    }
}
