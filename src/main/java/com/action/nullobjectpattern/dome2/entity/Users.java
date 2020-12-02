package com.action.nullobjectpattern.dome2.entity;

import com.action.nullobjectpattern.dome2.service.UserService;

import javax.crypto.interfaces.PBEKey;
import java.util.ArrayList;
import java.util.List;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/1
 * @Description:模拟数据库存储的信息
 */


public class Users implements UserService {
    private String userId;
    private String userName;

    /**
     * 方便打印信息
     * @return
     */
    public Users() {
        this.userId = "1";
        this.userName = "玛卡巴卡";
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        userName = userName;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public void show() {
        System.out.println("Users{" + "用户ID='" + userId + ", 用户名称='" + userName + '}');
    }
}
