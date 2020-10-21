package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    private static Sphynx sphynx;

    @BeforeAll
    static void init() {
        sphynx = new Sphynx("Kay");
    }

    @Test
    void sphynxTest() {
        Assertions.assertEquals("Kay", sphynx.getName());
        Assertions.assertEquals("AWWA", sphynx.mew());
        Assertions.assertEquals("HOHOHO", sphynx.purr());
    }
}
