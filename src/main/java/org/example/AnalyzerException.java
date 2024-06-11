package org.example;

public class AnalyzerException extends Exception{

    public enum ExceptionType{
        NULL,EMPTY;
    }
    ExceptionType type;
    public AnalyzerException(ExceptionType type,String msg){
        super(msg);
        this.type = type;
    }
}