package com.design.cn.facade;

/**
 * 外观类 组合其他类并产生新功能
 */
public class Facade {

    private DVDplayer dvDplayer=DVDplayer.getInstance();

    private MusicPlayer musicPlayer=MusicPlayer.getInstance();

    public void ready(){
        dvDplayer.ready();
        musicPlayer.ready();
    }

    public void pause(){
        dvDplayer.pause();
        musicPlayer.pause();
    }

    public void stop(){
        dvDplayer.stop();
        musicPlayer.stop();
    }
}
