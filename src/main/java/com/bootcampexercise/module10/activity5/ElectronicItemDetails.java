package com.bootcampexercise.module10.activity5;

import java.util.*;


public class ElectronicItemDetails {

    public double returnPriceOfItem(Map map) {
        Set keySet = map.keySet();


        for (Object o : keySet) {
            String key = (String) o;
            System.out.println("Price of " + key + " is " + map.get(key));
        }

        return 0;

    }

    public static void main(String[] args) {


        HashMap<String, Double> map = new HashMap<>();
        map.put("TV", 100.123456789);
        map.put("Refrigerator", 100.123456789);
        map.put("Washing Machine", 100.123456789);
        map.put("Laptop", 100.123456789);

        ElectronicItemDetails ee = new ElectronicItemDetails();
        ee.returnPriceOfItem(map);


    }

}
