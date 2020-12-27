package com.springmvc.frontcontrollerpattern.dispatcher;

import com.springmvc.frontcontrollerpattern.view.HomeView;
import com.springmvc.frontcontrollerpattern.view.StudentView;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:
 */


public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
