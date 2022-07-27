package com.bootcampexercise.module5.activity;
// 3.14*radius = Per
//3.14* radius2= Area

public class Circle extends Shape {
    // TODO: Implement calculateArea and calculatePerimeter in this class
    int radius;
    double pi = 3.14;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        return pi * radius * radius;
    }


    public double calculatePerimeter() {
        return pi * radius * 2;
    }

}




