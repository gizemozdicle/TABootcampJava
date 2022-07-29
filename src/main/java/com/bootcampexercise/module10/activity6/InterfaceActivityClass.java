package com.bootcampexercise.module10.activity6;

public class InterfaceActivityClass {


    public static void main(String[] args) {

        Bike b = new Bike();
        Car c = new Car();

        b.start();
        c.start();

        b.stop();
        c.stop();
    }
}
