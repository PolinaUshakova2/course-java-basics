package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround;

public class Zombie extends Enemy {
    public int numberOfTimesToResurrect;

    public Zombie(int health) {
        super(health);
        this.numberOfTimesToResurrect = 5;
    }

    @Override
    public boolean isAlive(Enemy enemy) {
        if (health < 0) {
            numberOfTimesToResurrect -= 1;
            health = (int) Math.random();
            if (numberOfTimesToResurrect < 0) {
                System.out.printf("Zombie dead");
                health = 0;
                numberOfTimesToResurrect = 0;
            }
            return false;
        }
    return true;
    }

    public int getNumberOfTimesToResurrect() {
        return this.numberOfTimesToResurrect;
    }
}
