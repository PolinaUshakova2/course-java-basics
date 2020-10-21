package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CatTest {
    private static Cat cat;

    @BeforeAll
    static void init() {
        cat = new Cat("Tom");
    }

    @Test
    void catTest() {
        Assertions.assertEquals("Tom", cat.getName());
        Assertions.assertEquals("MEW", cat.mew());
        Assertions.assertEquals("PUURRR", cat.purr());
    }
}
