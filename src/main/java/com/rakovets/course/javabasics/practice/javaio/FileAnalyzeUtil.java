package com.rakovets.course.javabasics.practice.javaio;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileAnalyzeUtil {
    public static List<String> getListOfFile(String filePath) {
        List<String> listOfStrings = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
            String str;
            while ((str = buffer.readLine()) != null) {
                listOfStrings.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfStrings;
    }

    public static List<String> getListOfWordsStartWithVowel(String filePath) {
        List<String> listOfWordsStartWithVowel = new ArrayList<>();
        String words = null;
        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
            int c;
            while ((c = buffer.read()) != -1) {
                words += c;
            }
            if (words != null) {
                for (String word : words.split("\\W")) {
                    if (word.matches("[aeiouyAEIOUY](.*)")) {
                        listOfWordsStartWithVowel.add(word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfWordsStartWithVowel;
    }

    public static List<String> getListOfWordsWithTheSameBeginningAndEnd(String filePath) {
        List<String> listOfWordsWithTheSameBeginningAndEnd = new ArrayList<>();
        String words = null;
        String[] word;
        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
            int c;
            while ((c = buffer.read()) != -1) {
                words += c;
            }
            word = words.split("\\W");
            for (int i = 0; i < word.length - 1; i++) {
                if (word[i] != null && word[i + 1] != null) {
                    if (word[i].charAt(word[i].length() - 1) == word[i + 1].charAt(0)) {
                        listOfWordsWithTheSameBeginningAndEnd.add(word[i]);
                        listOfWordsWithTheSameBeginningAndEnd.add(word[i + 1]);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfWordsWithTheSameBeginningAndEnd;
    }

    public static Map<Character, Integer> getLetterRepetitionRate(String filePath) {
        Map<Character, Integer> mapOfChar = new HashMap<>();
        Character symbol = null;
        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
            int c;
            while ((c = buffer.read()) != -1) {
                symbol = (char) c;
                symbol = Character.toLowerCase(symbol);
                if (mapOfChar.containsKey(symbol)) {
                    int value = mapOfChar.get(symbol);
                    value++;
                    mapOfChar.put(symbol, value);
                } else {
                    mapOfChar.put(symbol, 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mapOfChar;
    }


}



