package com.ch.web.exception;

public class UnsupportedMediaTypeException extends BadRequestException{
    public UnsupportedMediaTypeException(String message) {
        super(message);
    }

    public UnsupportedMediaTypeException(String message, Throwable cause) {
        super(message, cause);
    }
}
