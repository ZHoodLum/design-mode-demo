package com.action.statepattern.service;

import com.action.statepattern.service.impl.Context;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public interface State {
    public void doAction(Context context);
}
