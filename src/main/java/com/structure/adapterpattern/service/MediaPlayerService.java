package com.structure.adapterpattern.service;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/15
 * @Description:媒体播放器
 */


public interface MediaPlayerService {
    /**
     * 播放模式 win自带的播放软件  只支持MP3播放格式  好垃圾
     * @param audioType
     * @param fileName
     */
    public void play(String audioType, String fileName);
}
