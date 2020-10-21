package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat.Siamese;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    private static Siamese siamese;

    @BeforeAll
    static void init() {
        siamese = new Siamese("Arny");
    }

    @Test
    void siameseTest() {
        Assertions.assertEquals("Arny", siamese.getName());
        Assertions.assertEquals("MEEE", siamese.mew());
        Assertions.assertEquals("HHHHH", siamese.purr());
    }
}
