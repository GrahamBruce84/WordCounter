package com.example.grahambruce.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

/**
 * Created by grahambruce on 03/07/2017.
 */

public class TestWordCounter {

    WordCounter wordCounter;


    @Before
    public void before(){
        this.wordCounter = new WordCounter();
    }

    @Test
    public void TestWordCounter() throws Exception {
        assertEquals("4", wordCounter.getWordCount("how many are here"));

    }
}
