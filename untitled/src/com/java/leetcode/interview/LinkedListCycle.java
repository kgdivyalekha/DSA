package com.java.leetcode.interview;

public class LinkedListCycle {

     private static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public static void main(String[] args) {
         ListNode head=new ListNode(3);
         ListNode node1=new ListNode(2);
         head.next=node1;
        ListNode node2=new ListNode(0);
        node1.next=node2;
        ListNode node3=new ListNode(-1);
        node2.next=node3;
        node3.next=node1;

        System.out.println(hasCycle(head));
    }
        public static boolean hasCycle(ListNode head) {
            ListNode fast=head;
            ListNode slow=head;
            if(head==null||head.next==null)
                return false;
            while(fast!=null && fast.next!=null )
            {
                slow=slow.next;
                fast=fast.next.next;
                if(fast==slow)
                    return true;

            }
            return false;
        }



}
