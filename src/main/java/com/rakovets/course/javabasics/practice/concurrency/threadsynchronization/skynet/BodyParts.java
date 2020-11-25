package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

public enum BodyParts {
    HEAD(0),
    TORSO(1),
    HAND(2),
    FEET(3);

    private int code;

    BodyParts(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
