package com.rakovets.course.javabasics.practice.jcf;
import java.util.ArrayList;
import java.util.Comparator;

public class Studio {
    private ArrayList<Actor> actors;

    public Studio(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public class ActorFeeComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            return (int)(o1.getFee() - o2.getFee());
        }
    }

    public class ActorFirstNameComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            return o1.getFirstName().compareTo(o2.getLastName());
        }
    }

    public class ActorAgeComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            return  (int)(o1.getAge() - o2.getAge());
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

}
