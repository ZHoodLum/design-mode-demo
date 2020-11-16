package com.structure.adapterpattern.controller;


import com.structure.adapterpattern.Adapter.MediaAdapter2;
import com.structure.adapterpattern.service.AdvancedMediaPlayerService;
import com.structure.adapterpattern.service.impl.AudioPlayerServiceImpl;
import com.structure.adapterpattern.service.impl.MP4PlayerServicecImpl;
import sun.audio.AudioPlayer;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/15
 * @Description:请求action
 * 调用方调用同一个接口  不可改变的情况下，使用适配器模式
 */


public class AdapterPatternController {
    public static void main(String[] args) {
        AudioPlayerServiceImpl audioPlayer = new AudioPlayerServiceImpl();

        audioPlayer.play("mp3", "giao.mp3");
        //来个需求  我想播放MP4中的音频
        audioPlayer.play("mp4", "RIO.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

        System.out.println("----------------------");
        MediaAdapter2 mediaAdapter2 = new MediaAdapter2();
        AdvancedMediaPlayerService mp4PlayerServicec = mediaAdapter2.getInterface("mp4");
        mp4PlayerServicec.playMp4("mp4");

    }
}
