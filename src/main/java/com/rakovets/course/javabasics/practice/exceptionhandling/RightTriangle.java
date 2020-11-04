package com.rakovets.course.javabasics.practice.exceptionhandling;

public class RightTriangle {
    public static void main(String[] args) {
        try {
            int firstСathetus = 1;
            int secondCathetus = 2;
            int hypotenuse = 3;
            getAreaOfRightTriangle(firstСathetus, secondCathetus, hypotenuse);
        } catch (RightTriangleException e) {
            e.getMessage();
        }
    }

    public static double getAreaOfRightTriangle(int firstСathetus, int secondCathetus, int hypotenuse) throws RightTriangleException {
        try {
            if ((firstСathetus * firstСathetus) + (secondCathetus * secondCathetus) != hypotenuse) {
                throw new IllegalArgumentException("\nNot right triangle");
            }
            return 0.5 * firstСathetus * secondCathetus;
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            throw new RightTriangleException(e.getMessage());
        }
    }
}
