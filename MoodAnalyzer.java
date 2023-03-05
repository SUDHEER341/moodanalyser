package com.moodanalyser;

public class MoodAnalyzer {
    public String message;
    public  MoodAnalyzer(String message) {
        this.message = message;
    }

    public void analysingMood() {
        try {
            if (message.contains("Sad"))
                System.out.println("Sad");
            else
                System.out.println("Happy");
        }

        catch (NullPointerException e){

            System.out.println("Happy");
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzerobj = new MoodAnalyzer("");
        moodAnalyzerobj.analysingMood();
    }
}
