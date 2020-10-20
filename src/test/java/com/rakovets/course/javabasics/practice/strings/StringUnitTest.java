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
    void getStringWithoutWhiteSpaceInUpperCase() {
        Assertions.assertEquals("SAN12", stringUnit.getStringWithoutWhiteSpaceInUpperCase(" san12 "));
        Assertions.assertEquals("241 A L", stringUnit.getStringWithoutWhiteSpaceInUpperCase("   241 A l"));
        Assertions.assertEquals("AAAA", stringUnit.getStringWithoutWhiteSpaceInUpperCase("aaaa"));
        Assertions.assertEquals("TT", stringUnit.getStringWithoutWhiteSpaceInUpperCase("TT"));
    }


}
