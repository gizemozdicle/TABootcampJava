package com.bootcampexercise.module10.activity2;

import com.bootcampexercise.module10.activity1.Person;

public class Student extends Person {

    private String schoolName;


    public Student() {
        this.schoolName = "schoolName";
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void introduce() {
        System.out.println("I am study in university " + getSchoolName());

    }


}




