package com.rakovets.course.javabasics.practice.concurrency;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MasterWorker implements Runnable{
    @Override
    public void run() {
        try {
            boolean isRun = true;
            Scanner scanner = new Scanner(System.in);
            int timeToSleepInSeconds;
            while (isRun) {
                timeToSleepInSeconds = scanner.nextInt();
                if (timeToSleepInSeconds == -1) {
                    isRun = false;
                }
                try {
                    Thread.sleep(timeToSleepInSeconds * 1000);
                    System.out.println("I slept " + timeToSleepInSeconds + " seconds");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Next:");
            }
            System.out.println("...");
            Thread.sleep(1 * 1000);
        } catch (InputMismatchException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
