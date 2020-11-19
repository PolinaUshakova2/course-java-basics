package com.rakovets.course.javabasics.practice.jcf;

import java.util.HashMap;

public class TextMonitoring {
    public static HashMap<String, Integer> researchText(String text) {
        HashMap<String, Integer> mapOfWords = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if (mapOfWords.containsKey(word)) {
                int key = mapOfWords.get(word);
                mapOfWords.put(word, ++key);
            } else {
                mapOfWords.put(word, 1);
            }
        }
        return mapOfWords;
    }

    public int getCountUniqueWords(HashMap<String, Integer> mapOfWords) {
        return mapOfWords.size();
    }

    public java.util.Set<String> getUniqueWords(HashMap<String, Integer> mapOfWords) {
        return mapOfWords.keySet();
    }

    public int get(HashMap<String, Integer> map, String word) {
        return map.get(word);
    }
}
