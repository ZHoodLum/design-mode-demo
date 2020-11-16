package com.create.abstractfactorypattern.service.impl;

import com.create.abstractfactorypattern.service.SubscriberService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description:姓氏武某人
 */


public class WDLSubscriberServiceImpl implements SubscriberService {

    @Override
    public void Subscriber() {
        System.out.println("武大郎：不喝了不喝了，喝不动了！");
    }
}
