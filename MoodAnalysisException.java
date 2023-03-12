package com.moodanalyser;

public class MoodAnalysisException extends Exception {
    public exceptionType myException;
    public MoodAnalysisException(exceptionType type, String messgae, Throwable cause) {
        super(messgae);
        new MoodAnalysisException(type, cause);
    }
    public MoodAnalysisException(exceptionType type, Throwable cause) {
        super(cause);
        this.myException = type;
    }
    public MoodAnalysisException(exceptionType type, String message)
    {
        super(message);
        this.myException = type;
    }
    public enum exceptionType
    {
        ENTERED_NULL, NO_SUCH_CLASS, NO_SUCH_METHOD, METHOD_INVOCATION_ISSUE, ENTERED_EMPTY
    }
}

