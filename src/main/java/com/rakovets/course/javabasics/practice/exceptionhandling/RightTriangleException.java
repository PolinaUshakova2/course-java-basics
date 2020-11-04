package com.rakovets.course.javabasics.practice.exceptionhandling;

public class RightTriangleException extends Exception{
    private String message;

    public RightTriangleException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
