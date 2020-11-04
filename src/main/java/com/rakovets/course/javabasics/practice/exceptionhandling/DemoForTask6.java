package com.rakovets.course.javabasics.practice.exceptionhandling;

import java.util.Random;

public class DemoForTask6 {
    public static void main(String[] args) {
        try {
            getRandomException();
        } catch (IndexOutOfBoundsException | ArrayStoreException e) {
            System.out.print("Exception in array");
        } catch (ArithmeticException e) {
            System.out.print("Arithmetic exception");
        }
    }

    public static void getRandomException() throws IndexOutOfBoundsException, ArithmeticException, ArrayStoreException {
        Random random = new Random();
        int num = 0 + random.nextInt(4 - 0);
        switch (num) {
            case 0:
                throw new IndexOutOfBoundsException();
            case 1:
                throw new ArithmeticException();
            case 3:
                throw  new ArrayStoreException();
        }
    }
}
