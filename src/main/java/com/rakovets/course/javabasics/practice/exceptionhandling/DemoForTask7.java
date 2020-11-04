package com.rakovets.course.javabasics.practice.exceptionhandling;

public class DemoForTask7 {
    public static void main(String[] args) {
        try {
            MethodForTask7.Devision();
        }
        catch (ArithmeticException e) {
            System.out.print("\nWrong devision");
        }
        finally {
            System.out.print("\nFinally");
        }
    }
}
