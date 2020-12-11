package com.action.iteratorpattern.service.impl;

import com.action.iteratorpattern.service.Container;
import com.action.iteratorpattern.service.Iterator;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public class NameRepository implements Container {
    public String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}