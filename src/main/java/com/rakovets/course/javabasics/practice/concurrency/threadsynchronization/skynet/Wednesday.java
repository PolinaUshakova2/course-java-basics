package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.ArrayList;

public class Wednesday implements Runnable {
    private static ArrayList<BodyParts> listOfBodyPartsForWednesday;
    private Factory factory;

    public Wednesday(Factory factory) {
        this.factory = factory;
        listOfBodyPartsForWednesday = new ArrayList<>();
    }

    @Override
    public void run() {
        int countOfBodyParts = 0;
        while (Days.getCountOfDays() != 100) {
            while (countOfBodyParts != 5) {
                try {
                    Factory.getBodyPart(listOfBodyPartsForWednesday, 0, countOfBodyParts);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countOfBodyParts++;
            }

            countOfBodyParts = 0;
        }
        RobotAssembler.getRobots(listOfBodyPartsForWednesday);
    }

    public static ArrayList<BodyParts> getListOfBodyPartsForWednesday() {
        return listOfBodyPartsForWednesday;
    }

    public void setListOfBodyPartsForWednesday(ArrayList<BodyParts> listOfBodyPartsForWednesday) {
        this.listOfBodyPartsForWednesday = listOfBodyPartsForWednesday;
    }
}
