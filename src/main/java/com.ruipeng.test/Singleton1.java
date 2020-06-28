package com.ruipeng.test;

public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){}
    public static Singleton1 getInstance(){
        return Singleton1.INSTANCE;
    }
}
