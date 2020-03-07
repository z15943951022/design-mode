package com.design.cn.facade;

public class MusicPlayer {

    private static MusicPlayer instance=new MusicPlayer();

    public static MusicPlayer getInstance() {
        return instance;
    }

    public void ready(){
        System.out.println("music开始播放");
    }

    public void pause(){
        System.out.println("music开始暂停");
    }

    public void stop(){
        System.out.println("music结束");
    }

}
