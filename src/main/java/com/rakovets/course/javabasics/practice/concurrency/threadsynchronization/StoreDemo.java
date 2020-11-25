package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.store.ConsumerThread;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.store.ProducerThread;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.store.Store;

public class StoreDemo {
    public static void main(String[] args) {
        Store store = new Store();
        ProducerThread producer = new ProducerThread(store);
        ConsumerThread consumer = new ConsumerThread(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
