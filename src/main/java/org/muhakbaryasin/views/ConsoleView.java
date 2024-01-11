package org.muhakbaryasin.views;

import org.muhakbaryasin.entities.CountWordsResult;
import org.muhakbaryasin.interfaces.View;

import java.util.List;

public class ConsoleView implements View {
    private static View instance;

    // private constructor - Singleton Pattern
    private ConsoleView() {}

    // instance reference accessed from getInstance
    public static View getInstance() {
        if (instance == null) {
            // create instance if null
            instance = new ConsoleView();
        }

        return instance;
    }

    @Override
    public void init() {
        System.out.println("====================================");
        System.out.println("Count Words Console");
        System.out.println("====================================");
    }

    @Override
    public void showInputWords(List<String> words) {
        System.out.println("Input Words");
        System.out.println("------------------------------------");

        if (words.isEmpty()) {
            System.out.println("Input is empty!");
            System.out.println("------------------------------------");
            return;
        }

        for (var i = 0; i < words.size(); i++) {
            System.out.printf("%s. %s (%s)%n", i + 1, words.get(i), words.get(i).length());
        }

        System.out.println("------------------------------------");
    }

    @Override
    public void showTotalMWords(CountWordsResult countWordsResult) {
        System.out.printf(
                "Total words start with M/m: %s \n",
                countWordsResult.getTotalM()
        );
    }

    @Override
    public void showOver5CharWords(CountWordsResult countWordsResult) {
        System.out.printf(
                "Words over 5 chars: %s \n",
                String.join(", ", countWordsResult.getOver5CharWords())
        );
    }
}
