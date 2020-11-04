package com.rakovets.course.javabasics.practice.exceptionhandling;

public class MyRuntimeException extends RuntimeException {
    private int number;

    public MyRuntimeException(String message, int number) {
        super(message);
        this.number = number;
    }

    public double getNum() {
        return number;
    }
}
