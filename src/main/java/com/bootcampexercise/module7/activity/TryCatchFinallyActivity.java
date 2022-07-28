package com.bootcampexercise.module7.activity;

//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed.

import com.bootcampexercise.module7.sample.TryCatchFinallySample;

public class TryCatchFinallyActivity {
    public static void main(String[] args) {
        TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
        obj.catchMeIfYouCan();
    }

    void catchMeIfYouCan() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        //TODO: use try
        try{
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        }


        //TODO: create catch for try and use IndexOutOfBoundsException
        catch (IndexOutOfBoundsException IndexOutOfBoundsException){

            System.out.println(IndexOutOfBoundsException);
        }

        //TODO: In catch create custom System.out.println message
        finally {

            System.out.println("This should get printed even if there is an exception");}

    }

}

