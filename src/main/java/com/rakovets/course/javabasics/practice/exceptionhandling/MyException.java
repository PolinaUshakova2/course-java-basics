package com.rakovets.course.javabasics.practice.exceptionhandling;

public class MyException {
    public static void main(String[] args) {
        try {
            double result = getRootOfNumber(-4);
            System.out.print(result);
        }
        catch (Exception e) {
            System.out.print(e.getStackTrace());
            System.out.print(e.getMessage());
        }
    }

    public static double getRootOfNumber(int num) throws Exception {
        if (num < 0) {
            throw new Exception("\nThe number is less than 1");
        }
          return Math.sqrt(num);
    }
}
