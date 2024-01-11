package org.muhakbaryasin.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordGenerator {
    public static List<String> generateRandomWords() {
        List<String> words = new ArrayList<>();
        Random random = new Random();

        // Generates a random number of words between 5 and 10
        int numberOfWords = random.nextInt(10) + 5;

        // Generates a random length between 2 and 7 characters
        for (int i = 0; i < numberOfWords; i++) {
            int wordLength = random.nextInt(7) + 2;
            words.add(generateRandomWord(wordLength));
        }

        return words;
    }

    public static String generateRandomWord(int length) {
        StringBuilder word = new StringBuilder();
        Random random = new Random();

        // Randomly decides whether to use title case or lowercase
        boolean titleCase = random.nextBoolean();
        char lowerOrTitleCase = titleCase ? 'A' : 'a';

        for (int i = 0; i < length; i++) {
            // second to end letter should be lowercase
            // so, we override lowerOrTitleCase with 'a'
            if (i == 1)
                lowerOrTitleCase = 'a';

            // pick random letter
            char randomChar = (char) (lowerOrTitleCase + random.nextInt(26));
            word.append(randomChar);
        }

        return word.toString();
    }
}
