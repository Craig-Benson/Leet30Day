package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductofArrayExceptSelf {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        productExceptSelf(nums);
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length - 1];
        int answer = 0;


        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - 1; j++) {

                if(nums[j] != nums.length){

                    if (j != i) {

                        ans[i] += nums[j] + nums[j] + 1;

                    }



                }
            }


        }
        return ans;
    }
}









