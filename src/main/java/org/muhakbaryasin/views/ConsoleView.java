package org.muhakbaryasin.views;

import org.muhakbaryasin.entities.Result;
import org.muhakbaryasin.interfaces.View;

public class ConsoleView implements View {
    //
    private static View instance;

    private ConsoleView() {}

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
    public void showTotalMWords(Result result) {
        System.out.printf(
                "Total words start with M/m: %s \n",
                result.getTotalM()
        );
    }

    @Override
    public void showOver5CharWords(Result result) {
        System.out.printf(
                "Words over 5 chars: %s \n",
                String.join(", ", result.getOver5CharWords())
        );
    }
}
