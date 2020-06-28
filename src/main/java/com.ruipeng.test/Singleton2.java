package com.ruipeng.test;

public class Singleton2 {
    private static Singleton2 intance;
    private Singleton2(){}

    public static Singleton2 getInstance(){
        if(intance == null){
            intance =  new Singleton2();
        }
        return intance;
    }
}
