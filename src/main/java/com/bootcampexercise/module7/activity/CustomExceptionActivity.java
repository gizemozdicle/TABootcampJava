package com.bootcampexercise.module7.activity;

import com.bootcampexercise.module7.sample.CustomException;

//Needs to be completed
//1 - extend this class from Exception class
public class CustomExceptionActivity extends Exception{

    public static void setMessage(String message) throws CustomException {

    }

    //2 - Override getMessage() and provide the following message
    // "You are not allowed to use this program"

public String getMessage () {
    return "You are not allowed to use the program";


}
}
