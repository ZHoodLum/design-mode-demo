package com.structure.FilterOrCriteriaPattern.service.impl;

import com.structure.FilterOrCriteriaPattern.entity.Person;
import com.structure.FilterOrCriteriaPattern.service.CriteriaService;

import java.util.List;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/22
 * @Description:
 */


public class AndCriteriaServiceImpl implements CriteriaService {
    private CriteriaService criteria;
    private CriteriaService otherCriteria;

    public AndCriteriaServiceImpl(CriteriaService criteria, CriteriaService otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
