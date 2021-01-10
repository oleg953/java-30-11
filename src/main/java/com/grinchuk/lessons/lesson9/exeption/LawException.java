package com.grinchuk.lessons.lesson9.exeption;

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
