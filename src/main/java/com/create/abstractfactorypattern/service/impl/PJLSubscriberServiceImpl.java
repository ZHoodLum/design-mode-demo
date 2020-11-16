package com.create.abstractfactorypattern.service.impl;

import com.create.abstractfactorypattern.service.SubscriberService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description:姓氏潘某人
 */


public class PJLSubscriberServiceImpl implements SubscriberService {

    @Override
    public void Subscriber() {
        System.out.println("潘金莲：大朗，起来喝药了，他们让我再给你续一碗");

    }
}
