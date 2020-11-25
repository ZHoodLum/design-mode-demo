package com.structure.filterorcriteriapattern.service;

import com.structure.filterorcriteriapattern.entity.Person;

import java.util.List;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/22
 * @Description:
 */


public interface CriteriaService {

    public List<Person> meetCriteria(List<Person> persons);
}
