package com.kozachenko.lesson.lesson9.exception;

public class GangException extends Exception{

    public GangException() {
    }

    public GangException(String message) {
        super(message);
    }

    public GangException(String message, Throwable cause) {
        super(message, cause);
    }
}
