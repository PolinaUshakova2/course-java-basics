package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround;

public class Enemy implements Mort {
    public int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public boolean isAlive(Enemy enemy) {
        if (enemy.health > 0) {
            return true;
        }
        return false;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
