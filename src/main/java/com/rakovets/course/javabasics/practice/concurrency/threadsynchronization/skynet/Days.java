package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

public class Days {
    private static int countOfDays;

    public static void getNewDay(int countOfDays){
        countOfDays++;
        Factory.setCountOfCreatedBodyParts(0);
    }

    public static int getCountOfDays() {
        return countOfDays;
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }
}
