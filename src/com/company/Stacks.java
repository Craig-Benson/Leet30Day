package com.company;

import java.util.Stack;

public class Stacks {



    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);



        stack.empty();
        stack.peek();
        stack.pop();

        stack.search(2);
    }
}
