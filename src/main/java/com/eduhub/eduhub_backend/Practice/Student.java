package com.eduhub.eduhub_backend.Practice;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
//    @Autowired
//    public Student(Pen p){
//        his.p=p;
//    }

    Pen p;
    @Autowired
    public void setP(Pen p){
        this.p=p;
    }

    public void studey(){

    }
}
