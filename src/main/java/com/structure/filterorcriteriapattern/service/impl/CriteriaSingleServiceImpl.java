package com.structure.filterorcriteriapattern.service.impl;

import com.structure.filterorcriteriapattern.entity.Person;
import com.structure.filterorcriteriapattern.service.CriteriaService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/22
 * @Description:
 */


public class CriteriaSingleServiceImpl implements CriteriaService {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
