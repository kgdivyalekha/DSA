package com.java.dsa;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class RemoveDuplicatesSortedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node=new ListNode(2);
        head.next=node;
        ListNode node2=new ListNode(2);
        node.next=node2;
        ListNode node3=new ListNode(3);
        node2.next=node3;
        ListNode node4=new ListNode(3);
        node3.next=node4;
        node4.next=null;
        head=deleteDuplicates(head);
        while(head!=null)
        {
            System.out.print(head.val+ "==>");
            head=head.next;
        }
        System.out.println("null");
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        ListNode prev=null;
        HashSet<Integer> set=new HashSet<>();
        while(node!=null)
        {
            if(set.contains(node.val))
            {
                prev.next=node.next;
            }
            else {
                set.add(node.val);
                prev=node;
            }
            node=node.next;
        }
        return head;
    }
}
