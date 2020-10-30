package com.rakovets.course.javabasics.practice.jcf;

import java.util.ArrayList;

public class StringCollectionUtil {
    public static ArrayList<String> resetWordsByLength(ArrayList<String> strings, int sizeOfWord) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == sizeOfWord) {
                strings.set(i, "*");
            }
        }
        return strings;
    }

    public static ArrayList<String> removeWordsByLength(ArrayList<String> strings, int sizeOfWord) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == sizeOfWord) {
                strings.remove(i);
            }
        }
        return strings;
    }
}
