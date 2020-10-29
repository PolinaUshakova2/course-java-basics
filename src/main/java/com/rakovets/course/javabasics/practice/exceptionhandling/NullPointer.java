package com.rakovets.course.javabasics.practice.exceptionhandling;

public class NullPointer {
    public static void main(String[] args) {
        String string = null;
        try{
            string.length();
        }
        catch (NullPointerException e) {
            System.out.print("NullPointerException");
        }
    }
}
