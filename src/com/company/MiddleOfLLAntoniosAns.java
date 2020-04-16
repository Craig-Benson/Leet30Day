package com.company;

import java.util.LinkedList;
import java.util.List;

public class MiddleOfLLAntoniosAns {

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

        node1.next=node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next=node6;









        middleNode(node1);
    }

    public static ListNode middleNode(ListNode Head){

//        LinkedList<ListNode> linkedList = new LinkedList<>();
//        Iterator it = linkedList.iterator();

        ListNode hare = Head;
        ListNode turtle = Head;
        int count = 1;

        while(hare.next != null){
            if(hare.next.next != null){
                turtle = turtle.next;
                hare = hare.next.next;
                count+=2;
            }else{

                hare = hare.next;
                count++;
            }

        }

        return count % 2 ==0 && turtle.next != null? turtle.next : turtle;
    }




    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }


    }


}
