package com.rakovets.course.javabasics.practice.javaio;
import java.io.*;
import java.util.*;

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
        Character symbol;
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

    public static Map<Character, Integer> getLetterRepetitionRateAndSortedByValue(String filePath) {
        Map<Character, Integer> mapOfChar = new HashMap<>();
        Map<Character, Integer> sortedMapOfChar = new LinkedHashMap<>();
        Character symbol;
        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
            int c;
            while ((c = buffer.read()) != -1) {
                symbol = (char) c;
                symbol = java.lang.Character.toLowerCase(symbol);
                if (mapOfChar.containsKey(symbol)) {
                    int value = mapOfChar.get(symbol);
                    value++;
                    mapOfChar.put(symbol, value);
                } else {
                    mapOfChar.put(symbol, 1);
                }
            }
            List<Map.Entry<Character, Integer>> list = new LinkedList<>(mapOfChar.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
                @Override
                public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });
            for (Map.Entry<Character, Integer> item : list) {
                sortedMapOfChar.put(item.getKey(), item.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sortedMapOfChar;
    }

    public static void getSortOfNumbers(String filePath) {
        String[] numbers;
        String filePathNew = filePath.replace(".txt", "_.txt");
        List<Integer> listOfNumbers = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(filePathNew))) {
             String str;
             while ((str = buffer.readLine()) != null) {
                numbers = str.split(" ");
                for (String num : numbers) {
                    listOfNumbers.add(Integer.parseInt(num));
                }
                listOfNumbers.sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                });
                File file = new File(filePathNew);
                try {
                    boolean create = file.createNewFile();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                for (int item : listOfNumbers) {
                    bw.write(item + " ");
                    bw.flush();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Double> getAcademicPerformance(String filePath) {
        Map<String, Double> mapOfStudents = new HashMap<>();
        String[] intermediateArray;
        String surname;
        String stringOfMark;
        double sum = 0;
        double averageMark;
        List<String> listOfStrings = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
            String str;
            while ((str = buffer.readLine()) != null) {
                surname = str.substring(0, str.indexOf(','));
                stringOfMark = str.substring(str.indexOf(',') + 1);
                intermediateArray = stringOfMark.split(",");
                Integer[] marks = new Integer[intermediateArray.length];
                for (int i = 0; i < intermediateArray.length; i++) {
                    marks[i] = Integer.parseInt(intermediateArray[i]);
                }
                for (Integer mark : marks) {
                    sum += mark;
                }
                averageMark = sum / (marks.length);
                mapOfStudents.put(surname, averageMark);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mapOfStudents;
    }
}



