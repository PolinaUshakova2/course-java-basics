package com.rakovets.course.javabasics.practice.jcf.list;

import com.rakovets.course.javabasics.practice.jcf.Actor;
import com.rakovets.course.javabasics.practice.jcf.Studio;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StudioTest {
    @Test
    void studioTest() {
        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Lee", "Aaker", 20, 200));
        actors.add(new Actor("Jack", "Nicholson", 50, 468));
        actors.add(new Actor("Denzel", "Washington", 67, 858));
        actors.add(new Actor("Viola", "Davis", 56, 299));
        actors.add(new Actor("Julie", "Andrews", 60, 757));
        Studio studio = new Studio(actors);
        actors.sort(new Studio.ActorAgeComparator());
        assertEquals("67 60 56 50 20",studio.getAges());
        studio.fire(actors);
        assertEquals("757 468 299 200",studio.getFees());
    }
}
