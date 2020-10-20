package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround;

public class Enemy {
    public int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(5);
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
