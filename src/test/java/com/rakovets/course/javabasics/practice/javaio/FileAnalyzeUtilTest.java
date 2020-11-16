package com.rakovets.course.javabasics.practice.javaio;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FileAnalyzeUtilTest {
    @Test
    void getListOfFileTest() {
        String filePath = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "test2";
        List<String> expected = Arrays.asList("aa dd", "AA", "B", "12");
        assertEquals(expected, FileAnalyzeUtil.getListOfFile(filePath));
    }

    @Test
    void getListOfWordsStartWithVowelTest() {
        String filePath = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "test34";
        List<String> expected = Arrays.asList("amount", "emma");
        assertEquals(expected, FileAnalyzeUtil.getListOfWordsStartWithVowel(filePath));
    }

    @Test
    void getListOfWordsWithTheSameBeginningAndEndTest() {
        String filePath = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "test34";
        List<String> expected = Arrays.asList("amount", "take");
        assertEquals(expected, FileAnalyzeUtil.getListOfWordsWithTheSameBeginningAndEnd(filePath));
    }

    @Test
    void getLetterRepetitionRateTest() {
        String filePath = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "test6";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('w', 1);
        expected.put('r', 4);
        expected.put('g', 5);
        expected.put('d', 3);
        assertEquals(expected, FileAnalyzeUtil.getLetterRepetitionRate(filePath));
    }

    @Test
    void getWordRepetitionRateAndSortedByValueTest() {
        String filePath = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "test7";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("am", 1);
        expected.put("HI", 1);
        expected.put("by", 2);
        expected.put("hi", 3);
        expected.put("AM", 4);
        assertEquals(expected, FileAnalyzeUtil.getWordRepetitionRateAndSortedByValue(filePath));
    }

    @Test
    void getSortOfNumbersTest() {
        String filePath = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "test8";
        List<Integer> expected =  Arrays.asList(2, 2, 3, 5, 6, 12, 24, 34, 52);
        assertEquals(expected, FileAnalyzeUtil.getSortOfNumbers(filePath));
    }

    @Test
    void getAcademicPerformanceTest() {
        String filePath = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "test9";
        Map<String, Double> expected = new HashMap<>();
        expected.put("Appa", 5.5);
        expected.put("Ahha", 4.875);
        expected.put("Wap", 4.4);
        expected.put("Kap", 2.5);
        assertEquals(expected, FileAnalyzeUtil.getAcademicPerformance(filePath));
    }

}


