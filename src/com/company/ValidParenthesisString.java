package com.company;


import java.util.Stack;

public class ValidParenthesisString {
/*
Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
An empty string is also valid.

Example 1:
Input: "()"
Output: True
Example 2:
Input: "(*)"
Output: True
Example 3:
Input: "(*))"
Output: True
Note:
The string size will be in the range [1, 100].
*/

    public static void main(String[] args) {

        String s = "()";

        checkValidString(s);

    }

    public static boolean checkValidString(String s) {

        char[] charArray = s.toCharArray();
        char nextChar;
        int requiredEnd=0;
        Stack<Character> charStack = new Stack<>();

        for(int i = charArray.length-1; i >= 0;i--) {

            charStack.push(charArray[i]);

        }

        if (!(charStack.empty())) {
            do {

                if (charStack.firstElement() == ')') {
                    return false;
                } else {
                    requiredEnd++;
                    nextChar = charStack.pop();
                }

                if (nextChar == '(') {
                    requiredEnd++;
                } else if (nextChar == '*' || nextChar == ')') {
                    requiredEnd--;
                }


            } while (charStack.peek() != null);


        }
        return requiredEnd == 0;

    }






}
