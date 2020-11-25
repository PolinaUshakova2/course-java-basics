package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.ArrayList;

public class getWinner {
    public static void getWinner (ArrayList<BodyParts> arrayListOfWord, ArrayList<BodyParts> arrayListOfWednesday) {
        int countOfRobotsOfWord = RobotAssembler.getRobots(arrayListOfWord);
        int countOfRobotsOfWednesday = RobotAssembler.getRobots(arrayListOfWednesday);
        if (countOfRobotsOfWednesday > countOfRobotsOfWord) {
            System.out.print("Winner is Wednesday");
        } else {
            System.out.print("Winner is Word");
        }
    }

}
