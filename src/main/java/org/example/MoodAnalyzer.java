package org.example;

public class MoodAnalyzer {

    public String MoodAnalyzer(String msg){
        if(msg.contains("sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }
}