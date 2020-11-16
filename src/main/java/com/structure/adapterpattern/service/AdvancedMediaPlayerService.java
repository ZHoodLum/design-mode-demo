package com.structure.adapterpattern.service;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/15
 * @Description:高级媒体播放器
 */


public interface AdvancedMediaPlayerService {
    /**
     * 播放模式 VLC
     * @param fileName
     */
    public void playVlc(String fileName);

    /**
     * 播放模式 MP4
     * @param fileName
     */
    public void playMp4(String fileName);
}
