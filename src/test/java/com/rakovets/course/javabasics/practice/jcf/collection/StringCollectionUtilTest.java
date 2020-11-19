package com.rakovets.course.javabasics.practice.jcf.collection;

import com.rakovets.course.javabasics.practice.jcf.StringCollectionUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCollectionUtilTest {
    private static Collection<String> arrayList1;
    private static Collection<String> arrayList2;
    private static Collection<String> arrayList3;
    @BeforeEach
    void init() {
        String[] strings = new String []{"hi", "hello", "this", "ggg", "dsffs", "fss", "asd", "dwefggvg"};
        String[] strings1 = new String []{"hi", "hello", "this", "*", "dsffs", "*", "*", "dwefggvg"};
        String[] strings2 = new String []{"hi", "hello", "this", "dsffs", "dwefggvg"};
        arrayList1 = new ArrayList<>(Arrays.asList(strings));
        arrayList2 = new ArrayList<>(Arrays.asList(strings1));
        arrayList3 = new ArrayList<>(Arrays.asList(strings2));
    }

    @Test
    void resetWordsByLengthTest() {
        assertEquals(arrayList2, StringCollectionUtil.resetWordsByLength(arrayList1, 3));
    }

    @Test
    void removeWordsByLengthTest() {
        assertEquals(arrayList3, StringCollectionUtil.removeWordsByLength(arrayList1, 3));
    }
}