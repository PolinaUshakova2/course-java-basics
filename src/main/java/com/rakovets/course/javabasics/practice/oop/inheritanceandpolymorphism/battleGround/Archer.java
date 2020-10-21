package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(5);
        System.out.println("Archer attacks the enemy");
    }
}
