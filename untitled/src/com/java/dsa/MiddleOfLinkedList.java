package com.java.dsa;

public class MiddleOfLinkedList {
    private static class Node
    {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
       // head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next=null;
        System.out.println("The Middle Node is: " + getMiddle(head));
    }
    public static int getMiddle(Node head) {
        // code here
        if(head==null)
            return -1;
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }
}
