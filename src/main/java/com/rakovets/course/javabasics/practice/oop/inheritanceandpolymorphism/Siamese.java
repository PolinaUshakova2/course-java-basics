package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Siamese extends Cat{
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "MEEE";
    }

    @Override
    public String purr() {
        return "HHHHH";
    }
}
