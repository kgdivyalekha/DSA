package com.java.dsa.basics;

class Node
{
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
public class SinglyLinkedList {
    /*
    Singly Linked List has a value for itself and pointer to the next
    Valid Operations:
    Insert First-done
    Insert Last-done
    Insert At-done
    Delete Last - done
    Delete First - done
    Delete At - done
    Find Index of
    Display-done
    */
    public Node head;
    private Node tail;
    private int size;

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertFirst(10);
        sll.insertFirst(20);
        sll.insertFirst(30);
        sll.insertLast(40);
        sll.insertLast(50);
        sll.insertLast(60);
        sll.insertAt(3,70);
        sll.insertAt(0,80);
        sll.insertAt(8,90);
        System.out.println("After insertion");
        sll.display();
        sll.deleteFirst();
        sll.deleteLast();
        sll.deleteAt(3);
        System.out.println("After Deletion");
        sll.display();
        System.out.println(sll.findIndex(20));
    }
    //Insert First
    public Node insertFirst(int value)
    {
        //creating a new node with value passed
        Node node=new Node(value);
        //since inserted at first, head will be the next to node created
        node.next=head;
        //pointing head to created node
        head=node;
        //if there is only one node, tail and head will be the same.
        if(tail==null)
        {
            tail=head;
        }
        //increase size of the list for tracking purposes
        size++;
        return head;
    }
    //Insert Last
    public Node insertLast(int value)
    {
        //creating a new node with head as a tracker
        Node node=head;
        //traversing to the tail node, that is, not null
        while(node.next!=null)
        {
            node=node.next;
        }
        //once the last node with not null value is reached, creating a new node and assigning it as next
        node.next=new Node(value);
        //assigning the tail
        tail=node;
        //incrementing the size
        size++;
        return head;
    }
    //Insert At a given index
    public Node insertAt(int index,int value)
    {
        //check if the given index is 0 or size of the array or index is more than size
        if(index==0)
        {
            return insertFirst(value);
        }
        else if(index==size)
        {
            return insertLast(value);
        }
        else if(index>size)
            return head;
        else {
            //creating a new node pointer initialized with head
            Node node=head;
            /* traverse to the index where a node needs to be inserted with index-1 as the limit as
            * at the index, the element will be inserted */
            for(int i=0;i<index-1;i++)
                node=node.next;
            //storing the next value of the node so as to not lose the chain in a temp.
            Node temp=node.next;
            //inserting at specific index.
            node.next=new Node(value);
            //now linking the rest of the chain
            node.next.next=temp;
        }
        size++;
        return head;
    }
    //Delete First Element of LinkedList
    public Node deleteFirst()
    {
        //check if head is not null
        if(head!=null) {
            //point a node to second node
            Node temp = head.next;
            //assign temp node to head
            head = temp;
            //decrement size
            size--;
        }
        return head;
    }
    //Delete First Element of LinkedList
    public Node deleteLast()
    {
        //check if head is not null
        if(head!=null) {
            //point a temp node to null
            Node temp = head;
            //checking last before the last node is not null
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            //making the last node as null
            temp.next=null;
            //decrement size
            size--;
        }
        return head;
    }
    public Node deleteAt(int index)
    {
        //if index is the first, call deleteFirst
        if(index==0) {
            return deleteFirst();
        }
        //if index is the last, call deleteLast
        else if(index==size)
            return deleteLast();
        //if index mentioned doesn't exist, return list as such
        else if(index>size)
            return head;
        else {
            //hold head as a pointer and assign to temp
            Node temp=head;
            //create a dummy to keep track of all previous nodes before deletion
            Node tempNext=null;
            //traverse to the last but one index
            for(int i=0;i<index-1;i++)
            {
                tempNext=temp;
                temp=temp.next;
            }
            //assign the next index of current node to previous of it.
            tempNext.next=temp.next;
            size--;
        }
        return head;
    }
    //Find index of an element in a linkedlist
    public int findIndex(int value)
    {
        int index=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==value)
            {
                return index;
            }
            else
            {
                index++;
                temp=temp.next;
            }
        }
        return -1;
    }
    public void display()
    {
        Node node=head;
        while(node!=null)
        {
            System.out.print(node.data+"-->");
            node=node.next;
        }
        System.out.println("null");
        System.out.println("The size of the singly linked list is: "+ size);
    }
}
