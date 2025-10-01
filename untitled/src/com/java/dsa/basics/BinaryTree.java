package com.java.dsa.basics;

import java.util.Scanner;
/*
* tree is a data structure with children and binary tree has only two children
* common functions:
* populate
* display
* traversals:
*   - preorder
*   - inorder
*   - postorder
* */
public class BinaryTree {
    //new node class to create a tree
    class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
        }
        public Node(){}
    }
    public Node root;

    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.populate(new Scanner(System.in));
        bt.display();
        System.out.println("\nPreorder:\n");
        bt.preorder();
        System.out.println("\nInorder:\n");
        bt.inorder();
        System.out.println("\nPostorder:\n");
        bt.postorder();
    }
    //populate method is to insert into the tree reading values from user
    public void populate(Scanner sc)
    {
        System.out.println("Enter the root node:");
        int val=sc.nextInt();
        root=new Node(val);//make the first read node as root and the subsequent as children
        populate(sc,root);//recursive method to insert children to nodes to root
    }
//
    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to add left of the node "+ node.data+ "?");
        boolean left=sc.nextBoolean();
        if(left)
        {
            System.out.println("Enter the value to the left of "+node.data +":");
            int val=sc.nextInt();
            node.left=new Node(val);
            populate(sc,node.left);
        }
        System.out.println("Do you want to add right of the node "+ node.data+ "?");
        boolean right=sc.nextBoolean();
        if(right)
        {
            System.out.println("Enter the value to the right of "+node.data +":");
            int val=sc.nextInt();
            node.right=new Node(val);
            populate(sc,node.right);
        }
    }
    public void display()
    {
        display(this.root," ");
    }

    private void display(Node node, String indent) {
        if(node==null)
            return;
        System.out.println(indent+node.data);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
    private void preorder()
    {
        preorder(root);
    }

    private void preorder(Node node) {
        if(node==null)
            return;
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    private void inorder()
    {
        inorder(root);
    }

    private void inorder(Node node) {
        if(node==null)
            return;
        preorder(node.left);
        System.out.print(node.data+" ");
        preorder(node.right);
    }
    private void postorder()
    {
        postorder(root);
    }

    private void postorder(Node node) {
        if(node==null)
            return;
        preorder(node.left);
        preorder(node.right);
        System.out.print(node.data+" ");
    }
}
