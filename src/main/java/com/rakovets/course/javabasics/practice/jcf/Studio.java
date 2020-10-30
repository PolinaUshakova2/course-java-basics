package com.rakovets.course.javabasics.practice.jcf;

import java.util.ArrayList;
import java.util.Comparator;

public class Studio {
    private ArrayList<Actor> actors;

    public Studio(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public void fire(ArrayList actors) {
        actors.sort(new ActorFeeComparator());
        actors.remove(0);
    }

    public static class ActorFeeComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            return (int)(o2.getFee() - o1.getFee());
        }
    }

    public class ActorFirstNameComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            return o1.getFirstName().compareTo(o2.getLastName());
        }
    }

    public static class ActorAgeComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            return  (int)(o2.getAge() - o1.getAge());
        }
    }

    public class ActorAgeAndLastNameComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            if (o1.getLastName().compareTo(o2.getLastName()) != 0)
                return o1.getLastName().compareTo(o2.getLastName());
            else return o1.getAge() - (o2.getAge());
        }
    }

    public class ActorFeeAndLastNameComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            if (o1.getLastName().compareTo(o2.getLastName()) != 0)
                return o1.getLastName().compareTo(o2.getLastName());
            else return o1.getFee() - (o2.getFee());
        }
    }

    public String getAges() {
        String result = "";
        for (Actor actor : actors) {
            result += actor.getAge() + " ";
        }
        return result.trim();
    }

    public String getFees() {
        String result = "";
        for (Actor actor : actors) {
            result += actor.getFee() + " ";
        }
        return result.trim();
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }
}
