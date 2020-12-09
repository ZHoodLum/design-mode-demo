package com.action.commandpattern.demo1.service.impl;

import com.action.commandpattern.demo1.consumer.Stock;
import com.action.commandpattern.demo1.service.OrderService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public class SellStockServiceImpl implements OrderService {
    private Stock abcStock;

    public SellStockServiceImpl(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
