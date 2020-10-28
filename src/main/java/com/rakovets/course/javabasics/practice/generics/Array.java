package com.rakovets.course.javabasics.practice.generics;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;


public class Array<T> {
     private Number[] array;
     private int count;

     public Array(int count) {
         this.count = count;
         array = new Number[count];
     }

     public void getKeyboardInput() {
         Scanner in = new Scanner(System.in);
         for (int i = 0; i < count; i++) {
             array[i] = in.nextInt();
         }
     }

     public void getRandomInput() {
         Scanner in = new Scanner(System.in);
         for (int i = 0; i < count; i++) {
             array[i] = java.lang.Math.random();
         }
     }

     public void printArray() {
         for (Object variable : array){
             System.out.print(variable + " ");
         }
     }

    public <T extends Comparable> T getMaxFromArray(T array[]) {
        T max = array[0];
        for (T type : array) {
            if (type.compareTo(max) > 0) {
                max = type;
            }
        }
        return max;
    }

    public <T extends Comparable> T getMinFromArray(T array[]) {
        T min = array[0];
        for (T type : array) {
            if (type.compareTo(min) < 0) {
                min = type;
            }
        }
        return min;
    }

    public <T extends Number> double getAverageFromArray(T array[]) {
        double average = 0;
        for (T value : array) {
            average += value.doubleValue()/ array.length;
        }
        BigDecimal bd = new BigDecimal(Double.toString(average));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public T[] getSortInAscendingOrder(T array[]) {
        Arrays.sort(array);
        return array;
    }

    public T[] getSortInDescendingOrder(T array[]) {
        Arrays.sort(array);
        for(int i = 0; i < getCount(); i++) {
            for (int j = getCount(); j < 0; j--) {
                array[i] = array[j];
            }
        }
        return array;
    }

    public int getBinarySearch(T array[], T element) {
        return Arrays.binarySearch(array, element);
    }

    public void changeVariable(T array[], int index, T value) {
         array[index] = value;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public int getCount() {
        return count;
    }

}
