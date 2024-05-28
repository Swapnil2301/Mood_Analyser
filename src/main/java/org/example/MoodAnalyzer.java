package org.example;

public class MoodAnalyzer {

    private String msg;

    public MoodAnalyzer(String msg){
        this.msg=msg;
    }

    public String MoodAnalyzer(){
        if(msg.contains("sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }
}