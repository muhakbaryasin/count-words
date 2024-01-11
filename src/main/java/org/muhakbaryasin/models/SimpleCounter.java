package org.muhakbaryasin.models;

import org.muhakbaryasin.entities.Result;
import org.muhakbaryasin.interfaces.WordCounter;

import java.util.List;

public class SimpleCounter implements WordCounter {
    public Result count(List<String> words) {
        Result countWordsResult = new Result();

        // iterate through each word
        for (var word: words) {

            // word that start with M or m will be counted
            if (word.charAt(0) == 'M' || word.charAt(0) == 'm')
                countWordsResult.incrementTotalM();

            // word that has length over 5 will be populated
            if (word.length() > 5)
                countWordsResult.addOver5CharWords(word);

        }

        return countWordsResult;
    }
}
