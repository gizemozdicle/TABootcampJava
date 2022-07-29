package com.bootcampexercise.module10.activity2;

import com.bootcampexercise.module10.activity1.Person;


public class Employee extends Person {

    private String jobTitle;
    private double salary;
    private String company;

    public Employee() {
        this.jobTitle = "JobTitle";
        this.salary = 0;
        this.company = "Company";
    }

    public Employee(String jobTitle, int salary, String company) {
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.company = company;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + getName());
        System.out.println("I am " + getAge() + " years old");
        System.out.println("I am work as " + getJobTitle() + " in " + getCompany());
        System.out.println("My salary is " + getSalary());


    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


}



