package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    private LinkedList<Integer> list = new LinkedList<>();

    public synchronized void produce() {
        if (list.size() == 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(new Random().nextInt(50));
        System.out.print("Add number\n");
        notify();
    }

    public synchronized void consume() {
        if (list.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(list.getFirst());
        list.removeFirst();
        System.out.print("Remove number\n");
        notify();

    }
}
