package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class BackspaceStringCompare {

    public static void main(String[] args) {
        String str1 = "ab#c";
        String str2 = "ad#c";
        String str3 = "abb##";
        String str4 = "c#d#";

        backspaceCompare(str1,str2);

    }
    public static boolean backspaceCompare(String S, String T) {

        char[] sChar = S.toLowerCase().toCharArray();
        char[] tChar = T.toLowerCase().toCharArray();

        ArrayList<Character> charArray = new ArrayList<>();

        addToList(sChar,charArray);
        String A =  removeTarget(charArray);
        charArray.clear();

        addToList(tChar,charArray);
        String B = removeTarget(charArray);

        if(A.equals(B)){
            return true;
        }
        return false;
}

    private static String removeTarget(ArrayList<Character> charArray) {

        for (int i = 0; i < charArray.size();i++) {

            if(charArray.get(i) == '#'){

                charArray.remove(i);
                charArray.remove(i-1);
                i+=2;
            }
        }
        return build(charArray);
    }

    private static String build(ArrayList<Character> charArray) {

        char[] chars = new char[charArray.size()];

        for (int i =0; i<charArray.size();i++) {

            chars[i] = charArray.get(i);
        }

        return String.valueOf(chars);
    }

    private static void addToList(char[] stringToChar, ArrayList<Character> charArray) {

        for (char c: stringToChar) {
            charArray.add(c);
        }
    }

}
