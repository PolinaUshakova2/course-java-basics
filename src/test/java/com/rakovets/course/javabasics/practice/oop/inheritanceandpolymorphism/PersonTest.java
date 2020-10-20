package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void personTest() {
        Person person = new Person(40);
        Assertions.assertEquals(40, person.getHappiness());
        Assertions.assertEquals(37,person.changeHappiness(3));
    }
}
