package com.structure.FilterOrCriteriaPattern.service.impl;

import com.structure.FilterOrCriteriaPattern.entity.Person;
import com.structure.FilterOrCriteriaPattern.service.CriteriaService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/22
 * @Description:实现类
 */


public class CriteriaMaleServiceImpl implements CriteriaService {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        //将查询符合条件的  放入集合中
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
