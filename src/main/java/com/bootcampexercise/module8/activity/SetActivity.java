package com.bootcampexercise.module8.activity;

import java.util.HashSet;
import java.util.Set;


public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.

        HashSet names = new HashSet();

        names.add("Gizem");
        names.add("Kemal");

        SetActivity obj = new SetActivity();
        obj.print(names);

    }

    void print(Set set) {
        for (Object theSet : set) {
            System.out.println(theSet.toString());
        }

    }
}
