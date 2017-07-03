package com.example.grahambruce.wordcounter;


import java.util.ArrayList;

import static android.R.id.input;

/**
 * Created by grahambruce on 03/07/2017.
 */

public class WordCounter {

    public String getWordCount(String input){
        int words = 0;
        for (String s : input.split(" ")){
            words += 1;
        }
        return Integer.toString(words);
    }

}
