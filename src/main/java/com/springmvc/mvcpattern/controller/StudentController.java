package com.springmvc.mvcpattern.controller;

import com.springmvc.mvcpattern.entity.Student;
import com.springmvc.mvcpattern.view.StudentView;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:请求的action
 */


public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
