package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import java.util.Random;

public class ConsumerThread implements Runnable{
    public Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(new Random().nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.consume();
        }
    }
}
