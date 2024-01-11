package org.muhakbaryasin.utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordGeneratorTest {

    @Test
    void generateRandomWords() {
        List<String> words = WordGenerator.generateRandomWords();

        // Assert the list is not null and not empty
        assertNotNull(words);
        assertFalse(words.isEmpty());

        // Assert the number of words is between 5 and 10
        assertTrue(words.size() >= 5 && words.size() <= 10);

        // Assert each word has a length between 2 and 7
        for (String word : words) {
            assertTrue(word.length() >= 2 && word.length() <= 7);
        }
    }

    @Test
    void generateRandomWord() {
        String randomWord = WordGenerator.generateRandomWord(5);

        // Assert the generated word has the correct length
        assertEquals(5, randomWord.length());

        // Assert second character is lowercase
        assertTrue(Character.isLowerCase(randomWord.charAt(1)));
    }
}