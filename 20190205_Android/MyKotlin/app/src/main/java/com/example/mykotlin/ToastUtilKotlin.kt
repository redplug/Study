@file:JvmName("ToastUtil")
package com.example.mykotlin
import android.widget.Toast
import com.example.mykotlin.MainApplication



fun toastShort(message: String) {
    Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_SHORT).show()
}

fun toastLong(message: String) {
    Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_LONG).show()
}

fun toast(message: String, leangh: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(MainApplication.getAppContext(), message, leangh).show()
}

