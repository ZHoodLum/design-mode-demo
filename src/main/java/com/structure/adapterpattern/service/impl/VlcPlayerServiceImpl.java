package com.structure.adapterpattern.service.impl;

import com.structure.adapterpattern.service.AdvancedMediaPlayerService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/15
 * @Description:
 */


public class VlcPlayerServiceImpl  implements AdvancedMediaPlayerService {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Vlc的播放文件：" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
