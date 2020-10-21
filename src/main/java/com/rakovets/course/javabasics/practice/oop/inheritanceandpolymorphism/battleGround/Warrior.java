package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(7);
        System.out.println("Warrior attacks the enemy");
    }
}
