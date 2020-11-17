package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ParallelCalculator extends Thread {
    public static List<Integer> getMaxElementOfArray(List<Integer[]> arrays) {
        int maxElement = 0;
        List<Integer> listOfMaxElements = new ArrayList<>();
        try {
            for (int i = 0; i < arrays.size(); i++) {
                for (int j = 1; j < arrays.get(i).length; j++) {
                    maxElement = arrays.get(i)[0];
                    if (arrays.get(i)[j] > maxElement) {
                        maxElement = arrays.get(i)[j];
                    }
                }
                listOfMaxElements.add(maxElement);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print(arrays);
        return listOfMaxElements;
    }

    public static void getListOfRandomArrays(int countOfArrays) {
        List<Integer[]> randomList = new ArrayList<>();
        Integer[] randomArray = new Integer[(int) (Math.random() * 1000000)];
        for (int i = 1; i <= countOfArrays; i++) {
            for (int j = 0; j < randomArray.length; j++) {
                randomArray[j] = (int) (Math.random() * 300);
            }
            randomList.add(randomArray);
        }
    }

    public static void calculatorWithThreads(int countOfThreads, List<Integer[]> arrays) {
        int countOfArraysInAThread;
        if (arrays.size() % countOfThreads == 0) {
            countOfArraysInAThread = arrays.size() / countOfThreads;
        } else {
            countOfArraysInAThread = arrays.size() / countOfThreads + 1;
        }
        for (int i = 0; i < countOfThreads; i++) {
            int finalI = i;
            new Thread(() -> {
                for (int j = (finalI * countOfArraysInAThread); j < ((finalI + 1) * countOfArraysInAThread); j++) {
                    getMaxElementOfArray(arrays);
                }
            }).start();
        }
    }
}
