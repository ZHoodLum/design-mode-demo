package com.action.mediatorpattern.middle;

import com.action.mediatorpattern.entity.Users;

import java.util.Date;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public class WeChat {
    public static void showMessage(Users user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
    }
}
