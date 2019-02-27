package com.example.mykotlin;

public class SampleClass {
    int outerField1 = 0;

    class InnerClass {
        int myField = outerField1;
    }

    public static class NestedClass {

    }
}
