package com.bootcampexercise.module2.activity;

public class NumToWordsUsingMethod {

    public static void main(String[] args) {
        numToWordsLogic(300);
    }

    public static void numToWordsLogic(int x) {

        String numText = switch (x) {
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "NUMBER " + x;
        };

        System.out.println(numText);

    }


}
