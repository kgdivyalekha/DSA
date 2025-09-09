package com.java.dsa.basics;

/*
* Valid Operations:
* Insert-done
* Delete -done
* Display-done
* Has Cycle
* */
public class CircularLinkedList {
    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    private int data;
    private int size;
    public CircularLinkedList(int data) {
        this.data = data;
    }

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size=0;
    }
    public static void main(String[] args)
    {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.insert(50);
        cll.insert(60);
        cll.display();
        cll.delete(10);
        cll.delete(30);
        cll.delete(60);
        System.out.println("\n\nAfter deletion");
        cll.display();
        System.out.println("\n\nHas Cycle?: " + cll.hasCycle());
    }
    public void insert(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
         head=node;
         tail=node;
        }
        else {

            tail.next=node;
            node.next=head;
            tail=node;
        }
    }
    public boolean hasCycle()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
    public void display()
    {
        if(head!=null) {
            Node node=head;
            do {
                System.out.print(node.data + "-->");
                node = node.next;
            } while (node != head);
            System.out.print("HEAD");
        }
    }
    public void delete(int val)
    {
        Node node=head;
        if(head==tail)
        {
            head=null;
            tail=null;
            return;
        }
        if(node.data==val)
        {
            head=node.next;
            tail.next=head;
            return;
        }
        if(head!=null)
        {
            do
            {
                Node temp=node.next;
                if(temp.data==val)
                {
                    node.next=temp.next;
                    break;
                }
                node=node.next;
            } while(node!=head);
        }
    }
}
