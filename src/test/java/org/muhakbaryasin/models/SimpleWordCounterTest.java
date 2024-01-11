package org.muhakbaryasin.models;

import org.junit.jupiter.api.Test;
import org.muhakbaryasin.entities.CountWordsResult;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleWordCounterTest {

    @Test
    void count() {
        // Arrange
        SimpleWordCounter wordCounter = new SimpleWordCounter();

        // Test case 1: empty words list
        List<String> emptyWords = List.of();
        CountWordsResult result1 = wordCounter.count(emptyWords);
        assertEquals(0, result1.getTotalM());
        assertEquals(0, result1.getOver5CharWords().size());

        // Test case 2: words with 'M' or 'm' at the beginning and words with length over 5
        List<String> words = Arrays.asList("Mango", "apple", "melon", "macaroon", "Banana");
        CountWordsResult result2 = wordCounter.count(words);
        assertEquals(3, result2.getTotalM());
        assertEquals(Arrays.asList("macaroon", "Banana"), result2.getOver5CharWords());
    }
}