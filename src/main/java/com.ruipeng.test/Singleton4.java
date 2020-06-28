package com.ruipeng.test;

public class Singleton4 {

    private Singleton4(){}
    private static class Hodle{
        private static final Singleton4 INSTANCE = new Singleton4();
    }
    public static Singleton4 getInstance(){
        return Hodle.INSTANCE;
    }
}
