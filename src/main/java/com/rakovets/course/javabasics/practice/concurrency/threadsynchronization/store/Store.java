package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.store;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    private LinkedList<Integer> listOfInteger = new LinkedList<>();

    public synchronized void produce() {
        if (listOfInteger.size() == 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        listOfInteger.add(new Random().nextInt(50));
        System.out.print("Add number\n");
        notify();
    }

    public synchronized void consume() {
        if (listOfInteger.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(listOfInteger.getFirst());
        listOfInteger.removeFirst();
        System.out.print("Remove number\n");
        notify();
    }
}
