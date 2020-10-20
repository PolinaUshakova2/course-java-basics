package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "MEW";
    }

    public String purr() {
        return "PUURRR";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void mew(Person person) {
        person.changeHappiness(-2);
    }

    public void purr(Person person) {
        person.changeHappiness(3);
    }
}
