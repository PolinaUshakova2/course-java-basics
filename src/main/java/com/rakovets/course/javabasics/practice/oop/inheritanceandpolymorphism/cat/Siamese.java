package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat;

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

    @Override
    public void mew(Person person) {
        person.changeHappiness(-2);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(1);
    }
}
