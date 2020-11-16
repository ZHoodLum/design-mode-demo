package com.structure.adapterpattern.Adapter;

import com.structure.adapterpattern.service.AdvancedMediaPlayerService;
import com.structure.adapterpattern.service.MediaPlayerService;
import com.structure.adapterpattern.service.impl.MP4PlayerServicecImpl;
import com.structure.adapterpattern.service.impl.VlcPlayerServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/15
 * @Description:适配器   适配多种播放格式的文件
 */


public class MediaAdapter implements MediaPlayerService {
    AdvancedMediaPlayerService advancedMusicPlayer;


    /**
     * 构造器
     * @param audioType 播放类型
     */
    public MediaAdapter(String audioType){
        switch (audioType) {
            case "vlc":
                advancedMusicPlayer = new VlcPlayerServiceImpl();
            case "mp4":
                advancedMusicPlayer = new MP4PlayerServicecImpl();

        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
