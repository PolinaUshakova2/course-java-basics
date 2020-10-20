package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat.Person;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat.Siamese;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {

    @Test
    void siameseTest() {
        Siamese siamese = new Siamese("Arny");
        Assertions.assertEquals("Arny", siamese.getName());
        Assertions.assertEquals("MEEE", siamese.mew());
        Assertions.assertEquals("HHHHH", siamese.purr());
    }
}
