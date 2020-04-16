//package com.company;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MaximumSubarray {
//
//    public static void main(String[] args) {
//
//
//        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int i = 0;
//
//        recursion(array,i,i+1,i+2,list);
//    }
//
//
//
//    public static int[] recursion(int[] array, int i, int j, int k) {
//
//        if(i == j) {
//            return null;
//        }
//
//        int highest = array[i] + array[j] + array[k];
//
//        int nextHighest = recursion(array,j,k,k+1);
//
//
//
//
//
//
//
//
//
//        return null;
//
//    }
//
//}