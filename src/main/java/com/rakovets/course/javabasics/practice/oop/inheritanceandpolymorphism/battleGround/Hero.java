package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround;

public abstract class  Hero {
    public String name;
    public int health;

    public Hero(String name) {
        this.name = name;
        this.health = 0;
    }

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void dieHero(Hero hero) {
        if (hero.health < 0) {
            System.out.printf("%s died", hero.name);
        }
        hero.name = "-";
        hero.health = 0;
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(5);
        System.out.println("Enemy attacks the hero");
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public abstract void  attackEnemy(Enemy enemy);

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }
}
