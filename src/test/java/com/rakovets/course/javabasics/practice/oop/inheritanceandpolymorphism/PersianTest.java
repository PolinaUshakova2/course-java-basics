package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat.Persian;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PersianTest {
    private static Persian persian;

    @BeforeAll
    static void init() {
        persian = new Persian("Bob");
    }

    @Test
    void persianTest() {
        Assertions.assertEquals("Bob", persian.getName());
        Assertions.assertEquals("MYYY", persian.mew());
        Assertions.assertEquals("PRPPR", persian.purr());
    }
}
