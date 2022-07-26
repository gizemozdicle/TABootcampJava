package com.bootcampexercise.module2.activity;

public class FindlnArray {

    public static void main(String[] args){


        int[] nums={10,20,30,405,505};

        int result = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] > result);

            result = nums[i];

        }

        System.out.println("largest in array is "+result);

    }
}
