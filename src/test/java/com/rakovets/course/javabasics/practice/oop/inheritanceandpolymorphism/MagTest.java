package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleGround.Mag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MagTest {
    private static Mag mag;

    @BeforeAll
    static void init() {
        mag = new Mag("Akki");
    }

    @Test
    void magTest() {
        Assertions.assertEquals("Akki", mag.getName());
    }
}
