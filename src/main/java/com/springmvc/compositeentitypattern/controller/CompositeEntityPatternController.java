package com.springmvc.compositeentitypattern.controller;

import com.springmvc.compositeentitypattern.client.Client;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:
 */


public class CompositeEntityPatternController {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
