package com.structure.adapterpattern.service.impl;

import com.structure.adapterpattern.service.AdvancedMediaPlayerService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/15
 * @Description:
 */


public class MP4PlayerServicecImpl implements AdvancedMediaPlayerService {

    @Override
    public void playMp4(String fileName) {
        System.out.println("MP4的播放文件：" + fileName);
    }


    @Override
    public void playVlc(String fileName) {

    }
}
