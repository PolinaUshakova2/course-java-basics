package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(1, 30,2);
        Time timeInSecond = new Time(4000);
        System.out.printf("(1 HOUR 30 MINUTES 2 SECONDS)\nTime In Seconds: %d\n", time.getTotalSeconds());
        System.out.printf("Hours: %d, Minutes: %d, Seconds: %d",
                           time.getHours(),
                           time.getMinutes(),
                           time.getSeconds());
    }
}
