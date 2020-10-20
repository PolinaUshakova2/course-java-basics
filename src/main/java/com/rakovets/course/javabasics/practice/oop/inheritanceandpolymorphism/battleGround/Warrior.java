package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Warrior attacks the enemy");
    }
}
