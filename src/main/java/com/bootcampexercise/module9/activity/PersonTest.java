package com.bootcampexercise.module9.activity;

import com.bootcampexercise.module9.sample.Product;
import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
    protected void setUp() throws Exception {
        person = new Person();
        person.setHeight(160);
        person.setWeight(47);
    }

    //TODO: create teardown

    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testSetAndGetPerson() {
        int myWeight = 47;
        float myHeight = 160;
        assertEquals(person.getHeight(), myHeight);
        assertEquals(person.getWeight(), myWeight);


        int newWeight = 50;
        float newHeight = 170;
        person.setWeight(newWeight);
        person.setHeight(newHeight);
        assertEquals(person.getHeight(), newHeight);
        assertEquals(person.getWeight(), newWeight);

    }


    //TODO: create unit test for getBodyMassIndex method
    //Formula Weight/Height*Height
    public void testBodyMassIndex() {

        double testDataBodyMassIndex = 0.0018359374953433871;

        assertEquals(person.getBodyMassIndex(), testDataBodyMassIndex);

    }

    public void testStringBodyMassIndex() {

        String testStringData = "0.0018359374953433871";

        assertEquals(person.getStringBodyMassIndex(), testStringData);

    }


}
