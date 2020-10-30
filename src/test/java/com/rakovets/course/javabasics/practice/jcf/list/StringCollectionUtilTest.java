package com.rakovets.course.javabasics.practice.jcf.list;
import com.rakovets.course.javabasics.practice.jcf.StringCollectionUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringCollectionUtilTest {
    @Test
    void stringCollectionUtilTest() {
        ArrayList<String> strings = new ArrayList<>();
        String[] firstResultArray = new String[]{"hi", "hello", "*", "surname", "*"};
        String[] secondResultArray = new String[]{"hi", "hello", "*", "surname", "*", "hello"};
        strings.add("hi");
        strings.add("hello");
        strings.add("name");
        strings.add("surname");
        strings.add("cute");
        assertArrayEquals(firstResultArray, StringCollectionUtil.resetWordsByLength(strings, 4).toArray());
        strings.add("hello");
        strings.add("name");
        assertArrayEquals(secondResultArray, StringCollectionUtil.removeWordsByLength(strings, 4).toArray());;
    }
}
