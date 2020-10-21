package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround.Hero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HeroTest {
    private static Hero hero;

    @BeforeAll
    static void init() {
        hero = new Hero("Kate", 40);
    }

    @Test
    void heroTest() {
        Assertions.assertEquals("Kate", hero.getName());
        Assertions.assertEquals(40, hero.getHealth());
    }
}
