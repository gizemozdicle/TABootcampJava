package com.bootcampexercise.module10.activity1;

public abstract class Person {

    public String name;
    public int age;

    public Person() {
        this.name = "name";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void introduce();

}


