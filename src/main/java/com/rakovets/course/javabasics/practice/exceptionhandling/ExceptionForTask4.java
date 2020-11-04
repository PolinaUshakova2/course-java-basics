package com.rakovets.course.javabasics.practice.exceptionhandling;

public class ExceptionForTask4 {
    public static void main(String[] args) {
        try {
            int firstNumber = 4;
            int secondNumber = 0;
            divisionOfTwoNumbers(firstNumber, secondNumber);
        } catch (Exception e){
            e.printStackTrace();
            System.out.print(e.getMessage());
        }
    }

    public static double divisionOfTwoNumbers (int firstNumber, int secondNumber) throws MyRuntimeException {
        if(secondNumber == 0) {
            throw new MyRuntimeException("\nDivision by zero", secondNumber);
        } else {
            return firstNumber / secondNumber;
        }
    }
}
