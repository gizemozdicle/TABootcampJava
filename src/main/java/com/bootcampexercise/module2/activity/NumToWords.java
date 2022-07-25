package com.bootcampexercise.module2.activity;

public class NumToWords {
    public static void main(String[] args) {


        int x = 300;
        String numText = "";

        switch (x) {

            case 1:
                numText = "ONE";
                break;
            case 2:
                numText = "TWO";
                break;
            case 3:
                numText = "THREE";
                break;
            case 4:
                numText = "FOUR";
                break;
            case 5:
                numText = "FIVE";
                break;
            case 6:
                numText = "SIX";
                break;
            case 7:
                numText = "SEVEN";
                break;
            case 8:
                numText = "EIGHT";
                break;
            case 9:
                numText = "NINE";
                break;

            default:
                numText = "NUMBER " + x;
        }

        System.out.println(numText);


    }







}
