package com.structure.FilterOrCriteriaPattern.controller;

import com.structure.FilterOrCriteriaPattern.entity.Person;
import com.structure.FilterOrCriteriaPattern.service.CriteriaService;
import com.structure.FilterOrCriteriaPattern.service.impl.AndCriteriaServiceImpl;
import com.structure.FilterOrCriteriaPattern.service.impl.CriteriaMaleServiceImpl;
import com.structure.FilterOrCriteriaPattern.service.impl.CriteriaSingleServiceImpl;
import com.structure.FilterOrCriteriaPattern.service.impl.OrCriteriaServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/22
 * @Description:
 */


public class CriteriaPatternController {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        CriteriaService male = new CriteriaMaleServiceImpl();
        CriteriaService single = new CriteriaSingleServiceImpl();
        CriteriaService singleMale = new AndCriteriaServiceImpl(single, male);
        CriteriaService singleOrFemale = new OrCriteriaServiceImpl(single, single);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
