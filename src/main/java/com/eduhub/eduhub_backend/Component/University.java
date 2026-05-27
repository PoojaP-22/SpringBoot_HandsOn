package com.eduhub.eduhub_backend.Component;

public class University {
    int courseCode;
    String subName;
    int credit;

    public University(){
        
    }

    public University(int courseCode, String subName, int credit){
        this.courseCode = courseCode;
        this.subName = subName;
        this.credit = credit;
    }

    public int getId() {
        return courseCode;
    }

    public void setId(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getName() {
        return subName;
    }

    public void setName(String subName) {
        this.subName = subName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

}
