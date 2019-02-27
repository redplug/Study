package com.example.mykotlin;

public class PersonJava {

    private int age;

    private final String name;

    private String nickname;

    public PersonJava(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickName(String nickName){
        this.nickname = nickName.toLowerCase();
    }
}
