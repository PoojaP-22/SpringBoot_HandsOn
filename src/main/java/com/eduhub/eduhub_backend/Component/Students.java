package com.eduhub.eduhub_backend.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {
    private int id;
    private String name;
    private String department;
    private double cgpa;


//    public Students(){
//
//    }
//
//    public Students(int id,String name,String department,double cgpa){
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.cgpa = cgpa;
//    }
//
//    public int getId(){
//        return id;
//    }
//
//    public void setId(int id){
//        this.id = id;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name){this.name = name;}
//
//    public String getDept(){
//        return department;
//    }
//
//    public void setDept(String department){
//        this.department = department;
//    }
//
//    public double getCgpa(){
//        return cgpa;
//    }
//
//    public void setCgpa(double cgpa){
//        this.cgpa = cgpa;
//    }
}

