package com.example.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_view_binding.*

class BmiKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //UI로 사용할 레이아웃 XML파일을 지정한다.
        setContentView(R.layout.layout_view_binding)

        // bmi 버튼이 클릭된 경우 동작하는 코드를 작성한다.
        bmiButton.setOnClickListener {
            // tallField 의 값을 읽어온다
            val tall = tallField.text.toString().toDouble()

            // weightField 의 값을 읽어 온다
            val weight = weightField.text.toString().toDouble()

            // BMI를 게산한다

            val bmi = weight / Math.pow(tall / 100, 2.0)

            resultLabel.text = "키: ${tallField.text}, 체중: ${weightField.text}, BMI : $bmi"
        }


    }
}
