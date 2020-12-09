package com.action.commandpattern.demo1.controller;

import com.action.commandpattern.demo1.consumer.Stock;
import com.action.commandpattern.demo1.provider.Broker;
import com.action.commandpattern.demo1.service.impl.BuyStockServiceImpl;
import com.action.commandpattern.demo1.service.impl.SellStockServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public class CommandPatternController {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStockServiceImpl buyStockOrder = new BuyStockServiceImpl(abcStock);
        SellStockServiceImpl sellStockOrder = new SellStockServiceImpl(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
