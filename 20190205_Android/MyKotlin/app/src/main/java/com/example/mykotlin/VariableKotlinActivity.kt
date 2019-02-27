package com.example.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_variable.*
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {


    // 클릭된 횟수를 저장할 변수
    var clickCount = 0

    // Activity가 시작된 시간
    val startTime = System.currentTimeMillis()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        // 시작 시간을 텍스트 형태로 변환
        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)

        startTimeLabel.text = "Activity 시작 시간: ${timeText}"

        clickCountLable.text = "버튼이 클릭된 횟수 : ${clickCount}"

        button.setOnClickListener{
            clickCount = clickCount + 1

            clickCountLable.text = "버튼이 클릭된 횟수: ${clickCount}"
        }



    }
}
