package com.structure.proxypattern.controller;

import com.structure.proxypattern.ProxyUtils.ProxyImage;
import com.structure.proxypattern.service.ImageService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public class ProxyPatternController {
    public static void main(String[] args) {
        ImageService image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }
}
