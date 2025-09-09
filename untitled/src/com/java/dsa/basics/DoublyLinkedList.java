package com.java.dsa.basics;

public class DoublyLinkedList
 /*
    Doubly Linked List has a value for itself and pointer to the next
    Valid Operations:
    Insert First-done
    Insert Last-done
    Insert At-done
    Delete Last -done
    Delete First -done
    Delete At - done
    Find Index of-done
    Display-done
    */
{
    private class Node
    {
        private int data;
        private Node prev;
        private Node next;
        public Node ()
        {
            this.prev=null;
            this.next=null;
        }
        public Node(int data)
        {
            this.data=data;
        }

        public Node(Node prev, Node next, int data) {
            this.prev = prev;
            this.next = next;
            this.data = data;
        }
    }
    private Node head;
    private int size;

    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.insertFirst(30);
        dll.insertLast(40);
        dll.insertLast(50);
        dll.insertLast(60);
        dll.insertAt(2,70);
        System.out.println("After insertion");
        dll.display(dll.head);
        System.out.println("After deletion");
        dll.head=dll.deleteFirst(dll.head);
        dll.head=dll.deleteLast(dll.head);
        dll.head=dll.deleteAt(dll.head,3);
        dll.display(dll.head);
        System.out.println(dll.findIndex(dll.head, 50));
    }
    //Insert at the beginning
    public void insertFirst(int value)
    {
        //if dll is empty, add as head and point prev and next as null
        if(head==null)
        {
            head=new Node(value);
            head.prev=null;
            head.next=null;
        }
        else {
            //create a new node with value
            Node temp = new Node(value);
            //point the new node's next as head
            temp.next = head;
            //head's new prev will be the new node
            head.prev = temp;
            //once all links are established, make the new node as head
            head = temp;
        }
        size++;
    }
    //Insert at a particular index
    public void insertAt(int index,int value)
    {
        //if dll is empty, add as head and point prev and next as null
        if(head==null)
        {
            head=new Node(value);
            head.prev=null;
            head.next=null;
        }
        else if(index==0) {
            insertFirst(value);
            return;
        }
        else if(index==size) {
            insertLast(value);
            return;
        }
        else if(index>size) {
            System.out.println("Index doesn't exist");
            return;
        }
        else {
            //node as pointer to head
            Node node=head;
            //create a new node with a value passed
            Node temp=new Node(value);
            //traverse to the last index where the new node is to be added
            for(int i=0;i<index-1;i++)
                node=node.next;
            //now, new node's next will be pointer's next that way, the chain of next is not lost
            temp.next=node.next;
            //pointer node's next will be new node
            node.next=temp;
            //new node's previous will be pointers
            temp.prev=node;
            //now we make the next chain's previous to new node
            if(temp.next!=null)
                temp.next.prev=temp;
        }
        size++;
    }
    //Insert at the end
    public void insertLast(int value)
    {
        //if dll is empty, add as head and point prev and next as null
        if(head==null)
        {
            head=new Node(value);
            head.prev=null;
            head.next=null;
        }
        else {
            //create a new node with value
            Node temp=new Node(value);
            //create a node with head as pointer so as to traverse to the last
            Node node=head;
            //traverse to last node with value and not null
            while(node.next!=null)
            {
                node=node.next;
            }
            //add the new node to last node as it's next
            node.next=temp;
            //new node's previous will be the last node
            temp.prev=node;
            //new node's next will be null
            temp.next=null;
        }
        size++;
    }
    //Delete First
    public Node deleteFirst(Node head)
    {
        if(head==null)
            return head;
        //pointer node to head.next since head is to be deleted
        Node node=head.next;
        //point the previous of this pointer node to null
        node.prev=null;
        //node's next node's previous to node so as to not lose the link
        node.next.prev=node;
        //new head will be node.
        head=node;
        //decrement size
        size--;
        //return the new head
        return head;
    }
    //Delete Last
    public Node deleteLast(Node head)
    {
        //return head if head is null;
        if(head==null)
            return head;
        //pointer node to head
       Node node=head;
       //traverse to last but one node
       while(node.next!=null)
       {
           node=node.next;
       }
       //current node is to be deleted so point the previous of it to null
       node.prev.next=null;
       //decrement size
       size--;
       //return the new head
       return head;
    }
    //Delete Last
    public Node deleteAt(Node head, int index)
    {
        //return head if head is null;
        if(head==null)
            return head;
        else if(index==0)
            return deleteFirst(head);
        else if(index==size)
            return deleteLast(head);
        else if(index>size) {
            System.out.println("Index does not exist");
            return head;
        }
        //pointer node to head
        Node node=head;
        //traverse to index-1 element since "index" element is to be deleted
        for(int i=0;i<index-1;i++) {
            node = node.next;
        }
        //checking if next to next is not null
        if(node.next.next!=null) {
            //next to next's previous element will be node
            node.next.next.prev = node;
            //node's next will be the one next to it
            node.next = node.next.next;
        }
        //decrement size
        size--;
        //return the new head
        return head;
    }
    //Find index of an element
    public int findIndex(Node head,int val)
    {
        int counter=0;
        if(head!=null)
        {
            Node node=head;
            while (node!=null)
            {
                if(node.data==val)
                    return counter;
                counter++;
                node=node.next;
            }
        }
        return -1;
    }
    //DISPLAY and DISPLAY in REVERSE
    public void display(Node head)
    {
        Node temp=head;
        //adding last node to print in reverse. finding the position of last node that's not null
        Node last=null;
        while(temp!=null)
        {
            System.out.print(temp.data+"==>");
            last=temp;
            temp=temp.next;
        }
        System.out.println("END");
        System.out.println("Printing in reverse");
        while(last!=null)
        {
            System.out.print(last.data+"<==");
            last=last.prev;
        }
        System.out.println("START");
        System.out.println("\nTotal number of nodes: "+size);
    }

}
