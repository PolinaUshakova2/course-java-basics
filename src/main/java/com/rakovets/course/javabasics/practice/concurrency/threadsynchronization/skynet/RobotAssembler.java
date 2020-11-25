package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.ArrayList;

import static com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet.BodyParts.*;

public class RobotAssembler {
    public static int getRobots(ArrayList<BodyParts> bodyParts) {
        int countOfHead = 0;
        int countOfTorso = 0;
        int countOfHand = 0;
        int countOfFeet = 0;
        int countOfRobots = 0;
        for (BodyParts bodyPart : bodyParts) {
            switch (bodyPart) {
                case HEAD:
                    countOfHead++;
                    break;
                case TORSO:
                    countOfTorso++;
                    break;
                case HAND:
                    countOfHand++;
                    break;
                case FEET:
                    countOfFeet++;
                    break;
            }
            while (countOfHead >= 1 && countOfTorso >= 1 && countOfFeet >= 2 && countOfHand >= 2) {
                countOfHead--;
                countOfTorso--;
                countOfFeet -= 2;
                countOfHand -= 2;
                countOfRobots++;
            }
        }
        removeBodyPartsFromTheList(bodyParts, countOfRobots);
        return countOfRobots;
    }

    public static void removeBodyPartsFromTheList (ArrayList<BodyParts> bodyParts, int countOfRobots) {
        int countOfHeadAndTorso = countOfRobots;
        int countOfHandAndFeet = countOfRobots * 2;
        for (int i = 0; i < countOfHeadAndTorso; i++) {
            bodyParts.remove(HEAD);
            bodyParts.remove(TORSO);
        }
        for (int i = 0; i < countOfHandAndFeet; i++) {
            bodyParts.remove(HAND);
            bodyParts.remove(FEET);
        }
    }
}
