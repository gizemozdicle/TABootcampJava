package com.bootcampexercise.module8.activity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapActivity {


    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name

        Map hashMap = new HashMap();
        hashMap.put("1", "First");
        hashMap.put("2", "Second");
        hashMap.put("3", "Third");


        //2 - Call print method to print the map passed as its parameter.
        print(hashMap);

    }

    static void print(Map map) {
        //3 - Type code to print this map
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();

        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + "\t" + map.get(key));
        }

    }
}
