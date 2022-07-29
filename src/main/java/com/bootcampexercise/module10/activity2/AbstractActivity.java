package com.bootcampexercise.module10.activity2;



public class AbstractActivity {
    public static void main(String[] args) {


        Employee employee = new Employee();
        employee.setAge(31);
        employee.setName("Mozart");
        employee.setSalary(1000);
        employee.setJobTitle("Test Engineer");
        employee.setCompany("Microsoft");

        Student student = new Student();
        student.setSchoolName("Riga University");

        employee.introduce();
        student.introduce();


    }


}
