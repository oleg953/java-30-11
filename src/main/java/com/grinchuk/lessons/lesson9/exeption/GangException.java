package com.grinchuk.lessons.lesson9.exeption;

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
