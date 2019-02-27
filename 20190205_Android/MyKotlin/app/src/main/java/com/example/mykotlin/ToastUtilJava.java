package com.example.mykotlin;

import android.widget.Toast;

public class ToastUtilJava {
    public static void toastShort(String message) {
        Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_SHORT).show();
    }

    public static void toastLong(String message) {
        Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_LONG).show();
    }

    public static void toast(String message, int lengh){
        Toast.makeText(MainApplication.getAppContext(), message, lengh).show();
    }

    public static void toast(String message){
        toast(message, Toast.LENGTH_SHORT);
    }
}
