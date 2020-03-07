package com.design.cn.facade;

public class DVDplayer {

    public static DVDplayer  instance= new DVDplayer();

    private DVDplayer(){}

    public static DVDplayer getInstance() {
        return instance;
    }

    public void ready(){
        System.out.println("dvd开始播放");
    }

    public void pause(){
        System.out.println("dvd开始暂停");
    }

    public void stop(){
        System.out.println("DVD结束");
    }
}
