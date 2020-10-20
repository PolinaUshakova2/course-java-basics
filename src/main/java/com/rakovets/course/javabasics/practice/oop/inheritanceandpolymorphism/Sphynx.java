package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Sphynx extends Cat{
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "AWWA";
    }

    @Override
    public String purr() {
        return "HOHOHO";
    }
}
