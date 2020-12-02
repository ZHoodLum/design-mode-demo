package com.action.nullobjectpattern.dome2.controller;

import com.action.nullobjectpattern.dome2.entity.Users;
import com.action.nullobjectpattern.dome2.factory.EntityFactory;
import com.action.nullobjectpattern.dome2.service.UserService;
import org.apache.catalina.User;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/1
 * @Description:
 */


public class UserController {

    public static void main(String[] args) {
//        List<Users> listUser = new ArrayList<Users>();
//        for (int i = 0; i < 5; i++) {
//            Users users = new Users();
//            users.setUserId("" + i);
//            users.setUserName("用户" + i);
//            listUser.add(users);
//        }
//        for (Users list : listUser) {
//            System.out.println("对象" + list);
//        }
//        System.out.println("--------------------");

        EntityFactory bookFactory = new EntityFactory();
        UserService users = bookFactory.getEntity("2");
        users.show();


    }


}
