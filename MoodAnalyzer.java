package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message)
    {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalysisException
    {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalysisException
    {
        try
        {
            if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException
                            .exceptionType.ENTERED_EMPTY, "Please enter Proper Mood");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }

        catch (NullPointerException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERED_NULL, e);
        }
    }

    @Override
    public boolean equals(Object other)
    {
        MoodAnalyzer mood = (MoodAnalyzer) other;
        return this.message.equals(mood);
    }
}

