package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.ArrayList;

public class World implements Runnable{
    private static ArrayList<BodyParts> listOfBodyPartsForWord;
    private Factory factory;

    public World(Factory factory) {
        this.factory = factory;
        listOfBodyPartsForWord = new ArrayList<>();
    }

    @Override
    public void run() {
        int countOdBodyParts = 0;
        while (Days.getCountOfDays() != 100) {
            while (countOdBodyParts != 5) {
                try {
                    Factory.getBodyPart(listOfBodyPartsForWord, 0, countOdBodyParts);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countOdBodyParts++;
            }
            countOdBodyParts = 0;
        }
        RobotAssembler.getRobots(listOfBodyPartsForWord);
    }

    public static ArrayList<BodyParts> getListOfBodyPartsForWord() {
        return listOfBodyPartsForWord;
    }

    public void setListOfBodyPartsForWord(ArrayList<BodyParts> listOfBodyPartsForWord) {
        this.listOfBodyPartsForWord = listOfBodyPartsForWord;
    }
}
