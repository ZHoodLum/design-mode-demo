package com.springmvc.dataaccessobjectpattern.dao;

import com.springmvc.dataaccessobjectpattern.entity.Student;

import java.util.List;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:
 */

public interface StudentDao {
        public List<Student> getAllStudents();
        public Student getStudent(int rollNo);
        public void updateStudent(Student student);
        public void deleteStudent(Student student);
}
