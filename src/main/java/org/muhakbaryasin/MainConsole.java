package org.muhakbaryasin;

import org.muhakbaryasin.entities.CountWordsResult;
import org.muhakbaryasin.interfaces.View;
import org.muhakbaryasin.interfaces.WordCounter;
import org.muhakbaryasin.models.SimpleWordCounter;
import org.muhakbaryasin.utils.WordGenerator;
import org.muhakbaryasin.views.ConsoleView;

import java.util.List;


public class MainConsole {
    public static void main(String[] args) {
        List<String> generatedWords = WordGenerator.generateRandomWords();

        WordCounter counter = new SimpleWordCounter();
        CountWordsResult countWordsResult = counter.count(generatedWords);

        View view = ConsoleView.getInstance();
        view.init();
        view.showInputWords(generatedWords);
        view.showTotalMWords(countWordsResult);
        view.showOver5CharWords(countWordsResult);
    }
}