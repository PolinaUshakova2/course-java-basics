package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Cat {
    private String name;

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

    public void setName() {
        this.name = name;
    }
}
