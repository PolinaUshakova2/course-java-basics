package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat.Persian;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianTest {

    @Test
    void persianTest() {
        Persian persian = new Persian("Bob");
        Assertions.assertEquals("Bob", persian.getName());
        Assertions.assertEquals("MYYY", persian.mew());
        Assertions.assertEquals("PRPPR", persian.purr());
    }
}
