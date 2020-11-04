package com.rakovets.course.javabasics.practice.exceptionhandling;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] array = new int[4];
        try {
            array[5] = 4;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("ArrayIndexOutOfBoundsException");
        }
    }
}
