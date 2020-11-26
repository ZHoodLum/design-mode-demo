package com.structure.proxypattern.service.impl;

import com.structure.proxypattern.service.ImageService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public class RealImageServiceImpl implements ImageService {

    private String fileName;

    public RealImageServiceImpl(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }}
