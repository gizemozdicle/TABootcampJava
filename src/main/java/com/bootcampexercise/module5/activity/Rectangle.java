package com.bootcampexercise.module5.activity;
//    P = (a+b)*2
//       A=a*b

public class Rectangle extends Shape {

    // TODO: Implement calculateArea and calculatePerimeter in this class
    int length;
    int breadth;

    public Rectangle() {
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double calculateArea() {
        return length * breadth;
    }


    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }


}



