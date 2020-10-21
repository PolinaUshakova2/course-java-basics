package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround;

public class Mag extends Hero {
    public Mag(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(3);
        System.out.println("Mag attacks the enemy");
    }
}
