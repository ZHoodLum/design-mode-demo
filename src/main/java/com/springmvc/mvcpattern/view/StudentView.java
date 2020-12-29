package com.springmvc.mvcpattern.view;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:相当于界面
 */


public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
