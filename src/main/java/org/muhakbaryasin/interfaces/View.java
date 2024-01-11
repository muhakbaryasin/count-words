package org.muhakbaryasin.interfaces;

import org.muhakbaryasin.entities.Result;

public interface View {
    void init(); // initiation of view or preparation of view
    void showTotalMWords(Result result); // presentation of the total M/m words
    void showOver5CharWords(Result result); // presentation of the over 5 chars words
}
