package com.rakovets.course.javabasics.practice.strings;

public class StringUnit {
    public String getUniteString(String firstString, String secondString) {
        return firstString + secondString;
    }

    public int getIndexOfSymbol(String string, char symbol) {
        return string.indexOf(symbol);
    }

    public boolean getStringComparison(String firstString, String secondString) {
        return firstString.equals(secondString);
    }

    public String getStringWithoutWhiteSpaceInUpperCase (String string) {
        return string.trim().toUpperCase();
    }
}
