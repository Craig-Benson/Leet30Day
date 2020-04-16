package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingElements {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2};

        countElements(arr);

    }
    private static int countElements(int[] arr) {

        List<Integer> list = new ArrayList<>();


int count = 0;
int duplicate = 0;

        for(int i = 0; i <= arr.length-1;i++) {
            int search = 1;
            search += arr[i];

            for (int j = 0; j <= arr.length - 1; j++) {

            if(!list.contains(search)){
                if (search  == arr[j]) {
                    list.add(search);
                    count++;
                }
            }else if(list.contains(search)) {
                duplicate++;
            }

            }

        }
        return count;
    }



    }



