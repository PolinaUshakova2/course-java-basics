package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;


public class SkyNetDemo {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Wednesday wednesday = new Wednesday(factory);
        World world = new World(factory);
        Thread worldThread = new Thread(world);
        Thread wednesdayThread = new Thread(wednesday);
        worldThread.start();
        wednesdayThread.start();
    }
}
