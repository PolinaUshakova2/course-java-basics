package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {

    @Test
    void catTest() {
        Cat cat = new Cat("Tom");
        Assertions.assertEquals("Tom", cat.getName());
        Assertions.assertEquals("MEW", cat.mew());
        Assertions.assertEquals("PUURRR", cat.purr());
    }

}
