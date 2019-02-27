package com.example.helloandroid;

import java.util.Currency;

// 자동차라는 객체의 설계도인 Car Class 를 정의한다.
public class Car {
    // 클래스 내부에는 객체가 가져야할 속석등을 정의할 수 있다. 이를테면 자동차의 가속도, 현재속도, 최고 속도 등이 있을 수 있다.
    // 현재 속도
    private int currentSpeed = 0;

    // 최고 속도
    private int maxSpeed = 100;

    // 가속도
    private int acceleration = 3;

    // 브레이크 속도
    private int breakSpeed = 4;

    // 생성자
    public Car(int acceleration, int maxSpeed, int breakSpeed) {
        this.acceleration = acceleration;
        this.maxSpeed = maxSpeed;
        this.breakSpeed = breakSpeed;
    }

    // 클래스는 매소드를 이용해 다른 객체들과 상호작용이 가능하다.
    // 자동차 엑셀을 밟는 메소드
    public void accelerationPedal() {
        // 페달을 밟을때마다 가속도만큼 현재속도를 올린다. 최고속도 이상으로 가속되지 않는다.
        currentSpeed = currentSpeed + acceleration;
        if (currentSpeed > maxSpeed) {
            currentSpeed = maxSpeed;
        }
    }

    // 자동차 브레이크 페달을 밟는다.
    public void breakPedal() {
        // 페달을 밟을 때마다 현재속도를 줄인다. 브레이크 페달로 속도가 0이하는 될 수 없다.
        currentSpeed = currentSpeed - breakSpeed;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }

    public String getCurrentSpeedText() {
        return "현재 속도는 " + this.currentSpeed + " km/h 입니다.";
    }
}
