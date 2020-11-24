package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

public class ProducerThread implements Runnable{
    private Store store;

    public ProducerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            store.produce();
        }
    }
}
