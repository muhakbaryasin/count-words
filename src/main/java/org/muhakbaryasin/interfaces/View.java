package org.muhakbaryasin.interfaces;

import org.muhakbaryasin.entities.CountWordsResult;

import java.util.List;

public interface View {
    void init(); // initiation of view or preparation of view
    void showInputWords(List<String> words);
    void showTotalMWords(CountWordsResult countWordsResult); // presentation of the total M/m words
    void showOver5CharWords(CountWordsResult countWordsResult); // presentation of the over 5 chars words
}
