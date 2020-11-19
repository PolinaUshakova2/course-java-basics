package com.rakovets.course.javabasics.practice.jcf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class StringCollectionUtil {
    public static Collection<String> resetWordsByLength(Collection<String> strings, int sizeOfWord) {
        Collection<String> resultCollection = new LinkedList<>();
        for (String string : strings) {
            if (string.length() != sizeOfWord) {
                resultCollection.add(string);
            } else {
                resultCollection.add("*");
            }
        }
        return resultCollection;
    }

    public static Collection<String> removeWordsByLength(Collection<String> strings, int sizeOfWord) {
        Collection<String> resultCollection = new LinkedList<>();
        for (String string : strings) {
            if (string.length() != sizeOfWord) {
                resultCollection.add(string);
            }
        }
        return resultCollection;
    }

}
