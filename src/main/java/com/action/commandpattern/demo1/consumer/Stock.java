package com.action.commandpattern.demo1.consumer;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + " ]bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + " ]sold ");
    }
}
