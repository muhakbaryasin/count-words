package org.muhakbaryasin.entities;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private int totalM = 0;
    private final List<String> over5CharWords = new ArrayList<>();

    public int getTotalM() {
        return this.totalM;
    }

    public List<String> getOver5CharWords() {
        return this.over5CharWords;
    }

    public void incrementTotalM() {
        this.totalM = this.totalM + 1;
    }

    public void addOver5CharWords(String word) {
        this.over5CharWords.add(word);
    }
}
