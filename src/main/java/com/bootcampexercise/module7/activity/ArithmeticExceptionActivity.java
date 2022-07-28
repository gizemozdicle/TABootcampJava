package com.bootcampexercise.module7.activity;

// Needs to be completed
public class ArithmeticExceptionActivity {

    public static void main(String[] args) {

        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
        obj.catchMe(10, 0);
        obj.catchMe(10, 2);
    }
    void catchMe(int num1, int num2) {

        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("Can't divine by 0");
        }
        finally {
            System.out.println("Thank you for using this program.");
        }

    }
}