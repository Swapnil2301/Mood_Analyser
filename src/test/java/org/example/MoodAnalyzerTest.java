package org.example;

import org.example.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {

    @Test
    void analyzeMood() throws AnalyzerException, jdk.internal.org.objectweb.asm.tree.analysis.AnalyzerException {
        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer("I am in Sad mood".toLowerCase());
        String mood = moodAnalyzer1.analyzeMood();
        Assertions.assertEquals(mood,"SAD");
    }

    @Test
    void analyzeHappyMood() throws AnalyzerException, jdk.internal.org.objectweb.asm.tree.analysis.AnalyzerException {
        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer("I am in Any mood".toLowerCase());
        String mood = moodAnalyzer2.analyzeMood();
        Assertions.assertEquals(mood,"HAPPY");
    }

    @Test
    void analyzeNullMood() throws AnalyzerException, jdk.internal.org.objectweb.asm.tree.analysis.AnalyzerException {
        MoodAnalyzer moodAnalyzer3 = new MoodAnalyzer(null);
        String mood = moodAnalyzer3.analyzeMood();
        Assertions.assertEquals(mood,"HAPPY");
    }
    void analyzeEmptyMood() throws AnalyzerException, jdk.internal.org.objectweb.asm.tree.analysis.AnalyzerException {
        MoodAnalyzer moodAnalyzer3= new MoodAnalyzer(" ");
        String mood = moodAnalyzer3.analyzeMood();
        Assertions.assertEquals(mood,"HAPPY");
    }
}