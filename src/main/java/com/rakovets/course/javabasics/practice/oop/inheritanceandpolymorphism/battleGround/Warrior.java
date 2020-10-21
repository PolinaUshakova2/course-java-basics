package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround;

public class Warrior extends Hero{
    public Warrior(String name, int health) {
        super(name);
        this.health = health;
    }

    public Warrior(String name) {
        super(name);
        this.health = 0;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(7);
        System.out.println("Warrior attacks the enemy");
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(5);
        System.out.println("Enemy attacks the warrior");
    }
}
