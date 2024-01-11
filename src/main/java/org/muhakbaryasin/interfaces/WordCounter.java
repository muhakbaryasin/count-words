package org.muhakbaryasin.interfaces;

import org.muhakbaryasin.entities.Result;

import java.util.List;

public interface WordCounter {
    // we create interface to support extension of the WordCounter implementation
    // so, if in the future the Counter logic different,
    // than we will just need to create other implementation

    Result count(List<String> words);
}
