package com.action.mediatorpattern.entity;

import com.action.mediatorpattern.middle.WeChat;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public class Users {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 构造函数
     * @param name
     */
    public Users(String name){
        this.name = name;
    }

    public void sendMessage(String message){
        WeChat.showMessage(this,message);
    }
}
