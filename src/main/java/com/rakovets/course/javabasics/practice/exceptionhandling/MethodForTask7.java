package com.rakovets.course.javabasics.practice.exceptionhandling;

import java.util.Random;

public class MethodForTask7 {
    public static int Devision() throws ArithmeticException {
        Random random = new Random();
        int num = 0 + random.nextInt(2 - 0);
        System.out.print(num / num);
        return  num / num;
    }
}
