package org.muhakbaryasin;

import org.muhakbaryasin.entities.Result;
import org.muhakbaryasin.interfaces.View;
import org.muhakbaryasin.interfaces.WordCounter;
import org.muhakbaryasin.models.SimpleCounter;
import org.muhakbaryasin.utils.WordGenerator;
import org.muhakbaryasin.views.ConsoleView;

import java.util.List;


public class MainConsole {
    public static void main(String[] args) {
        List<String> generatedWords = WordGenerator.generateRandomWords();

        WordCounter counter = new SimpleCounter();
        Result result = counter.count(generatedWords);

        View view = ConsoleView.getInstance();
        view.init();
        view.showTotalMWords(result);
        view.showOver5CharWords(result);
    }
}