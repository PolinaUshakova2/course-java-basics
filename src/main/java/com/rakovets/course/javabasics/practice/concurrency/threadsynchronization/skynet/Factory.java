package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;
import java.util.ArrayList;
import java.util.Random;
import static com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet.BodyParts.*;
import static com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet.Days.getNewDay;

public class Factory{
    private static int countOfCreatedBodyParts = 0;

    public static void getBodyPart(ArrayList<BodyParts> listOfBodyParts, int countOfDays, int countOfBodyParts) throws InterruptedException {
        if (countOfCreatedBodyParts == 10) {
            getNewDay(countOfDays);
        }
        int random = new Random().nextInt(3);
        BodyParts bodyParts = null;
        countOfCreatedBodyParts++;
        switch (random) {
            case 0:
                bodyParts = HEAD;
                break;
            case 1:
                bodyParts = TORSO;
                break;
            case 2:
                bodyParts = HAND;
                break;
            case 3:
                bodyParts = FEET;
                break;
            default:
                break;
        }
        listOfBodyParts.add(bodyParts);
    }

    public static void setCountOfCreatedBodyParts(int countOfCreatedBodyParts) {
        Factory.countOfCreatedBodyParts = countOfCreatedBodyParts;
    }

    public static int getCountOfCreatedBodyParts() {
        return countOfCreatedBodyParts;
    }
}
