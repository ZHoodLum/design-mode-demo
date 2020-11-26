package com.structure.proxypattern.ProxyUtils;

import com.structure.proxypattern.service.ImageService;
import com.structure.proxypattern.service.impl.RealImageServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public class ProxyImage implements ImageService {

    private RealImageServiceImpl realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImageServiceImpl(fileName);
        }
        realImage.display();
    }
}