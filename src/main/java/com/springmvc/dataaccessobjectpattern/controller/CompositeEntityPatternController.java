package com.springmvc.dataaccessobjectpattern.controller;

import com.springmvc.dataaccessobjectpattern.dao.StudentDao;
import com.springmvc.dataaccessobjectpattern.dao.impl.StudentDaoImpl;
import com.springmvc.dataaccessobjectpattern.entity.Student;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:
 */


public class CompositeEntityPatternController {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //输出所有的学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }


        //更新学生
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "
                + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}