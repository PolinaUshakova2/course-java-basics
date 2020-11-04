package com.rakovets.course.javabasics.practice.exceptionhandling;

public class MyException {
    public static void main(String[] args) {
        try {
            double result = getRootOfNumber(-4);
            System.out.print(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double getRootOfNumber(int num) throws SqrtException {
        if (num < 0) {
            throw new SqrtException("\nThe number is less than 1", num);
        }
          return Math.sqrt(num);
    }
}
