package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround;

public class Mag extends Hero {
    public Mag(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Mag attacks the enemy");
    }
}
