package org.muhakbaryasin.models;

import org.muhakbaryasin.entities.CountWordsResult;
import org.muhakbaryasin.interfaces.WordCounter;

import java.util.ArrayList;
import java.util.List;

public class SimpleWordCounter implements WordCounter {
    public CountWordsResult count(List<String> words) {
        int totalM = 0;
        List<String> over5CharWords = new ArrayList<>();

        // iterate through each word
        for (var word: words) {

            // word that start with M or m will be counted
            if (word.charAt(0) == 'M' || word.charAt(0) == 'm')
                totalM = totalM + 1;

            // word that has length over 5 will be populated
            if (word.length() > 5)
                over5CharWords.add(word);
        }

        return new CountWordsResult.Builder()
                .totalM(totalM)
                .over5CharWords(over5CharWords).build();
    }
}
