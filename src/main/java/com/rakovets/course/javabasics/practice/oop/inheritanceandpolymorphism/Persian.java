package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "MYYY";
    }

    @Override
    public String purr() {
        return "PRPPR";
    }
}
