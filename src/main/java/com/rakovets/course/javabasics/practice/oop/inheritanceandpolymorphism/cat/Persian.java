package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat;

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

    @Override
    public void mew(Person person) {
        person.changeHappiness(-4);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(5);
    }
}
