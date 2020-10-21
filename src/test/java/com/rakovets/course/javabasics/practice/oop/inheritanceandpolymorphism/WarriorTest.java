package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround.Warrior;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class WarriorTest {
    private static Warrior warrior;

    @BeforeAll
    static void init() {
        warrior = new Warrior("Bob");
    }

    @Test
    void warriorTest() {
        Assertions.assertEquals("Bob", warrior.getName());
    }
}
