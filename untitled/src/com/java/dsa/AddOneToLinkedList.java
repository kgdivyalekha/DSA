package com.java.dsa;

public class AddOneToLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(4);
        head.next=new Node(5);
        head.next.next=new Node(6);
        Node temp=addOne(head);
        while(temp!=null)
        {
            System.out.print(temp.data+"==>");
            temp=temp.next;
        }
    }
    public static Node addOne(Node head) {
        // code here.
        String s="";
        Node node=head;
        while(node!=null)
        {
            s=s+node.data;
            node=node.next;
        }
        int num=Integer.parseInt(s);
        num=num+1;
        s="";
        s=s+num;
        Node temp=new Node(s.charAt(0)-'0');
        for(int i=1;i<s.length();i++)
        {
            Node n=new Node(s.charAt(i)-'0');
            temp.next=n;
            temp=temp.next;
        }
        //   head=temp;
        return temp;
    }
}
