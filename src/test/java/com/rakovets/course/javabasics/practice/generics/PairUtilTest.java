package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairUtilTest {
    @Test
    void swapTest() {
        PairUtil<String, Integer> stringIntegerPairUtil = new PairUtil<>();
        Pair<String, Integer> origin = new Pair<>("Hi", 12);
        Pair<Integer, String> swaped = stringIntegerPairUtil.swap(origin);
        Assertions.assertEquals(origin.getFirst(), swaped.getSecond());
        Assertions.assertEquals(origin.getSecond(), swaped.getFirst());
    }
}
