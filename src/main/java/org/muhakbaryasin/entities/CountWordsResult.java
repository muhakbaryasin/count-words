package org.muhakbaryasin.entities;

import java.util.List;

public class CountWordsResult {
    private int totalM;
    private List<String> over5CharWords;

    // Private constructor to enforce the use of the builder
    private CountWordsResult() {
    }

    public int getTotalM() {
        return this.totalM;
    }

    public List<String> getOver5CharWords() {
        return this.over5CharWords;
    }

    // Builder pattern class
    public static class Builder {
        private int totalM;
        private List<String> over5CharWords;

        public Builder() {
        }

        public Builder totalM(int totalM) {
            this.totalM = totalM;
            return this;
        }

        public Builder over5CharWords(List<String> over5CharWords) {
            this.over5CharWords = over5CharWords;
            return this;
        }

        public CountWordsResult build() {
            CountWordsResult countWordsResult = new CountWordsResult();
            countWordsResult.totalM = this.totalM;
            countWordsResult.over5CharWords = this.over5CharWords;
            return countWordsResult;
        }
    }

    // toString to facilitate debugging
    @Override
    public String toString() {
        return "Result{" +
                "totalM=" + totalM +
                ", over5CharWords=" + over5CharWords +
                '}';
    }
}
