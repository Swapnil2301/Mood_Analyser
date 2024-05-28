package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {

    @Test
    public void moodAnalyzer() {
        MoodAnalyzer obj1=new MoodAnalyzer();
        String mood=obj1.MoodAnalyzer("I am in sad mood".toLowerCase());
        Assertions.assertEquals(mood,"SAD");
    }
}