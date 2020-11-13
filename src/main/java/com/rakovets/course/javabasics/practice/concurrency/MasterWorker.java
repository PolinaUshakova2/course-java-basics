package com.rakovets.course.javabasics.practice.concurrency;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MasterWorker implements Runnable{
    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(System.in);
            int timeToSleepInSedonds;
            while (true) {
                timeToSleepInSedonds = scanner.nextInt();
                if (timeToSleepInSedonds == -1) {
                    return;
                }
                try {
                    Thread.sleep(timeToSleepInSedonds * 1000);
                    System.out.println("I slept " + timeToSleepInSedonds + " seconds");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
