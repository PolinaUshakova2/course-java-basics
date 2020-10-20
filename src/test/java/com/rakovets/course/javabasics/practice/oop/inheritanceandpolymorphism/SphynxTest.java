package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTest {

    @Test
    void sphynxTest() {
        Sphynx sphynx = new Sphynx("Kay");
        Assertions.assertEquals("Kay", sphynx.getName());
        Assertions.assertEquals("AWWA", sphynx.mew());
        Assertions.assertEquals("HOHOHO", sphynx.purr());
    }
}
