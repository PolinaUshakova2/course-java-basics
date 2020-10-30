package com.rakovets.course.javabasics.practice.jcf;

import java.util.HashMap;

public class TextMonitoring {
    public static void researchText(String text) {
        HashMap<String, Integer> map= new HashMap<>();
        String[] stringArray = text.split(" ");
        for (String word : stringArray) {
            if (map.containsKey(word)) {
                int value = map.get(word);
                value++;
                map.put(word, value);
            } else {
                map.put(word, 1);
            }
        }
    }

    public static int getCountUniqueWords(HashMap<String, Integer> map) {
        return map.size();
    }

    public static java.util.Set<String> getUniqueWords(HashMap<String, Integer> map) {
        return map.keySet();
    }

    public static int get(HashMap<String, Integer> map, String word) {
        return map.get(word);
    }
}
