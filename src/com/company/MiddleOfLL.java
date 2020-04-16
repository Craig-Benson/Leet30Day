package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MiddleOfLL {

    //create LL
    // 5 values
    //find the middle node
    //return it

    //create LL
    // 6 values
    //find the middle node
    //if the entire left and the entire right are equal return the first node of the right

    public static void main(String[] args) {

List<Integer> list = List.of(1,2,3,4,5);

        List<ListNode> linkedList = new LinkedList<>();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
ListNode node7 = new ListNode(7);
ListNode node8 = new ListNode(8);
ListNode node9 = new ListNode(9);
ListNode node10 = new ListNode(10);

        node1.next=null;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next=null;

        middleNode(node1);
    }

    public static ListNode middleNode(ListNode head){

        ListNode temp = head;
        int firstCount = 1;

        while(temp.next != null){
            firstCount++;
            temp = temp.next;
        }

        if(firstCount % 2 ==0){
            firstCount++;
        }

        int middle = (int)Math.ceil((double)firstCount /2);
        int secondCount = 0;

        do{

            ++secondCount;
            head = head.next;

        } while (secondCount + 1 < middle);
        return head;
    }




    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }


    }


}
