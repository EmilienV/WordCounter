package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private final Map<String, Integer> wordCountMap = new HashMap<>();

    public void countWords(String sentence) {

        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return wordCountMap;
    }
}