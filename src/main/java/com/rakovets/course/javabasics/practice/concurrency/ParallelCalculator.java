package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ParallelCalculator {
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


}
