package com.company;


import javax.imageio.plugins.tiff.TIFFImageReadParam;
import javax.swing.*;
import java.util.Iterator;

public class MinStack {

    private Node head;
    private Node temp;

    public MinStack() {

         head = new Node();

    }

    public void push(int x) {

        if(head.value == null) {

            head = new Node(x);
        }else if (head.next == null) {

            temp = new Node(x);
            head.next = temp;

        }else{

            Node oldTemp = temp;
            temp = new Node(x);
            oldTemp.next = temp;

        }

    }

    public void pop() {

        Node tempHead = head;

        while(tempHead.next.next !=null){

            tempHead = tempHead.next;
        }

        tempHead.next = null;

    }

    public int top() {
        Node tempHead = head;

        while(tempHead.next.next !=null){

            tempHead = tempHead.next;
        }

        return tempHead.value;
    }

    public int getMin() {

        Node tempHead = head;

        int intMin = tempHead.value;

        while(tempHead.next !=null){


            if(intMin > tempHead.next.value){
                intMin = tempHead.next.value;
            }

            tempHead = tempHead.next;
        }

        return intMin;
    }

    public class Node {
        Integer value;
        Node next;

        public Node() {

            this.value = null;
            this.next = null;

        }
        public Node(Integer value) {

            this.value = value;
            this.next = null;

        }

    }

    public static void main(String[]args){

        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.top();

    }

}

