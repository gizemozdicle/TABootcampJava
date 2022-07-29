package com.bootcampexercise.module10.activity4;

import com.bootcampexercise.module10.activity2.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {


    public static void main(String[] arg) {

        Employee employeeOne = new Employee("Lawyer", 1000, "LawyerCompany");
        Employee employeeTwo = new Employee("Doctor", 2000, "DoctorCompany");
        Employee employeeThree = new Employee("Farmer", 3000, "FarmerCompany");
        Employee employeeFour = new Employee("Pilot", 4000, "PilotCompany");
        Employee employeeFive = new Employee("Teacher", 5000, "TeacherCompany");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employeeOne);
        employeeList.add(employeeTwo);
        employeeList.add(employeeThree);
        employeeList.add(employeeFour);
        employeeList.add(employeeFive);


        double salary = 0;

        for (Employee employee : employeeList) {
            double loopSalary = employee.getSalary();

            if (loopSalary > salary) {
                salary = loopSalary;
            }


        }
        System.out.println("The Employee whose salary is the highest is :" + salary);


    }
}
