package com.action.commandpattern.demo1.provider;

import com.action.commandpattern.demo1.service.OrderService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */

public class Broker {
    private List<OrderService> orderList = new ArrayList<OrderService>();

    public void takeOrder(OrderService order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (OrderService order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
