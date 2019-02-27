package com.example.mykotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button1 클릭된 경우의 이벤트 리스너 설정
        button1.setOnClickListener {
            // Intent 로 BmiJavaActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent   (this@MainActivity, BmiJavaActivity::class.java))
        }

        button2.setOnClickListener{
            // Intent로 BmiKotlinActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent (this@MainActivity, BmiKotlinActivity::class.java))
        }
        button3.setOnClickListener{
            // Intent로 VariableJavaActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent (this@MainActivity, VariableJavaActivity::class.java))
        }
        button4.setOnClickListener{
            // Intent로 VariableKotlinActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent (this@MainActivity, VariableKotlinActivity::class.java))
        }
        button5.setOnClickListener{
            // Intent로 VariableKotlinActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent (this@MainActivity, ControlJavaActivity::class.java))
        }
        button6.setOnClickListener{
            // Intent로 VariableKotlinActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent (this@MainActivity, ControlKotlinActivity::class.java))
        }
    }
}
