package com.structure.FilterOrCriteriaPattern.service;

import com.structure.FilterOrCriteriaPattern.entity.Person;

import java.util.List;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/22
 * @Description:
 */


public interface CriteriaService {

    public List<Person> meetCriteria(List<Person> persons);
}
