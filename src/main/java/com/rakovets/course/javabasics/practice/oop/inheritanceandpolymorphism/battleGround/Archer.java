package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name);
        this.health = health;
    }

    public Archer(String name) {
        super(name);
        this.health = 0;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(5);
        System.out.println("Archer attacks the enemy");
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(5);
        System.out.println("Enemy attacks the archer");
    }
}
