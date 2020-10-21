package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround.Enemy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EnemyTest {
    private static Enemy enemy;

    @BeforeAll
    static void init() {
        enemy = new Enemy(30);
    }

    @Test
    void enemyTest() {
        Assertions.assertEquals(30, enemy.getHealth());
        Assertions.assertEquals(true, enemy.isAlive(enemy));
    }
}
