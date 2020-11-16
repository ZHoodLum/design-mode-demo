package com.structure.adapterpattern.service.impl;

import com.structure.adapterpattern.Adapter.MediaAdapter;
import com.structure.adapterpattern.service.MediaPlayerService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/15
 * @Description:
 */


public class AudioPlayerServiceImpl implements MediaPlayerService {
    MediaPlayerService mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("支持播放当前的音频文件，正在播放" + fileName + "文件");
            System.out.println("画画的BABY，奔驰的小野马和带刺的玫瑰......");
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("当前播放的文件类型"+ audioType + " ， 格式不支持，请联系管理员！！！");
        }
    }
}
