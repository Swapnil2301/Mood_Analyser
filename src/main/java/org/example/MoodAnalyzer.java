package org.example;

import jdk.internal.org.objectweb.asm.tree.analysis.AnalyzerException;

public class MoodAnalyzer {
    public enum ExceptionType{
        NULL,EMPTY;
    }

    private String msg;


    public MoodAnalyzer(){

    }
    public MoodAnalyzer(String msg) throws AnalyzerException{
        this.msg = msg;
    }

    public void analyzeMood(String msg) throws AnalyzerException{
        this.msg = msg;
        analyzeMood();
    }

    public String analyzeMood() throws AnalyzerException {
        try {
            if (msg.isEmpty()) {
                throw new AnalyzerException(AnalyzerException.ExceptionType.EMPTY, "Enter Input");
            }

            if (msg.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new AnalyzerException(AnalyzerException.ExceptionType.NULL, "Enter a valid Input");
        }
    }
}