package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround;

public class Mag extends Hero {
    public Mag(String name, int health) {
        super(name);
        this.health = health;
    }

    public Mag(String name) {
        super(name);
        this.health = 0;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(3);
        System.out.println("Mag attacks the enemy");
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(5);
        System.out.println("Enemy attacks the mag");
    }
}
