package com.bootcampexercise.module2.activity;

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 10; i <=20 ; i++) {
            for (int j=1; j<=10;j++) {


                System.out.println("*** Table of " + i + " ***");
                System.out.println(i + "*" + j + " = " + i * j);

            }

        }


    }


}
