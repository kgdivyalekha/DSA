package com.java.dsa;

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
        List<ListNode> list = new LinkedList<>();
        list.add(new ListNode(1));
        list.add(new ListNode(1));
        list.add(new ListNode(2));
        list.add(new ListNode(3));
        list.add(new ListNode(3));
        list.stream().forEach(l->System.out.println(l.val));
      //  deleteDuplicates(list.get(0));
    }
    public ListNode deleteDuplicates(ListNode head) {
    return null;
    }
}
