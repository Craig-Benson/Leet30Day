package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagrams {


    public static void main(String[] args) {
       String[] arr = {"eat", "tea", "tan", "aet", "nat", "bat"};

       anagram(arr);


    }

    private static List<List<String>> anagram(String[] arr) {


        List<List<String>> list = new ArrayList<>();

        //take each word and sort it
        //break down each word
        //sort the word a to z


        for (String str : arr) {

            String sorted = str;
                int index = 0;
                char[] charArray = sorted.toCharArray();
            Arrays.sort(charArray, 0, charArray.length);
            sorted = String.valueOf(charArray);
            int key = str.hashCode();

            if(list.contains(sorted)){
//                list.add();
            }


}


        return list;
    }}



