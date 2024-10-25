package com.cake.application.exception;

public class IllegalOrderStateException extends IllegalArgumentException {

    public IllegalOrderStateException(String message) {
        super(message);
    }
}
