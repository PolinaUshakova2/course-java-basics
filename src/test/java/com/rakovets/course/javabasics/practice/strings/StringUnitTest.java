package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringUnitTest {
    private static StringUnit stringUnit;

    @BeforeAll
    static void init() {
        stringUnit = new StringUnit();
    }

    @Test
    void uniteStringTest() {
        Assertions.assertEquals("goodday", stringUnit.getUniteString("good", "day"));
        Assertions.assertEquals("g231ay", stringUnit.getUniteString("g23", "1ay"));
        Assertions.assertEquals("mo  ay", stringUnit.getUniteString("mo ", " ay"));
        Assertions.assertEquals("mo ay", stringUnit.getUniteString("mo", " ay"));
        Assertions.assertEquals("ASy", stringUnit.getUniteString("AS", "y"));
    }

    @Test
    void getIndexOfSymbolTest() {
        Assertions.assertEquals(1, stringUnit.getIndexOfSymbol("gdd", 'd'));
        Assertions.assertEquals(3, stringUnit.getIndexOfSymbol("go12", '2'));
        Assertions.assertEquals(-1, stringUnit.getIndexOfSymbol("mo", '2'));
        Assertions.assertEquals(1, stringUnit.getIndexOfSymbol("a s", ' '));
    }

    @Test
    void getStringComparisonTest() {
        Assertions.assertEquals(true, stringUnit.getStringComparison("aa1Sa", "aa1Sa"));
        Assertions.assertEquals(false, stringUnit.getStringComparison("", "2"));
        Assertions.assertEquals(false, stringUnit.getStringComparison("AAAA ", " AAAA"));
    }

    @Test
    void getStringWithoutWhiteSpaceInUpperCaseTest() {
        Assertions.assertEquals("SAN12", stringUnit.getStringWithoutWhiteSpaceInUpperCase(" san12 "));
        Assertions.assertEquals("241 A L", stringUnit.getStringWithoutWhiteSpaceInUpperCase("   241 A l"));
        Assertions.assertEquals("AAAA", stringUnit.getStringWithoutWhiteSpaceInUpperCase("aaaa"));
        Assertions.assertEquals("TT", stringUnit.getStringWithoutWhiteSpaceInUpperCase("TT"));
    }

    @Test
    void getSubstringOfStringTest() {
        Assertions.assertEquals("0987654321", stringUnit.getSubstringOfString("12345678900987654321"));
        Assertions.assertEquals("false", stringUnit.getSubstringOfString(" "));
        Assertions.assertEquals("123456789012345678901234", stringUnit.getSubstringOfString("1234567890123456789012345678901234567890"));
    }

    @Test
    void replaceSymbolTest() {
        Assertions.assertEquals(":)", stringUnit.replaceSymbol(":("));
        Assertions.assertEquals("11 :)", stringUnit.replaceSymbol("11 :("));
        Assertions.assertEquals("", stringUnit.replaceSymbol(""));
    }

    @Test
    void isStringStartWithTheWordTest() {
        Assertions.assertEquals(false, stringUnit.isStringStartWithTheWord("1kkkk1 ", "1"));
        Assertions.assertEquals(false, stringUnit.isStringStartWithTheWord("", "bj"));
        Assertions.assertEquals(true, stringUnit.isStringStartWithTheWord(" 6 ", " "));
        Assertions.assertEquals(true, stringUnit.isStringStartWithTheWord("good morning good", "good"));
    }

    @Test
    void getCountOfVowelsTest() {
        Assertions.assertEquals(2, stringUnit.getCountOfVowels("Good"));
        Assertions.assertEquals(5, stringUnit.getCountOfVowels("aaAAA"));
        Assertions.assertEquals(0, stringUnit.getCountOfVowels(""));
    }

    @Test
    void getCountOfPunctuationMarksTest() {
        Assertions.assertEquals(3, stringUnit.getCountOfPunctuationMarks("!! . "));
        Assertions.assertEquals(2, stringUnit.getCountOfPunctuationMarks("aa,,AAA"));
        Assertions.assertEquals(0, stringUnit.getCountOfPunctuationMarks(""));
    }

    @Test
    void getStringReversTest() {
        Assertions.assertEquals("11", stringUnit.getStringRevers("11"));
        Assertions.assertEquals("abba", stringUnit.getStringRevers("abba"));
    }

    @Test
    void getAbbreviationOfFIO() {
        Assertions.assertEquals("У.П.И", stringUnit.getAbbreviationOfFIO("Ушакова Полина игоревна"));
        Assertions.assertEquals("С.К.И", stringUnit.getAbbreviationOfFIO("симанович катерина игоревна"));
    }

    @Test
    void getStringOfNumbers() {
        Assertions.assertEquals("2332", stringUnit.getStringOfNumbers("Уf2332f"));
        Assertions.assertEquals("", stringUnit.getStringOfNumbers("  "));
        Assertions.assertEquals("3", stringUnit.getStringOfNumbers(" 3 "));
    }

}
