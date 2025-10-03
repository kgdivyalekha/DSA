package com.java.dsa.basics;

public class BinarySearchTree {
    class Node{
        int data;
        int height;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
        public int getData()
        {
            return data;
        }
    }
    Node root;

    public static void main(String[] args) {
        BinarySearchTree bt=new BinarySearchTree();
        int[] nums={5,2,7,1,4,6,9,8,3,10};
      //  int[] nums={1,2,3,4,5,6,7,8,9,10};
        bt.populateSorted(nums);
        bt.display();
        System.out.println(bt.isBalanced());
    }
    public int height(Node node)
    {
        if(node==null)
            return -1;
        return node.height;
    }
    public boolean isEmpty()
    {
        return root==null;
    }
    public void display()
    {
        display(root,"Root Node: ");
    }

    private void display(Node node, String details) {
        if(node==null)
            return;
        System.out.println(details + node.getData());
        display(node.left,"Left child of "+node.getData()+ ": ");
        display(node.right,"Right child of "+node.getData()+ ": ");
    }
    public void insert(int val)
    {
      root=insert(val,root);
    }

    private Node insert(int val, Node node) {
        if(node==null)
        {
            node = new Node(val);
            return node;
        }
        if(val<node.getData())
            node.left=insert(val,node.left);
        if(val>node.getData())
            node.right=insert(val,node.right);
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    private boolean isBalanced(){
        return isBalanced(root);
    }

    public boolean isBalanced(Node node) {
        if(node==null)
            return true;
        return Math.abs(height(node.left)-height(node.right))<=1 && isBalanced(node.left) && isBalanced(node.right);
    }
    public void populate(int[] nums)
    {
        for(int n: nums)
            this.insert(n);
    }
    public void populateSorted(int[] nums)
    {
        populateSorted(nums,0,nums.length);
    }

    public void populateSorted(int[] nums, int start, int end) {
        if(start>=end)
            return;
        int mid=start+(end-start)/2;
        this.insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);
    }
}
