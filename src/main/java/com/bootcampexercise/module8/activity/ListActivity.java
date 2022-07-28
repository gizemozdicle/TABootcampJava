package com.bootcampexercise.module8.activity;

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.

        List animals = new ArrayList();

        animals.add("dog");
        animals.add("cat");


        //TODO: 2 - Call print method to print the list passed as its parameter.
        ListActivity obj = new ListActivity();
        obj.print(animals);

    }

    void print(List list) {
        //TODO: 3 - Type code to print this list
        System.out.println(list);


    }
}


