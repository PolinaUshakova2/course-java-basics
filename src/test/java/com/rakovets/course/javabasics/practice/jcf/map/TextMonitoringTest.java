package com.rakovets.course.javabasics.practice.jcf.map;

import com.rakovets.course.javabasics.practice.jcf.TextMonitoring;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextMonitoringTest {

    @Test
    void researchTextTest() {
        TextMonitoring text = new TextMonitoring();
        HashMap<String, Integer> mapWords = text.researchText("aaaa DDD bb ddd aa vv ddd w kf ddd");
        assertEquals(3, mapWords.get("ddd"));
    }


    @Test
    void getCountUniqueWordsTest() {
        TextMonitoring text = new TextMonitoring();
        HashMap<String, Integer> mapWords = text.researchText("aaaa DDD bb ddd aa aa vv ddd w kf ddd");
        assertEquals(8, text.getCountUniqueWords(mapWords));
    }
}
