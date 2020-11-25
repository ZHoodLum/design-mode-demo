package com.structure.filterorcriteriapattern.service.impl;

import com.structure.filterorcriteriapattern.entity.Person;
import com.structure.filterorcriteriapattern.service.CriteriaService;

import java.util.List;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/22
 * @Description:
 */


public class OrCriteriaServiceImpl implements CriteriaService {
    private CriteriaService criteria;
    private CriteriaService otherCriteria;

    public OrCriteriaServiceImpl(CriteriaService criteria, CriteriaService otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
