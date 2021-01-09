package com.kozachenko.lesson.lesson9.exception;

public class LawException extends Exception{
    public LawException() {
    }

    public LawException(String message) {
        super(message);
    }

    public LawException(String message, Throwable cause) {
        super(message, cause);
    }
}
