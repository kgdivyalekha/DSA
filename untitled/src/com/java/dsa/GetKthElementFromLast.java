package com.java.dsa;

public class GetKthElementFromLast {
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
        head.next= new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        // head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next=null;
        System.out.println("The Kth element from end is: " + getKthFromLast(head,2));
    }
    public static int getKthFromLast(Node head, int k) {
        int size=0;
        if(head==null)
            return -1;
        Node temp=head;
        while(temp!=null) {
            size++;
            temp=temp.next;
        }
        int index = size - k - 1;
        if(k<=size && size>0) {
            temp = head;
            for (int i = 0; i <= index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        return -1;
    }
}
