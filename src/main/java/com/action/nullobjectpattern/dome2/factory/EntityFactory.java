package com.action.nullobjectpattern.dome2.factory;

import com.action.nullobjectpattern.dome2.entity.Users;
import com.action.nullobjectpattern.dome2.service.UserService;
import com.action.nullobjectpattern.dome2.service.impl.NullUserServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/1
 * @Description:
 */


public class EntityFactory {
    public UserService getEntity(String ID) {
        UserService book;//将原来的ConcreteBook改为Book
        switch (ID) {
            case "1":
                book = new Users();
                break;
            default:
                book = new NullUserServiceImpl();//创建一个NullBook对象
                break;
        }

        return book;
    }
}
