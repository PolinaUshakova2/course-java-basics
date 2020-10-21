package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround;

public class Killer extends Enemy{
    public boolean isDoubleTheDamage;

    public Killer(int health) {
        super(health);
        this.isDoubleTheDamage = false;
    }

    public void getDoubleTheDamage(Hero hero, int damege) {
        hero.takeDamage(damege * 2);
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = 5;
        int randomNumber = (int) Math.random();
        if (randomNumber % 2 == 0) {
            getDoubleTheDamage(hero, damage);
            System.out.println("Enemy attacks the hero twice");
        } else {
            hero.takeDamage(damage);
            System.out.println("Enemy attacks the hero");
        }
    }

    public boolean getIsDoubleTheDamage() {
        return this.isDoubleTheDamage;
    }
}
