package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround.Archer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArcherTest {
    private static Archer archer;

    @BeforeAll
    static void init() {
        archer = new Archer("Tom");
    }

    @Test
    void archerTest() {
        Assertions.assertEquals("Tom", archer.getName());
    }
}
