package com.bootcampexercise.module7.activity;

public class CustomExceptionActivityTest {

    public static void main(String[] args) throws CustomExceptionActivity {
        CustomExceptionActivityTest user = new CustomExceptionActivityTest();

        user.validateUser("Mike");
        user.validateUser("Gizem");

    }
    void validateUser(String name) throws CustomExceptionActivity {
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};



        int flag = 0 ;
        for (int i = 0; i < 4; i++) {
            if (validUsers[i] == name) {
                flag = 1;
            }
            else {
                System.out.println("Welcome to Payroll program");
            }

        }
    }
}
