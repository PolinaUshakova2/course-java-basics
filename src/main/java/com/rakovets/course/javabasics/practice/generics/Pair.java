package com.rakovets.course.javabasics.practice.generics;

public class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    protected K getFirst() {
        return first;
    }

    protected V getSecond() {
        return second;
    }

    protected void setFirst(K first) {
        this.first = first;
    }

    protected void setSecond(V second) {
        this.second = second;
    }
}
