import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {

    @Test
    void analyzeMood() throws AnalyzerException {
        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer("I am in Sad mood".toLowerCase());
        String mood = moodAnalyzer1.analyzeMood();
        Assertions.assertEquals(mood,"SAD");
    }

    @Test
    void analyzeHappyMood() throws AnalyzerException {
        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer("I am in Any mood".toLowerCase());
        String mood = moodAnalyzer2.analyzeMood();
        Assertions.assertEquals(mood,"HAPPY");
    }


    @Test
    void analyzeNullMood() throws AnalyzerException {
        MoodAnalyzer moodAnalyzer3 = new MoodAnalyzer(null);

        try {
            moodAnalyzer3.analyzeMood(null);
        } catch (AnalyzerException e) {
            Assertions.assertEquals("Enter a valid Input",e.getMessage());
        }
    }


}