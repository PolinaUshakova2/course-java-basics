package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat;

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

    @Override
    public void mew(Person person) {
        person.changeHappiness(-6);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(2);
    }
}
