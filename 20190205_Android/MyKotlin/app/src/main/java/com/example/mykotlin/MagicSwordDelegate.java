package com.example.mykotlin;

public class MagicSwordDelegate implements ISword{
    ISword iSword;
    public MagicSwordDelegate(ISword iSword){
        this.iSword = iSword;
    }

    @Override
    public void equip() {
        playWoderfulSound();

        iSword.equip();

    }

    public void playWoderfulSound() {
        System.out.println("짜잔");
    }


}
