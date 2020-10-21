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

    public String getStringWithoutWhiteSpaceInUpperCase(String string) {
        return string.trim().toUpperCase();
    }

    public String getSubstringOfString(String string) {
        String result;
        if(string.length() < 10) {
            return "false";
        }
        result = string.substring(10);
        if (result.length() > 23) {
            return result.substring(0,24);
        }
        return result;
    }

    public String replaceSymbol(String string) {
        return string.replace(":(", ":)");
    }

    public boolean isStringStartWithTheWord(String string, String word) {
        return string.startsWith(word) && string.endsWith(word);
    }

    public int getCountOfVowels(String string) {
        char[] arrayOfEnglishVowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
        int countOfVowels = 0;
        char[] stringToChar = string.toLowerCase().toCharArray();
        for (char symbol : stringToChar) {
            for (char englishVowel : arrayOfEnglishVowels) {
                    if (symbol == englishVowel) {
                        countOfVowels++;
                        break;
                    }
            }
        }
        return countOfVowels;
    }

    public int getCountOfPunctuationMarks (String string) {
        char[] arrayOfPunctuationMarks = new char[]{'.', ',', '!'};
        int countOfVowels = 0;
        char[] stringToChar = string.toCharArray();
        for (char symbol : stringToChar) {
            for (char englishVowel : arrayOfPunctuationMarks) {
                if (symbol == englishVowel) {
                    countOfVowels++;
                    break;
                }
            }
        }
        return countOfVowels;
    }

    public String getStringRevers(String string) {
        StringBuffer stringBuffer = new StringBuffer(string);
        return stringBuffer.reverse().toString();
    }

    public String getAbbreviationOfFIO(String string) {
        StringBuilder fioBuilder = new StringBuilder();
        String[] arrayOfFIO = string.toUpperCase().split(" ");
        for (int i = 0; i < arrayOfFIO.length; i++) {
            if (i != arrayOfFIO.length - 1) {
                arrayOfFIO[i] = arrayOfFIO[i].charAt(0) + ".";
            } else {
                arrayOfFIO[i] = String.valueOf(arrayOfFIO[i].charAt(0));
            }
        }
        for (int i = 0; i < arrayOfFIO.length; i++) {
            fioBuilder.append(arrayOfFIO[i]);
        }
        String joinedString = fioBuilder.toString();
        return joinedString;
    }

    public static String getStringOfNumbers(String string) {
        String[] arrayOfNumbers = string.split("\\D");
        String result = "";
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            result += arrayOfNumbers[i];
        }
        return result;
    }

}
