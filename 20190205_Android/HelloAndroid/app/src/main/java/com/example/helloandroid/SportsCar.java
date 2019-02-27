package com.example.helloandroid;

public class SportsCar extends Car {

    private boolean isOpenSunRoof = false;
    public SportsCar(int acceleartion, int maxSpeed, int breakSpeed){
        super(acceleartion, maxSpeed, breakSpeed);
    }

    // 스포츠카의 선루프를 연다.
    public void setOpenSunRoof() {
        isOpenSunRoof = true;
    }

    public void setCloseSunRoof() {
        isOpenSunRoof = false;
    }

    public String getSunRoofInfo() {
        if (isOpenSunRoof) {
            return "선루프를 열었더니 상쾌하다.";
        } else {
            return "선루프는 닫혀있다.";
        }
    }

    // 부모에게 받은 기능을 그대로 쓰지 않고 재 정의 해서 쓰는 것을 오버라이드라고 한다.
    @Override
    public String getCurrentSpeedText(){
        return "스포츠카 입니다. " + super.getCurrentSpeedText();
    }
}
