package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {

    @Test
    public void moodAnalyzer() {
        MoodAnalyzer obj1=new MoodAnalyzer("I am in sad mood".toLowerCase());
        String mood=obj1.MoodAnalyzer();
        Assertions.assertEquals(mood,"SAD");
    }
}