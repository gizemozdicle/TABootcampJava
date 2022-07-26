package com.bootcampexercise.module2.activity;

public class PrintNumWithWhile {
    public static void main(String[] args) {


        int i = 1;
		while(i<=100){
            if(i%3 == 0)
                System.out.println("Odd Number= "+ i);
			i=i+1;
		}
    }
}

