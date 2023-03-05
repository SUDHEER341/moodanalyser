package com.moodanalyser;

public class MoodAnalyser {
    public String message;
    public MoodAnalyser(String message)
    {
        this.message = message;
    }
    public  void analyseMood() {

        if(message.contains("Sad"))
        {
            System.out.println("SAD");
        }
        else
        {
            System.out.println("HAPPY");
        }
    }
    public static void main(String[] args)
    {
        MoodAnalyser myObj =new MoodAnalyser("Sad");
        myObj.analyseMood();
    }
}
