package com.rakovets.course.javabasics.practice.exceptionhandling;

public class SqrtException extends Exception{
    private double number;

    public SqrtException(String message, double num) {
        super(message);
        number = num;
    }

    public double getNum() {
        return number;
    }
}
