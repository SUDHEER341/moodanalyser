package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void Messgae_is_Sad_ThenReturn_Sad() {
        MoodAnalyzer moodAnalyzerObj = new MoodAnalyzer(" Message is sad ");
        String moodObj = moodAnalyzerObj.analyseMood();
        Assert.assertEquals("SAD", moodObj);

    }

    @Test
    public void Message_IsNotSad_ThenReturn_Happy() {
        MoodAnalyzer moodAnalyzerObj = new MoodAnalyzer("Message is Happy");
        String moodObj = moodAnalyzerObj.analyseMood();
        Assert.assertEquals("HAPPY", moodObj);
    }
}
