package com.bootcampexercise.module5.activity;

import com.bootcampexercise.module5.sample.inheritance.Person_I;

//TODO: extend Employee_I to Person_I.
    public class Employee_I extends Person_I{

	//Attributes
	private int salary;
	private String title;


	//Behavior
	//TODO: write default constructor. Print 'I'm an Employee_I Constructor'
    public Employee_I() {
        System.out.println("I'm Employee_I constructor");
    }

	//TODO: write getter for int salary

    public int getSalary() {
        return salary;
    }

	//TODO: write setter for int salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

	//TODO: write getter for String title

    public String getTitle() {
        return title;
    }

	//TODO: write setter for String title

    public void setTitle(String title) {
        this.title = title;
    }

}

