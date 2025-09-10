package com.java.dsa;

public class ReverseLinkedList {
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
        head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next=null;
        head= reverseList(head);
        display(head);
    }

    private static void display(Node head) {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public static Node reverseList(Node head) {
        // code here
        int size=0;
        Node node=head;
        while(node!=null)
        {
            size++;
            node=node.next;
        }
        if(size<2)
            return head;
        Node currNode=head;
        Node prevNode=null;
        Node nextNode=head.next;
        while(currNode!=null)
        {
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
            if(nextNode!=null)
                nextNode=nextNode.next;
        }
        head=prevNode;
        return head;
    }
}
