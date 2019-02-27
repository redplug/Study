package com.example.mykotlin;

public class SingletonJava {
    private static SingletonJava Instance = new SingletonJava();

    public static SingletonJava getInstance() {
        return Instance;
    }

    private SingletonJava() {
    }
    public void log(String text) {
        System.out.println(text);
    }
}
