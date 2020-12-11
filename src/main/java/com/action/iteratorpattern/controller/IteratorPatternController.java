package com.action.iteratorpattern.controller;

import com.action.iteratorpattern.service.Iterator;
import com.action.iteratorpattern.service.impl.NameRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public class IteratorPatternController {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }

        System.out.println("---------------------------------------");
        List list = new ArrayList();
        list.add("1");
        list.add("12");
        list.add("13");
        list.add("14");
        list.add("15");
        java.util.Iterator i1 = list.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
    }
}
