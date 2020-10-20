package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround;

public class Hero {
    public String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attackEnemy() {
        System.out.println("Hero attacks the enemy");
    }

    public String getName() {
        return this.name;
    }
}
