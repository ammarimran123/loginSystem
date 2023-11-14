package com.internalsystems.errorhandlers;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}